/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Libro;
import java.util.Scanner;


/**
 *
 * @author GamalielE.Gonzalez
 */
public class LibroServicio {
    
    public Libro crearLibro(){
    
        Libro moldeLibro=new Libro();
        Scanner Leer= new Scanner(System.in);
        System.out.println("ingrese ISBN");
        moldeLibro.setISBN(Leer.nextInt());
        
        System.out.println("ingrese titulo");
        Leer.nextLine();
        moldeLibro.setTitulo(Leer.nextLine());
        
        System.out.println("ingrese autor");
        moldeLibro.setAutor(Leer.nextLine());
        
        System.out.println("ingrese numpag");
        moldeLibro.setNumpag(Leer.nextInt());
        
        return moldeLibro;
    }
  public void mostrarLibro(Libro libroCualquiera){
      System.out.println("ISBN: "+ libroCualquiera.getISBN());
      System.out.println("Autor: "+ libroCualquiera.getAutor());
      System.out.println("Titulo: "+ libroCualquiera.getTitulo());
      System.out.println("Numero de pagina: "+ libroCualquiera.getNumpag());
  }          
}
