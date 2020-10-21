package com.example.helloCamel.helloCamel.processor;

import com.example.helloCamel.helloCamel.model.Client;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ClientProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody(String.class));
        Client client = new Client();
        client.setName("Deus");
        client.setIdade(7);
        exchange.getIn().setBody(client);
    }
}
