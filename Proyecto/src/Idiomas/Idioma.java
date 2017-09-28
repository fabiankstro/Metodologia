/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idiomas;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author castrorj
 */
public class Idioma {
    public String language (String lang, String country, String word){
        Locale l = new Locale(lang, country);
        ResourceBundle x = ResourceBundle.getBundle("Idiomas/Bundle", l);
        String str = x.getString(word);
        return str;
    }
}
