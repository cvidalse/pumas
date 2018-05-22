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

    int[][] tabla;

    public int[][] sumaTabla(int x, String operacion) {
        tabla = new int[x][x];
        for (int i = 0; i < x; i++) {
            int c=0;
            for (int j = 0; j < x; j++) {
                tabla[i][j]=c;        
                        c++;
                        }
        }
        return null;
    }

=======
    private int[][] matriz;
    public void multiplicación(int n){
        matriz= new int[n][n];
        for(int i=0;i<n;i++){
            for(int c=0;c<n;c++){
                matriz[i][n]=n*i;
            }
        }
    }
>>>>>>> origin/master
}
