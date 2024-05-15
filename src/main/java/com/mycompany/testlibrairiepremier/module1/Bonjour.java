 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testlibrairiepremier.module1;

/**
 *
 * @author wangq
 */
public class Bonjour {
    //On ajoute une méthode
    public void printGreetings (String nom, String prenom){
        System.out.println("Bonjour " + prenom + " " + nom);
        //On clique à nouveau "Clean and Build" sur "module1" dans l'onglet à gauche de l'écran , 
        //  pour fabriquer à nouveau notre librairie (donc pour raffraîchir la librairie).
        //Le "Clean ans Build" a eu pour effet de rafraîchir notre librairie "module1-1.jar" dans le dossier "target", 
        //  mais également dans le dossier ".m2"
    }
    
}
