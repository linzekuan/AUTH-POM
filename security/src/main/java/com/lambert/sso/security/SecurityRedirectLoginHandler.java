package com.lambert.sso.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lambert
 * @version $Id: SecurityRedirectLoginHandler.java, v 0.1 2020年07月31日 9:30 PM lambert Exp $
 */
public class SecurityRedirectLoginHandler {

    public static final String LOGIN_PAGE = "/login";

    public static void handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(LOGIN_PAGE);
    }
}
