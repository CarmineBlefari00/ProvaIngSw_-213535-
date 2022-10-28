package carmine.ProvaIngsw213535;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.joda.time.LocalTime;
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
    public void shouldBeInInterval()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	String prova = "4000";
    	assert(funny.stringToIntConverter(prova) != 0);
    	System.out.println("Test ends : " + LocalTime.now());
    }
    
    @Test
    public void NotInInterval()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	String prova = "40000";
    	assert(funny.stringToIntConverter(prova) == 0);
    	System.out.println("Test ends : " + LocalTime.now());
    }
    
    @Test
    public void shouldBeIntegerAndWellDone()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	String prova2 = "9";
    	assert(funny.stringToIntConverter(prova2) == 9);
    	System.out.println("Test ends : " + LocalTime.now());
    }
    
    @Test 
    public void shouldFindPosition()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	int[] array = {1 , 2 , 3};
    	int myNum = 2;
    	assertEquals(1,funny.binarySearch(array , myNum));
    	System.out.println("Test ends : " + LocalTime.now());
    }
    
    @Test 
    public void shouldNotFindPosition()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	int[] array = {1 , 2 , 3};
    	int myNum = 10;
    	assertEquals(-1,funny.binarySearch(array , myNum));
    	System.out.println("Test ends : " + LocalTime.now());
    }
    
    @Test
    public void shouldBeSortedAscending()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	int[] array = {1,2,3};
    	int[] correctArray = {3,2,1};
    	funny.selectionSort(array,0);
    	boolean controllo = false;
    	for(int i = 0 ; i < array.length ; i++)
    	{
    		if(array[i] == correctArray[i])
    		{
    			controllo = true;
    		}
    		else
    		{
    			controllo = false;
    			break;
    		}
    	}
    	assertTrue(controllo);
    	System.out.println("Test ends : " + LocalTime.now());
    }
    
    @Test
    public void shouldBeSortedDescending()
    {
    	System.out.println("Test starts : " + LocalTime.now());
    	int[] array = {3,2,1};
    	int[] correctArray = {1,2,3};
    	funny.selectionSort(array,1);
    	boolean controllo = false;
    	for(int i = 0 ; i < array.length ; i++)
    	{
    		if(array[i] == correctArray[i])
    		{
    			controllo = true;
    		}
    		else
    		{
    			controllo = false;
    			break;
    		}
    	}
    	assertTrue(controllo);
    	System.out.println("Test ends : " + LocalTime.now());
    }
}
