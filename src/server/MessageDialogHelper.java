/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Hòa Bum
 */
public class MessageDialogHelper {
    public static void showMessageDialog(Component parent ,String content, String title){
        JOptionPane.showMessageDialog(parent,content , title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorDialog(Component parent ,String content, String title){
        JOptionPane.showMessageDialog(parent, content , title, JOptionPane.ERROR_MESSAGE);
    }
     public static int showConfirmDialog(Component parent ,String content, String title){
        int choose = JOptionPane.showConfirmDialog(parent, content , title,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        return choose;
    }
}
