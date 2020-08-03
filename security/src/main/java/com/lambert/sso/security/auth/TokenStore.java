package com.lambert.sso.security.auth;

/**
 * @author lambert
 * @version $Id: TokenStore.java, v 0.1 2020年07月31日 9:41 PM lambert Exp $
 */
public interface TokenStore {
    /**
     * 保存
     * @param accessToken
     */
    void storeAccessToken(AccessToken accessToken);

    /**
     * 根据 token 获取 Authentication
     * @param token
     * @return
     */
    Authentication readAuthentication(AccessToken token);

    /**
     * 读取 AccessToken
     * @param Token
     * @return
     */
    AccessToken readAccessToken(String Token);

    /**
     * 移除
     * @param accessToken
     */
    void removeAccessToken(AccessToken accessToken);

    /**
     * 存储 refresh Token和 authentication 的对应关系
     * @param refreshToken
     * @param authentication
     */
    void storeRefreshToken(RefreshToken refreshToken, Authentication authentication);

    /**
     * 根据 AccessToken获取 RefreshToken
     * @param token
     * @return
     */
    RefreshToken readRefreshToken(String token);

    /**
     * 根据 refreshToken 获取 Authentication
     * @param token
     * @return
     */
    Authentication readAuthenticationForRefreshToken(RefreshToken token);

    /**
     * 移除refreshToken
     * @param token
     */
    void removeRefreshToken(RefreshToken token);

    /**
     * 用refreshToken移除AccessToken
     * @param refreshToken
     */
    void removeAccessTokenUsingRefreshToken(RefreshToken refreshToken);

    /**
     *
     * 根据认证信息 Authentication 获取 AccessToken
     * @param authentication
     * @return
     */
    AccessToken getAccessToken(Authentication authentication);
}
