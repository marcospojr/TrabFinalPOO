import java.util.Date;

public class Terreno extends Imovel{

    private double largura;
    private double comprimento;
    private Boolean possuiAclive;
    private Boolean possuiDeclive;

    public Terreno(double area, Date dataConstrucao, SituacaoImovel situacaoImovel, double valorVenda, double valorLocacao, double valorRealVenda, double valorRealLocacao, double valorComissao, Date dataAnuncio, Endereco endereco, ClienteProprietario clienteProprietario, RegistroTransacao registroTransacao, double largura, double comprimento, Boolean possuiAclive, Boolean possuiDeclive) {
        super(area, dataConstrucao, situacaoImovel, valorVenda, valorLocacao, valorRealVenda, valorRealLocacao, valorComissao, dataAnuncio, endereco, clienteProprietario, registroTransacao);
        this.largura = largura;
        this.comprimento = comprimento;
        this.possuiAclive = possuiAclive;
        this.possuiDeclive = possuiDeclive;
    }

    public double getLargura() {
        return largura;
    }

    public boolean setLargura(double largura) {
        if(largura > 0) {
            this.largura = largura;
            return true;
        }
        else {
            return false;
        }    }

    public double getComprimento() {
        return comprimento;
    }

    public boolean setComprimento(double comprimento) {
        if(comprimento > 0) {
            this.comprimento = comprimento;
            return true;
        }
        else {
            return false;
        }    }

    public Boolean getPossuiAclive() {
        return possuiAclive;
    }

    public void setPossuiAclive(Boolean possuiAclive) {
        this.possuiAclive = possuiAclive;
    }

    public Boolean getPossuiDeclive() {
        return possuiDeclive;
    }

    public void setPossuiDeclive(Boolean possuiDeclive) {
        this.possuiDeclive = possuiDeclive;
    }
}
