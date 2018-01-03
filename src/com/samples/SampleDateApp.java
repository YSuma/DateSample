/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples;

import javax.swing.JFrame;

/**
 *
 * @author ken
 */
public class SampleDateApp extends JFrame {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            MyDate date = new MyDate("31 12 2017");
            MyDate date2 = new MyDate("31 12 2018");
            System.out.println("Days = " + new MyDateUtils().difference(date, date2));
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        } 
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampleAppForm().setVisible(true);
            }
        });
        
    }
    
  
    
}
