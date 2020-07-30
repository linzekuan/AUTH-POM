package com.lambert.sso.web.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lambert
 * @version $Id: LoginController.java, v 0.1 2020年07月30日 10:32 PM lambert Exp $
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
