package com.lambert.sso.web.auth.security;

import com.lambert.sso.security.configurer.SecurityConfigurerAdapter;
import com.lambert.sso.security.configurer.SecurityContextConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author lambert
 * @version $Id: WebSecurityConfigurerAdapter.java, v 0.1 2020年07月31日 8:40 PM lambert Exp $
 */
@Configuration
public class WebSecurityConfigurerAdapter extends SecurityConfigurerAdapter {

    @Autowired
    public SecurityContextConfigurer securityContextConfigurer;

    public WebSecurityConfigurerAdapter( SecurityContextConfigurer securityContextConfigurer) {
        super(securityContextConfigurer);
    }
}
