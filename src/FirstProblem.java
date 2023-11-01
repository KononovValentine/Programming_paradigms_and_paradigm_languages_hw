import java.util.function.BinaryOperator;

public class FirstProblem {
    public static void main(String[] args) {
        double[] vector1 = {1.0, 2.0, 3.0};
        double[] vector2 = {2.0, 3.0, 4.0};
        double result = mse(vector1, vector2);
        System.out.println("MSE: " + result);
    }

    public static double mse(double[] vector1, double[] vector2) {
        BinaryOperator<Double> squareDiff = (a, b) -> Math.pow(a - b, 2);

        return (double) (squareDiff.apply(vector1[0], vector2[0]) +
                squareDiff.apply(vector1[1], vector2[1]) +
                squareDiff.apply(vector1[2], vector2[2])) / vector1.length;
    }
}
