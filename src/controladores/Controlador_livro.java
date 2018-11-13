package controladores;

import entidades.Obj_livro;
import repositorios.Repo_livro;

public class Controlador_livro {

    Repo_livro livros;

    public Controlador_livro() {
        this.livros = new Repo_livro();
    }

    public void adicionar_livro(String nome, String editora, String nome_autor, String descricao, String genero, int edicao, int ano, int paginas, String[] topicos) {
        Obj_livro livro = Obj_livro.newInstance(nome, editora, nome_autor, descricao, genero, edicao, ano, paginas, topicos);
        livros.adicionar_livro(livro);
    }

    public boolean excluir_livro(String nome) {
        return livros.excluir_livro(nome);
    }

    public Obj_livro[] listar_livros() {
        return livros.listar();
    }

}
