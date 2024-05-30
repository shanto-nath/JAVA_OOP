/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.util.Random;

/**
 *
 * @author User
 */
public class Matrix {
    int[][] vals;
    public Matrix() {
        //vals=null;  
        vals = new int[10][10];
        int i,j;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                this.vals[i][j]=0;
            }
        }
    }

    public Matrix(int[][] vals) {
        this.vals = vals;
    }
    public Matrix(int rows, int cols){
        vals = new int[rows][cols];
        int i,j;
        Random r = new Random();
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                this.vals[i][j]= r.nextInt(100);
            }
        }        
    }
    void showMatrix(){
        int i,j;
        for(i=0; i<vals.length; i++){
            for(j=0;j<vals[i].length;j++){
                System.out.print(this.vals[i][j]+" ");
            }
            System.out.println();
        }         
    }
    
    String getStringEquivalentOfMatrix(){
       String str="";
       int i,j;
        for(i=0; i<vals.length; i++){
            for(j=0;j<vals[i].length;j++){
                str += this.vals[i][j]+" ";
            }
            str += "\n";
        }             
        return str;
    }
    
}
