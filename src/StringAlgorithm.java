import java.util.Scanner;

public class StringAlgorithm {


    private int num1;
    private int num2;

    public String multiply(String num1, String num2) {
        this.num1 = num1.length();
        this.num2 = num2.length();

        if (this.num1 == 0 || this.num2 == 0)
            return "0";

        int result[] = new int[this.num1 + this.num2];


        int indexN1 = 0;
        int indexN2 = 0;


        for (int i = this.num1 - 1; i >= 0; i--) {
            int carry = 0;
            int n1 = num1.charAt(i) - '0';

            indexN2 = 0;


            for (int j = this.num2 - 1; j >= 0; j--) {

                int n2 = num2.charAt(j) - '0';

                int sum = n1 * n2 + result[indexN1 + indexN2] + carry;

                result[indexN1 + indexN2] = sum % 10;

                carry = sum / 10;

                indexN2++;
            }


            if (carry > 0)
                result[indexN1 + indexN2] += carry;

            indexN1++;
        }

        int i = result.length - 1;
        while (i >= 0 && result[i] == 0)
            i--;

        if (i == -1)
            return "0";


        String s = "";

        while (i >= 0)
            s += (result[i--]);

        return s;
    }


}

