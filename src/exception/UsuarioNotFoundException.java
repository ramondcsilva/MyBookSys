package exception;

public class UsuarioNotFoundException extends Exception{
    private static final long serialVersionUID = 12342L;
    
    public UsuarioNotFoundException(String mensagem){
        //Acessa o contrutor de Exception (Classe Pai)
        super(mensagem);
    }
    
    public UsuarioNotFoundException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}