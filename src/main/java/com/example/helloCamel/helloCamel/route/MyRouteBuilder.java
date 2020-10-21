package com.example.helloCamel.helloCamel.route;

import com.example.helloCamel.helloCamel.processor.CatProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        /**
         * mover elementos para outra
         * */
        //from("{{my.folder.source}}").to("{{my.folder.disti}}");


        /**
         * mover elementos para outra pasta e não deixar backup, copiar a instancia apenas uma
         * única vez. Ao ser alterado o arquivo na pasta source nao refletirá na disti
         * NOOP = No operation to Override Program
         * */
        //from("{{my.folder.source}}?noop=true").to("{{my.folder.disti}}");

        /**
         * realizar chamar de api local
         * */
//        from("{{my.folder.source}}?noop=true")
//                .setHeader(Exchange.HTTP_METHOD, simple("GET"))
//                .to("http://localhost:8080/client")
//                .process(new ModifyClientProcessor())
//                .log("${body}");

        /**
         * chamada de api externa e conversão de json
         * */
        from("{{my.folder.source}}?noop=true")
                .setHeader(Exchange.HTTP_METHOD, simple("GET"))
                .to("https://aws.random.cat/meow")
                .process(new CatProcessor());





    }
}
