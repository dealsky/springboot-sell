package com.imooc.config;

import com.lly835.bestpay.config.WxPayH5Config;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dealsky
 */
@Configuration
public class WechatPayConfig {

    @Autowired
    private WechatPayAccount wechatPayAccount;

    @Bean
    public BestPayServiceImpl bestPayService() {
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayH5Config(wxPayH5Config());
        return bestPayService;
    }

    @Bean
    public WxPayH5Config wxPayH5Config() {
        WxPayH5Config wxPayH5Config = new WxPayH5Config();
        wxPayH5Config.setAppId(wechatPayAccount.getMpAppId());
        wxPayH5Config.setMchId(wechatPayAccount.getMchId());
        wxPayH5Config.setMchKey(wechatPayAccount.getMchKey());
        wxPayH5Config.setKeyPath(wechatPayAccount.getKeyPath());
        wxPayH5Config.setNotifyUrl(wechatPayAccount.getNotifyUrl());
        return wxPayH5Config;
    }
}
