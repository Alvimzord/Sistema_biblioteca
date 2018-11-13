package repositorios;

import entidades.Obj_livro;
import java.util.ArrayList;

public class Repo_livro {

    static ArrayList<Obj_livro> livros = new ArrayList();

    public Repo_livro() {
    }

    public boolean adicionar_livro(Obj_livro livro) {
        if (true) {
            livros.add(livro);
            return true;
        } else {
            return false;
        }
    }

    public boolean excluir_livro(String nome) {
        if (livros.isEmpty()) {
            return false;
        }
        for (int i = 0; i < livros.size(); i++) {
            Obj_livro Teste = livros.get(i);
            if (livros.get(i).getNome().equals(nome)) {
                livros.remove(Teste);
                return true;
            }
        }
        return false;
    }

    public Obj_livro prourar_livro(String nome) {
        for (int i = 0; i < livros.size(); i++) {
             if (livros.get(i).getNome().equals(nome)) {
                return livros.get(i);
            }
        }
        return null;
    }
    
    public Obj_livro[] listar(){
        return (Obj_livro[]) livros.toArray();
    }

}