
package negocio;

import dados.Pessoa;
import dados.RepositorioPessoa;
import excecoes.PessoaNaoEncontradaException;
import excecoes.VetorCheioException;
import excecoes.VetorVazioException;

public class CadastroPessoa {
    private RepositorioPessoa repositoriopessoa;

    public CadastroPessoa(int qMaxPessoas) {
        this.repositoriopessoa = new RepositorioPessoa(qMaxPessoas);
    }
    
    public void inserir(Pessoa p) throws VetorCheioException {
        this.repositoriopessoa.inserir(p);
    }
    
    public Pessoa[] listar() throws VetorVazioException {
        return this.repositoriopessoa.listar();
    }
    
    public Pessoa procurar(String cpf) throws PessoaNaoEncontradaException, VetorVazioException {
        return this.repositoriopessoa.procurar(cpf);
    }
    
    public void alterar(Pessoa p) throws PessoaNaoEncontradaException, VetorVazioException {
        this.repositoriopessoa.alterar(p);
    }
    
    public void remover(String cpf) throws PessoaNaoEncontradaException, VetorVazioException {
        this.repositoriopessoa.remover(cpf);
    }
    
    public int getIndice() throws VetorVazioException {
        return this.repositoriopessoa.getIndice();
    }
    
}
