package br.com.fatec.api_links_uteis.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void deveRetornarMensagemHello() {
        String resultado = controller.hello();
        assertEquals("Olá Fatec", resultado);
    }

}
