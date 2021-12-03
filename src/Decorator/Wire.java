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
public class Wire extends Extra {

    public Wire(Notificacion notificacion) {
        super(notificacion);
    }
    
    // Decorator 3
    
    @Override
    public void notificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
