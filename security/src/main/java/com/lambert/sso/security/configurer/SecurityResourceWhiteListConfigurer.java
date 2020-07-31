package com.lambert.sso.security.configurer;

import java.util.List;

/**
 * @author lambert
 * @version $Id: SecurityResourceWhiteListConfigurer.java, v 0.1 2020年07月31日 9:17 PM lambert Exp $
 */
public class SecurityResourceWhiteListConfigurer {

    private List<String> excludeList;

    public List<String> getExcludeList() {
        return excludeList;
    }

    public void setExcludeList(List<String> excludeList) {
        this.excludeList = excludeList;
    }
}
