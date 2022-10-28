package carmine.ProvaIngsw213535;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest 
{
    /**
     * Rigorous Test :-)
     */
	
	private static FunnyAlgorithms funny;
	
	@BeforeClass
	public static void beforeTests()
	{
		System.out.println("Before class");
		funny = new FunnyAlgorithms();
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldBeInInterval()
    {
    	String prova = "4000";
    	assert(FunnyAlgorithms.stringToIntConverter(prova) != 0);
    }
    
    @Test
    public void shouldBeIntegerAndWellDone()
    {
    	String prova2 = "9";
    	assert(FunnyAlgorithms.stringToIntConverter(prova2) == 9);
    }
}
