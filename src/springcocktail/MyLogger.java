/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcocktail;

import javax.swing.JOptionPane;

/**
 *
 * @author M.T
 */
public class MyLogger implements Logger{
    @Override
    public void log(String message){
        JOptionPane.showMessageDialog(null,"MyLogger:"+message);
    }
}
