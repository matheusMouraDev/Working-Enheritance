
package dados;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa() {
        this("","","");
    }
    
    public Pessoa(String nome) {
        this(nome,"","");
    }

    public Pessoa(String nome, String cpf) {
        this(nome,cpf,"");
    }

    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
