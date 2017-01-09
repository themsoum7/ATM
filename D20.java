/**
 * Created by r0bert on 12/06/2016.
 */
public class D20 implements Dispenser {
    private Dispenser chain;

    @Override
    public void setNext(Dispenser nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20){
            int number = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Giving u " + number + " 20$");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        }
        else{
            this.chain.dispense(currency);
        }
    }
}
