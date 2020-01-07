public class FizzBuzzTest{
    public static void main(String[] args){
        int testnumber = 15;
        FizzBuzz fB = new FizzBuzz();
        String myoutput = fB.checkFizzBuzz(testnumber);
        System.out.println(myoutput);
        testnumber = 5;
        myoutput = fB.checkFizzBuzz(testnumber);
        System.out.println(myoutput);
        testnumber = 3;
        myoutput = fB.checkFizzBuzz(testnumber);
        System.out.println(myoutput);
        testnumber = 2;
        myoutput = fB.checkFizzBuzz(testnumber);
        System.out.println(myoutput);
    }
}