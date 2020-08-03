package com.lambert.sso.security.auth;

/**
 * @author lambert
 * @version $Id: DefaultAccessTokenService.java, v 0.1 2020年07月31日 9:48 PM lambert Exp $
 */
public class DefaultAccessTokenService implements AccessTokenService {

    private TokenStore tokenStore;

    @Override
    public void setTokenStore(TokenStore tokenStore) {
        this.tokenStore = tokenStore;
    }
}
