package br.com.liscandeia;

import br.com.liscandeia.dao.ClienteDao;
import br.com.liscandeia.dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteSevice;

public class ClienteServiceTest {
    @Test
    public void salvarTeste(){
        ClienteDaoMock clienteDaoMock = new ClienteDaoMock();
        //escolhendo a classe dao que vou usar pra teste
        ClienteSevice clienteSevice = new ClienteSevice(clienteDaoMock);
        String retorno = clienteSevice.salvar();
        Assert.assertEquals("Sucesso!",retorno);

    }
    @Test(expected = UnsupportedOperationException.class) //colocar que o teste pra passar levanta um erro
    public void erroSalvarTeste(){
        ClienteDao clienteDao = new ClienteDao();
        //escolhendo a classe dao que vou usar pra teste de erro no caso a dao
        ClienteSevice clienteSevice = new ClienteSevice(clienteDao);
        String retorno = clienteSevice.salvar();
        Assert.assertEquals("Sucesso!",retorno);
    }
}
