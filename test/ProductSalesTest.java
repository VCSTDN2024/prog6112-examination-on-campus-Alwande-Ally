/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */

import Question2.ProductSales;
import org.junit.*;
import static org.junit.Assert.*;

public class ProductSalesTest {

    private ProductSales ps;

    @Before
    public void setUp() {
        ps = new ProductSales();
    }

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        // Expected: 2 (700 and 600 are over limit)
        assertEquals(2, ps.getSalesOverLimit());
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        // Expected: 4 (300, 250, 150, 200 are under limit)
        assertEquals(4, ps.getSalesUnderLimit());
    }

    @Test
    public void GetTotalSales_ReturnsCorrectTotal() {
        // Expected: 2200 total
        assertEquals(2200, ps.getTotalSales());
    }

    @Test
    public void GetAverageSales_ReturnsCorrectAverage() {
        // Expected: 2200 / 6 = 366.67
        assertEquals(366.67, ps.getAverageSales(), 0.01);
    }

    @Test
    public void GetProductsProcessed_ReturnsCorrectYears() {
        // Expected: 2 years
        assertEquals(2, ps.getProductsProcessed());
    }
}
