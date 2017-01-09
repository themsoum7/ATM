/**
 * Created by r0bert on 12/06/2016.
 */
import java.util.Scanner;

public class ATM {
    private Dispenser ch1;

    public ATM(){
        this.ch1 = new D50();
        Dispenser ch2 = new D20();
        Dispenser ch3 = new D10();

        ch1.setNext(ch2);
        ch2.setNext(ch3);
    }
    public static void main(String[] args){

        ATM atmDispenser = new ATM();
        while (true) {
            int amount = 0;
            System.out.println("Enter the amount to dispense:");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s!");
                return;
            }
            atmDispenser.ch1.dispense(new Currency(amount));
        }

    }

}
