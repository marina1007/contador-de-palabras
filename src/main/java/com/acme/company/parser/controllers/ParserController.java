package com.acme.company.parser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marina on 24/01/18.
 */
@Controller
public class ParserController {

  @RequestMapping("/parseador")
  public String parseador() {
    return "parserView";
  }


}
