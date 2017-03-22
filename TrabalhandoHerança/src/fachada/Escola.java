
package fachada;

import negocio.CadastroPessoa;
import dados.*;
import excecoes.*;

public class Escola {
    private CadastroPessoa cadastropessoa;

    public Escola(int qMaxPessoas) {
        this.cadastropessoa = new CadastroPessoa(qMaxPessoas);
    }
    
    public void inserir(Pessoa p) throws VetorCheioException{
        this.cadastropessoa.inserir(p);
    }
   
    public Pessoa[] listar() throws VetorVazioException {
        return this.cadastropessoa.listar();
    }
    
    public Pessoa[] listarAlunos() throws VetorVazioException, NaohaAlunosException {
        Pessoa ps[] = this.cadastropessoa.listar();
        Pessoa a[] = new Pessoa[ps.length];
        int count = 0;
        for(int i=0;i<ps.length;i++) {
            if(ps[i] instanceof Aluno) {
              a[count++] = ps[i];
            }
        }
        Pessoa x[] = new Pessoa[count];
        for(int i=0;i<count;i++) {
            x[i] = a[i];
        }
        if(count!=0){
            return x;
        } else {
            throw new NaohaAlunosException();
        }
        
    }
    
    public Pessoa[] listarProfessores() throws VetorVazioException, NaoHaProfessoresException {
        Pessoa ps[] = this.cadastropessoa.listar();
        Pessoa pro[] = new Pessoa[ps.length];
        int count = 0;
        int aux = 0;
        for(int i=0;i<ps.length;i++) {
            if(ps[i] instanceof Professor) {
                pro[aux++] = ps[i];
                count++;
            }
        }
        Pessoa x[] = new Pessoa[count];
        for(int i=0;i<count;i++) {
            x[i] = pro[i];
        }
        if(aux!=0){
            return x;
        } else {
            throw new NaoHaProfessoresException();
        }
    }
    
    public Pessoa procurar(String cpf) throws PessoaNaoEncontradaException, VetorVazioException {
        return this.cadastropessoa.procurar(cpf);
    }
    
    public void alterar(Pessoa p) throws PessoaNaoEncontradaException, VetorVazioException {
        this.cadastropessoa.alterar(p);
    }
    
    public void remover(String cpf) throws PessoaNaoEncontradaException, VetorVazioException {
        this.cadastropessoa.remover(cpf);
    }
    
    public int getIndice() throws VetorVazioException {
        return this.cadastropessoa.getIndice();
    }
    
}
