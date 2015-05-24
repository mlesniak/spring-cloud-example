package com.micromata.examples.spring.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Entry point.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
@RestController
@EnableConfigServer
@SpringBootApplication
public class ServerMain {
  public static void main(String[] args) {
    SpringApplication.run(ServerMain.class, args);
  }

  @RequestMapping("/")
  public String home() {
    return "Hello World";
  }
}
