public class Pessoa {

    private String cpf;
    private String nome;
    private Endereço endereço;
    private ValidaCPF validaCPF;

    public Pessoa(String cpf, String nome, Endereço endereço) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.length() > 0) {
            this.nome = nome;
            return true;
        }
        else {
            return false;
        }    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
