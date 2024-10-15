package org.example.configures.entity;

import lombok.Data;
import org.example.configures.loader.YamlPropertyLoader;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author 86184
 */
@Data
@Component
//批量读取配置文件信息
@ConfigurationProperties(prefix = "family")
@Validated
@PropertySource(value = {"classpath:family.yaml"},factory = YamlPropertyLoader.class)
public class Family {

    @Length(min = 5, max = 10 , message = "家庭名称必须5到10")
    private String familyName;

    private String father;
    private String mother;
    private String child;
    @Range(min = 3,message = "年限必须大于三年")
    private Integer age;
//    @Value("${family.family-name}")
//    private String familyName;
//    @Value("${family.father}")
//    private String father;
//    @Value("${family.mother}")
//    private String mother;
//    @Value("${family.child}")
//    private String child;
//    @Value("${family.age}")
//    private int age;
}