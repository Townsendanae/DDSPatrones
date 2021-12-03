
package FactoryMethod;

public class PremiumCardCreator extends CardCreator {

    @Override
    public Card createCard() {
        
        return new PremiumCard();
        
    }
    
}
