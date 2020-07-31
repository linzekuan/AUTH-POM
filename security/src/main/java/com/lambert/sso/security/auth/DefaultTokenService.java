package com.lambert.sso.security.auth;

/**
 * @author lambert
 * @version $Id: DefaultTokenService.java, v 0.1 2020年07月31日 9:48 PM lambert Exp $
 */
public class DefaultTokenService implements TokenService {

    private TokenStore tokenStore;

    @Override
    public void setTokenStore(TokenStore tokenStore) {
        this.tokenStore = tokenStore;
    }
}
