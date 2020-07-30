package com.lambert.sso.web.auth.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lambert
 * @version $Id: AbstractAuthFilter.java, v 0.1 2020年07月30日 10:48 PM lambert Exp $
 */
public class AbstractAuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
