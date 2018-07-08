package exception;

public class ArestaNotFoundException extends Exception{
    private static final long serialVersionUID = 323421L;
    
    public ArestaNotFoundException(String mensagem){
        //Acessa o contrutor de Exception (Classe Pai)
        super(mensagem);
    }
    
    public ArestaNotFoundException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
