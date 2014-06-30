/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcup.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author amorozov
 */
@Named
@SessionScoped
public class Greeting implements Serializable {

    private String text;
    
    public Greeting() {
        this.text = "Hello from Mars!";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
}
