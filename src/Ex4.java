import java.util.Scanner;
/*
* @author Claudio Cassimiro
* Algoritmo de Collatz
* */

public class Ex4 {
    public static int countStepsCollatz(int number) {
        int steps = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            }else {
                number = 3 * number + 1;
            }
            steps++;
        }

        return steps;
    }

    public static String getCollatzSequence(int number) {
        StringBuilder sequence = new StringBuilder();
        sequence.append(number);

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            }else {
                number = 3 * number + 1;
            }
            sequence.append(", ").append(number);
        }

        return sequence.toString();
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Limite: ");
        int limit = scanner.nextInt();

        int longestSequence = 0;
        int numberWithGreatestSequence = 0;

        for (int i = 1; i <= limit; i++) {
            int steps = countStepsCollatz(i);

            if (steps > longestSequence) {
                longestSequence = steps;
                numberWithGreatestSequence = i;
            }
        }

        System.out.println("Número com a sequência mais larga: " + numberWithGreatestSequence);
        System.out.println("Passos desse número: " + longestSequence);
        System.out.println("Sequência: " + getCollatzSequence(numberWithGreatestSequence));
    }
}