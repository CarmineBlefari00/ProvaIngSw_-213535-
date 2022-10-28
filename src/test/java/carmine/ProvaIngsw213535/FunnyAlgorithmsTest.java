package carmine.ProvaIngsw213535;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldBeNotZero()
    {
    	String prova = "40000";
    	assert(FunnyAlgorithms.stringToIntConverter(prova) != 0);
    }
}
