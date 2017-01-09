/**
 * Created by r0bert on 12/06/2016.
 */
public interface Dispenser {
    void setNext(Dispenser nextChain);
    void dispense (Currency currency);
}
