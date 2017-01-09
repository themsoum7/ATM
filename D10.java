/**
 * Created by r0bert on 12/06/2016.
 */
public class D10 implements Dispenser {
    private Dispenser chain;

    @Override
    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10){
            int number = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Giving u " + number + " 10$");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        }
        else{
            this.chain.dispense(currency);
        }
    }
}