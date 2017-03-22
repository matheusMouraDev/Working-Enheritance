
package teste;

import dados.*;
import excecoes.*;
import fachada.Escola;

public class teste {
    
    public static void main(String[] args) throws VetorCheioException {
        
        Escola escola = new Escola(10);
        Pessoa p = null;
        int opcao = 0;
        Aluno aluno = new Aluno("a","a","a","a","a");
        Professor pro = new Professor();
        escola.inserir(aluno);
        
        try{
            Pessoa x[] =escola.listar();
            for(int i=0;i<x.length;i++) {
                System.out.println(x[i].getNome());
            }
            System.out.println("");
        }catch(VetorVazioException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pessoa alunos[] = escola.listarAlunos();
            for(int i=0;i<alunos.length;i++) {
                Aluno al = (Aluno) alunos[i];
                System.out.println("Aluno: " + al.getNome());
                System.out.println("CPF: " + al.getCpf());
                System.out.println("Endereço: " + al.getEndereco());
                System.out.println("Matricula: " + al.getMatricula());
                System.out.println("Curso: " + al.getCurso());
            }
        }catch (VetorVazioException | NaohaAlunosException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
