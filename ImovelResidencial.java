import java.util.Date;

public class ImovelResidencial extends Imovel{

    private int qntdQuartos;
    private int qntdSuites;
    private int qntdSalasEstar;
    private int qntdSalasJantar;
    private int vagasGaragem;
    private boolean armarioEmbutido;
    private String descrição;
    
    public ImovelResidencial() {
    	
    }

    public ImovelResidencial(double area, Date dataConstrucao, SituacaoImovel situacaoImovel, double valorVenda, double valorLocacao, double valorRealVenda, double valorRealLocacao, double valorComissao, Date dataAnuncio, Endereco endereco, ClienteProprietario clienteProprietario, RegistroTransacao registroTransacao, int qntdQuartos, int qntdSuites, int qntdSalasEstar, int qntdSalasJantar, int vagasGaragem, boolean armarioEmbutido, String descrição) {
        super(area, dataConstrucao, situacaoImovel, valorVenda, valorLocacao, valorRealVenda, valorRealLocacao, valorComissao, dataAnuncio, endereco, clienteProprietario, registroTransacao);
        this.qntdQuartos = qntdQuartos;
        this.qntdSuites = qntdSuites;
        this.qntdSalasEstar = qntdSalasEstar;
        this.qntdSalasJantar = qntdSalasJantar;
        this.vagasGaragem = vagasGaragem;
        this.armarioEmbutido = armarioEmbutido;
        this.descrição = descrição;
    }

    public int getQntdQuartos() {
        return qntdQuartos;
    }

    public void setQntdQuartos(int qntdQuartos) {
        this.qntdQuartos = qntdQuartos;
    }

    public int getQntdSuites() {
        return qntdSuites;
    }

    public void setQntdSuites(int qntdSuites) {
        this.qntdSuites = qntdSuites;
    }

    public int getQntdSalasEstar() {
        return qntdSalasEstar;
    }

    public void setQntdSalasEstar(int qntdSalasEstar) {
        this.qntdSalasEstar = qntdSalasEstar;
    }

    public int getQntdSalasJantar() {
        return qntdSalasJantar;
    }

    public void setQntdSalasJantar(int qntdSalasJantar) {
        this.qntdSalasJantar = qntdSalasJantar;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public boolean isArmarioEmbutido() {
        return armarioEmbutido;
    }

    public void setArmarioEmbutido(boolean armarioEmbutido) {
        this.armarioEmbutido = armarioEmbutido;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
