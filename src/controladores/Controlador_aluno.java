package controladores;

import entidades.Obj_aluno;
import entidades.Obj_endereco;
import repositorios.Repo_aluno;

public class Controlador_aluno {
    Repo_aluno alunos;
    
    public Controlador_aluno(){
        this.alunos = new Repo_aluno();
    }
    
    public void adicionar_aluno(String nome, String cpf,String telefone, String serie, String ano,Obj_endereco endereco){
       Obj_aluno aluno = Obj_aluno.newInstance(nome, cpf, telefone, serie, ano, endereco);
       alunos.adicionar_aluno(aluno);
    }
    
    public boolean excluir_aluno(String nome){
        return alunos.excluir_aluno(nome);
    }
    
    public Obj_aluno[] listar_alunos(){
        return alunos.listar();
    }
    
}