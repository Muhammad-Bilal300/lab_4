



package lab_.b;

import java.util.*;

/**
 *
 * @author computer clinic
 */
class Customer {

    public String Name;
    private double balance;

    Customer(String Name, double Balance) {
        this.Name = Name;
        this.balance = Balance;

    }

    public void recordPayment(double payment) {
        this.balance -= payment;
    }

    public double displaybalance() {
        System.out.println("Cutomer has paid the bill and the remaining balance is : ");
        return balance;
    }

    public double recordCall(int type, int time) {
        double bill = 0.0;
        if (type == 1) {
            bill = 2 * time;
        } else if (type == 2) {
            bill = 0.5 * time;
        }
        return bill;
    }

}

class GoldCustomer extends Customer {

    public GoldCustomer(String Name, double Balance) {
        super(Name, Balance);
    }

    public double recordCall(int type, int time) {

        double bill = 0.0;
        int duration = 0;

        if (type == 2) {

            duration += time;

            if (duration > 60) {
                bill = time * 0.75;
            } else {
                bill = 2 * time;
            }
        } else if (type == 1) {

            duration += time;

            if (duration > 60) {
                bill = time * 0.5;
            } else {
                bill = time * 0.75;
            }

            bill = 2 * time;
        }
        return bill;
    }
}

public class LAB_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Taking input from user for both customer and gold customer
        Scanner sc = new Scanner(System.in);

//         Finiding balace and record call or gold customer
        System.out.println("Enter data for ordinary customer ");
        System.out.println("Enter Your Name : ");
        String Name = sc.nextLine();
        System.out.println("Enter Your Balance : ");
        double balance = sc.nextFloat();

        Customer c1 = new Customer(Name, balance);
        System.out.println("The amount of bill for landline is : " + c1.recordCall(1, 10));
        System.out.println("The amount of bill for cell is : " + c1.recordCall(2, 20));
        System.out.println("The amount of bill for cell is : " + c1.recordCall(2, 15));
        c1.recordPayment(100);
        System.out.println("The remaining balance after payment will be : " + c1.displaybalance());

//        Finiding balace and record call or gold customer
        System.out.println("Enter data for gold customer ");
        System.out.println("Enter Your Name : ");
        String GC_Name = sc.next();
        System.out.println("Enter Your Balance : ");
        double GC_balance = sc.nextFloat();
        GoldCustomer c2 = new GoldCustomer(GC_Name, GC_balance);

        System.out.println("The amount of bill for landline is : " + c2.recordCall(1, 10));
        System.out.println("The amount of bill for cell is : " + c2.recordCall(2, 20));
        System.out.println("The amount of bill for cell is : " + c2.recordCall(2, 15));
        System.out.println("The amount of bill for cell is : " + c2.recordCall(2, 130));
        c2.recordPayment(200);
        System.out.println("The remaining balance after payment will be : " + c2.displaybalance());

    }

}
