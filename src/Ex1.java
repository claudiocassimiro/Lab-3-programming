
import java.util.Scanner;

public class Ex1 {
    /*
     * @author Claudio Cassimiro
     * Algoritmo para somar os multiplos de 3 em um intervalo definido pelo usuário
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber;
        int sum = 0;

        System.out.println("Digite o valor de final do intervalo");
        lastNumber = scanner.nextInt();

        for (int i = 1; i <= lastNumber; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("A Soma dos multiplos de 3 entre 1 e " + lastNumber + " é " + sum);
    }
}
