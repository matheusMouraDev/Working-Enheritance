
package dados;


public class Professor extends Pessoa{

    private String matricula;
    private String formacao;
    
    public Professor() {
        this.matricula = "";
        this.formacao = "";
    }

    public Professor(String nome) {
        super(nome);
        this.matricula = "";
        this.formacao = "";
    }

    public Professor(String nome, String cpf) {
        super(nome, cpf);
        this.matricula = "";
        this.formacao = "";
    }
    
    public Professor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.formacao = "";
    }
    
    public Professor(String nome, String cpf, String endereco, String matricula, String formacao) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.formacao = formacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    
}
