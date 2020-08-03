package com.lambert.sso.security;

import com.lambert.sso.security.configurer.SecurityContextConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lambert
 * @version $Id: SecurityCheckLoginHandler.java, v 0.1 2020年08月03日 10:25 PM lambert Exp $
 */
public class SecurityCheckLoginHandler {

    public static boolean handler(HttpServletRequest request, HttpServletResponse response, SecurityContextConfigurer securityContextConfigurer) throws IOException {
        return false;
    }
}
