
package FactoryMethod;

public class VIPCardCreator extends CardCreator {

    @Override
    public Card createCard() {
        
        return new VIPCard();
        
    }
    
}
