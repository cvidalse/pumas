/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ce
 */
public class TablaZ {

   static int[][] tabla;

    
    public static int[][] operacionTabla(int n, String op){
        if(op.equals("+")){
           return sumaTabla(n);
        }
        else {
           return multiplicacion(n);
    }

    }



    public static int[][] sumaTabla(int x) {
        tabla = new int[x][x];
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < x; j++) {
                tabla[i][j]= (i+j)%x;        
        }
        }
        
        return tabla;
    }

  
   
    public static int[][] multiplicacion(int n){
        tabla= new int[n][n];

        for(int i=0;i<n;i++){
            for(int c=0;c<n;c++){
                tabla[i][n]=n*i;
            }
        }
        return tabla;
    }

}
