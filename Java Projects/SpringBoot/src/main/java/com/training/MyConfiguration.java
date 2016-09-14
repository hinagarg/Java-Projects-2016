/**
 * 
 */
package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author hgarg1
 *
 */
@Configuration
public class MyConfiguration {
  
  @Bean
  public RestTemplate restTemplate()
  {
  
    return new RestTemplate();
  }
}
