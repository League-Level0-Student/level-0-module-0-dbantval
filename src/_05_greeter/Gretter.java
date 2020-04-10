package _05_greeter;

import javax.swing.JOptionPane;

public class Gretter {
    public static void main(String[] args) throws Exception {
    	String input = JOptionPane.showInputDialog("What is your name?");
    	JOptionPane.showMessageDialog(null,"Hello "+input);
}}
