package com.imooc.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dealsky
 */
@Configuration
public class WechatOpenConfig {

    @Autowired
    private WechatOpenAccount wechatOpenAccount;

    @Bean
    public WxMpService wxOpenService() {
        WxMpService wxOpenService = new WxMpServiceImpl();
        wxOpenService.setWxMpConfigStorage(wxOpenConfigStorage());
        return wxOpenService;
    }

    @Bean
    public WxMpConfigStorage wxOpenConfigStorage() {
        WxMpInMemoryConfigStorage wxOpenConfigStorage = new WxMpInMemoryConfigStorage();
        wxOpenConfigStorage.setAppId(wechatOpenAccount.getMpAppId());
        wxOpenConfigStorage.setSecret(wechatOpenAccount.getMpAppSecret());
        return wxOpenConfigStorage;
    }
}
