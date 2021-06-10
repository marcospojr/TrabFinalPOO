import java.util.Date;

public class Apartamento extends ImovelResidencial{

    private int andar;
    private double valorCondominio;
    private Boolean possuiPortaria24h;

    public Apartamento(double area, Date dataConstrucao, SituacaoImovel situacaoImovel, double valorVenda, double valorLocacao, double valorRealVenda, double valorRealLocacao, double valorComissao, Date dataAnuncio, Endereco endereco, ClienteProprietario clienteProprietario, RegistroTransacao registroTransacao, int qntdQuartos, int qntdSuites, int qntdSalasEstar, int qntdSalasJantar, int vagasGaragem, boolean armarioEmbutido, String descrição, int andar, double valorCondominio, Boolean possuiPortaria24h) {
        super(area, dataConstrucao, situacaoImovel, valorVenda, valorLocacao, valorRealVenda, valorRealLocacao, valorComissao, dataAnuncio, endereco, clienteProprietario, registroTransacao, qntdQuartos, qntdSuites, qntdSalasEstar, qntdSalasJantar, vagasGaragem, armarioEmbutido, descrição);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
        this.possuiPortaria24h = possuiPortaria24h;
    }

    public int getAndar() {
        return andar;
    }

    public boolean setAndar(int andar) {
        if(andar > 0) {
            this.andar = andar;
            return true;
        }
        else {
            return false;
        }    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public boolean setValorCondominio(double valorCondominio) {
        if(valorCondominio > 0) {
            this.valorCondominio = valorCondominio;
            return true;
        }
        else {
            return false;
        }    }

    public Boolean getPossuiPortaria24h() {
        return possuiPortaria24h;
    }

    public void setPossuiPortaria24h(Boolean possuiPortaria24h) {
        this.possuiPortaria24h = possuiPortaria24h;
    }
}
