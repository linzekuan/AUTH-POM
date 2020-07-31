package com.lambert.sso.security.configurer;

import com.lambert.sso.security.auth.TokenService;

/**
 * @author lambert
 * @version $Id: SecurityContextConfigurer.java, v 0.1 2020年07月31日 8:28 PM lambert Exp $
 */
public class SecurityContextConfigurer {

    private SecurityResourceWhiteListConfigurer securityResourceWhiteListConfigurer;

    private TokenService tokenService;

    public SecurityResourceWhiteListConfigurer getSecurityResourceWhiteListConfigurer() {
        return securityResourceWhiteListConfigurer;
    }

    public void setSecurityResourceWhiteListConfigurer(SecurityResourceWhiteListConfigurer securityResourceWhiteListConfigurer) {
        this.securityResourceWhiteListConfigurer = securityResourceWhiteListConfigurer;
    }

    public TokenService getTokenService() {
        return tokenService;
    }

    public void setTokenService(TokenService tokenService) {
        this.tokenService = tokenService;
    }
}
