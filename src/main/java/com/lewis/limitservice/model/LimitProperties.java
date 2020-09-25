package com.lewis.limitservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LimitProperties {
    private int min;
    private int max;
}
