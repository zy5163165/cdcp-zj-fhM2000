package org.asb.mule.probe.ptn.fenghuo;

import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Author: Ronnie.Chen
 * Date: 13-7-18
 * Time: 下午6:16
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class FenghuoStat  implements CommandBean {
    private FenghuoService fenghuoService;

    private void info(String info) {
        System.out.println(info);
    }

    public FenghuoService getFenghuoService() {
        return fenghuoService;
    }

    public void setFenghuoService(FenghuoService u2000Service) {
        this.fenghuoService = u2000Service;
    }

    @Override
    public void execute() {
        System.out.println("execute = ");
        List<Section> sections1 = fenghuoService.retrieveAllSections();
        System.out.println("sections1 = " + sections1.size());
        List<ManagedElement> managedElements = null;
        List<FlowDomainFragment> flowDomainFragments = null;
        List<Section> sections = null;
        List<TrafficTrunk> trafficTrunks = null;
        try {
            managedElements = fenghuoService.retrieveAllManagedElements();
            flowDomainFragments = fenghuoService.retrieveAllFdrs();
            sections = fenghuoService.retrieveAllSections();
            trafficTrunks = fenghuoService.retrieveAllTrafficTrunk();
        } catch (Exception e) {
            e.printStackTrace();
        }
        info("okokok");
        info("trafficTrunks size = "+trafficTrunks.size());
        info("managedElements size = "+managedElements.size());
        info("sections size = "+sections.size());
        info("flowDomainFragments size = "+flowDomainFragments.size());
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < trafficTrunks.size(); i++) {
            TrafficTrunk trafficTrunk = trafficTrunks.get(i);
            String tag2 = trafficTrunk.getTag2();
            Integer count = map.get(tag2);
            if (count == null) {

                map.put(tag2,1);
            } else {
                map.put(tag2,count + 1);
            }

        }

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            info(next+"="+map.get(next));
        }
    }
}
