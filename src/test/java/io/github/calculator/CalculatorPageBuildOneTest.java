package io.github.calculator;

import org.junit.jupiter.api.*;

public class CalculatorPageBuildOneTest extends TestMethods{

    //valid input tests
    @Test
    @DisplayName("Sum Of Two Variables")
    @Tag("Build_1_Test")
    @Tag("Valid_Operation_Test")
    void sumTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        addTwoVariablesTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables")
    @Tag("Build_1_Test")
    @Tag("Valid_Operation_Test")
    void subtractTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        minusTwoVariablesTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables")
    @Tag("Build_1_Test")
    @Tag("Valid_Operation_Test")
    void multiplicationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        multiplyTwoVariablesTest();
    }

    @Test
    @DisplayName("Division Of Two Variables")
    @Tag("Build_1_Test")
    @Tag("Valid_Operation_Test")
    void divisionTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        divideTwoVariablesTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable Missed") //the expected output is correct
    @Tag("Build_1_Test")
    @Tag("Valid_Operation_Test")
    void concatenationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        concatenateTwoVariablesTest();
    }

    //invalid input tests
    @Test
    @DisplayName("Sum Of Two Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void sumTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        addTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void subtractionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        subtractTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void multiplicationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        multiplyTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Division Of Two Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void divisionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        divideTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables As Letters") //the expected output is correct
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void concatenationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        concatenateTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void sumOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        addOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void subtractionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        subtractOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void multiplicationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        multiplyOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Division Of One Variables As Letters")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void divisionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        divideOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable As Letters") //the expected result is correct
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        concatenateOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variable As Missed")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void sumOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        addMissOneVariableTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variable As Missed")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void subtractOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        subtractMissOneVariableTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variable As Missed")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void multiplicationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        multiplyMissOneVariableTest();
    }

    @Test
    @DisplayName("Division Of One Variable As Missed") //it throws 'Divide by zero' error
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void divisionOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        divideMissOneVariableTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable Missed") //the expected output is correct
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        concatenateOneVariableMissedTest();
    }

    @Test
    @DisplayName("Division By Zero")
    @Tag("Build_1_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Improper_Operation_Test")
    void divisionByZeroTest(){
        clickBuildSelectorTest();
        selectBuildOneTest();
        divideByZeroTest();
    }

}
