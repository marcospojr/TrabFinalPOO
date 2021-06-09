import java.util.Date;

public class Corretor extends Funcionario{

    private Date dataInicioTrabalhaoCorretor;
    private boolean possuiCurso;
    private double salarioComComissao;

    public Corretor(String cpf, String nome, Endereço endereço, String telefone, String telefoneContato, String telefoneCelular, Date dataIngresso, String cargo, double salarioBase, String usuario, String senha, Date dataInicioTrabalhaoCorretor, boolean possuiCurso, double salarioComComissao) {
        super(cpf, nome, endereço, telefone, telefoneContato, telefoneCelular, dataIngresso, cargo, salarioBase, usuario, senha);
        this.dataInicioTrabalhaoCorretor = dataInicioTrabalhaoCorretor;
        this.possuiCurso = possuiCurso;
        this.salarioComComissao = salarioComComissao;
    }

    public Date getDataInicioTrabalhaoCorretor() {
        return dataInicioTrabalhaoCorretor;
    }

    public void setDataInicioTrabalhaoCorretor(Date dataInicioTrabalhaoCorretor) {
        this.dataInicioTrabalhaoCorretor = dataInicioTrabalhaoCorretor;
    }

    public boolean isPossuiCurso() {
        return possuiCurso;
    }

    public void setPossuiCurso(boolean possuiCurso) {
        this.possuiCurso = possuiCurso;
    }

    public double getSalarioComComissao() {
        return salarioComComissao;
    }

    public boolean setSalarioComComissao(double salarioComComissao) {
        if(salarioComComissao > 0) {
            this.salarioComComissao = salarioComComissao;
            return true;
        }
        else {
            return false;
        }
    }

    public void calcularSalario(){

    }
}
