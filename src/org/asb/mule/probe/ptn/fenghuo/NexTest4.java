package org.asb.mule.probe.ptn.fenghuo;

import com.alcatelsbell.cdcp.nodefx.EmsExecutable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;

/**
 * Author: Ronnie.Chen
 * Date: 2015/2/10
 * Time: 16:22
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class NexTest4 implements EmsExecutable {
    private FileLogger logger  = null;

    @Override
    public Object execute(NbiService nbiService) {
        logger = new FileLogger("cc-"+nbiService.getEmsName()+".log");
        CCCacheTask ccCacheTask = new CCCacheTask(logger.getLogger(),(FenghuoService)nbiService,nbiService.getEmsName());
        new Thread(ccCacheTask).start();
        return null;
    }
}
