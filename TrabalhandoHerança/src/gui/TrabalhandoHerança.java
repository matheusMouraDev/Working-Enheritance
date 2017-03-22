
package gui;

import fachada.Escola;
import java.util.Scanner;
import dados.*;
import excecoes.*;

public class TrabalhandoHerança {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Escola escola = new Escola(10);
        int opcao = 0;
        
        do{
            System.out.println("1 - Inserir aluno.");
            System.out.println("2 - Insetir professor.");
            System.out.println("3 - Listar todos.");
            System.out.println("4 - Listar alunos.");
            System.out.println("5 - Listar professores.");
            System.out.println("6 - Procurar.");
            System.out.println("7 - Alterar");
            System.out.println("8 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");
            switch(opcao) {
                case 1:
                    try {
                        System.out.print("Nome: ");
                        String nome = teclado.nextLine();
                        System.out.print("CPF: ");
                        String cpf = teclado.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = teclado.nextLine();
                        System.out.print("Matricula: ");
                        String matricula = teclado.nextLine();
                        System.out.print("Curso: ");
                        String curso = teclado.nextLine();
                        System.out.println("Aluno cadastrado com sucesso.");
                        System.out.println("");
                        Pessoa aluno = new Aluno(nome, cpf, endereco, matricula, curso);
                        escola.inserir(aluno);
                    }catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    break;
                    
                case 2:
                    try {
                        System.out.print("Nome: ");
                        String nome = teclado.nextLine();
                        System.out.print("CPF: ");
                        String cpf = teclado.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = teclado.nextLine();
                        System.out.print("Matricula: ");
                        String matricula = teclado.nextLine();
                        System.out.print("Formação: ");
                        String formacao = teclado.nextLine();
                        System.out.println("Professor cadastrado com sucesso.");
                        System.out.println("");
                        Pessoa pro = new Professor(nome, cpf, endereco, matricula, formacao);
                        escola.inserir(pro);
                    }catch (VetorCheioException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    break;
                    
                case 3:
                    try{
                        Pessoa ps[] = escola.listar();
                        for(int i=0;i<ps.length;i++){
                            if(ps[i] instanceof Professor) {
                                Professor pro = (Professor) ps[i];
                                System.out.println("--Professor--");
                                System.out.println("Nome: " + pro.getNome());
                                System.out.println("CPF: " + pro.getCpf());
                                System.out.println("Endereco: " + pro.getEndereco());
                                System.out.println("Matricula: " + pro.getMatricula());
                                System.out.println("Formação: " + pro.getFormacao());
                                System.out.println("");
                            }else {
                                Aluno a = (Aluno) ps[i];
                                System.out.println("--Aluno--");
                                System.out.println("Nome: " + a.getNome());
                                System.out.println("CPF: " + a.getCpf());
                                System.out.println("Endereco: " + a.getEndereco());
                                System.out.println("Matricula: " + a.getMatricula());
                                System.out.println("Curso: " + a.getCurso());
                                System.out.println("");
                            }
                        }
                    } catch(VetorVazioException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    break;
                    
                case 4:
                    try{
                        Pessoa ps[] = escola.listarAlunos();
                        for(int i=0;i<ps.length;i++) {
                            Aluno a = (Aluno) ps[i];
                            System.out.println("Nome: " + a.getNome());
                            System.out.println("CPF: " + a.getCpf());
                            System.out.println("Endereço: " + a.getEndereco());
                            System.out.println("Matricula: " + a.getMatricula());
                            System.out.println("Curso: " + a.getCurso());
                            System.out.println("");
                        }
                    }catch(VetorVazioException | NaohaAlunosException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    
                    break;
                    
                case 5:
                    try{
                        Pessoa ps[] = escola.listarProfessores();
                        for(int i=0;i<ps.length;i++) {
                            Professor pro = (Professor) ps[i];
                            System.out.println("Nome: " + pro.getNome());
                            System.out.println("CPF: " + pro.getCpf());
                            System.out.println("Endereço: " + pro.getEndereco());
                            System.out.println("Matricula: " + pro.getMatricula());
                            System.out.println("Formação: " + pro.getFormacao());
                            System.out.println("");
                        }
                    }catch(VetorVazioException | NaoHaProfessoresException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    break;
                    
                case 6:
                    try {
                        escola.getIndice();
                        System.out.print("Digite o CPF a ser procurado. ");
                        String cpf = teclado.nextLine();
                        Pessoa p = escola.procurar(cpf);
                        if(p instanceof Aluno) {
                            Aluno a = (Aluno) p;
                            System.out.println("");
                            System.out.println("--Aluno--");
                            System.out.println("Nome: " + a.getNome());
                            System.out.println("CPF: " + a.getCpf());
                            System.out.println("Endereço: " + a.getEndereco());
                            System.out.println("Matriula: " + a.getMatricula());
                            System.out.println("Curso: " + a.getCurso());
                            System.out.println("");
                        } else{
                            Professor pro = (Professor) p;
                            System.out.println("");
                            System.out.println("--Professor--");
                            System.out.println("Nome: " + pro.getNome());
                            System.out.println("CPF: " + pro.getCpf());
                            System.out.println("Endereço: " + pro.getEndereco());
                            System.out.println("Matriula: " + pro.getMatricula());
                            System.out.println("Formação: " + pro.getFormacao());
                            System.out.println("");
                        }
                    }catch(PessoaNaoEncontradaException | VetorVazioException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    
                    break;
                    
                case 7:
                    try{
                        escola.getIndice();
                        System.out.print("Digite o cpf a ser alterado. ");                       
                        String cpf = teclado.nextLine();
                        Pessoa alterar = escola.procurar(cpf);
                        System.out.print("Novo nome: ");
                        String nome = teclado.nextLine();
                        System.out.print("Novo Endereco: ");
                        String endereco = teclado.nextLine();
                        System.out.print("Nova matricula: ");
                        String matricula = teclado.nextLine();
                        String aux;
                        Pessoa p;
                        if(alterar instanceof Aluno) {                                                       
                            System.out.print("Novo curso: ");
                            aux  = teclado.nextLine();
                            p = new Aluno(nome, cpf, endereco, matricula, aux);
                        } else {                          
                            System.out.print("Nova formação: ");
                            aux = teclado.nextLine();
                            p = new Professor(nome, cpf, endereco, matricula, aux);
                        }   
                        escola.alterar(p);
                        System.out.println("Pessoa alterada com sucesso.");
                        System.out.println("");
                    }catch(VetorVazioException | PessoaNaoEncontradaException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    break;
                case 8:
                    try{
                        escola.getIndice();
                        System.out.print("Digite o CPF a ser removido. ");
                        String cpf = teclado.nextLine();
                        escola.remover(cpf);
                        System.out.println("Removido com sucesso.");
                        System.out.println("");
                    }catch(VetorVazioException | PessoaNaoEncontradaException e) {
                        System.out.println(e.getMessage());
                        System.out.println("");
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção invalida!");
                    System.out.println("");
                    break;
            }
        } while(opcao!=9);
    }
    
}
