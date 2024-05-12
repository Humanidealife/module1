/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testlibrairiepremier.module1;

/**
 *
 * @author wangq
 */
public class Module1 {

    public static void main(String[] args) {
        //On veut faire appel aux Class de la librairie que l'on vient de télécharger.
        //On souhaite en particulier utiliser la Class StringUtils et sa méthode "abbreviate"
        String phraseLongue = "Ceci est une phrase très longue afin de pouvoir faire un test sur la Class StringUilts de la librairie Lang";
        System.out.println(phraseLongue);
        //Puis on veut la réduire
        //"StringUtils" est évidemment toujours inconnu, bien qu'il s'agisse d'un projet "Maven",
        //  on va tout de même avoir besoin d'indiquer de quelle librairie on a besoin. Mais cela va être un peu plus simple.
        String phraseRaccourcie = StringUtils.abbreviate(phraseLongue, 8);
        System.out.println(phraseRaccourcie);
    }
}
