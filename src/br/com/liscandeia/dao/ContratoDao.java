package br.com.liscandeia.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não tem banco!");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não tem banco!");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não tem banco!");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não tem banco!");
    }
}
