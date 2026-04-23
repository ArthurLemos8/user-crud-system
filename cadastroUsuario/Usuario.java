

public class Usuario {
    String nome;
    String cpf;
    String usuario;
    String senha;
    String telefone;

    public Usuario(String nome, String cpf, String telefone){
        this.usuario = nome;
        this.senha = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        System.out.println(retornaDados());
    }
    public Usuario(String nome, String cpf, String email, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = cpf;
        if(validaEmail(email)){
            this.usuario = email;
        }
        else{
            this.usuario = nome;
        }
        System.out.println(retornaDados());
    }
    public Usuario(String cpf, String nome, String telefone, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        if(validaEmail(email)){
            this.usuario = email;
        }
        else{
            this.usuario = nome;
        }
        if(senha.length()<6){
            this.senha = cpf;
        }
        else{
            this.senha = senha;
        }
        System.out.println(retornaDados());
    }
    
    public boolean validaEmail(String email){
        int colocouArroba = email.indexOf("@");
        int colocouPonto = email.lastIndexOf(".com");

        if(colocouArroba>0 && colocouPonto >colocouArroba){
            return true;
        }
        else{
            return false;
        }
    }
    public String getSenha() {
        return senha;
    }
    public String retornaDados(){
        return "------USUÁRIO CRIADO------\n"+ " Usuario = "+this.usuario + " Senha= "+this.senha;
    }

}
