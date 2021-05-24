import org.junit.jupiter.api.Assertions;

import java.math.BigInteger;

public class Test {


    @org.junit.jupiter.api.Test
    void testMultiplication() {

        String str1 = "123456";
        String str2 = "123456";
        StringAlgorithm algorithm = new StringAlgorithm();

        String s1 = algorithm.multiply(str1,str2);

        BigInteger num1 = new BigInteger("123456");
        BigInteger num2 = new BigInteger("123456");

        BigInteger s2 = num1.multiply(num2);

        Assertions.assertEquals(s1,s2.toString());

    }

    @org.junit.jupiter.api.Test
    void testStringAlgorithm() {

        String str1 = "123456";
        String str2 = "123456";
        StringAlgorithm algorithm = new StringAlgorithm();
        Assertions.assertEquals(algorithm.multiply(str1,str2),"15241383936");

    }

    @org.junit.jupiter.api.Test
    void testBigIntAlgorithm(){

        BigInteger num1 = new BigInteger("123456");
        BigInteger num2 = new BigInteger("123456");

        Assertions.assertEquals((num1.multiply(num2)).toString(),"15241383936");
    }
}
