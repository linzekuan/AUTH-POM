package com.lambert.sso.adapter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lambert
 * @version $Id: WebProperty.java, v 0.1 2020年01月18日 12:00 PM lambert Exp $
 */
@Component
public class WebProperty {

    public static final String SYSTEM_USER_HOME;

    public static String ASSETS_RESOURCE;

    static {
        SYSTEM_USER_HOME = System.getProperty("user.home");
    }

    @Value("${assets.resource:}")
    public void setAssetsResource(String assetsResource) {
        WebProperty.ASSETS_RESOURCE = assetsResource;
    }
}
