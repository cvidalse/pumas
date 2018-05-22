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
<<<<<<< HEAD
=======


>>>>>>> origin/master
    int[][] tabla;
<<<<<<< HEAD

    public int[][] sumaTabla(int x, String operacion) {
        tabla = new int[x][x];
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < x; j++) {
                tabla[i][j]= i%j;        
                        }
        }
        return tabla;
=======
    
    public void operacionTabla(int n, String op){
        if(op.equals("+"));
            sumaTabla(n);
        if(op.equals("*")); 
            multiplicacion(n);
>>>>>>> origin/master
    }

<<<<<<< HEAD
    public void multiplicación(int n){
        tabla= new int[n][n];
=======
    public int[][] sumaTabla(int x) {
        tabla = new int[x][x];
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < x; j++) {
                tabla[i][j]= (i+j)%x;        
        }
        }
        
        return tabla;
    }

    private int[][] matriz;
   
    public void multiplicacion(int n){
        matriz= new int[n][n];
>>>>>>> origin/master
        for(int i=0;i<n;i++){
            for(int c=0;c<n;c++){
                tabla[i][n]=n*i;
            }
        }
    }
<<<<<<< HEAD
=======

>>>>>>> origin/master
}
