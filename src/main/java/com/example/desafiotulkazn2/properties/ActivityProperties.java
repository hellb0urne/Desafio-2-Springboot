package com.example.desafiotulkazn2.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Activity.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@Getter
@Setter
@Component
@NoArgsConstructor
@ConfigurationProperties(prefix = "activity")
public class ActivityProperties {

    private List<String>typeList;

}
