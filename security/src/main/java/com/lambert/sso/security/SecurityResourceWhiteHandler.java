package com.lambert.sso.security;

import com.lambert.sso.security.configurer.SecurityContextConfigurer;
import com.lambert.sso.security.configurer.SecurityResourceWhiteListConfigurer;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lambert
 * @version $Id: SecurityResourceWhiteHandler.java, v 0.1 2020年07月31日 9:21 PM lambert Exp $
 */
public class SecurityResourceWhiteHandler {

    private static PathMatcher pathMatcher = new AntPathMatcher();

    public static boolean Handler(HttpServletRequest httpRequest, SecurityResourceWhiteListConfigurer securityResourceWhiteListConfigurer){
        return matchExcludePath(securityResourceWhiteListConfigurer.getExcludeList(),httpRequest.getServletPath());
    }


    private static boolean matchExcludePath(List<String> excludeList, String path) {
        boolean flag = false;
        if (excludeList != null) {
            for (String ignore : excludeList) {
                if (pathMatcher.match(ignore, path)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
