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

  private final ConfigValues configValues;

  public static void main(String[] args) {
    SpringApplication.run(ConfigClient.class, args);
  }

  @Bean
  public CommandLineRunner getConfiguration() {
    return args -> {
      log.info("Configuration property: '{}' value: '{}'", APP_CONFIG_PREFIX + ".value1", configValues.getValue1());
      log.info("Configuration property: '{}' value: '{}'", APP_CONFIG_PREFIX + ".value2", configValues.getValue2());
    };
  }
}