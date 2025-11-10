/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author lab_services_student
 */

public class ProductSales implements IProduct {
    
    @Override
    public int TotalSales ( int [][] productSales) {
        int total = 0;
        
        for ( int [] year: productSales){
            for(int sale: year){
                total += sale;
            }
        }
        return total;
    }
    @Override
    public double AverageSales( int [][] productSales){
        int total = 0;
        int count = 0;
        for (int [] year: productSales){
            for (int sale: year){
                total += sale;
                count++;
            }
        }
        return (double) total/count;
    }
    @Override
    public int MaxSale( int [][] productSales, int sale){
        int max = productSales[0][0];
        for (int [] year: productSales){
            for(sale > max){
                max = sale;
            }
        }
        return 0;
    }

    int MinSale(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int MaxSale(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    return min;
}

        
