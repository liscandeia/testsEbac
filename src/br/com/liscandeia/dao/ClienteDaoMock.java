package br.com.liscandeia.dao;

public class ClienteDaoMock implements IClienteDao{
//simulador do cliente dao pra nao dar erro no teste por banco
    @Override
    public String salvar() {
        return "Sucesso";
    }
}
