public class RegistroTransacao {

    private Imovel imovel;
    private String tipoTransacao;
    private Corretor corretor;
    private FormaDePagamento formaDePagamento;
    private int numeroContrato;
    private ClienteUsuario clienteUsuario;

    public RegistroTransacao(Imovel imovel, String tipoTransacao, Corretor corretor, FormaDePagamento formaDePagamento, int numeroContrato, ClienteUsuario clienteUsuario) {
        this.imovel = imovel;
        this.tipoTransacao = tipoTransacao;
        this.corretor = corretor;
        this.formaDePagamento = formaDePagamento;
        this.numeroContrato = numeroContrato;
        this.clienteUsuario = clienteUsuario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public boolean setTipoTransacao(String tipoTransacao) {
        if(tipoTransacao.length() > 0) {
            this.tipoTransacao = tipoTransacao;
            return true;
        }
        else {
            return false;
        }    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public boolean setNumeroContrato(int numeroContrato) {
        if(numeroContrato > 0) {
            this.numeroContrato = numeroContrato;
            return true;
        }
        else {
            return false;
        }    }

    public ClienteUsuario getClienteUsuario() {
        return clienteUsuario;
    }

    public void setClienteUsuario(ClienteUsuario clienteUsuario) {
        this.clienteUsuario = clienteUsuario;
    }
}
