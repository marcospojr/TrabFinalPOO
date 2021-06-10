import java.util.Date;

public class SalaComercial extends Imovel{

    private int qntdBanheiros;
    private int qntdComodos;

    public SalaComercial(double area, Date dataConstrucao, SituacaoImovel situacaoImovel, double valorVenda, double valorLocacao, double valorRealVenda, double valorRealLocacao, double valorComissao, Date dataAnuncio, Endereco endereco, ClienteProprietario clienteProprietario, RegistroTransacao registroTransacao, int qntdBanheiros, int qntdComodos) {
        super(area, dataConstrucao, situacaoImovel, valorVenda, valorLocacao, valorRealVenda, valorRealLocacao, valorComissao, dataAnuncio, endereco, clienteProprietario, registroTransacao);
        this.qntdBanheiros = qntdBanheiros;
        this.qntdComodos = qntdComodos;
    }

    public int getQntdBanheiros() {
        return qntdBanheiros;
    }

    public boolean setQntdBanheiros(int qntdBanheiros) {
        if(qntdBanheiros > 0) {
            this.qntdBanheiros = qntdBanheiros;
            return true;
        }
        else {
            return false;
        }    }

    public int getQntdComodos() {
        return qntdComodos;
    }

    public boolean setQntdComodos(int qntdComodos) {
        if(qntdComodos > 0) {
            this.qntdComodos = qntdComodos;
            return true;
        }
        else {
            return false;
        }    }
}
