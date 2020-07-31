package com.lambert.sso.security;

import com.lambert.sso.security.configurer.SecurityContextConfigurer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lambert
 * @version $Id: SecurityAuthenticationAccessFilter.java, v 0.1 2020年07月31日 8:35 PM lambert Exp $
 */
public class SecurityAuthenticationAccessFilter extends AbstractSecurityFilter {


    public SecurityAuthenticationAccessFilter(SecurityContextConfigurer securityContextConfigurer) {
        super(securityContextConfigurer);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
       if(SecurityResourceWhiteHandler.Handler(request,securityContextConfigurer.getSecurityResourceWhiteListConfigurer())){
           filterChain.doFilter(servletRequest,servletResponse);
       }else{
           SecurityRedirectLoginHandler.handler(request,response);
       }
    }
}
