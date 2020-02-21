package sumdivide_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumDivide_CalculatorIT {
    
    public SumDivide_Calculator calcu = new SumDivide_Calculator();

    @Test
    public void testSum() {
        assertEquals(11,calcu.Sum(5,6));
        assertEquals(-4,calcu.Sum(0,-4));
        assertEquals(8,calcu.Sum(14,-6));
    }

    @Test
    public void testDivide() {
        try{
        assertEquals(4F,calcu.Divide(100,25),0.0);
        assertEquals(0.02F,calcu.Divide(2,100),0.0);
        assertEquals(-2.5F,calcu.Divide(-10,4),0.0);
        calcu.Divide(1,0);
        }
        catch(RuntimeException error){
            System.out.println(error.toString());
        }
        
    }

}