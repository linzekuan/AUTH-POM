package com.lambert.sso.security.auth;

/**
 * @author lambert
 * @version $Id: TokenGranter.java, v 0.1 2020年08月03日 10:30 PM lambert Exp $
 */
public interface TokenGranter {
    public AccessToken grant();
}
