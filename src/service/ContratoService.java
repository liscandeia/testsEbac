package service;

import br.com.liscandeia.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso!";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso!";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso!";    }
}
