import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double sum = Math.exp(legA) + Math.exp(legB);
        double squareRoot = Math.sqrt(sum);
        return squareRoot;
    }
}