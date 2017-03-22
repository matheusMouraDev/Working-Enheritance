
package dados;

import excecoes.*;

public class RepositorioPessoa {
    private int qMaxPessoas;
    public int indice;
    private Pessoa pessoas[];
    
    public RepositorioPessoa(int qMaxPessoas) {
        this.qMaxPessoas = qMaxPessoas;
        this.pessoas = new Pessoa[this.qMaxPessoas];
        this.indice = -1;
    }
    
    public void inserir(Pessoa p) throws VetorCheioException{
        this.indice++;
        if(this.indice<qMaxPessoas) {
            this.pessoas[this.indice] = p;
        } else {
            this.indice--;
            throw new VetorCheioException();
        }
    }
    
    public Pessoa[] listar() throws VetorVazioException{
        if(this.indice>=0) {
            Pessoa ps[] =  new Pessoa[this.indice+1];
            for(int i=0;i<=this.indice;i++) {
                ps[i]=this.pessoas[i];
            }
            return ps;
        } else {
            throw new VetorVazioException();
        }
    }
    
    public Pessoa procurar(String cpf) throws PessoaNaoEncontradaException, VetorVazioException {
        Pessoa p = null;
        if(this.indice!=-1) {
            for(int i=0;i<=this.indice;i++) {
                if(this.pessoas[i].getCpf().equals(cpf)) {
                    p = this.pessoas[i];
                    break;
                }
            }
            if(p==null) {
                throw new PessoaNaoEncontradaException();
            }
        } else {
            throw new VetorVazioException();
        }
        return p;
    }
    
    public void alterar(Pessoa p) throws PessoaNaoEncontradaException, VetorVazioException {
        Pessoa pOriginal = this.procurar(p.getCpf());
        if(pOriginal!=null) {
            pOriginal.setNome(p.getNome());
            pOriginal.setEndereco(p.getEndereco());
            if(pOriginal instanceof Aluno) {
                Aluno a = (Aluno) p;
                ((Aluno) pOriginal).setMatricula(a.getMatricula() );
                ((Aluno) pOriginal).setCurso(a.getCurso());
            } else {
                Professor pro = (Professor) p;
                ((Professor) pOriginal).setMatricula(pro.getMatricula());
                ((Professor) pOriginal).setFormacao(pro.getFormacao());
            }
        }else {
            throw new PessoaNaoEncontradaException();
        }
    }
    
    public void remover(String cpf) throws PessoaNaoEncontradaException, VetorVazioException {
        if (this.indice!=-1) {
            int num = -1;
            for(int i=0; i<=this.indice; i++) {
                if(cpf.equals(this.pessoas[i].getCpf())){
                    num = i;
                    break;
                }    
            }
            if(num != -1) {
                for (int i=num; i < this.indice;i++) {
                    this.pessoas[i] = this.pessoas[i+1];
                }
                this.indice--;
            }else {
                throw new PessoaNaoEncontradaException();
            }
        } else {
            throw new VetorVazioException();
        }
    }

    public int getIndice() throws VetorVazioException {
        if(this.indice != -1) {
            return 1;
        }else {
            throw new VetorVazioException();
        }
    }
    
    
    
}
