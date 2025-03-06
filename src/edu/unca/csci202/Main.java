package edu.unca.csci202;
/*
 * Anis Golriz
 * Spring 2024
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;
/**
 * Main class for ArrayLargeInteger Project
 */
public class Main {
	/**
	 * Main java method
	 * @param args
	 */

	public static void main(String[] args) {
		
		
		
		

		
		
		String[] ARATestTimes = new String[32];
		String[] BITestTimes = new String[32];
		
		
		
		
		
		ArrayLargeInteger bigPos = new ArrayLargeInteger("93928483938489298389438284923");
		ArrayLargeInteger smallPos = new ArrayLargeInteger("785");
		ArrayLargeInteger midPos = new ArrayLargeInteger("837578393");
		ArrayLargeInteger hugePos = new ArrayLargeInteger("928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785");
		ArrayLargeInteger smallNeg = new ArrayLargeInteger("-1383");
		ArrayLargeInteger midNeg = new ArrayLargeInteger("-84728482");
		ArrayLargeInteger hugeNeg = new ArrayLargeInteger("-894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293");
		ArrayLargeInteger bigNeg = new ArrayLargeInteger("-93928483938489298389438284923");
		ArrayLargeInteger biggerPos2 = new ArrayLargeInteger("9829472984875928492749284639724424");
		ArrayLargeInteger smallPos2 = new ArrayLargeInteger("9");
		ArrayLargeInteger midPos2 = new ArrayLargeInteger("329741");
		ArrayLargeInteger hugePos2 = new ArrayLargeInteger("97847917387292781749179279768587654674856985746352412536475869784791738729278174917927976858765467485698574635241253647586978479173872927817491792797685876546748569857463524125364758697847917387292781749179279768587654674856985746352412536475869784791738729278174917927976858765467485698574635241253647586978479173872927817491792797685876546748569857463524125364758697847917387292781749179279768587654674856985746352412536475869784791738729278174917927976858765467485698574635241253647586");
		ArrayLargeInteger smallNeg2 = new ArrayLargeInteger("-3");
		ArrayLargeInteger midNeg2 = new ArrayLargeInteger("-472527489");
		ArrayLargeInteger hugeNeg2 = new ArrayLargeInteger("-987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000");
		ArrayLargeInteger bigNeg2 = new ArrayLargeInteger("-929847892748274912852794875927783758927");
		
		BigInteger bigPosi = new BigInteger("93928483938489298389438284923");
		BigInteger midPosi = new BigInteger("837578393");
		BigInteger hugePosi = new BigInteger("928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785928689159379619434756926947259729856857378478592868915937961943475692694725972985685737847859286891593796194347569269472597298568573784785");
		BigInteger smallPosi = new BigInteger("785");
		BigInteger bigMinus = new BigInteger("-93928483938489298389438284923");
		BigInteger smallMinus = new BigInteger("-1383");
		BigInteger midMinus = new BigInteger("-84728482");
		BigInteger hugeMinus = new BigInteger("-894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293894839728563948294852749763582783635817947391849377852938948397285639482948527497635827836358179473918493778529389483972856394829485274976358278363581794739184937785293");
		BigInteger bigPosi2 = new BigInteger("9829472984875928492749284639724424");
		BigInteger midPosi2 = new BigInteger("329741");
		BigInteger hugePosi2 = new BigInteger("97847917387292781749179279768587654674856985746352412536475869784791738729278174917927976858765467485698574635241253647586978479173872927817491792797685876546748569857463524125364758697847917387292781749179279768587654674856985746352412536475869784791738729278174917927976858765467485698574635241253647586978479173872927817491792797685876546748569857463524125364758697847917387292781749179279768587654674856985746352412536475869784791738729278174917927976858765467485698574635241253647586");
		BigInteger smallPosi2 = new BigInteger("9");
		BigInteger bigMinus2 = new BigInteger("-929847892748274912852794875927783758927");
		BigInteger smallMinus2 = new BigInteger("84848487282222222");
		BigInteger midMinus2 = new BigInteger("-472527489");
		BigInteger hugeMinus2 = new BigInteger("-987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000987654323456789098765432345678765432456786543000009876543234567890987654323456787654324567865430000098765432345678909876543234567876543245678654300000");
		
		
		
		

		Long startTime = System.nanoTime();
		System.out.println(bigPos.abs());
		Long endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for abs, bigPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[0] = "ArrayLargeInteger for abs,bigPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(bigNeg.abs());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for abs, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[1] = "ArrayLargeInteger for abs, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(hugeNeg.abs());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for abs, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[2] = "ArrayLargeInteger for abs, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(hugePos.abs());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for abs, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[3] = "ArrayLargeInteger for abs, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		
		//BI down here
		System.out.println("Same but for BigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigPosi.abs());
		endTime = System.nanoTime();
		System.out.println("BigInteger for abs, bigPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[0] = "BigInteger for abs, bigPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigMinus.abs());
		endTime = System.nanoTime();
		System.out.println("BigInteger for abs, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[1] = "BigInteger for abs, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus.abs());
		endTime = System.nanoTime();
		System.out.println("BigInteger for abs, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[2] = "BigInteger for abs, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.abs());
		endTime = System.nanoTime();
		System.out.println("BigInteger for abs, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[3] = "BigInteger for abs, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		
		System.out.println("Below are tests for negate function");
		
		startTime = System.nanoTime();
		System.out.println(bigPos.negate());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for negate, bigPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[4] = "ArrayLargeInteger for negate, bigPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(hugePos.negate());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for negate, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[5] = "ArrayLargeInteger for negate, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(hugeNeg.negate());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for negate, hugeNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[6] = "ArrayLargeInteger for abs, hugeNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(bigNeg.negate());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for negate, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[7] = "ArrayLargeInteger for negate, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for BigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigPosi.negate());
		endTime = System.nanoTime();
		System.out.println("BigInteger for negate, bigPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[4] = "BigInteger for negate, bigPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.negate());
		endTime = System.nanoTime();
		System.out.println("BigInteger for negate, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[5] = "BigInteger for negate, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus.negate());
		endTime = System.nanoTime();
		System.out.println("BigInteger for negate, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[6] = "BigInteger for negate, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigMinus.negate());
		endTime = System.nanoTime();
		System.out.println("BigInteger for negate, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[7] = "BigInteger for negate, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();

		
		System.out.println("Below are tests for max function");
		System.out.println();
		
		startTime = System.nanoTime();
		
		System.out.println(smallNeg.max(smallPos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for max, smallNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[8] = "ArrayLargeInteger for max, smallNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigNeg.max(smallNeg));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for max, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[9] = "ArrayLargeInteger for max, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeNeg.max(hugePos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for max, hugeNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[10] = "ArrayLargeInteger for max, hugeNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePos.max(hugePos2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for max, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[11] = "ArrayLargeInteger for max, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for bigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallMinus.max(smallPosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for max, smallMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[8] = "BigInteger for max, smallMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigMinus.max(smallMinus));
		endTime = System.nanoTime();
		System.out.println("BigInteger for max, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[9] = "BigInteger for max, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus.max(hugePosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for max, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[10] = "BigInteger for max, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.max(hugePosi2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for max, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[11] = "BigInteger for max, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Below are tests for min");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midNeg.min(hugePos2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for min, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[12] = "ArrayLargeInteger for min, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPos.min(midNeg));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for min, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[13] = "ArrayLargeInteger for min, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePos2.min(bigNeg));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for min, hugePos2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[14] = "ArrayLargeInteger for min, hugePos2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeNeg2.min(hugeNeg2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for min, hugeNeg2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[15] = "ArrayLargeInteger for min, hugeNeg2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for BitInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midMinus.min(hugePosi2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for min, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[12] = "BigInteger for min, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPosi.min(midMinus));
		endTime = System.nanoTime();
		System.out.println("BigInteger for min, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[13] = "BigInteger for min, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi2.min(bigMinus));
		endTime = System.nanoTime();
		System.out.println("BigInteger for min, hugePosi2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[14] = "BigInteger for min, hugePosi2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus2.min(hugeMinus2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for min, hugeMinus2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[15] = "BigInteger for min, hugeMinus2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Below are tests for signum function");
		System.out.println();

		startTime = System.nanoTime();
		System.out.println(hugeNeg2.signum());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for signum, hugeNeg2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[16] = "ArrayLargeInteger for signum, hugeNeg2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePos.signum());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for signum, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[17] = "ArrayLargeInteger for signum, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPos.signum());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for signum, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[18] = "ArrayLargeInteger for signum, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midNeg.signum());
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for signum, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[19] = "ArrayLargeInteger for signum, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for BigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus2.signum());
		endTime = System.nanoTime();
		System.out.println("BigInteger for signum, hugeMinus2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[16] = "BigInteger for signum, hugeMinus2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.signum());
		endTime = System.nanoTime();
		System.out.println("BigInteger for signum, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[17] = "BigInteger for signum, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPosi.signum());
		endTime = System.nanoTime();
		System.out.println("BigInteger for signum, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[18] = "BigInteger for signum, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midMinus.signum());
		endTime = System.nanoTime();
		System.out.println("BigInteger for signum, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[19] = "BigInteger for signum, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Below are tests for add function");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPos.add(hugePos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for add, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[20] = "ArrayLargeInteger for add, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midNeg.add(bigPos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for add, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[21] = "ArrayLargeInteger for add, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePos.add(hugePos2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for add, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[22] = "ArrayLargeInteger for add, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigPos.add(smallPos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for add, bigPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[23] = "ArrayLargeInteger for add, bigPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for BigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallMinus.add(hugePosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for add, smallMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[20] = "BigInteger for add, smallMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midMinus.add(bigPosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for add, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[21] = "BigInteger for add, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.add(hugePosi2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for add, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[22] = "BigInteger for add, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigPosi.add(smallPosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for add, bigPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[23] = "BigInteger for add, bigPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		
		System.out.println("Below are tests for subtraction function");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePos.subtract(hugePos2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for subtract, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[24] = "ArrayLargeInteger for subtract, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midNeg.subtract(smallPos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for subtract, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[25] = "ArrayLargeInteger for subtract, midNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeNeg.subtract(hugePos));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for subtract, hugeNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[26] = "ArrayLargeInteger for subtract, hugeNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPos.subtract(smallNeg));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for subtract, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[27] = "ArrayLargeInteger for subtract, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for BigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.subtract(hugePosi2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for subtract, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[24] = "BigInteger for subtract, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(midMinus.subtract(smallPosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for subtract, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[25] = "BigInteger for subtract, midMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus.subtract(hugePosi));
		endTime = System.nanoTime();
		System.out.println("BigInteger for subtract, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[26] = "BigInteger for subtract, hugeMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPosi.subtract(smallMinus));
		endTime = System.nanoTime();
		System.out.println("BigInteger for subtract, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[27] = "BigInteger for subtract, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Below are tests for multiplication function");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeNeg2.multiply(smallPos2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for multiply, hugeNeg2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[28] = "ArrayLargeInteger for multiply, hugeNeg2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigNeg.multiply(smallNeg));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for multiply, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[29] = "ArrayLargeInteger for multiply, bigNeg took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPos.multiply(midNeg));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for multiply, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[30] = "ArrayLargeInteger for multiply, smallPos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePos.multiply(hugePos2));
		endTime = System.nanoTime();
		System.out.println("ArrayLargeInteger for multiply, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		ARATestTimes[31] = "ArrayLargeInteger for multiply, hugePos took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Same but for BigInteger");
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugeMinus2.multiply(smallMinus2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for multiply, hugeMinus2 took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[28] = "BigInteger for multiply, hugeMinus2 took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(bigMinus.multiply(smallMinus));
		endTime = System.nanoTime();
		System.out.println("BigInteger for multiply, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[29] = "BigInteger for multiply, bigMinus took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(smallPosi.multiply(midMinus));
		endTime = System.nanoTime();
		System.out.println("BigInteger for multiply, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[30] = "BigInteger for multiply, smallPosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println(hugePosi.multiply(hugePosi2));
		endTime = System.nanoTime();
		System.out.println("BigInteger for multiply, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.");
		BITestTimes[31] = "BigInteger for multiply, hugePosi took " + (double) (endTime - startTime) / 100000000 + " s to run.";
		System.out.println();
		
		System.out.println("Below has all the data for the ArrayLargeInteger times");
		System.out.println();
		for(String s : ARATestTimes) {
			System.out.println(s+"\n");
		}
			
		
		System.out.println();
		
		System.out.println("Below here has all the data for the BigInteger times");
		System.out.println();
		for(String s : BITestTimes) {
			System.out.println(s+"\n");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
