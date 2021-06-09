import java.util.ArrayList;

public class Cliente extends Pessoa{

    ArrayList<String> telefonesContato = new ArrayList<>();
    private String email;
    private String sexo;
    private String estadoCivil;
    private String profissao;

    public Cliente(String cpf, String nome, Endereço endereço, ArrayList<String> telefonesContato, 
    		String email, String sexo, String estadoCivil, String profissao) {
        super(cpf, nome, endereço);
        this.telefonesContato = telefonesContato;
        this.email = email;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    public ArrayList<String> getTelefonesContato() {
        return telefonesContato;
    }

    public void setTelefonesContato(ArrayList<String> telefonesContato) {
        this.telefonesContato = telefonesContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
