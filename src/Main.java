
public class Main {
    public static void main(String[] args) {
        //Declarations
        int cardBalance = 5000; //balance on card
        double interestRate = 0.17; //interest rate
        int oneMonth = 0; //interest after 1 month
        int twoMonths = 0; //interest after 2 months
        oneMonth = (int) (cardBalance *interestRate); //one month interest
        twoMonths = oneMonth * 2; //two months interest
        System.out.println("Since no payment was made for one month, you owe $" + oneMonth + " in interest.");
        System.out.println("Since no payment was made for two months, you owe $" + twoMonths + " in interest.");
    }
}