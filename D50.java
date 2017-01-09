/**
 * Created by r0bert on 12/06/2016.
 */
public class D50 implements Dispenser {
    private Dispenser chain;

    @Override
    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int number = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Giving u " + number + " 50$");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        }
        else{
            this.chain.dispense(currency);
        }
    }
}
