package com.micromata.examples.spring.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller :)
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
@RestController
public class DemoController {
  @Autowired
  private DemoService demoService;

  @RequestMapping("/")
  public String home() {
    return demoService.getValue();
  }
}
