package com.edu.mobileappws.security;

import com.edu.mobileappws.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 864_000_000;   //10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";

    public static String getTokenSecret() {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
}
