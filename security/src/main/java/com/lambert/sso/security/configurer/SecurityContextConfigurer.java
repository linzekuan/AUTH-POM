package com.lambert.sso.security.configurer;

import com.lambert.sso.security.auth.AccessTokenService;

/**
 * @author lambert
 * @version $Id: SecurityContextConfigurer.java, v 0.1 2020年07月31日 8:28 PM lambert Exp $
 */
public class SecurityContextConfigurer {

    private SecurityResourceWhiteListConfigurer securityResourceWhiteListConfigurer;

    private AccessTokenService tokenService;

    public SecurityResourceWhiteListConfigurer getSecurityResourceWhiteListConfigurer() {
        return securityResourceWhiteListConfigurer;
    }

    public void setSecurityResourceWhiteListConfigurer(SecurityResourceWhiteListConfigurer securityResourceWhiteListConfigurer) {
        this.securityResourceWhiteListConfigurer = securityResourceWhiteListConfigurer;
    }

    public AccessTokenService getTokenService() {
        return tokenService;
    }

    public void setTokenService(AccessTokenService tokenService) {
        this.tokenService = tokenService;
    }
}
