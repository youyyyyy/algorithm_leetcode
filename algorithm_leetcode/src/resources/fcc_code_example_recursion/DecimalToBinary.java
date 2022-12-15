/*
* Code example from freeCodeCamp.org
* url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
* */

package resources.fcc_code_example_recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        int a = 233;
        String s = findBinary(a, "");
        System.out.println(s);
    }


    public static String findBinary(int decimal, String result) {
        if (decimal == 0) return result;
        result = decimal % 2 + result;
        return findBinary(decimal / 2, result);

    }
}
