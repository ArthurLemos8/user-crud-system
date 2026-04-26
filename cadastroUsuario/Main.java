
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaUsuario usu = new SistemaUsuario();
        char opcao;

        do {
            System.out.println("\n--- CADASTRO ---");
            System.out.println("Escolha o tipo de cadastro ou selecione uma Ação:");
            System.out.println("1 - Nome, CPF, Telefone");
            System.out.println("2 - Nome, CPF, Email, Telefone");
            System.out.println("3 - CPF, Nome, Telefone, Email, Senha");
            System.out.println("4 - Mostrar Lista de cadastro");
            System.out.println("5 - Remover Usuario");
            int escolha = Integer.parseInt(sc.nextLine());
            Usuario usuario;
            if (escolha == 1) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu Telefone com o DD: ");
                String telefone = sc.nextLine();
                while (!usu.validaTelefone(telefone)) {
                    System.out.println("Telefone inválido, digite novamente: ");
                    telefone = sc.nextLine();
                }
                System.out.println("Digite seu cpf: ");
                String cpf = sc.nextLine();
                while (!usu.validaCpf(cpf)) {
                    System.out.println("Cpf inválido, digite novamente: ");
                    cpf = sc.nextLine();
                }
                usuario = new Usuario(nome, cpf, telefone);
                usu.adicionarUsuario(usuario);
                System.out.println( usu.retornaDados(usuario));

            } else if (escolha == 2) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu Telefone: ");
                String telefone = sc.nextLine();
                while (!usu.validaTelefone(telefone)) {
                    System.out.println("Telefone inválido, digite novamente: ");
                    telefone = sc.nextLine();
                }
                System.out.println("Digite seu cpf: ");
                String cpf = sc.nextLine();
                while (!usu.validaCpf(cpf)) {
                    System.out.println("Cpf inválido, digite novamente: ");
                    cpf = sc.nextLine();
                }
                System.out.println("Digite seu email: ");
                String email = sc.nextLine();
                while (!usu.validaEmail(email)) {
                    System.out.println("Email inválido, digite novamente: ");
                    email = sc.nextLine();
                }
                usuario = new Usuario(nome, cpf, email, telefone);
                usu.adicionarUsuario(usuario);
                System.out.println( usu.retornaDados(usuario));

            } else if (escolha == 3) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu Telefone: ");
                String telefone = sc.nextLine();
                while (!usu.validaTelefone(telefone)) {
                    System.out.println("Telefone inválido, digite novamente: ");
                    telefone = sc.nextLine();
                }
                System.out.println("Digite seu cpf: ");
                String cpf = sc.nextLine();
                while (!usu.validaCpf(cpf)) {
                    System.out.println("Cpf inválido, digite novamente: ");
                    cpf = sc.nextLine();
                }
                System.out.println("Digite seu email: ");
                String email = sc.nextLine();
                while (!usu.validaEmail(email)) {
                    System.out.println("Email inválido, digite novamente: ");
                    email = sc.nextLine();
                }
                System.out.println("Digite sua senha: ");
                String senha = sc.nextLine();
                usuario = new Usuario(cpf, nome, telefone, email, senha);
               usu.adicionarUsuario(usuario);
                 System.out.println( usu.retornaDados(usuario));

            } else if (escolha == 4) {
                System.out.println("Usuários cadastrados até o momento: ");
                usu.mostrarLista();
                ;
            } else if (escolha == 5) {
                System.out.println("===Lista de usuários: ===");
                usu.mostrarLista();
                System.out.println("Digite o indice de qual usuário deseja remover: ");
                int indice = Integer.parseInt(sc.nextLine());
                System.out.println("Digite a senha do usuário selecionado: ");
                String senha = sc.nextLine();
                if (usu.removerdaLista(indice, senha)) {
                    System.out.println("Removido com sucesso!");
                } else {
                    System.out.println("Não foi possivel remover!");
                }
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.println(" -------Deseja continuar e realizar uma ação/cadastro novamente? S/N-------");
            opcao = sc.nextLine().charAt(0);
        } while (opcao == 's' || opcao == 'S');
        System.out.println("Volte sempre!");
        sc.close();
    }
}