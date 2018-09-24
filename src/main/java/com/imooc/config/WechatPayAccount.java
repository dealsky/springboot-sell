package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author dealsky
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat.pay")
public class WechatPayAccount {

    private String mpAppId;

    private String mchId;

    private String mchKey;

    private String keyPath;

    private String notifyUrl;
}
