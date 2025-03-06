package edu.unca.csci202;



/**
 * An interface for LargeInteger
 */
public interface LargeInteger extends Comparable{
	
	
	
	/**
	 * gives the sum of two LargeIntegers
	 * @param other used to add two largeIntegers, "this" and other.
	 * @return sum 
	 */
	public LargeInteger add(LargeInteger other);
	
	/**
	 *  gives the sum of two LargeIntegers
	 * @param other used to subtract two largeIntegers, "this" and other.
	 * @return difference
	 */
	public LargeInteger subtract(LargeInteger other);
	
	/**
	 *  gives the negative value of the LargeInteger
	 *  @return negative of LargeInteger 
	 */
	public LargeInteger negate();
	
	/**
	 *  gives the absolute value of the LargeInteger
	 *  @return absolute value
	 */
	public LargeInteger abs();
	
	/**
	 *  gives the product of two LargeIntegers
	 * @param other used to multiply two largeIntegers, "this" and other.
	 * @return product
	 */
	
	public LargeInteger multiply(LargeInteger other);
	
	/**
	 *  gives the max between two LargeIntegers
	 * @param other used to compare two largeIntegers, "this" and other.
	 * @return max 
	 */
	public LargeInteger max(LargeInteger other);
	
	/**
	 *  gives the minimum between two LargeIntegers
	 * @param other used to compare two largeIntegers, "this" and other.
	 * @return min
	 */
	public LargeInteger min(LargeInteger other);
	
	/**
	 * used to show if value is 0, positive or negative
	 * @return 0 if val is 0, 1 if positive, -1 if negative
	 */
	public int signum();
	
	

}
