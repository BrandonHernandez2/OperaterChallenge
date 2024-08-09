public class OperatorChall {
    public static void main(String[] args) {

        double myDouble = 20.00;
        double mySecondDouble = 80.00;

        double resultOfDoubles = (myDouble + mySecondDouble) * 100.00;
        System.out.println("The Result of the Doubles is: " + resultOfDoubles);

        double remainderOfDoubles = resultOfDoubles % 40.00;
        System.out.println("The result of the Double: " + remainderOfDoubles);

        boolean remainderResult = (remainderOfDoubles == 0) ? true : false;
        System.out.println("The remainder is: "  + remainderResult);

        if (!remainderResult) {
            System.out.println("got some remainder");
        }



    }
}
