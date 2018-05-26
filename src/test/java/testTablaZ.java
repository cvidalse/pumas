/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eriol
 */
public class testTablaZ {
    
    @Test
    public void testTablaZMult() {
        int[][] matrizMultiplicacion2={{0,0,0,0},{0,1,2,3},{0,2,0,2},{0,3,2,1}};
        assertArrayEquals(matrizMultiplicacion2,TablaZ.operacionTabla(4, "*"));
    }
     @Test
    public void sumaTablaTest(){
        int[][] suma1= {{0,1,2,3},{1,2,3,0},{2,3,0,1},{3,0,1,2}};
        assertArrayEquals(suma1,TablaZ.operacionTabla(4,"+"));
    }
    
   
}
