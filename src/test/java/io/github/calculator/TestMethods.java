package io.github.calculator;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //positive test methods
    protected void addTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        int expectedResult = number1 + number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        try {
            assertEquals(expectedResult, actualResult, "The local addition result is incorrect");
            logger.info("The local addition answer is: " + actualResult);
        } catch (AssertionError e) {
            // log the assertion error if it does occur
            logger.error("Assertion failed: The local addition result is incorrect. Expected: "
                    + expectedResult + ", but got: " + actualResult, e);
        }
        calculatorPage.clickClearButton();
    }

    protected void minusTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        int expectedResult = number1 - number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // local comparison of the result with the result displayed
        int actualResult = Integer.parseInt(calculatorPage.getCalculationAnswer());
        try {
            assertEquals(expectedResult, actualResult, "The local addition result is incorrect");
            logger.info("The local subtraction answer is: " + actualResult);
        } catch (AssertionError e) {
            // log the assertion error if it does occur
            logger.error("Assertion failed: The local addition result is incorrect. Expected: "
                    + expectedResult + ", but got: " + actualResult, e);
        }
        calculatorPage.clickClearButton();
    }

    protected void multiplyTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        double expectedResult = (double)number1 * number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // local comparison of the result with the result displayed
        double actualResult = Double.parseDouble(calculatorPage.getCalculationAnswer());
        final double TOLERANCE = 0.0001;
        try {
            assertEquals(expectedResult, actualResult, TOLERANCE, "The local addition result is incorrect");
            logger.info("The local multiplication answer is: " + actualResult);
        } catch (AssertionError e) {
            // log the assertion error if it does occur
            logger.error("Assertion failed: The local addition result is incorrect. Expected: "
                    + expectedResult + ", but got: " + actualResult, e);
        }
        calculatorPage.clickClearButton();
    }

    protected void divideTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //local comparator
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        double expectedResult = (double)number1 / number2;
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // local comparison of the result with the result displayed
        double actualResult = Double.parseDouble(calculatorPage.getCalculationAnswer());
        final double TOLERANCE = 0.0001;
        try {
            assertEquals(expectedResult, actualResult, TOLERANCE, "The local addition result is incorrect");
            logger.info("The local division answer is: " + actualResult);
        } catch (AssertionError e) {
            // log the assertion error if it does occur
            logger.error("Assertion failed: The local addition result is incorrect. Expected: "
                    + expectedResult + ", but got: " + actualResult, e);
        }
        calculatorPage.clickClearButton();
    }

    protected void concatenateTwoVariablesTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputData();
        calculatorPage.inputNumberOne();
        calculatorPage.inputNumberTwo();
        //actual concatenation
        int number1 = calculatorPage.getNumber1();
        int number2 = calculatorPage.getNumber2();
        String expectedResult = String.valueOf(number1).concat(String.valueOf(number2));
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectConcatenateOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "concatenate", calculatorPage.isConcatenateSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log expected concatenated result
        logger.info("Expected concatenated result of two variables: " + expectedResult);
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // log the differences in output if they occur
        try {
            assertEquals(expectedResult, calculatorPage.getCalculationAnswer(), "The concatenation result is incorrect.");
            logger.info("Concatenation is correct. Expected: " + expectedResult + ", Actual: " + calculatorPage.getCalculationAnswer());
        } catch (AssertionError e) {
            // log the assertion error without crashing the test
            logger.error("Assertion failed: The concatenation result is incorrect. Expected: "
                    + expectedResult + ", but got: " + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }
    //negative test methods -> two variables as letters

    protected void addTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        String errorMessage = calculatorPage.getInvalidVariableMessage();
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                // check if it's an issue with "Number 1"
                if (errorMessage.equals("Number 1 is not a number")) {
                    assertEquals(errorMessage, "Number 1 is not a number", "The error message didn't display correctly.");
                } else {
                    assertEquals(errorMessage, "Number 2 is not a number", "The error message didn't display correctly.");
                }
            } else {
                assertEquals(calculatorPage.getCalculationAnswer(), "NaN", "The error message didn't display correctly.");
            }
        } catch (AssertionError e) {
            // Log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }

        calculatorPage.clickClearButton();
    }

    protected void subtractTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        String errorMessage = calculatorPage.getInvalidVariableMessage();
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                // check if it's an issue with "Number 1"
                if (errorMessage.equals("Number 1 is not a number")) {
                    assertEquals(errorMessage, "Number 1 is not a number", "The error message didn't display correctly.");
                } else {
                    assertEquals(errorMessage, "Number 2 is not a number", "The error message didn't display correctly.");
                }
            } else {
                assertEquals(calculatorPage.getCalculationAnswer(), "NaN", "The error message didn't display correctly.");
            }
        } catch (AssertionError e) {
            // Log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }

        calculatorPage.clickClearButton();
    }

    protected void multiplyTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        String errorMessage = calculatorPage.getInvalidVariableMessage();
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                // check if it's an issue with "Number 1"
                if (errorMessage.equals("Number 1 is not a number")) {
                    assertEquals(errorMessage, "Number 1 is not a number", "The error message didn't display correctly.");
                } else {
                    assertEquals(errorMessage, "Number 2 is not a number", "The error message didn't display correctly.");
                }
            } else {
                assertEquals(calculatorPage.getCalculationAnswer(), "NaN", "The error message didn't display correctly.");
            }
        } catch (AssertionError e) {
            // Log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }

        calculatorPage.clickClearButton();
    }

    protected void divideTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        String errorMessage = calculatorPage.getInvalidVariableMessage();
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                // check if it's an issue with "Number 1"
                if (errorMessage.equals("Number 1 is not a number")) {
                    assertEquals(errorMessage, "Number 1 is not a number", "The error message didn't display correctly.");
                } else {
                    assertEquals(errorMessage, "Number 2 is not a number", "The error message didn't display correctly.");
                }
            } else {
                assertEquals(calculatorPage.getCalculationAnswer(), "NaN", "The error message didn't display correctly.");
            }
        } catch (AssertionError e) {
            // Log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }

        calculatorPage.clickClearButton();
    }

    protected void concatenateTwoVariablesAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //expected concatenation
        String num1 = calculatorPage.getNumber1Values();
        String num2 = calculatorPage.getNumber2Values();
        String expectedResult = num1.concat(num2);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectConcatenateOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "concatenate", calculatorPage.isConcatenateSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the expected concatenation
        logger.info("Expected concatenated result: " + expectedResult);
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // log the differences in output if they occur
        try {
            assertEquals(expectedResult, calculatorPage.getCalculationAnswer(), "The concatenation result is incorrect.");
            logger.info("Concatenation is correct. Expected: " + expectedResult + ", Actual: " + calculatorPage.getCalculationAnswer());
        } catch (AssertionError e) {
            // log the assertion error without crashing the test
            logger.error("Assertion failed: The concatenation result is incorrect. Expected: "
                    + expectedResult + ", but got: " + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    //negative test methods -> one variable as letters

    protected void addOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputNumberTwo();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                assertEquals("Number 1 is not a number", calculatorPage.getInvalidVariableMessage(), "The error message didn't display");
            } else {
                assertEquals("NaN" , calculatorPage.getCalculationAnswer(), "The error message didn't display");
            }
        } catch (AssertionError e) {
            //log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    protected void subtractOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                assertEquals("Number 2 is not a number", calculatorPage.getInvalidVariableMessage(), "The error message didn't display");
            } else {
                assertEquals("NaN" , calculatorPage.getCalculationAnswer(), "The error message didn't display");
            }
        } catch (AssertionError e) {
            //log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    protected void multiplyOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputLettersIntoNum1InputField();
        calculatorPage.inputNumberTwo();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                assertEquals("Number 1 is not a number", calculatorPage.getInvalidVariableMessage(), "The error message didn't display");
            } else {
                assertEquals("NaN" , calculatorPage.getCalculationAnswer(), "The error message didn't display");
            }
        } catch (AssertionError e) {
            //log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    protected void divideOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        try {
            if (calculatorPage.getCalculationAnswer().isEmpty()) {
                assertEquals("Number 2 is not a number", calculatorPage.getInvalidVariableMessage(), "The error message didn't display");
            } else {
                assertEquals("NaN" , calculatorPage.getCalculationAnswer(), "The error message didn't display");
            }
        } catch (AssertionError e) {
            //log the assertion error without crashing the test
            logger.error("Assertion failed: The error message didn't display correctly. Expected: NaN, but got: "
                    + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    protected void concatenateOneVariableAsLettersTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //expected concatenation
        int num1 = calculatorPage.getNumber1();
        String num2 = calculatorPage.getNumber2Values();
        String expectedResult = String.valueOf(num1).concat(num2);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectConcatenateOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "concatenate", calculatorPage.isConcatenateSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the expected concatenation
        logger.info("Expected concatenated result: " + expectedResult);
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // log the differences in output if they occur
        try {
            assertEquals(expectedResult, calculatorPage.getCalculationAnswer(), "The concatenation result is incorrect.");
            logger.info("Concatenation is correct. Expected: " + expectedResult + ", Actual: " + calculatorPage.getCalculationAnswer());
        } catch (AssertionError e) {
            // log the assertion error without crashing the test
            logger.error("Assertion failed: The concatenation result is incorrect. Expected: "
                    + expectedResult + ", but got: " + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    //negative test methods -> one variable as letters

    protected void addMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.missInputNum1InputField();
        calculatorPage.inputNumberTwo();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectPlusOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "plus", calculatorPage.isPlusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        //assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
        calculatorPage.clickClearButton();
    }

    protected void subtractMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        calculatorPage.missInputIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectMinusOperator();
        //assert the minus was selected
        verifyOperatorSelected(calculatorPage, "minus", calculatorPage.isMinusSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        //assertEquals(calculatorPage.getCalculationAnswer(), "ERR");
        calculatorPage.clickClearButton();
    }

    protected void multiplyMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.missInputNum1InputField();
        calculatorPage.inputNumberTwo();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectTimesOperator();
        //assert the times was selected
        verifyOperatorSelected(calculatorPage, "times", calculatorPage.isTimesSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation is as expected
        assertEquals(calculatorPage.getCalculationAnswer(), "0");
        calculatorPage.clickClearButton();
    }

    protected void divideMissOneVariableTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.inputNumberOne();
        calculatorPage.missInputIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        if(!calculatorPage.getInvalidVariableMessage().isEmpty()) {
            assertEquals(calculatorPage.getInvalidVariableMessage(), "Divide by zero error!");
        }else{
            logger.error("The actual result throws " + calculatorPage.getCalculationAnswer() + " instead of 'Divide by zero error!'");
        }
        calculatorPage.clickClearButton();
    }

    protected void concatenateOneVariableMissedTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        calculatorPage.missInputNum1InputField();
        calculatorPage.inputLettersIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //expected concatenation
        String num1 = calculatorPage.getNumber1Values();
        String num2 = calculatorPage.getNumber2Values();
        String expectedResult = num1.concat(num2);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectConcatenateOperator();
        //assert the plus was selected
        verifyOperatorSelected(calculatorPage, "concatenate", calculatorPage.isConcatenateSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the expected concatenation
        logger.info("Expected concatenated result: " + expectedResult);
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        // log the differences in output if they occur
        try {
            assertEquals(expectedResult, calculatorPage.getCalculationAnswer(), "The concatenation result is incorrect.");
            logger.info("Concatenation is correct. Expected: " + expectedResult + ", Actual: " + calculatorPage.getCalculationAnswer());
        } catch (AssertionError e) {
            // log the assertion error without crashing the test
            logger.error("Assertion failed: The concatenation result is incorrect. Expected: "
                    + expectedResult + ", but got: " + calculatorPage.getCalculationAnswer(), e);
        }
        calculatorPage.clickClearButton();
    }

    protected void divideByZeroTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        //assert input field are displayed
        verifyInputFieldsDisplayed(calculatorPage);

        //altered inputData for this specific case
        calculatorPage.inputDataDivByZero();
        calculatorPage.inputNumberOne();
        calculatorPage.inputZeroIntoNum2InputField();
        //log input numbers for invalid operation
        logInputInvalidOperationVariables(calculatorPage);
        //assert dropdown menu is visible
        verifyOperatorDropdownDisplayed(calculatorPage);
        calculatorPage.selectOperatorDropdown();
        calculatorPage.selectDivideOperator();
        //assert the divide was selected
        verifyOperatorSelected(calculatorPage, "divide", calculatorPage.isDivideSelected());
        //verify calculate button is displayed
        verifyCalculateButtonIsDisplayed(calculatorPage);
        calculatorPage.clickCalculateButton();
        //log the answer into console
        logCalculationPageAnswerIntoConsole(calculatorPage);
        //assert the calculation error is displayed
        if(!calculatorPage.getInvalidVariableMessage().isEmpty()) {
            assertEquals(calculatorPage.getInvalidVariableMessage(), "Divide by zero error!");
        }else{
            logger.error("The build doesn't terminate the operation. It's actual result is " + calculatorPage.getCalculationAnswer() + " instead of 'Divide by zero error!'");
        }
        calculatorPage.clickClearButton();
    }
    //assert methods
    protected void verifyInputFieldsDisplayed(CalculatorPage calculatorPage) {
        assertTrue(calculatorPage.isNum1InputFieldDisplayed(), "The num 1 field isn't displayed");
        assertTrue(calculatorPage.isNum2InputFieldDisplayed(), "The num 2 field isn't displayed");
    }

    protected void verifyOperatorDropdownDisplayed(CalculatorPage calculatorPage){
        assertTrue(calculatorPage.isOperatorSelectorDisplayed(), "The operator selector is not displayed");
    }

    protected void verifyOperatorSelected(CalculatorPage calculatorPage, String operator, boolean isSelected) {
        assertTrue(isSelected, "The " + operator + " operator is not selected");
    }

    protected void verifyCalculateButtonIsDisplayed(CalculatorPage calculatorPage){
        assertTrue(calculatorPage.isCalculateButtonDisplayed(), "The 'calculate' button is not displayed");
    }

    //calculator build selector methods
    protected void clickBuildSelectorTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.clickBuildSelector();
    }
    protected void selectBuildOneTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeOne();
    }
    protected void selectBuildTwoTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeTwo();
    }
    protected void selectBuildThreeTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeThree();
    }
    protected void selectBuildFourTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeFour();
    }
    protected void selectBuildFiveTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeFive();
    }
    protected void selectBuildSixTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeSix();
    }
    protected void selectBuildSevenTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeSeven();
    }
    protected void selectBuildEightTest(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        isBuildWebElementDisplayed(calculatorPage);
        calculatorPage.selectPrototypeEight();
    }

    //build selector assert method
    protected void isBuildWebElementDisplayed(CalculatorPage calculatorPage){
        //assert the build selector is displayed
        assertTrue(calculatorPage.isBuildPrototypeOptionDisplayed(), "The prototype option isn't displayed");
        assertTrue(calculatorPage.isBuildOneOptionDisplayed(), "The build one option isn't displayed");
        assertTrue(calculatorPage.isBuildTwoOptionDisplayed(), "The build two option isn't displayed");
        assertTrue(calculatorPage.isBuildThreeOptionDisplayed(), "The build three option isn't displayed");
        assertTrue(calculatorPage.isBuildFourOptionDisplayed(), "The build four option isn't displayed");
        assertTrue(calculatorPage.isBuildFiveOptionDisplayed(), "The build five option isn't displayed");
        assertTrue(calculatorPage.isBuildSixOptionDisplayed(), "The build six option isn't displayed");
        assertTrue(calculatorPage.isBuildSevenOptionDisplayed(), "The build seven option isn't displayed");
        assertTrue(calculatorPage.isBuildEightOptionDisplayed(), "The build eight option isn't displayed");
        assertTrue(calculatorPage.isBuildNineOptionDisplayed(), "The build nine option isn't displayed");
    }

    //calculator answer output logger
    protected void logCalculationPageAnswerIntoConsole(CalculatorPage calculatorPage){
        logger.info("The answer is: " + calculatorPage.getCalculationAnswer());
    }

    //numbers input logger
    protected void logInputInvalidOperationVariables(CalculatorPage calculatorPage){
        logger.info("Number 1: " + calculatorPage.getNumber1Values() + "\n");
        logger.info("Number 2: " + calculatorPage.getNumber2Values() + "\n");
    }
}
