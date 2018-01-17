// Creado por Leo Miro - update 2

package seleniumcookbook.tests;

import org.junit.Test; 

import static org.junit.Assert.*;
import seleniumcookbook.tests.pageobjects.*;

public class BmiCalculatorTests {

	@Test 
	public void testBmiCalculation() {    
		
		//Create instance of BmiCalcPage and pass the driver    
		BmiCalcPage bmiCalcPage = new BmiCalcPage();            

		//Open the Bmi Calculator Page    
		bmiCalcPage.load();
		
		//Calculate the Bmi by supplying Height and Weight values   
		bmiCalcPage.calculateBmi("181", "80");           

		//Verify Bmi & Bmi Category values    
		assertEquals("24.4", bmiCalcPage.getBmi());    
		assertEquals("Normal", bmiCalcPage.getBmiCategory());            

		//Close the Browser    
		bmiCalcPage.close(); 
	} 
}