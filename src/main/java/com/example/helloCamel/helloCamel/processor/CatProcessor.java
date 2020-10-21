package com.example.helloCamel.helloCamel.processor;

import com.example.helloCamel.helloCamel.model.Cat;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class CatProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Message message = exchange.getIn();
        Cat cat = message.getBody(Cat.class);
        System.out.println(cat);
    }
}
