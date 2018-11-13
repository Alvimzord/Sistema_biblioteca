package repositorios;

import java.util.ArrayList;
import entidades.Obj_aluno;

public class Repo_aluno {

    static ArrayList<Obj_aluno> alunos = new ArrayList();

    public Repo_aluno() {
    }

    public boolean adicionar_aluno(Obj_aluno aluno) {
        if (true) {
            alunos.add(aluno);
            return true;
        } else {
            return false;
        }
    }

    public boolean excluir_aluno(String nome) {
        if (alunos.isEmpty()) {
            return false;
        }
        for (int i = 0; i < alunos.size(); i++) {
            Obj_aluno Teste = alunos.get(i);
            if (alunos.get(i).getNome().equals(nome)) {
                alunos.remove(Teste);
                return true;
            }
        }
        return false;
    }

    public Obj_aluno prourar_aluno(String nome) {
        for (Obj_aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public Obj_aluno[] listar() {
        Obj_aluno[] vetor = new Obj_aluno[alunos.size()];
        for (int i = 0; i < alunos.size(); i++) {
            vetor[i] = alunos.get(i);
        }
        return vetor;
    }
}
