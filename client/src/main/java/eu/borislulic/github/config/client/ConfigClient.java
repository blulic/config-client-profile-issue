package eu.borislulic.github.config.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import static eu.borislulic.github.config.client.ConfigValues.APP_CONFIG_PREFIX;

@SpringBootApplication
@EnableConfigurationProperties (ConfigValues.class)
@RequiredArgsConstructor
@Slf4j
public class ConfigClient {

  protected static final String CONFIGURATION_PROPERTY_VALUE = "Configuration property: '{}' value: '{}'";
  protected static final String VALUE = ".value";
  private final ConfigValues configValues;

  public static void main(String[] args) {
    SpringApplication.run(ConfigClient.class, args);
  }

  @Bean
  public CommandLineRunner getConfiguration() {
    return args -> {
      log.info(CONFIGURATION_PROPERTY_VALUE, APP_CONFIG_PREFIX + VALUE + "1", configValues.getValue1());
      log.info(CONFIGURATION_PROPERTY_VALUE, APP_CONFIG_PREFIX + VALUE + "2", configValues.getValue2());
      log.info(CONFIGURATION_PROPERTY_VALUE, APP_CONFIG_PREFIX + VALUE + "3", configValues.getValue3());
      log.info(CONFIGURATION_PROPERTY_VALUE, APP_CONFIG_PREFIX + VALUE + "4", configValues.getValue4());
    };
  }
}