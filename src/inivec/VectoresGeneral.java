
package inivec;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class VectoresGeneral {
     public int [] LlenarVector(int n) // Como dato de retorno (no es void) nos regresa un arreglo de tipo entero de 2 dimemnsión
    {
        //        vec1=vg.LlenarVector(n);
        int [] vector=new int [n];   // Se crea vector que es un arreglo de "e" elementos  
        
        for(int i=0; i<vector.length; i++)//  for(int i=0; i<n; i++)
        {
           vector[i]= Integer.parseInt(JOptionPane.showInputDialog("Teclea valor ["+ (i+1)+"]"));
        }
        return vector;
    }
    
    /*
        Metodo para imprimir vectores
    */
    
    public String imprimirVector(int[] vector)   //  Recibe como parámetro un vector que será el que se desea imprimir
    {
        String s ="\nElementos del arreglo\n";       //  Variable que irá almacenando los valores de los elementos de la matriz para posteriomente imprimirlos
        for(int i=0;i<vector.length;i++)
        {
           s=s+vector[i]+"\n";
        }
        //System.out.print("desde el método\n"+res+"\n antes de salir del metodo\n");
        return s;     //  Retorna la cadena almaacenada
    }
    public void sumaVectores(int[] vecA,int[] vecB,int[] vecSuma)
    {
            for(int k=0;k<vecA.length;k++)
             {
                     vecSuma[k]=vecA[k]+vecB[k];
             }
    }
    
    
    
    
    public void sumaVecInvertido(int[] vecA,int[] vecB,int[] vecSuma)
    {
            for(int i=0;i<vecA.length;i++)
             {
                 vecSuma[i]=vecA[i]+vecB[vecA.length-(i+1)];
             }
    }
    
   /*
        Metodos para ordenar un vector
      linea comentio 
    */
    public void ordenaVector(int[] vector)
    {
        int aux;
        for(int pas=1;pas<vector.length;pas++)
        {
            for(int com=1;com<=vector.length-pas;com++)
            {
                if(vector[com-1]>vector[com])
                {
                    aux=vector[com-1];
                    vector[com-1]=vector[com];
                    vector[com]=aux;
                }
            }
        }
    }
    public boolean busquedaBinaria(int[] vector,int buscar)
    {
        
        int pm,li,ls;
        li=0;
        ls=vector.length-1;
        do
        {
            pm=(li+ls)/2;
            if(vector[pm]>buscar)
            {
                ls=pm-1;
            }
            else
            {
                li=pm+1;
            }
        }while(vector[pm]!=buscar && li<=ls);
        if(vector[pm]==buscar)
        {
           return true;
        }
        else
        {
            return false;
        }
            
    }

    
}  
    

