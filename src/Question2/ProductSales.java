/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author lab_services_student
 */

public class ProductSales implements ProductSalesInterface {

    private int[][] productSales = {
            {300, 250}, // Microphone
            {150, 200}, // Speakers
            {700, 600}  // Mixing Desk
    };

    private final int SALES_LIMIT = 500;

    @Override
    public int getTotalSales() {
        int total = 0;
        for (int[] product : productSales) {
            for (int sale : product) {
                total += sale;
            }
        }
        return total;
    }

    @Override
    public double getAverageSales() {
        int total = 0;
        int count = 0;
        for (int[] product : productSales) {
            for (int sale : product) {
                total += sale;
                count++;
            }
        }
        return (double) total / count;
    }

    @Override
    public int getSalesOverLimit() {
        int over = 0;
        for (int[] product : productSales) {
            for (int sale : product) {
                if (sale >= SALES_LIMIT) {
                    over++;
                }
            }
        }
        return over;
    }

    @Override
    public int getSalesUnderLimit() {
        int under = 0;
        for (int[] product : productSales) {
            for (int sale : product) {
                if (sale < SALES_LIMIT) {
                    under++;
                }
            }
        }
        return under;
    }

    @Override
    public int getProductsProcessed() {
        return productSales[0].length; // Number of years processed
    }
}
