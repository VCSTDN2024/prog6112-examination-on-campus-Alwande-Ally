/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
import.org.junit*;
import static org. junit. Assert*;


private ProductSales class public class ProductSales Test{
    
    private ProductSales ps;
    private int [][] data;
    
    @Before
    public void setUp() {
        ps = new productSales();
        data = new int [][] {
            {300,150,700),
        {250,200,600}
    }
        
        
    
        }
                
    };
    
 @Test
   public void testTotalSeries(){
    assertEquals(2200 ps. TotalSales(data));
}

@Test
public void testMaxSale(){
assertEquals(700, ps.MaxSale(data));

}

@Test
public void testMinSale(){
assertEquals(150,ps.MinSale(data));
}

}
