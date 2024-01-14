import java.util.Scanner;

public class FinancialModeling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Financial Modeling!");
        Bond bd = new Bond("Bonds Deals");
        bd.initializeDetails();
        bd.displayDetails();
        bd.calculateReturns();
       
    }
}

abstract class Instrument{
    public String instrumentName;

    public Instrument(String instrumentName){
        this.instrumentName = instrumentName;
        System.out.println(instrumentName);
    }

    public abstract void initializeDetails();
    public abstract void displayDetails();

    public void thank(){
        System.out.println("Thank you for your entry!");
    }

}

class Bond extends Instrument{
    float cost;
    String date;
    Bond(String name){
        super(name);
    }

    @Override
    public void initializeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price of Bond : ");
        cost = sc.nextFloat();
        System.out.println("Trade date : ");
        date = sc.next();
        sc.close();
    }

    public void displayDetails(){
        System.out.println("Bonds of " + cost + " purchased on " + date);
    }

    void calculateReturns(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current price of bond : ");
        float currentPrice = sc.nextFloat();
        float returns = ((currentPrice - cost) / cost) * 100;
        System.out.println(returns);
    }
}