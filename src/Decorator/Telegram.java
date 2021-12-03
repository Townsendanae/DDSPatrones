/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Danaé
 */
public class Telegram extends Extra{

    public Telegram(Notificacion notificacion) {
        super(notificacion);
    }
    
    // Decorator 4
    
    public void notificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
