package service;

import br.com.liscandeia.dao.ClienteDao;
import br.com.liscandeia.dao.IClienteDao;

public class ClienteSevice {
    private IClienteDao clienteDao;
    //passando a responsa de salvar pra implementação pra eu poder escolher o mock
    //que é a clienteDao de teste
    public ClienteSevice(IClienteDao clienteDao){
        //iClienteDao = new ClienteDao();
        this.clienteDao = clienteDao;

    }
    public String salvar(){
        clienteDao.salvar();
       return  "Sucesso!";
    }
}
