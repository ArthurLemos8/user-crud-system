
public class Usuario {
    private String nome;
    private String cpf;
    private String usuario;
    private String senha;
    private String telefone;

    public Usuario(String nome, String cpf, String telefone) {
        this.usuario = nome;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = cpf;
      
    }

    public Usuario(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = cpf;
        this.usuario = email;
       
    }

    public Usuario(String cpf, String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.usuario = email;
        if (senha.length() < 6) {
            this.senha = cpf;
        } else {
            this.senha = senha;
        }
       
    }
    
    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTelefone() {
        return telefone;
    }
    
}
