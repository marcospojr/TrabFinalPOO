import java.util.Date;

public class Funcionario extends Pessoa{

    private String telefone;
    private String telefoneContato;
    private String telefoneCelular;
    private Date dataIngresso;
    private String cargo;
    private double salarioBase;
    private String usuario;
    private String senha;

    public Funcionario(String cpf, String nome, Endereço endereço, String telefone, String telefoneContato, String telefoneCelular, Date dataIngresso, String cargo, double salarioBase, String usuario, String senha) {
        super(cpf, nome, endereço);
        this.telefone = telefone;
        this.telefoneContato = telefoneContato;
        this.telefoneCelular = telefoneCelular;
        this.dataIngresso = dataIngresso;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean setTelefone(String telefone) {
        if(telefone.length() > 0) {
            this.telefone = telefone;
            return true;
        }
        else {
            return false;
        }    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public boolean setTelefoneContato(String telefoneContato) {
        if(telefoneContato.length() > 0) {
            this.telefoneContato = telefoneContato;
            return true;
        }
        else {
            return false;
        }    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public boolean setTelefoneCelular(String telefoneCelular) {
        if(telefoneCelular.length() > 0) {
            this.telefoneCelular = telefoneCelular;
            return true;
        }
        else {
            return false;
        }    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(String cargo) {
        if(cargo.length() > 0) {
            this.cargo = cargo;
            return true;
        }
        else {
            return false;
        }    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public boolean setSalarioBase(double salarioBase) {
        if(salarioBase > 0) {
            this.salarioBase = salarioBase;
            return true;
        }
        else {
            return false;
        }    }

    public String getUsuario() {
        return usuario;
    }

    public boolean setUsuario(String usuario) {
        if(usuario.length() > 0) {
            this.usuario = usuario;
            return true;
        }
        else {
            return false;
        }    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if(senha.length() > 0) {
            this.senha = senha;
            return true;
        }
        else {
            return false;
        }    }
}
