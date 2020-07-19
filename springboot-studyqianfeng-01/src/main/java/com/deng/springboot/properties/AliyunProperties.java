package com.deng.springboot.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * AliyunProperties class
 *
 * @author DengWeiCheng
 * @date 2020/7/17 20:59
 */
@Component
@ConfigurationProperties(prefix ="aliyun")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliyunProperties {
    private String xxxx;
    private String yyyy;
    private String aaaa;
    private String bbbb;
    private String cccc;

}
