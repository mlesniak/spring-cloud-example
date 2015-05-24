package com.micromata.examples.spring.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Demo bean (which can be reinitialized from the server).
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
@Service
@RefreshScope
public class DemoService {
  private static final Logger LOG = LoggerFactory.getLogger(DemoService.class);

  @Value("${key:undefined}")
  private String value;

  public String getValue() {
    return value;
  }

  @PostConstruct
  public void info() {
    LOG.info("Instance created.");
  }
}
