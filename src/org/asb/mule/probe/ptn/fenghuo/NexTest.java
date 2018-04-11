package org.asb.mule.probe.ptn.fenghuo;

import com.alcatelsbell.cdcp.nodefx.EmsExecutable;
import com.alcatelsbell.nms.valueobject.BObject;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.ptn.fenghuo.sbi.mgrhandler.ManagedElementMgrHandler;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.VendorDNFactory;
import terminationPoint.TerminationPoint_T;

import java.util.HashMap;
import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 2014/12/8
 * Time: 16:30
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class NexTest  implements EmsExecutable {


    @Override
    public Object execute(NbiService fenghuoService) {
        return testCTP(fenghuoService);
       // return checkSlot(fenghuoService);
    }

    private Object checkSlot(NbiService fenghuoService) {
        StringBuffer sb = new StringBuffer();
        List<ManagedElement> mes = fenghuoService.retrieveAllManagedElements();
        int count = 0;
        boolean find = false;
        for (ManagedElement me : mes) {
            List<EquipmentHolder> equipmentHolders = fenghuoService.retrieveAllEquipmentHolders(me.getDn());
            List<Equipment> equipments = fenghuoService.retrieveAllEquipments(me.getDn());

            sb.append("------------------------------------------------------\n");
            sb.append("\n");
            sb.append("EquipmentHolder:\n");
            HashMap<String,EquipmentHolder> slotMap = new HashMap<String, EquipmentHolder>();
            for (EquipmentHolder equipmentHolder : equipmentHolders) {
                slotMap.put(equipmentHolder.getDn(),equipmentHolder);
                sb.append(equipmentHolder.getDn()+"\n");
            }
            sb.append("Equipment:\n");
            for (Equipment equipment : equipments) {
                String dn = equipment.getDn();
                sb.append(equipment.getDn());
                dn = dn.substring(0,dn.lastIndexOf("@"));
                if (!slotMap.containsKey(dn)) {
                    find = true;
                    sb.append("NOT FOUND ! \n");
                } else
                    sb.append("\n");
            }

            if (count ++ > 50 && find) {
                break;
            }

        }
        return sb.toString();
    }

    private Object testMECC(NbiService fenghuoService) {
        StringBuffer sb = new StringBuffer("\nCURRENT1111\n");
        List<CrossConnect> crossConnects = fenghuoService.retrieveAllCrossConnects("EMS:JXI-OTNM2000-1-P@ManagedElement:134244186;69899");
        sb.append(crossConnects.size());
        sb.append("\n");
        sb.append(getDnListString(crossConnects));

        List<CrossConnect> crossConnects2 = fenghuoService.retrieveAllCrossConnects("EMS:JXI-OTNM2000-1-P@ManagedElement:134244163;81943");
        sb.append(crossConnects2.size());
        sb.append("\n");
        sb.append(getDnListString(crossConnects2));
        return sb.toString();
    }


    private String getDnListString(List  bos) {
        StringBuffer sb = new StringBuffer();
        sb.append("=================================================");
        for (Object bo : bos) {
            sb.append(((BObject)bo).getDn()+"\n");
        }
        return sb.toString();
    }

    private Object testCTP(NbiService fenghuoService) {

        String ptpDn = "EMS:HUZ-OTNM2000-7-P@ManagedElement:134217944;106500@PTP:/rack=26625/shelf=1/slot=3146755/port=1";
        FenghuoService service = (FenghuoService)fenghuoService;
        StringBuffer sb = new StringBuffer("\nCURRENT\n");
        try {
            TerminationPoint_T[] terminationPoint_ts = ManagedElementMgrHandler.instance().retrieveContainedCurrentTPs(service.getCorbaService().getNmsSession()
                            .getManagedElementMgr(), VendorDNFactory.createCommonDN(ptpDn),
                    new short[0]);

            if (terminationPoint_ts != null) {
                for (TerminationPoint_T terminationPoint_t : terminationPoint_ts) {
                    sb.append(nv2dn(terminationPoint_t.name)+"\n");
                }
            }
            else sb.append("null");
        } catch (ProcessingFailureException e) {
            return e;
        }
        return sb.toString();

    }

    private Object testCTP(NbiService fenghuoService,String ptpDn) {

        FenghuoService service = (FenghuoService)fenghuoService;
        StringBuffer sb = new StringBuffer("\nCURRENT\n");
        try {
            TerminationPoint_T[] terminationPoint_ts = ManagedElementMgrHandler.instance().retrieveContainedCurrentTPs(service.getCorbaService().getNmsSession()
                            .getManagedElementMgr(), VendorDNFactory.createCommonDN(ptpDn),
                    new short[0]);

            if (terminationPoint_ts != null) {
                for (TerminationPoint_T terminationPoint_t : terminationPoint_ts) {
                    sb.append(nv2dn(terminationPoint_t.name)+"\n");
                }
            }
            else sb.append("null");
        } catch (ProcessingFailureException e) {
            return e;
        }

        sb.append("\nInUse\n") ;
        try {
            TerminationPoint_T[] terminationPoint_ts = ManagedElementMgrHandler.instance().retrieveContainedInUseTPs(service.getCorbaService().getNmsSession()
                            .getManagedElementMgr(), VendorDNFactory.createCommonDN(ptpDn),
                    new short[0]);

            if (terminationPoint_ts != null) {
                for (TerminationPoint_T terminationPoint_t : terminationPoint_ts) {
                    sb.append(nv2dn(terminationPoint_t.name)+"\n");
                }
            }
            else sb.append("null");
        } catch (ProcessingFailureException e) {
            return e;
        }

        sb.append("\nPotential\n") ;
        try {
            TerminationPoint_T[] terminationPoint_ts = ManagedElementMgrHandler.instance().retrieveContainedPotentialTPs(service.getCorbaService().getNmsSession()
                            .getManagedElementMgr(), VendorDNFactory.createCommonDN(ptpDn),
                    new short[0]);

            if (terminationPoint_ts != null) {
                for (TerminationPoint_T terminationPoint_t : terminationPoint_ts) {
                    sb.append(nv2dn(terminationPoint_t.name)+"\n");
                }
            }
            else sb.append("null");
        } catch (ProcessingFailureException e) {
            return e;
        }
        return sb.toString();

    }

    public String nv2dn(NameAndStringValue_T[] name) {
        if (name != null && name.length > 0) {
            StringBuilder dnString = new StringBuilder();
            for (NameAndStringValue_T nv : name) {
                dnString.append(Constant.dnSplit).append(nv.name).append(Constant.namevalueSplit).append(nv.value);
            }
            return dnString.substring(1);
        }
        return "";
    }
}
