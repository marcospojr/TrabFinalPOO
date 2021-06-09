import java.util.Date;

public class Casa extends ImovelResidencial{

    private Boolean ficaEmCondominio;
    private Boolean possuiPiscina;

    public Casa(double area, Date dataConstrucao, SituacaoImovel situacaoImovel, double valorVenda, double valorLocacao, double valorRealVenda, double valorRealLocacao, double valorComissao, Date dataAnuncio, Endereço endereco, ClienteProprietario clienteProprietario, RegistroTransacao registroTransacao, int qntdQuartos, int qntdSuites, int qntdSalasEstar, int qntdSalasJantar, int vagasGaragem, boolean armarioEmbutido, String descrição, Boolean ficaEmCondominio, Boolean possuiPiscina) {
        super(area, dataConstrucao, situacaoImovel, valorVenda, valorLocacao, valorRealVenda, valorRealLocacao, valorComissao, dataAnuncio, endereco, clienteProprietario, registroTransacao, qntdQuartos, qntdSuites, qntdSalasEstar, qntdSalasJantar, vagasGaragem, armarioEmbutido, descrição);
        this.ficaEmCondominio = ficaEmCondominio;
        this.possuiPiscina = possuiPiscina;
    }

    public Boolean getFicaEmCondominio() {
        return ficaEmCondominio;
    }

    public void setFicaEmCondominio(Boolean ficaEmCondominio) {
        this.ficaEmCondominio = ficaEmCondominio;
    }

    public Boolean getPossuiPiscina() {
        return possuiPiscina;
    }

    public void setPossuiPiscina(Boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }
}
