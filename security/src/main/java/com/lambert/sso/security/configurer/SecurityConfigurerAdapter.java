package com.lambert.sso.security.configurer;

import com.lambert.sso.security.SecurityAuthenticationAccessFilter;
import com.lambert.sso.security.auth.TokenService;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author lambert
 * @version $Id: SecurityConfigurerAdapter.java, v 0.1 2020年07月31日 8:29 PM lambert Exp $
 */
public abstract class SecurityConfigurerAdapter {

    public SecurityContextConfigurer securityContextConfigurer;



    public SecurityConfigurerAdapter(SecurityContextConfigurer securityContextConfigurer) {
        this.securityContextConfigurer = securityContextConfigurer;
    }

    @Bean
    public FilterRegistrationBean  securityAuthenticationAccessFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new SecurityAuthenticationAccessFilter(securityContextConfigurer));
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("securityAuthenticationAccessFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
