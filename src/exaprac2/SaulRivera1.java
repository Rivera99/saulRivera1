/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class SaulRivera1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int i=0;
        int tam=0;
        int menu=0;
        int cont=0;
        int seguir;
        
        
        String carritoNom[];
        int cantidad[];
        double precioUni[];
        
        double sumaTotal;
        double acu=0;
        
        
        
        
        
        do{
            
            menu=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n 1-Agregar Producto\n 2-Calcular total\n 3- Salir"));
            
            switch(menu){
            
            
            case 1:
                
                tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos productos ingresra"));
                
                carritoNom = new String[tam];
                cantidad = new int[tam];
                precioUni = new double[tam];
                String resultado="";
                
                for(i=0; i<tam; i++){
                    
                    
                    carritoNom[i]=JOptionPane.showInputDialog(null, "Escriba el nombre del producto");
                    
                    cantidad[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de productos"));
                    
                    precioUni[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "Precio unitario del producto"));
                    
                    cont++;
                    sumaTotal=precioUni[i]*cantidad[i];
                    acu+=sumaTotal*1.13;
                }
                
                for( i=0; i<tam;i++){
           
                    resultado+="\nNombre del producto "+carritoNom[i]+"\n Cantidad" +cantidad[i]+"\n Precio:"+precioUni[i];
                    
        }
                JOptionPane.showMessageDialog(null, "Productos"+resultado);
                
                
                break;
                
            case 2:
                    
                    JOptionPane.showMessageDialog(null, "EL total es:"+acu);
                break;
                
            case 3:
                
                break;
        }
            
            
            
            seguir=JOptionPane.showConfirmDialog(null, "desea continuar", "confirmar", JOptionPane.YES_NO_OPTION);
            
        }while(seguir== JOptionPane.YES_OPTION);
        
        
        
    }
    
}
