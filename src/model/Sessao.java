package model;

//Para manipular a sessao logada, apenas para um usuario.
public class Sessao {
    private static Sessao instance = null;
    private Usuario user;

    public Sessao() {
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
        
    public static Sessao getIntance(){
        if(Sessao.instance == null){
            instance = new Sessao();
        }
        return Sessao.instance;
    }
    
    public void finaliza(){
        if(Sessao.instance != null){
            this.setUser(null);
        }
    }
}
