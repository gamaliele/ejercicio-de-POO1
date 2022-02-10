/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Libro;
import servicios.LibroServicio;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class Main {

    /**prueba
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicio Ls= new LibroServicio();
        Libro l1 = Ls.crearLibro();
        Ls.mostrarLibro(l1);
    }
    
}
