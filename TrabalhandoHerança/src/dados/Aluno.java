
package dados;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    
    
    
    public Aluno(){
        super();
    }

    public Aluno(String nome) {
        super(nome);
        this.matricula = "";
        this.curso = "";
    }

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
        this.matricula = "";
        this.curso = "";
    }

    public Aluno(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.matricula = "";
        this.curso = "";
    }
    
    public Aluno(String nome, String cpf, String endereco, String matricula) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }
    
    public Aluno(String nome, String cpf, String endereco, String matricula, String curso) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
