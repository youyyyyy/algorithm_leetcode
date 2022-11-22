package leetcode_math;

import java.util.Arrays;

class Solution2469 {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}

public class _2469_ConvertTemperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        Solution2469 slt = new Solution2469();
        System.out.println(Arrays.toString(slt.convertTemperature(celsius)));
    }
}
