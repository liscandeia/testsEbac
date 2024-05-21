package br.com.liscandeia;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    @Test
    public void testeClasseCliente(){
        Cliente cliente = new Cliente();
        cliente.adicionarNome("Lis");
        Assert.assertEquals("Lis", cliente.getNome());
    }

}
