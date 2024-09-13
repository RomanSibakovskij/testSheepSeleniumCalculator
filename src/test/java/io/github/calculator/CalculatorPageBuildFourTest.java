package io.github.calculator;

import org.junit.jupiter.api.*;

public class CalculatorPageBuildFourTest extends TestMethods{

    //valid input tests
    @Test
    @DisplayName("Sum Of Two Variables")
    @Tag("Build_4_Test")
    @Tag("Valid_Operation_Test")
    void sumTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        addTwoVariablesTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables")
    @Tag("Build_4_Test")
    @Tag("Valid_Operation_Test")
    void subtractTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        minusTwoVariablesTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables")
    @Tag("Build_4_Test")
    @Tag("Valid_Operation_Test")
    void multiplicationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        multiplyTwoVariablesTest();
    }

    @Test
    @DisplayName("Division Of Two Variables") //the expected division result doesn't match the actual
    @Tag("Build_4_Test")
    @Tag("Valid_Operation_Test")
    void divisionTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        divideTwoVariablesTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables") //the expected output is correct
    @Tag("Build_4_Test")
    @Tag("Valid_Operation_Test")
    void concatenationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        concatenateTwoVariablesTest();
    }

    //invalid input tests
    @Test
    @DisplayName("Sum Of Two Variables As Letters")  //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void sumTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        addTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void subtractionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        subtractTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void multiplicationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        multiplyTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Division Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void divisionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        divideTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables As Letters")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void concatenationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        concatenateTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variables As Letters")  //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void sumOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        addOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variables As Letters")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void subtractionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        subtractOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void multiplicationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        multiplyOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Division Of One Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void divisionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        divideOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable As Letters")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        concatenateOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variable As Missed")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void sumOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        addMissOneVariableTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variable As Missed")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void subtractOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        subtractMissOneVariableTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variable As Missed")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void multiplicationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        multiplyMissOneVariableTest();
    }

    @Test
    @DisplayName("Division Of One Variable As Missed") //it throws 'Divide by zero' error
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void divisionOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        divideMissOneVariableTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable Missed")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        concatenateOneVariableMissedTest();
    }

    @Test
    @DisplayName("Division By Zero")
    @Tag("Build_4_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Improper_Operation_Test")
    void divisionByZeroTest(){
        clickBuildSelectorTest();
        selectBuildFourTest();
        divideByZeroTest();
    }
}
