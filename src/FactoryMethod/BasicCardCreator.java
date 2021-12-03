
package FactoryMethod;

public class BasicCardCreator extends CardCreator {

    @Override
    public Card createCard() {
        
        return new BasicCard();
        
    }
    
}
