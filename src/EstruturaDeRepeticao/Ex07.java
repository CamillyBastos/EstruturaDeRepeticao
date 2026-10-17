package EstruturaDeRepeticao;
import java.util.Scanner;

public class Ex07 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a quantidade de vendas: ");
            int quantidadeVendas = sc.nextInt();

            double valorVenda = 50.00;
            double faturamento = 0;

            for (int i = 1; i <= quantidadeVendas; i++) {
                faturamento = faturamento + valorVenda;
            }

            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf("Faturamento total: R$ %.2f%n", faturamento);

            sc.close();
        }
    }

