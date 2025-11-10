/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

    
    
/**
 *
 * @author lab_services_student
 */

public class ProductSalesReport{
    public static void main(String[] args);
    
    // 1. Declare and initialize the 2DArray  for yearly  sales ====
    // Each row = a year, each column = a quater
    
    int [][] sales = {
        {300,150,700}, // year 1
            {250,200,600} // year 2
            

        
    };
    
    // ==== 2. Variable to hold calculations====
    int tottal = 0;
    int count =0;
    int max = sales[0][0];
    int min = sales [0][0];
    private int total;
    
    
    
    // ====== 3. Loop through the 2D array to Calculate tottals =====
    for ( int i = 0; i < sales.length; i++){
    for ( int j=0; j< sales[i].length;j++){
    int value = sales [i][i];
            total + = value;
            count ++;
            
            
            if (value > max) max = value;
            if (value < min) min = value;
            
}
            
            
            
    
            
}
// ====== 4. Calculate the average ======

double average = (double)total/count;


    
  
    
    
}