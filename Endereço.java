public class Endereço {

    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;

    public Endereço(String rua, int numero, String complemento, String cep, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public boolean setRua(String rua) {
        if(rua.length() > 0) {
            this.rua = rua;
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
            return true;
        }
        else {
            return false;
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public boolean setComplemento(String complemento) {
        if(complemento.length() > 0) {
            this.complemento = complemento;
            return true;
        }
        else {
            return false;
        }
    }

    public String getCep() {
        return cep;
    }

    public boolean setCep(String cep) {
        if(cep.length() > 0) {
            this.cep = cep;
            return true;
        }
        else {
            return false;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public boolean setBairro(String bairro) {
        if(bairro.length() > 0) {
            this.bairro = bairro;
            return true;
        }
        else {
            return false;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if(cidade.length() > 0) {
            this.cidade = cidade;
            return true;
        }
        else {
            return false;
        }
    }
}
