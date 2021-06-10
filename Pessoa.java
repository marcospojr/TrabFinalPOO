public class Pessoa {

    private String cpf;
    private String nome;
    private Endereco endereço;

    public Pessoa(String cpf, String nome, Endereco endereço) {
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

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
}
