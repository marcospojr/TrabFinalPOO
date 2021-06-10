import java.util.ArrayList;
import java.util.Date;

public class ClienteProprietario extends Cliente{

    private Date dataPrimeiroImovel;

    public ClienteProprietario(String cpf, String nome, Endereco endereço, ArrayList<String> telefonesContato, String email, String sexo, String estadoCivil, String profissao, Date dataPrimeiroImovel) {
        super(cpf, nome, endereço, telefonesContato, email, sexo, estadoCivil, profissao);
        this.dataPrimeiroImovel = dataPrimeiroImovel;
    }

    public Date getDataPrimeiroImovel() {
        return dataPrimeiroImovel;
    }

    public void setDataPrimeiroImovel(Date dataPrimeiroImovel) {
        this.dataPrimeiroImovel = dataPrimeiroImovel;
    }
}
