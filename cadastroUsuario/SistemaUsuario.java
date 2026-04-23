import java.util.ArrayList;
public class SistemaUsuario {
    ArrayList<Usuario> lista = new ArrayList<>();
    public void mostrarLista(){
        for(int i=0; i<lista.size();i++){
            Usuario u = lista.get(i);
            System.out.println(i+1+"-Usuário: "+u.usuario);
        }
    }
    public boolean removerdaLista(int indice, String senha){
        if(indice>0 && indice<=lista.size()){
            Usuario u = lista.get( indice -1);
            if(u.getSenha().equals(senha)){
            lista.remove(indice-1);
            return true;
            }
        }
            return false;
    }
}
