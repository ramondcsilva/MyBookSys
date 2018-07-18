package model;

public class Usuario {

    private String login;
    private String password;
    private String nome;
    private String email;
    private String dataNascimento;
    private String endereço;
    private String telefone;

    public Usuario() {
    }

    public Usuario(String login, String password, String nome, String email, String dataNascimento, String endereço, String telefone) {
        this.login = login;
        this.password = password;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario user = (Usuario) obj;
            if (user.email.equals(this.email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "login";
    }
}