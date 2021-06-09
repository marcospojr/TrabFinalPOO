import java.util.ArrayList;

public class ClienteUsuario extends Cliente{

    private String nomeAvalista;
    private String cpfAvalista;

    public ClienteUsuario(String cpf, String nome, Endereço endereço, ArrayList<String> telefonesContato, String email, String sexo, String estadoCivil, String profissao, String nomeAvalista, String cpfAvalista) {
        super(cpf, nome, endereço, telefonesContato, email, sexo, estadoCivil, profissao);
        this.nomeAvalista = nomeAvalista;
        this.cpfAvalista = cpfAvalista;
    }

    public String getNomeAvalista() {
        return nomeAvalista;
    }

    public boolean setNomeAvalista(String nomeAvalista) {
        if(nomeAvalista.length() > 0) {
            this.nomeAvalista = nomeAvalista;
            return true;
        }
        else {
            return false;
        }    }

    public String getCpfAvalista() {
        return cpfAvalista;
    }

    public boolean setCpfAvalista(String cpfAvalista) {
        if(cpfAvalista.length() > 0) {
            this.cpfAvalista = cpfAvalista;
            return true;
        }
        else {
            return false;
        }    }
}

