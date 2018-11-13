package entidades;

public class Obj_aluno {

    String nome, cpf, telefone, serie, nasc;
    Obj_endereco endereco;

    private Obj_aluno(String nome, String cpf, String telefone, String serie, String nasc, Obj_endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.serie = serie;
        this.nasc = nasc;
        this.endereco = endereco;
    }

    public static Obj_aluno newInstance(String nome, String cpf, String telefone, String serie, String ano, Obj_endereco endereco) {
        if (true) {
            return new Obj_aluno(nome, cpf, telefone, serie, ano, endereco);
        } else {
            return null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAno() {
        return nasc;
    }

    public void setAno(String ano) {
        this.nasc = ano;
    }

    public Obj_endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Obj_endereco endereco) {
        this.endereco = endereco;
    }

    public String[] listagem() {
        String[] aluno = new String[3];
        aluno[0] = this.nome;
        aluno[1] = this.cpf;
        aluno[2] = this.telefone;
        return aluno;
    }
}
