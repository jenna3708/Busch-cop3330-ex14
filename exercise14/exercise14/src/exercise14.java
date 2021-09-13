import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the order amount?");
        String amount = input.next();
        int convAmount = Integer.parseInt(amount);

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is the state?");
        String state = input2.next();
        String inState = "WI";

        double tax = 0;
        double finalTotal = 0;
        if(state.equals(inState))
        {
            tax = convAmount * .055;

        }
        finalTotal = convAmount + tax;

        System.out.println("The subtotal is $"+convAmount+". \nThe tax is $"+tax+".\nThe total is $"+finalTotal+".");

    }
}
