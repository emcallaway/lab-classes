package taojava.labs.classes;

import java.math.BigInteger;

/**
 * A simple implementation of Fractions.
 * 
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 * @author CSC152 2005S
 * @version 1.0 of February 2005
 */
public class Fraction
{
  // +------------------+---------------------------------------------
  // | Design Decisions |
  // +------------------+
  /*
   * (1) Denominators are always positive. Therefore, negative fractions are
   * represented with a negative numerator. Similarly, if a fraction has a
   * negative numerator, it is negative.
   * 
   * (2) Fractions are not necessarily stored in simplified form. To obtain a
   * fraction in simplified form, one must call the simplify method.
   */

  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** The numerator of the fraction. Can be positive, zero or negative. */
  BigInteger num;

  /** The denominator of the fraction. Must be non-negative. */
  BigInteger denom;

  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new fraction with numerator num and denominator denom.
   * 
   * Warning! Not yet stable.
   */
  public Fraction (BigInteger num, BigInteger denom) throws Exception
  {
    this.num = num;
    this.denom = denom;
  } // Fraction(BigInteger, BigInteger)

  /**
   * Build a new fraction with numerator num and denominator denom.
   * 
   * Warning! Not yet stable.
   */
  public Fraction (int num, int denom) throws Exception
  {
    this.num = BigInteger.valueOf (num);
    this.denom = BigInteger.valueOf (denom);
  } // Fraction(int, int)
  
  public Fraction (String fract)
  {
	  String[] fractionArray = fract.split("/");
	  Integer numerator = new Integer(fractionArray[0]);
	  Integer denominator = new Integer(fractionArray[1]);
	  this.num = BigInteger.valueOf(numerator);
	  this.denom = BigInteger.valueOf(denominator);
  }

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  public Fraction multiply(Fraction num1) throws Exception
  {
	  Fraction newFrac = new Fraction((num.multiply( num1.num)), (denom.multiply(num1.denom)));
	  return newFrac;
  }
  
  public Fraction fractional() throws Exception
  {  
	  Fraction newFrac = new Fraction(num.remainder(denom), denom);

	  
	  return newFrac;
	  
  }
  
  
  /**
   * Express this fraction as a double.
   */
  public double
    doubleValue ()
  {
    return this.num.doubleValue () / this.denom.doubleValue ();
  } // doubleValue()

  /**
   * Add the fraction other to this fraction.
   */
  public Fraction add(Fraction addMe)
  {
    BigInteger resultNumerator;
    BigInteger resultDenominator;

    // The denominator of the result is the
    // product of this object's denominator
    // and addMe's denominator
    resultDenominator = this.denom.multiply(addMe.denom);
    // The numerator is more complicated
    resultNumerator = (this.num.multiply(addMe.denom)).add(addMe.num.multiply(this.denom));

    // Return the computed value
    try 
      {   
        return new Fraction(resultNumerator, resultDenominator);
      }
    catch (Exception e)
      {
        return null;
      } // generic Exception
  }// add(Fraction)

  /**
   * Convert this fraction to a string for ease of printing.
   */
  public String
    toString ()
  {
    // Lump together the string represention of the numerator,
    // a slash, and the string representation of the denominator
    // return this.num.toString().concat("/").concat(this.denom.toString());
    return this.num + "/" + this.denom;
  } // toString()
} // class Fraction

