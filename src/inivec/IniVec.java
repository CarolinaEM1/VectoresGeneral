/** programa que imprime vector,suma de vectores, suma vector invertido, ordena vector, 
 * búsqueda binaria.
 */
package inivec;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class IniVec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String res="B";
       System.out.println(res.compareTo("B"));
       
       VectoresGeneral vg=new VectoresGeneral();
       int n=Integer.parseInt(JOptionPane.showInputDialog("Teclea elementos"));
       int [] vec1;      // int [] vec=new int[6];
       vec1=vg.LlenarVector(n);
       JOptionPane.showMessageDialog(null,"Arreglo 1\n"+vg.imprimirVector(vec1));
       //System.exit(0);
       int [] vec2;      // int [] vec=new int[6];
       vec2=vg.LlenarVector(n);
       JOptionPane.showMessageDialog(null,"Arreglo 2\n"+vg.imprimirVector(vec2));
       
       int [] sumaVec=new int [n];
       vg.sumaVectores(vec1, vec2, sumaVec);
       
       JOptionPane.showMessageDialog(null,"Arreglo Suma\n"+vg.imprimirVector(sumaVec));
       
 
       vg.ordenaVector(vec1);
       JOptionPane.showMessageDialog(null,"Vector Ordenado\n"+vg.imprimirVector(vec1));
      // System.exit(0);

       int [] otro={10,23,45,2,34,65,6,21,34,10};
        vg.ordenaVector(otro);
        JOptionPane.showMessageDialog(null,"Nuevo arreglo\n"+vg.imprimirVector(otro));
       int [] suma=new int[vec1.length];
       vg.sumaVectores(vec1, otro, suma);
       JOptionPane.showMessageDialog(null,"Suma arreglos\n"+vg.imprimirVector(suma));
       
       do
       {
           vg.busquedaBinaria(vec1,10);
           res=JOptionPane.showInputDialog("¿Otra búsqueda? teclea <SI/NO>");
       }while(res.equalsIgnoreCase("SI"));
       System.exit(0);
   }
     }
    
    
    

