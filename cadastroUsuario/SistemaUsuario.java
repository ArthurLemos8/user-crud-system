import java.util.ArrayList;

public class SistemaUsuario {
    private ArrayList<Usuario> lista = new ArrayList<>();

    public void mostrarLista() {
        for (int i = 0; i < lista.size(); i++) {
            Usuario u = lista.get(i);
            System.out.println(i + 1 + "-Usuário: " + u.getUsuario() + " Telefone: " + u.getTelefone());
        }
    }

    public boolean removerdaLista(int indice, String senha) {
        if (indice > 0 && indice <= lista.size()) {
            Usuario u = lista.get(indice - 1);
            if (u.getSenha().equals(senha)) {
                lista.remove(indice - 1);
                return true;
            }
        }
        return false;
    }

    public static boolean validaEmail(String email) {
        int colocouArroba = email.indexOf("@");
        int colocouPonto = email.lastIndexOf(".com");

        if (colocouArroba > 0 && colocouPonto > colocouArroba) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validaCpf(String cpf) {
        return cpf != null && cpf.length() == 11;
    }

    public static boolean validaTelefone(String telefone) {
        return telefone != null && (telefone.length() == 11 || telefone.length() == 10);
    }

    public String retornaDados(Usuario u) {

        return "------USUÁRIO CRIADO------\n" + " Usuario = " + u.getUsuario() + " Senha= " + u.getSenha();
    }

   public void adicionarUsuario(Usuario u) {
    lista.add(u);
}
    
}
