
import java.math.BigInteger;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        boolean cont = true;

        Scanner in = new Scanner(System.in);

        while (cont ) {

            if (cont) {
                printMenu();
            }

            switch (in.nextLine()) {

                case "1":
                    StringAlgorithm firstAlgorithm = new StringAlgorithm();
                    System.out.println("You chose String algorithm, please insert your desired numbers:");

                    System.out.println("Number 1: ");
                    String str1 = in.nextLine();

                    System.out.println("Number 2:");
                    String str2 = in.nextLine();

                    System.out.println("Result: " + firstAlgorithm.multiply(str1, str2));
                    break;

                case "2":
                    System.out.println("You chose BigInteger algorithm, please insert your desired numbers:");

                    System.out.println("Number 1: ");
                    String num1BigInt = in.nextLine();
                    BigInteger bigInt = new BigInteger(num1BigInt);

                    System.out.println("Number 2:");
                    String num2BigInt = in.nextLine();
                    BigInteger bigInt2 = new BigInteger(num2BigInt);

                    System.out.println(bigInt.multiply(bigInt2));
                    break;

                case "3":
                    cont = false;
                    System.out.println("Turning off!");
                    break;

                default:
                    System.out.println("Incorrect choice, please choose between String or BigInteger algorithm");
                    mainCaller();
                    break;
            }
        }

    }


    static void mainCaller() {
        System.out.println("");

        // Calling the main() method
        main(null);
    }

    static void printMenu() {
        System.out.println("Choose the type of computing algorithm:");
        System.out.println("1. String algorithm");
        System.out.println("2. BigInteger algorithm");
        System.out.println("3. Exit");
    }

}
