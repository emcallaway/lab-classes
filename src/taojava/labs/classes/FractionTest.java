package taojava.labs.classes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A test of our fraction class.
 */
public class FractionTest
{

  @Test
  public void
    testMultiply () throws Exception
  {
    Fraction f = new Fraction(1, 2);
    Fraction b = new Fraction(2, 3);
    
    assertEquals("Testing 1/2 * 2/3 ", "2/6", f.multiply(b).toString());
  } // testMultiply
  
  @Test
  public void
    testFractional () throws Exception
  {
	  Fraction f = new Fraction(11,3);
	    assertEquals("2/3", f.fractional().toString());

	    f = new Fraction(1,2);
	    assertEquals("1/2",  f.fractional().toString());

	    f = new Fraction (5,2);
	    assertEquals("1/2", f.fractional().toString());

	    f = new Fraction(4,2);
	    assertEquals("0/2", f.fractional().toString());
	    
	    f = new Fraction(-4, 3);
	    assertEquals("-1/3", f.fractional().toString());
	} // testFractional()
  
  @Test
  public void 
  stringConstructorTest() 
  {
    Fraction f = new Fraction("1/4");
    assertEquals(1, f.num);
    assertEquals(4, f.denom);
    f = new Fraction("11/5");
    assertEquals(11, f.num);
    assertEquals(5, f.denom);
    f = new Fraction("120/3");
    //assertEquals(40.0, f.toReal(), 0.0001);
  } // stringConstructorTest()
  
} // class FractionTest
