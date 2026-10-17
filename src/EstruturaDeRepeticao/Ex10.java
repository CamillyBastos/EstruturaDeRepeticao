package EstruturaDeRepeticao;
import java.util.Scanner;

public class Ex10 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar usuário");
                System.out.println("2 - Listar usuários");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Cadastrar usuário selecionado.");
                        break;

                    case 2:
                        System.out.println("Listar usuários selecionado.");
                        break;

                    case 3:
                        System.out.println("Sistema encerrado");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 3);

            sc.close();
        }
    }
