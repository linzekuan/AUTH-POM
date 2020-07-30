package com.lambert.sso.adapter;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.List;

/**
 * @author lambert
 * @version $Id: InterceptorAdaper.java, v 0.1 2019年05月14日 11:26 PM lambert Exp $
 */
public class InterceptorAdaper extends HandlerInterceptorAdapter {
    private String[] pathPatterns;
    private List<String> excludePathPatterns;

    public String[] getPathPatterns() {
        return pathPatterns;
    }

    public void setPathPatterns(String[] pathPatterns) {
        this.pathPatterns = pathPatterns;
    }

    public List<String> getExcludePathPatterns() {
        return excludePathPatterns;
    }

    public void setExcludePathPatterns(List<String> excludePathPatterns) {
        this.excludePathPatterns = excludePathPatterns;
    }
}
