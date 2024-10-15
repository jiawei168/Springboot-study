package org.example.configures.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class person {
    private String firstName;
    private String lastName;
    private int age;
    private UUID id;
    private String phone;
}
