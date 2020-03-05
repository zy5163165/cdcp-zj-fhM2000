package org.asb.mule.probe.ptn.fenghuo;

import com.alcatelsbell.nms.util.ObjectUtil;
import extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T;
import flowDomainFragment.FlowDomainFragment_T;
import globaldefs.NameAndStringValue_T;
import org.asb.mule.probe.framework.service.Constant;
import subnetworkConnection.TPData_T;
import terminationPoint.TerminationPoint_T;
import transmissionParameters.LayeredParameters_T;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Author: Ronnie.Chen
 * Date: 13-7-4
 * Time: 下午6:38
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class RouteTest {
    protected static String mapperTransmissionPara(LayeredParameters_T nst) {
        StringBuffer sb = new StringBuffer();
        sb.append(nst.layer + Constant.dnSplit);
        for (NameAndStringValue_T name : nst.transmissionParams) {
            sb.append(name.name);
            sb.append(Constant.namevalueSplit);
            sb.append(name.value);
            sb.append(Constant.listSplit);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Object o2 = ObjectUtil.readObjectByPath("d:\\cdcpdb\\testptps2");
        TerminationPoint_T[] o1 = (TerminationPoint_T[]) ObjectUtil.readObjectByPath("d:\\cdcpdb\\testptps");
        TerminationPoint_T terminationPoint_t = o1[108];
        LayeredParameters_T[] transmissionParams = terminationPoint_t.transmissionParams;
        StringBuffer sb = new StringBuffer();
        for (LayeredParameters_T nst : transmissionParams) {
            sb.append(mapperTransmissionPara(nst));
            sb.append(Constant.dnSplit);
        }
        System.out.println(sb.toString());
        System.out.println("o1 = " + o1);
        HashMap map = (HashMap) ObjectUtil.readObjectByPath("d:\\work\\routemap-309");

        for (Object o : map.keySet()) {
            FlowDomainFragment_T fdf = (FlowDomainFragment_T) o;
            System.out.println("FDF:"+fdf.nativeEMSName);
            ExMatrixFlowDomainFragment_T[] routes = (ExMatrixFlowDomainFragment_T[]) map.get(fdf);
            TPData_T aend = fdf.aEnd[0];
            TPData_T zend = fdf.zEnd[0];
            System.out.print(toString(aend.tpName) + " <> ");
            System.out.println( toString(zend.tpName));
            System.out.println("===================== route =======================");
            for (int i = 0; i < routes.length; i++) {
                ExMatrixFlowDomainFragment_T route = routes[i];
                System.out.print( toString(route.aEnd[0].tpName)+" <> ");
                System.out.println( toString(route.zEnd[0].tpName));
            }

            System.out.println("----------------------------------------------------------------------");
        }
    }

    private static String toString(NameAndStringValue_T[] tpName) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tpName.length; i++) {
            NameAndStringValue_T nameAndStringValue_t = tpName[i];
            sb.append(nameAndStringValue_t.name+"="+nameAndStringValue_t.value).append("/");
        }
        return sb.toString();
    }
}
