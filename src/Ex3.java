public class Ex3 {
    /*
     * @author Claudio Cassimiro
     * Algoritmo de errorPrinter
     *
     * Esse algoritmo valida strings em ordem alfabedica, identificando erros e fazendo a contagem desses error
     * */
    public static String errorPrinter(String stringToVerify) {
        int lengthOfString = stringToVerify.length();
        int quantOfErros = 0;

        for (int i = 1; i < lengthOfString; i++) {
            char currentChar = stringToVerify.charAt(i);
            char prevChar = stringToVerify.charAt(i - 1);

            if (currentChar < prevChar) {
                quantOfErros++;

                for (int j = i + 1; j < lengthOfString; j++) {
                    if (j == lengthOfString - 1) {
                        break;
                    }

                    char nextChar = stringToVerify.charAt(j + 1);
                    if (currentChar == nextChar) {
                        quantOfErros++;
                    }
                }
            }
        }

        return quantOfErros + "/" + lengthOfString;
    }

    public static void main(String[] args) {
        String stringToVerify1 = errorPrinter("aaaxbbbbyyhwawiwjjjwwm");
        String stringToVerify2 = errorPrinter("aaacccbbbb");
        String stringToVerify3 = errorPrinter("aaabbbbhijjjm");

        System.out.println("aaaxbbbbyyhwawiwjjjwwm " + stringToVerify1);
        System.out.println("aaacccbbbb " + stringToVerify2);
        System.out.println("aaabbbbhijjjm " + stringToVerify3);
    }
}
