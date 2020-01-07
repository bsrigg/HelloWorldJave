public class FizzBuzz{
    public String checkFizzBuzz(int mynumber) {
        String myresult = "";
        if(mynumber%3 == 0 ){
            myresult = "Fizz";
        }
        if(mynumber%5 == 0){
            myresult += "Buzz";
        } else if(myresult == ""){
            myresult += mynumber;
        }
        return myresult;
    }
}