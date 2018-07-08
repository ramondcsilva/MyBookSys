package exception;

public class ArestaNotFoundException extends Exception{
    private static final long serialVersionUID = 323421L;
    
    public ArestaNotFoundException(String mensagem){
        super(mensagem);
    }
    
    public ArestaNotFoundException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
