public class PythagoreanTheoremTest {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        Pythagorean pT = new Pythagorean();
        Double pythagoreanTheorem = pT.calculateHypotenuse(a, b);
        System.out.println(pythagoreanTheorem);
    }
}