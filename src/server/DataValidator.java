/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hòa Bum
 */
public class DataValidator {
    public static void validateEmpty(JTextField field,StringBuilder sb, String errorMessage){
        if(field.getText().equals("")){
            sb.append(errorMessage);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
    }
     public static void validateEmpty(JPasswordField field,StringBuilder sb, String errorMessage){
         String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
    }
}
