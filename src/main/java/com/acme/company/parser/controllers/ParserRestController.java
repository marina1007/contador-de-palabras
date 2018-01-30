package com.acme.company.parser.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marina on 29/01/18.
 */
@RestController
public class ParserRestController {


  @GetMapping(value="/parser", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Map<String, Integer> parseador(@RequestParam(value = "parrafo", defaultValue = "World") String parrafo){

    Map<String, Integer> result = new HashMap<>();

    System.out.println(parrafo);
    //1 divido el parrafo por palabras
    String[] palabras = parrafo.split(" ");

     //2 recorro las palabras obtenidas
    for(int i=0; i<palabras.length; i++){
      //3 veo si exite una palabra igual
      if( result.containsKey(palabras[i]) ) {
        //3.1 si existe incremento el contador
        result.put(palabras[i], result.get(palabras[i]) +1 );
      } else {
        //3.2 sino existe la agrego
        result.put( palabras[i], 1 );
      }
    }


    return result;
  }
}
