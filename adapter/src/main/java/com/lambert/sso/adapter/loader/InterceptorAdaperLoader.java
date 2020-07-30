package com.lambert.sso.adapter.loader;


import com.lambert.sso.adapter.InterceptorAdaper;

import java.util.List;

/**
 * @author lambert
 * @version $Id: InterceptorAdaperLoader.java, v 0.1 2019年05月14日 10:54 PM lambert Exp $
 */
public class InterceptorAdaperLoader {

    private List<InterceptorAdaper> interceptorAdapers;

    public List<InterceptorAdaper> getInterceptorAdapers() {
        return interceptorAdapers;
    }

    public void setInterceptorAdapers(List<InterceptorAdaper> interceptorAdapers) {
        this.interceptorAdapers = interceptorAdapers;
    }
}
