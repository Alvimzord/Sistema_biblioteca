package entidades;

public class Obj_livro {

    String nome, editora, nome_autor, descricao, genero;
    int edicao, ano, paginas;
    String[] topicos;
    int exemplares;
    int fixos ;

    private Obj_livro(String nome, String editora, String nome_autor, String descricao, String genero, int edicao, int ano, int paginas, String[] topicos) {
        this.nome = nome;
        this.editora = editora;
        this.nome_autor = nome_autor;
        this.descricao = descricao;
        this.genero = genero;
        this.edicao = edicao;
        this.ano = ano;
        this.paginas = paginas;
        this.topicos = topicos;
        this.exemplares = 0;
        this.fixos = 0;
    }

    public static Obj_livro newInstance(String nome, String editora, String nome_autor, String descricao, String genero, int edicao, int ano, int paginas, String[] topicos) {
        if (true) {
            return new Obj_livro(nome, editora, nome_autor, descricao, genero, edicao, ano, paginas, topicos);
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String[] getTopicos() {
        return topicos;
    }

    public void setTopicos(String[] topicos) {
        this.topicos = topicos;
    }
    
    public boolean adicionar_exemplares(int ex,int fix){
        this.exemplares += ex;
        this.fixos += fix;
        return true;
    }
      public String[] listagem() {
        String[] aluno = new String[3];
        aluno[0] = this.nome;
        aluno[1] = this.nome_autor;
        aluno[2] = Integer.toString(this.edicao);
        return aluno;
    }
}
