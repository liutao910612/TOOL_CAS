package com.liutao.casclient.utility;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;

import javax.servlet.http.HttpServletRequest;

/**
 * cas client常用工具类
 *
 * @author LIUTAO
 * @version 2017/6/1
 * @see
 * @since
 */
public class CASUtility {

    /**
     * 从cas中获取用户名
     *
     * @param request
     * @return
     */
    public static String getAccountNameFromCas(HttpServletRequest request) {
        Assertion assertion = (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        AttributePrincipal principal = assertion.getPrincipal();
        return principal.getName();
    }
}
