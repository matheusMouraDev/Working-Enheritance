
package excecoes;

public class NaoHaProfessoresException extends Exception{

    public NaoHaProfessoresException() {
        super("Não foram inseridos professores.");
    }
    
}
