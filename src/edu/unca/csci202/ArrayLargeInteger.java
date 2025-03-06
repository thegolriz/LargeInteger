package edu.unca.csci202;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 * ArrayLargeInteger class that implements LargeInteger interface Used to
 * manipulatie "integers" that would be outside of bounds within the normal java
 * int class
 */
public class ArrayLargeInteger implements LargeInteger {
	List<String> bigOlInt;
	private final int ZERO = 0;
	private final int ONE = 1;
	private final int TEN = 10;
	boolean wasNeg;// used for when a "-" must be remove, to let program know to add it back to
					// original number
	boolean negAte;// instance when two negatives make a positive so it does not negate them again
	boolean putNegSign;

	/**
	 * Constructor for ArrayLargeInteger class
	 * 
	 * @param s takes String and puts each char into a list to represent a integer
	 */
	public ArrayLargeInteger(String s) {

		bigOlInt = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			String temp = s.substring(i, i + 1);
			bigOlInt.add(temp);

		}
		wasNeg = false;
		negAte = false;
		putNegSign = false;// for when a negative sign needs to be added
	}

	/**
	 * Used to help compareTo method 
	 * 
	 * @param other takes Laege Integer to compare with argument
	 * @return which is the higher value number, 1 if this is bigger, -1 is other is
	 *         bigger, 0 if both are the same
	 */

	public int compareToHelp(LargeInteger other) {// works

		// loop through both and if a number is greater than that of the other, break
		// loop and return it
		// base case for equavils
		if (bigOlInt.isEmpty() && sizeCheck(other) == 0) {// if both are empty they are the same
			return 0;
		}
		if (this.signum() == -1 && other.signum() == 1) {// handles case of negative on this and positive other
			return -1;

		}
		if (this.signum() == 1 && other.signum() == -1) {// handles case of negative on other and positive on
															// this
			return 1;
		}
		if (this.signum() == -1 && other.signum() == -1) {// if both are negative
			
			if (bigOlInt.size() < sizeCheck(other)) {// if this is smaller in size, value would therefore be greater
				
				return 1;
			}
			if (bigOlInt.size() > sizeCheck(other)) {// if this is smaller in size, value would therefore be greater
				
				return -1;
			}
			if (bigOlInt.size() == sizeCheck(other)) {
				
				;
				
				for (int i = 0; i < bigOlInt.size() -1; i++) {// same as above loop but for positive with same lengths
					
					int check1 = this.getNum(i);
					int check2 = removeAndParse(other,i);
					
					if (check1 < check2) {// same but returns is at any point a number in this is
																	// bigger
						return 1;
					}
					if (check1 > check2) {// same as above but for other
						
						return -1;

					}

				}
				
			}

		}

		if (bigOlInt.size() > sizeCheck(other)) {// if this is bigger in size, value would therefore be greater
			return 1;
		}
		if (bigOlInt.size() < sizeCheck(other)) {// if this is bigger in size, value would therefore be greater
			return -1;
		}
		// case of equal length, different numbers

		for (int i = 0; i < bigOlInt.size()-1; i++) {// same as above loop but for positive with same lengths

			if (this.getNum(i) > removeAndParse(other, i)) {// same but returns is at any point a number in this is
															// bigger
				return 1;
			}
			if (this.getNum(i) < removeAndParse(other, i)) {// same as above but for other
				return -1;

			}

		}

		return 0;// base case son
	}

	public LargeInteger add(LargeInteger other) {
		

		// for negative addition invoke the subtract method(not cheating ;).
		if (other.signum() == 0) {// checks if other is empty
			return this;// works
		}
		if (this.signum() == 0) {// checks if this is empty
			return other;// works
		}
		int overNine = 0;// used to count amount of times a number plus another number results in it
		int overageFac = 0;

		// being over 9
		// idea is when it hits 10, you add a zero to the end

		List<String> answers = new ArrayList<String>();

		if (this.signum() == -1 && other.signum() == 1) {// not implemented yet
			bigOlInt.remove(0);
			wasNeg = true;

			if (bigOlInt.size() < sizeCheck(other)) {
				negAte = true;
			} else {
				putNegSign = true;
			}

			return this.subtract(other);
		}
		if (this.signum() == 1 && other.signum() == -1) {// works
			// should be just subtracting
			if (bigOlInt.size() < sizeCheck(other)) {
				putNegSign = true;
			}
			String temp = other.toString();
			temp = temp.substring(1);
			ArrayLargeInteger copy = new ArrayLargeInteger(temp);
			other = copy;
			// putNegSign = true;

			return this.subtract(other);
		}

		if (this.signum() == -1 && other.signum() == -1) {// works
			// String reneg = "-";
			bigOlInt.remove(0);

			String temp = other.toString();
			temp = temp.substring(1);
			ArrayLargeInteger copy = new ArrayLargeInteger(temp);
			other = copy;
			wasNeg = true;
			putNegSign = true;

		}

		int looped = 0;
		// instance where primary LargeInteger is bigger than param
		// Make a list which holds the answer
		if (bigOlInt.size() == sizeCheck(other)) {// works

			for (int i = bigOlInt.size() - 1; i >= 0; i--) {
				int bigNum = Integer.parseInt(bigOlInt.get(i));// takes last number of both lists
				int othNum = removeAndParse(other, i);

				// Now we will add
				if (overNine == ONE) {// checks if there is a left over from previous loop

					overNine = 0;
					bigNum++;// adds that one to number being added
				}
				int addition = bigNum + othNum;

				overageFac = 0;// this is eveything over 9 as it cannot be put into same line
				// check for it being 10
				if (i == 0 && addition == TEN) {
					answers.add(TEN + "");
				}
				if (i == 0 && addition > TEN) {
					answers.add(addition + "");
				}
				if (i > 0 && addition == TEN) {
					// add one to counter
					answers.add(ZERO + "");// add 0 to end of list
					overNine++;

				}
				if (i > 0 && addition != TEN && addition > 9) {// checks case for addition being 11 or moe
					overageFac = addition - TEN;// gives number that will be result put into list
					answers.add(overageFac + "");// adds to list
					overNine++;// lets us know the next iteration will have a larger number yeyeye

				} else if (addition != TEN && addition <= 9) {
					answers.add(addition + "");

				}

			}
		}
		// works
		if (bigOlInt.size() > sizeCheck(other)) {// if this is bigger than loop thorugh as long as there are elements
			for (int i = bigOlInt.size() - 1; i >= 0; i--) {

				for (int j = sizeCheck(other) - 1; j >= 0; j--) {

					if (looped == sizeCheck(other)) {
						break;
					}
					int bigNum = Integer.parseInt(bigOlInt.get(i));// takes last number of both lists
					int othNum = removeAndParse(other, j);

					// Now we will add
					if (overNine == ONE) {// checks if there is a left over from previous loop

						overNine = 0;
						bigNum++;// adds that one to number being added
					}
					int addition = bigNum + othNum;

					overageFac = 0;// this is eveything over 9 as it cannot be put into same line
					// check for it being 10
					if (addition == TEN) {
						// add one to counter
						answers.add(ZERO + "");// add 0 to end of list
						overNine++;

					}
					if (addition != TEN && addition > 9) {// checks case for addition being 11 or moe
						overageFac = addition - TEN;// gives number that will be result put into list
						answers.add(overageFac + "");// adds to list
						overNine++;// lets us know the next iteration will have a larger number yeyeye

					} else if (addition != TEN && addition <= 9) {
						answers.add(addition + "");
					}

					looped++;
					i--;

				}

				if (overNine == ONE) {// checks if there is still a remainder to add

					overNine = ZERO;
					int bigNum = Integer.parseInt(bigOlInt.get(i));

					int addition = bigNum + 1;

					if (i >= 0 && addition < TEN) {
						answers.add(addition + "");
					}

					if (i > 0 && addition == TEN) {// if the addition is 10
						answers.add(ZERO + "");
						overNine++;// handles case of addition being 10 again

					}
					if (i == 0 && addition == 10) {

						answers.add(TEN + "");
						overNine = 0;

					}

				} else {// else it will continue loop and keep brining remaining numbers in here

					answers.add(bigOlInt.get(i));
				}

			}

		}
		// instance where primary is smaller than param
		if (bigOlInt.size() < sizeCheck(other)) {// works

			for (int i = sizeCheck(other) - 1; i >= 0; i--) {

				for (int j = bigOlInt.size() - 1; j >= 0; j--) {

					if (looped == bigOlInt.size()) {
						break;
					}
					int bigNum = Integer.parseInt(bigOlInt.get(j));// takes last number of both lists
					int othNum = removeAndParse(other, i);

					// Now we will add
					if (overNine == ONE) {// checks if there is a left over from previous loop

						overNine = 0;
						othNum++;// adds that one to number being added
					}
					int addition = bigNum + othNum;

					overageFac = 0;// this is eveything over 9 as it cannot be put into same line
					// check for it being 10
					if (addition == TEN) {
						// add one to counter
						answers.add(ZERO + "");// add 0 to end of list
						overNine++;

					}
					if (addition != TEN && addition > 9) {// checks case for addition being 11 or moe
						overageFac = addition - TEN;// gives number that will be result put into list
						answers.add(overageFac + "");// adds to list
						overNine++;// lets us know the next iteration will have a larger number yeyeye

					} else if (addition != TEN && addition <= 9) {
						answers.add(addition + "");
					}
					looped++;
					i--;

				}

				if (overNine == ONE) {// checks if there is still a remainder to add

					overNine = ZERO;
					int othNum = removeAndParse(other, i);

					int addition = othNum + 1;

					if (i >= 0 && addition < TEN) {
						answers.add(addition + "");
					}

					if (i > 0 && addition == TEN) {// if the addition is 10
						answers.add(ZERO + "");
						overNine++;// handles case of addition being 10 again

					}
					if (i == 0 && addition == 10) {

						answers.add(TEN + "");
						overNine = 0;

					}

				} else {// else it will continue loop and keep brining remaining numbers in here

					answers.add(removeAndParse(other, i) + "");
				}

			}

		}

		// all numbers are now in list called answers however it is backworks

		Collections.reverse(answers);// or shall I say was

		StringBuilder bigNum = new StringBuilder(answers.size());// used to make it into a string so to make new
		// ArrayLargeInteger
		String str = "";
		for (int i = 0; i < answers.size(); i++) {
			bigNum.append(answers.get(i));
		}

		if (wasNeg == true) {
			if (!bigOlInt.get(0).equals("-")) {
				bigOlInt.add(0, "-");
			}
		}

		wasNeg = false;
		if (negAte == true) {
			str = "" + bigNum;
			negAte = false;
		} else if (putNegSign == true) {
			str = "-" + bigNum;
			putNegSign = false;

		} else {

			str = bigNum + "";

		}

		return new ArrayLargeInteger(str);
	}

	/**
	 * Used to remove the - sign from largeInteger
	 * 
	 * @param other largeinteger to be looked at
	 * @param index where it at
	 */
	public LargeInteger removeNeg(LargeInteger other) {
		String ting = other.toString();
		ting = ting.substring(1);
		ArrayLargeInteger copy = new ArrayLargeInteger(ting);
		other = copy;
		return other;

	}

	/**
	 * Used to take the String value at a certain spot in the LargeInteger and make
	 * it an int
	 * 
	 * @param other LargeInteger to be parsed
	 * @param index where in the List to take from
	 * @return int of spot chosen
	 */
	public int removeAndParse(LargeInteger other, int index) {// seems to work correctly, returns correct spot
		String goingToBeNum = other.toString();
		if (other.signum() == -1) {
			index++;
		}
		char exactSpot = goingToBeNum.charAt(index);

		String redo = exactSpot + "";
		int numizied = Integer.parseInt(redo);
		return numizied;
	}

	public LargeInteger subtract(LargeInteger other) {
		// check for both being negative and just run add on it, duh
		// TODO Auto-generated method stub

		if (other.signum() == 0) {// checks if other is empty
			return this;
		}
		if (this.signum() == 0) {// checks if this is empty
			return other;
		}
		List<String> answers = new ArrayList<String>();
		// if both negative, invoke addition
		int looped = 0;
		int underFac = 0;// this should subtract 1 from next spot as we borrowed 10 for when subtraction
							// is smaller - bigger number
		if (this.signum() == -1 && other.signum() == -1) {// if both are negative then other will be positive and it
															// will continue subtracting

			String temp = "" + other;
			temp = temp.substring(1);
			ArrayLargeInteger temper = new ArrayLargeInteger(temp);
			other = temper;

			return this.add(other);
		}
		if (this.signum() == 1 && other.signum() == -1) {
			negAte = true;
			String temp = other.toString();
			temp = temp.substring(1);
			ArrayLargeInteger copy = new ArrayLargeInteger(temp);
			other = copy;

			return this.add(other);

		}
		if (this.signum() == -1 && other.signum() == 1) {
			String temp = other.toString();
			temp = "-" + temp;
			ArrayLargeInteger copy = new ArrayLargeInteger(temp);
			other = copy;
			return this.add(other);

		}

		// For both positive numbers
		if (this.signum() == 1 && other.signum() == 1) {

			if (bigOlInt.size() == sizeCheck(other) && this.compareToHelp(other) == 1) {

				for (int i = sizeCheck(other) - 1; i >= 0; i--) {

					int bigNum = Integer.parseInt(bigOlInt.get(i));
					int othNum = removeAndParse(other, i);
					if (underFac < 0) {// case for when there is a layover number form prevoius loop
						bigNum--;
						underFac = 0;
					}

					if (bigNum < othNum) {

						underFac = -1;// should now take one away from next bigNum in loop
						bigNum = bigNum + 10;// adds 10 from next spot
						int sub = bigNum - othNum;
						answers.add(sub + "");// add answer

					}
					if (bigNum > othNum && underFac == 0) {// case for when there is a layover number form prevoius loop
						int sub = bigNum - othNum;
						answers.add(sub + "");
					}
					if (bigNum - othNum == ZERO && i > 0) {

						answers.add(ZERO + "");
					}
				}
				for (int i = answers.size() - 1; i >= 0; i--) {// used for when it is basiacally small digit numbers,
																// gets rid of unessessacry 0's
					if (answers.get(i).equals("0")) {

						answers.remove(i);

					} else {
						break;
					}
				}
			}

			if (bigOlInt.size() == sizeCheck(other) && this.compareToHelp(other) == -1) {
				putNegSign = true;

				for (int i = sizeCheck(other) - 1; i >= 0; i--) {

					int bigNum = Integer.parseInt(bigOlInt.get(i));
					int othNum = removeAndParse(other, i);
					if (underFac > 0) {// case for when there is a layover number form prevoius loop
						othNum--;

						underFac = 0;
					}

					if (bigNum < othNum && othNum != ZERO) {

						int sub = othNum - bigNum;
						answers.add(sub + "");// add answer

					}
					if (bigNum > othNum) {
						underFac = 1;
						othNum = othNum + 10;
						int sub = othNum - bigNum;
						answers.add(sub + "");
					}
					if (bigNum - othNum == ZERO && i > 0) {

						answers.add(ZERO + "");
					}

				}

				for (int i = answers.size() - 1; i >= 0; i--) {// shown 30 lines up
					if (answers.get(i).equals("0")) {

						answers.remove(i);

					} else {
						break;
					}
				}

			}
			// for this being bigger
			if (bigOlInt.size() > sizeCheck(other)) {

				for (int i = bigOlInt.size() - 1; i >= 0; i--) {
					for (int j = sizeCheck(other) - 1; j >= 0; j--) {

						if (looped == sizeCheck(other)) {
							break;
						}
						int bigNum = Integer.parseInt(bigOlInt.get(i));
						int othNum = removeAndParse(other, j);
						if (underFac < 0) {// case for when there is a layover number form prevoius loop
							bigNum--;
							underFac = 0;
						}

						if (bigNum < othNum) {

							underFac = -1;// should now take one away from next bigNum in loop
							bigNum = bigNum + 10;// adds 10 from next spot
							int sub = bigNum - othNum;
							answers.add(sub + "");// add answer

						}
						if (bigNum > othNum && underFac == 0) {// case for when there is a layover number form prevoius
																// loop
							int sub = bigNum - othNum;
							answers.add(sub + "");
						}
						if (bigNum - othNum == ZERO) {

							answers.add(ZERO + "");
						}

						looped++;
						i--;

					}
					int bigNum = Integer.parseInt(bigOlInt.get(i));
					if (underFac < 0) {
						bigNum--;
						underFac = 0;
						if (bigNum < 0) {

							bigNum = bigNum + 10;
							underFac = -1;
							answers.add(bigNum + "");
						} else {

							if (bigNum == ZERO) {
								break;
							} else {
								answers.add(bigNum + "");
							}
						}

					} else {
						answers.add(bigNum + "");
					}
				}

			}

			if (bigOlInt.size() < sizeCheck(other)) {// for when other is bigger
				putNegSign = true;

				for (int i = sizeCheck(other) - 1; i >= 0; i--) {
					for (int j = bigOlInt.size() - 1; j >= 0; j--) {

						if (looped == bigOlInt.size()) {
							break;
						}
						int bigNum = Integer.parseInt(bigOlInt.get(j));
						int othNum = removeAndParse(other, i);

						if (underFac > 0) {// case for when there is a layover number form prevoius loop
							othNum--;

							underFac = 0;
						}

						if (bigNum < othNum && othNum != ZERO) {

							int sub = bigNum - othNum;
							sub = sub * -1;

							answers.add(sub + "");// add answer

						}
						if (bigNum > othNum) {
							underFac = 1;
							othNum = othNum + 10;

							int sub = othNum - bigNum;

							answers.add(sub + "");
						}
						if (bigNum - othNum == ZERO && i > 0) {

							answers.add(ZERO + "");
						}

						looped++;
						i--;

					}
					int bigNum = removeAndParse(other, i);

					if (underFac > 0) {
						bigNum--;
						underFac = 0;
						if (bigNum < 0) {

							bigNum = bigNum + 10;
							underFac = -1;
							answers.add(bigNum + "");
						} else {

							if (bigNum == ZERO) {
								break;
							} else {
								answers.add(bigNum + "");
							}
						}

					} else {
						answers.add(bigNum + "");
					}

				}

			}

		}
		Collections.reverse(answers);

		StringBuilder bigNum = new StringBuilder(answers.size());// used to make it into a string so to make new
		// ArrayLargeInteger

		String str = "";

		for (int i = 0; i < answers.size(); i++) {
			bigNum.append(answers.get(i));
		}

		if (wasNeg == true) {
			if (!bigOlInt.get(0).equals("-")) {
				bigOlInt.add(0, "-");
			}
		}
		wasNeg = false;
		if (negAte == true) {
			str = "" + bigNum;
			negAte = false;
			return new ArrayLargeInteger(str);
		}
		if (putNegSign == true) {
			str = "-" + bigNum;
			putNegSign = false;
			return new ArrayLargeInteger(str);
		} else {

			str = bigNum + "";

		}

		return new ArrayLargeInteger(str);

	}

	public LargeInteger negate() {// works
		if (bigOlInt.isEmpty()) {// base case
			return this;
		}
		// TODO Auto-generated method stub
		StringBuilder bigNum = new StringBuilder(bigOlInt.size());// used to make list into a string
		String strPos = "";// empty string for case of negative this

		if (this.signum() == 1) {// if positive

			String str = "";// empty string for when its positve
			for (int i = 0; i < bigOlInt.size(); i++) {
				bigNum.append(bigOlInt.get(i));// append into stringbuilder
			}
			str = "-" + bigNum + "";// make it mnegatve
			return new ArrayLargeInteger(str);
		}

		for (int i = 1; i < bigOlInt.size(); i++) {// same as above but for negative case
			bigNum.append(bigOlInt.get(i));
		}
		strPos = bigNum + "";
		return new ArrayLargeInteger(strPos);

	}

	public LargeInteger abs() {
		// TODO Auto-generated method stub

		if (!bigOlInt.contains("-")) {
			return this;
		}
		StringBuilder bigNum = new StringBuilder(bigOlInt.size());// used to make it into a string so to make new
																	// ArrayLargeInteger
		String str = "";
		for (int i = 1; i < bigOlInt.size(); i++) {
			bigNum.append(bigOlInt.get(i));
		}
		str = bigNum + "";

		return new ArrayLargeInteger(str);
	}

	public LargeInteger multiply(LargeInteger other) {
		int overAge = 0;
		int addToNext = 0;
		boolean addLists = false; // lets program know when it has its max of two lists to add them together
		int timer = 2;// everytime this hits zero, there should be two full lists, after it hits zero
						// program should add, store and empty said lists and restart timer, thus
						// enssurong there is not leftovers
		int amntOfZeros = 0;// keeps track of how many zeros need to be added for next iteration of
							// multiplication, so it its at 4, add four zeros to the end then begin
							// operations
		if (this.signum() == 0) {// if it zero, anything times zero is zero
			return new ArrayLargeInteger(ZERO + "");
		}
		if (other.signum() == 0) {// same as above
			return new ArrayLargeInteger(ZERO + "");

		}
		if (this.signum() == -1 && other.signum() == -1) {// if both neg, it is a positive
			bigOlInt.remove(0);
			String temp = other.toString();
			temp = temp.substring(1);
			ArrayLargeInteger copy = new ArrayLargeInteger(temp);
			other = copy;
			wasNeg = true;
			negAte = true;
		}
		if (this.signum() == -1 && other.signum() == 1) {// if one is neg, both will become neg at the end

			bigOlInt.remove(0);

			wasNeg = true;
			putNegSign = true;
		}
		if (this.signum() == 1 && other.signum() == -1) {// same as above
			String temp = other.toString();
			temp = temp.substring(1);
			ArrayLargeInteger copy = new ArrayLargeInteger(temp);
			other = copy;
			putNegSign = true;
		}
		List<String> answers = new ArrayList<String>();
		List<String> answers2 = new ArrayList<String>();

		if (bigOlInt.size() > sizeCheck(other) || bigOlInt.size() == sizeCheck(other)) {// for when this is bigger in
																						// length
			int iterate = bigOlInt.size() - 1;// starts iterator at last index

			for (int i = sizeCheck(other) - 1; i >= 0; i--) {// loop thorugh each spot in the smaller number, so that
																// can be multiplied to each and every spot in the
																// bigger number
				int multiplier = removeAndParse(other, i);// what we will use to multiply thorugh list

				while (iterate >= 0) {// will iteratate at every spot as to multiple each spot in
					int multiplied = Integer.parseInt(bigOlInt.get(iterate));// what is being multiplied
					;

					if (overAge > 0) {// if there is an overAge from last iteration

						addToNext = overAge;// add that to the number being multiplied

						// System.out.println("What should be added is "+addToNext);
						overAge = 0;// reset value

					}
					if (multiplier * multiplied >= TEN) {// if the two numbers are greater than 10 or two digitis
															// multiplied

						int multiply = multiplier * multiplied;// multiply the two

						multiply = multiply + addToNext;

						// System.out.println(multiply);
						addToNext = 0;
						if (iterate == 0) {
							if (i == sizeCheck(other) - 1) {// if we are in the first iteration we can use the first
								// list
								answers.add(multiply + "");
							} else {// otherwise we will put all in this secound list to keep up with
								answers2.add(multiply + "");
							}
							iterate--;
							break;
						}

						String over = multiply + "";// create a string version
						String putIn = over.substring(1);// take secound digit which sill be added to List
						over = over.substring(0, 1);// take first digit to add to number in next iteration
						overAge = Integer.parseInt(over);// parse it

						if (i == sizeCheck(other) - 1) {// if we are in the first iteration we can use the first
														// list
							answers.add(putIn);
						} else {// otherwise we will put all in this secound list to keep up with
							answers2.add(putIn);
						}

					} else {
						int multiply = multiplier * multiplied;// multiply the two

						multiply = multiply + addToNext;

						addToNext = 0;
						if (iterate > 0 && multiply >= 10) {// handles for when its basically 10 and not the last spot
							String over = multiply + "";// create a string version
							String putIn = over.substring(1);// take secound digit which sill be added to List
							over = over.substring(0, 1);// take first digit to add to number in next iteration
							overAge = Integer.parseInt(over);// parse it

							if (i == sizeCheck(other) - 1) {// if we are in the first iteration we can use the first
								// list
								answers.add(putIn);
							} else {// otherwise we will put all in this secound list to keep up with
								answers2.add(putIn);
							}

						} else {

							if (i == sizeCheck(other) - 1) {// if we are in the first iteration we can use the first
								// list
								answers.add(multiply + "");
							} else {// otherwise we will put all in this secound list to keep up with
								answers2.add(multiply + "");
							}
						}

					}

					iterate--;// go down a spot
				}
				if (amntOfZeros > 0) {

					for (int j = 0; j < amntOfZeros; j++) {
						answers2.add(0, ZERO + "");// adds zeros to the end to keep up with multiplication rules
					}
				}
				// take one away from the count to go to next spot
				iterate = bigOlInt.size() - 1;// reset iterate but next spot, loop should
				// restart
				timer--;
				if (timer == 0) {
					String result = listAdder(answers, answers2);// takes addition of two lines, then will put that
					// result into a String

					emptyList(answers);// empty list to hold new value
					emptyList(answers2);
					for (int k = result.length() - 1; k >= 0; k--) {// reinsert in reverse order to list since its
						// always in reverese until final answer is ready to
						// be given
						answers.add(result.charAt(k) + "");

					}

					timer = 1;// adds one back to run for next loop
				}

				amntOfZeros++;
			}
		}
		if (bigOlInt.size() < sizeCheck(other)) {// for when this is smaller in length
			int iterate = sizeCheck(other) - 1;// starts iterator at last index

			for (int i = bigOlInt.size() - 1; i >= 0; i--) {// loop thorugh each spot in the smaller number, so that
															// can be multiplied to each and every spot in the
															// bigger number
				int multiplier = Integer.parseInt(bigOlInt.get(i));
				;// what we will use to multiply thorugh list

				while (iterate >= 0) {// will iteratate at every spot as to multiple each spot in
					int multiplied = removeAndParse(other, iterate);// what is being multiplied
					;

					if (overAge > 0) {// if there is an overAge from last iteration

						addToNext = overAge;// add that to the number being multiplied

						overAge = 0;// reset value

					}
					if (multiplier * multiplied >= TEN) {// if the two numbers are greater than 10 or two digitis
															// multiplied

						int multiply = multiplier * multiplied;// multiply the two

						multiply = multiply + addToNext;

						addToNext = 0;
						if (iterate == 0) {
							if (i == bigOlInt.size() - 1) {// if we are in the first iteration we can use the first
								// list
								answers.add(multiply + "");
							} else {// otherwise we will put all in this secound list to keep up with
								answers2.add(multiply + "");
							}
							iterate--;
							break;
						}

						String over = multiply + "";// create a string version
						String putIn = over.substring(1);// take secound digit which sill be added to List
						over = over.substring(0, 1);// take first digit to add to number in next iteration
						overAge = Integer.parseInt(over);// parse it

						if (i == bigOlInt.size() - 1) {// if we are in the first iteration we can use the first
														// list
							answers.add(putIn);
						} else {// otherwise we will put all in this secound list to keep up with
							answers2.add(putIn);
						}

					} else {
						int multiply = multiplier * multiplied;// multiply the two

						multiply = multiply + addToNext;

						addToNext = 0;
						if (iterate > 0 && multiply >= 10) {// handles for when its basically 10 and not the last spot
							String over = multiply + "";// create a string version
							String putIn = over.substring(1);// take secound digit which sill be added to List
							over = over.substring(0, 1);// take first digit to add to number in next iteration
							overAge = Integer.parseInt(over);// parse it

							if (i == bigOlInt.size() - 1) {// if we are in the first iteration we can use the first
								// list
								answers.add(putIn);
							} else {// otherwise we will put all in this secound list to keep up with
								answers2.add(putIn);
							}

						} else {

							if (i == bigOlInt.size() - 1) {// if we are in the first iteration we can use the first
								// list
								answers.add(multiply + "");
							} else {// otherwise we will put all in this secound list to keep up with
								answers2.add(multiply + "");
							}
						}

					}

					iterate--;// go down a spot
				}
				if (amntOfZeros > 0) {

					for (int j = 0; j < amntOfZeros; j++) {
						answers2.add(0, ZERO + "");// adds zeros to the end to keep up with multiplication rules
					}
				}
				// take one away from the count to go to next spot
				iterate = sizeCheck(other) - 1;// reset iterate but next spot, loop should restart
				timer--;
				if (timer == 0) {
					String result = listAdder(answers, answers2);// takes addition of two lines, then will put that
					// result into a String

					emptyList(answers);// empty list to hold new value
					emptyList(answers2);
					for (int k = result.length() - 1; k >= 0; k--) {// reinsert in reverse order to list since its
						// always in reverese until final answer is ready to
						// be given
						answers.add(result.charAt(k) + "");

					}

					timer = 1;// adds one back to run for next loop
				}

				amntOfZeros++;
			}
		}

		Collections.reverse(answers);

		StringBuilder bigNum = new StringBuilder(answers.size());// used to make it into a string so to make new
		// ArrayLargeInteger

		String str = "";

		for (int i = 0; i < answers.size(); i++) {
			bigNum.append(answers.get(i));
		}

		if (wasNeg == true) {
			if (!bigOlInt.get(0).equals("-")) {
				bigOlInt.add(0, "-");
			}
		}
		wasNeg = false;
		if (negAte == true) {
			str = "" + bigNum;
			negAte = false;
			return new ArrayLargeInteger(str);
		}
		if (putNegSign == true) {
			str = "-" + bigNum;
			putNegSign = false;
			return new ArrayLargeInteger(str);
		} else {

			str = bigNum + "";

		}

		return new ArrayLargeInteger(str);
	}

	/**
	 * Helper Method for multiply function, takes two lists and adds then together
	 * 
	 * @param a list a to add
	 * @param b list b to add other
	 * @return string which holds result
	 */
	public String listAdder(List<String> a, List<String> b) {

		Collections.reverse(a);
		Collections.reverse(b);

		StringBuilder oneS = new StringBuilder();
		StringBuilder twoS = new StringBuilder();
		for (String place : a) {
			oneS.append(place);
		}
		String one = "" + oneS;
		for (String place : b) {
			twoS.append(place);
		}
		String two = "" + twoS;

		ArrayLargeInteger un = new ArrayLargeInteger(one);
		ArrayLargeInteger deux = new ArrayLargeInteger(two);

		String result = un.add(deux) + "";

		return result;

	}

	/**
	 * Helper method for multiply, empties list
	 * 
	 * @param a takes list and empties it
	 */
	public void emptyList(List<String> a) {
		for (int i = a.size() - 1; i >= 0; i--) {
			a.remove(i);
		}

	}

	public LargeInteger max(LargeInteger other) {
		// TODO Auto-generated method stub
		if (this.compareToHelp(other) == 0) {
			return this;
		}
		if (this.compareToHelp(other) == -1) {
			return other;
		}

		return this;
	}

	public LargeInteger min(LargeInteger other) {
		// TODO Auto-generated method stub
		if (this.compareToHelp(other) == 0) {
			return this;
		}
		if (this.compareToHelp(other) == -1) {
			return this;
		}

		return other;

	}

	public int signum() {// works
		// TODO Auto-generated method stub
		if (bigOlInt.isEmpty()) {// if its empty returns 0, may change to a print or exception message, ask for
			return 0;
		}
		if (bigOlInt.size() <= 1 && bigOlInt.contains("0")) {// checks that there is one element in and it is 0
			return 0;
		}
		if (bigOlInt.contains("-")) {// checks for negative operator at beginning
			return -1;
		}
		return 1;// base case, positive
	}

	/**
	 * Used to get the size of the LargeInteger
	 * 
	 * @param other takes LargeInteger in
	 * @return size in a int style
	 */

	public int sizeCheck(LargeInteger other) {
		String sizer = other.toString();// make other a String
		return sizer.length();// grab the length of the String
	}

	/**
	 * gets the integer value of a certain spot of integer
	 * 
	 * @param index where to get spot from
	 * @return int for index
	 */

	public int getNum(int index) {
		if (this.signum() == -1) {// handle negative case
			index++;
		}
		
		int num = Integer.parseInt(bigOlInt.get(index));
		
		return num;
	}

	/**
	 * Checks if two Large integers are equals in value
	 * 
	 * @param other takes a largeinteger to compare
	 * @return true if equal, false if not
	 */
	public boolean equals(LargeInteger other) {
		if (this.compareToHelp(other) == 0) {
			return true;
		}
		return false;
	}

	/**
	 * toString method to print things for class
	 */
	public String toString() {// to be remade possibly
		if (signum() == 0) {
			return "0";
		}
		StringBuilder bigNum = new StringBuilder(bigOlInt.size());
		String str = "";
		for (int i = 0; i < bigOlInt.size(); i++) {
			bigNum.append(bigOlInt.get(i));
		}
		str = bigNum + "";
		return str;
	}

	

	/**
	 * CompareTo Method from compareable interface
	 */
	public int compareTo(Object o) {
		if (o == null) {
			throw new NullPointerException("Cannot compare with null");
		}

		if (o instanceof LargeInteger) {
			// If 'o' is a LargeInteger, cast it to LargeInteger and use the
			// compareTo(LargeInteger) method
			return this.compareToHelp((LargeInteger) o);
		} else {
			throw new ClassCastException("Object must be an instance of LargeInteger");
		}
	}

}
