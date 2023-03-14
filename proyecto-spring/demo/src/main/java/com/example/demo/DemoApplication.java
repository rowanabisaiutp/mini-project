/* */
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    //primer parametro....

    //--------------------------------------------------------------------------------
    //en este parametro es el ejemplo visto en clase, la cual implico en realizar
    //la impresion del primer resultado del HOLA MUNDO  a travez de se Spring boot...
    //--------------------------------------------------------------------------------

    ///hello

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "mundo") String name) {
      return String.format("holaaa %s!", name);
    }

    //--------------------------------------------------------------------------------
    //en este segundo ejemplo se realizo un query string como segundo parametro como segunda
    //activivdad, la cual implica la impresion de valores a travez de la URL localhost:port...
    //--------------------------------------------------------------------------------
    //Rowan Abisai Ojeda Kumul...
    //--------------------------------------------------------------------------------
    //puerto
    //  http://localhost:8086/ejemplo?param1=hola&param2=123
    //PARAMETRO DE EJEMPLO...
    //--------------------------------------------------------------------------------
    @RestController
    public class EjemploController {

    @GetMapping("/ejemplo")
    public String ejemplo(@RequestParam("param1") String parametro1, @RequestParam("param2") int parametro2) {
        return "Los valores de los parámetros son: " + parametro1 + " y " + parametro2;
    }
  }
}