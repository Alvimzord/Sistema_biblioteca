package entidades;

public class Obj_endereco {

    String cidade, complemento, bairro, rua,cep, numero;

    private Obj_endereco(String cidade, String complemento, String bairro, String rua, String cep, String numero) {
        this.cidade = cidade;
        this.complemento = complemento;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public static Obj_endereco newInstance(String cidade, String complemento, String bairro, String rua, String cep, String numero) {
        if (true) {
            return new Obj_endereco(cidade, complemento, bairro, rua, cep, numero);
        } else {
            return null;
        }

    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}