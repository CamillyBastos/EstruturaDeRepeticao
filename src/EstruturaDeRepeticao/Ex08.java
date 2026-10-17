package EstruturaDeRepeticao;
import java.util.Scanner;

public class Ex08 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a quantidade de produtos: ");
            int quantidadeProdutos = sc.nextInt();

            System.out.print("Digite o valor de cada produto: R$ ");
            double valorProduto = sc.nextDouble();

            double totalCompra = 0;
            int contador = 1;

            while (contador <= quantidadeProdutos) {
                totalCompra = totalCompra + valorProduto;
                contador++;
            }

            System.out.println("Quantidade de produtos: " + quantidadeProdutos);
            System.out.printf("Valor de cada produto: R$ %.2f%n", valorProduto);
            System.out.printf("Total da compra: R$ %.2f%n", totalCompra);

            sc.close();
        }
    }
