package exception;

public class DuplicateUsuarioException extends Exception{
    private static final long serialVersionUID = 12342L;
    
    public DuplicateUsuarioException(String mensagem){
        //Acessa o contrutor de Exception (Classe Pai)
        super(mensagem);
    }
    
    public DuplicateUsuarioException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
