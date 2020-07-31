package com.lambert.sso.security;

import com.lambert.sso.security.configurer.SecurityContextConfigurer;

import javax.servlet.Filter;

/**
 * @author lambert
 * @version $Id: AbstractSecurityFilter.java, v 0.1 2020年07月31日 8:30 PM lambert Exp $
 */
public abstract class AbstractSecurityFilter implements Filter {

    public SecurityContextConfigurer securityContextConfigurer;

    public AbstractSecurityFilter(SecurityContextConfigurer securityContextConfigurer) {
        this.securityContextConfigurer = securityContextConfigurer;
    }


}
