
import java.util.Scanner;

public class Ex2 {
    /*
     * @author Claudio Cassimiro
     * Algoritmo para somar os produtos de uma lista de compras
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userChoice;
        int rice = 8;
        int bean = 10;
        int potato = 15;
        int meat = 100;
        int sum = 0;

        System.out.println("1. Arroz - $8\n2. Feijão - $10\n3. Batata - $15\n4. Carne - $100\n0. Sair");

        System.out.println("Escolha um produto para adicionar ao seu carrinho:");
        userChoice = scanner.nextInt();

        while(userChoice != 0) {
            switch(userChoice) {
                case 1:
                    sum += rice;
                    break;
                case 2:
                    sum += bean;
                    break;
                case 3:
                    sum += potato;
                    break;
                case 4:
                    sum += meat;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente com opções entre 0 e 4");
            }

            System.out.println("1. Arroz - $8\n2. Feijão - $10\n3. Batata - $15\n4. Carne - $100\n0. Sair");
            System.out.println("Escolha outro produto para adicionar ao seu carrinho ou saía da aplicação:");
            userChoice = scanner.nextInt();
        }

        System.out.println("O total da compra foi R$" + sum);
    }
}
