package model;

//Para manipular a sessao logada, apenas para um usuario.
public class Sessao {
    private static Sessao instance = null;
    private Usuario UsuarioOn;

    public Sessao() {
    }

    public Usuario getUsuarioOn() {
        return UsuarioOn;
    }

    public void setUsuarioOn(Usuario UsuarioOn) {
        this.UsuarioOn = UsuarioOn;
    }
        
    public static Sessao getIntance(){
        if(Sessao.instance == null){
            instance = new Sessao();
        }
        return Sessao.instance;
    }
    
    public void finaliza(){
        if(Sessao.instance != null){
            this.setUsuarioOn(null);
        }
    }
}
