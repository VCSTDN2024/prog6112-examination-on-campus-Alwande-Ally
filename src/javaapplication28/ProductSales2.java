/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author lab_services_student
 */


public class ProductSales2 Report {
    public static void main (String[] args){
        int [][] productSales = {
            {300,150,700}, // Year 1
            {250,200,600} // Year 2
                
                
        };
        
        ProductSales ps = new ProductSales();
        
        int total = ps. TotalSales (productSales);
        double average = ps.AverageSales(productSales);
        int max = ps.MaxSale(productSales);
        int min = ps.MinSale(productSales);
        
        System.out.println("Product Sales Report - 2025");
        System.out.println("Total sales: total");
        System.out.println("Average sales" + Math.round(average));
        System.out.println("Maximum sales:"+ max);
        System.out.println("Minimum sales"+ min);
        
        
     
        
        
    }
}
