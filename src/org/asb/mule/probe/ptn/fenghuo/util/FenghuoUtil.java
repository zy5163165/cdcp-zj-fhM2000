package org.asb.mule.probe.ptn.fenghuo.util;

import globaldefs.NameAndStringValue_T;

/**
 * Author: Ronnie.Chen
 * Date: 13-7-29
 * Time: 下午7:40
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class FenghuoUtil {
    public static  String toString(NameAndStringValue_T[] nvs) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nvs.length; i++) {
            NameAndStringValue_T nv = nvs[i];
            sb.append(nv.name+"="+nv.value).append(";");
        }
        return sb.toString();
    }
}
