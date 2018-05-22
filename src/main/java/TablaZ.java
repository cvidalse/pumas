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
    
    public void multiplicación(int n){
        int[][] matriz= new int[n][n];
        for(int i=0;i<n;i++){
            for(int c=0;c<n;c++){
                matriz[i][n]=n*i;
            }
        }
    }
}
