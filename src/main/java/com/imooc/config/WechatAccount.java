package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author dealsky
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccount {

    private String mpAppId;

    private String mpAppSecret;

    /**
     * 微信模板id
     */
    private Map<String, String> templateId;
}
