package br.com.liscandeia;

import br.com.liscandeia.dao.ContratoDao;
import br.com.liscandeia.dao.ContratoDaoMock;
import br.com.liscandeia.dao.IContratoDao;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso!",retorno);
    }
    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso!", retorno);

    }
    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso!", retorno);
    }
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso!", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void salvarNoBancoDeDadosErro (){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso!",retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void excluirNoBancoDeDadosErro(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso!",retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void atualizarNoBancoDeDadosErro(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso!",retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void buscarNoBancoDeDadosErro(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso!",retorno);
    }

}
