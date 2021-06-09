public class FormaDePagamento {

    private Boolean temPrazo;
    private int qntdParcelas;
    private String tipoPagamento;

    public FormaDePagamento(Boolean temPrazo, int qntdParcelas, String tipoPagamento) {
        this.temPrazo = temPrazo;
        this.qntdParcelas = qntdParcelas;
        this.tipoPagamento = tipoPagamento;
    }

    public Boolean isTemPrazo() {
        return temPrazo;
    }

    public void setTemPrazo(Boolean temPrazo) {
        this.temPrazo = temPrazo;
    }

    public int getQntdParcelas() {
        return qntdParcelas;
    }

    public boolean setQntdParcelas(int qntdParcelas) {
        if(qntdParcelas > 0) {
            this.qntdParcelas = qntdParcelas;
            return true;
        }
        else {
            return false;
        }
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public boolean setTipoPagamento(String tipoPagamento) {
        if(tipoPagamento.length() > 0) {
            this.tipoPagamento = tipoPagamento;
            return true;
        }
        else {
            return false;
        }    }
}
