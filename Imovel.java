import java.util.Date;

public abstract class Imovel {
    private double area;
    private Date dataConstrucao;
    private SituacaoImovel situacaoImovel;
    private double valorVenda;
    private double valorLocacao;
    private double valorRealVenda;
    private double valorRealLocacao;
    private double valorComissao;
    private Date dataAnuncio;
    private Endereco endereco;
    private ClienteProprietario clienteProprietario;
    private RegistroTransacao registroTransacao;
    
    public Imovel() {
    	
    }

    public Imovel(double area, Date dataConstrucao, SituacaoImovel situacaoImovel, double valorVenda, double valorLocacao, 
    		double valorRealVenda, double valorRealLocacao, double valorComissao, Date dataAnuncio, Endereco endereco, 
    		ClienteProprietario clienteProprietario, RegistroTransacao registroTransacao) {
        this.area = area;
        this.dataConstrucao = dataConstrucao;
        this.situacaoImovel = situacaoImovel;
        this.valorVenda = valorVenda;
        this.valorLocacao = valorLocacao;
        this.valorRealVenda = valorRealVenda;
        this.valorRealLocacao = valorRealLocacao;
        this.valorComissao = valorComissao;
        this.dataAnuncio = dataAnuncio;
        this.endereco = endereco;
        this.clienteProprietario = clienteProprietario;
        this.registroTransacao = registroTransacao;
    }

    public double getArea() {
        return area;
    }

    public boolean setArea(double area) {
        if(area > 0) {
            this.area = area;
            return true;
        }
        else {
            return false;
        }    }

    public Date getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(Date dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public SituacaoImovel getSituacaoImovel() {
        return situacaoImovel;
    }

    public void setSituacaoImovel(SituacaoImovel situacaoImovel) {
        this.situacaoImovel = situacaoImovel;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorRealVenda() {
        return valorRealVenda;
    }

    public void setValorRealVenda(double valorRealVenda) {
        this.valorRealVenda = valorRealVenda;
    }

    public double getValorRealLocacao() {
        return valorRealLocacao;
    }

    public void setValorRealLocacao(double valorRealLocacao) {
        this.valorRealLocacao = valorRealLocacao;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public boolean setValorComissao(double valorComissao) {
        if(valorComissao > 0) {
            this.valorComissao = valorComissao;
            return true;
        }
        else {
            return false;
        }    }

    public Date getDataAnuncio() {
        return dataAnuncio;
    }

    public void setDataAnuncio(Date dataAnuncio) {
        this.dataAnuncio = dataAnuncio;
    }
}