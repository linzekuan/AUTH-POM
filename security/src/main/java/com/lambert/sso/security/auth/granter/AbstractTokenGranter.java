package com.lambert.sso.security.auth.granter;

import com.lambert.sso.security.auth.AccessToken;
import com.lambert.sso.security.auth.TokenGranter;

/**
 * @author lambert
 * @version $Id: AbstractTokenGranter.java, v 0.1 2020年08月03日 10:32 PM lambert Exp $
 */
public class AbstractTokenGranter implements TokenGranter {
    @Override
    public AccessToken grant() {
        return getAccessToken();
    }

    private AccessToken getAccessToken(){
        return null;
    }
}
