package eu.borislulic.github.config.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties (prefix = ConfigValues.APP_CONFIG_PREFIX)
@Getter
@Setter
@NoArgsConstructor
public class ConfigValues {

  public static final String APP_CONFIG_PREFIX = "app.config.client";

  private String value1;

  private String value2;
}
