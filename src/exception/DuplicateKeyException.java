package exception;

public class DuplicateKeyException extends Exception{
    private static final long serialVersionUID = 12342L;
    
    public DuplicateKeyException(String mensagem){
        super(mensagem);
    }
    
    public DuplicateKeyException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}   