/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author Abdul Moiz Chishti
 */

import javax.swing.JOptionPane;
import java.util.*;				//import declarations
import java.io.*;
public class App {



    public static void main(String [] args) throws IOException
    {
    //Calling welcome Screen
 	Procedure.message();
 	//Game object
    Game g = new Game();
    //Play game method
    g.playGame();

    }


}