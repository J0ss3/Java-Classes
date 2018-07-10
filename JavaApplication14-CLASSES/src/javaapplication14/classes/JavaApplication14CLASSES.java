/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14.classes;

/**
 *
 * @author jose.enriquez
 */
public class JavaApplication14CLASSES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Methods adn Values
    Flight lax1 = new Flight();
    Flight lax2 = new Flight();
    // add passengers to both flights
    
    Flight lax3;
    if(lax1.hasRoom(lax2))
        lax3 = lax1.createNewWithBoth(lax2);
    }
    
}
