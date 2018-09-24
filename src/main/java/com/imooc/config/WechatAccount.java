package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author dealsky
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccount {

    private String mpAppId;

    private String mpAppSecret;
}
