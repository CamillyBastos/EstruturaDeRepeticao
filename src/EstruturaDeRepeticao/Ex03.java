package EstruturaDeRepeticao;
import java.util.Scanner;

public class Ex03 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número para a tabuada: ");
            int numero = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            sc.close();
        }
    }

