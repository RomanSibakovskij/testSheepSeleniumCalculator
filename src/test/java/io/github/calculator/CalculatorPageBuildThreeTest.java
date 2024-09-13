package io.github.calculator;

import org.junit.jupiter.api.*;

public class CalculatorPageBuildThreeTest extends TestMethods{

    //valid input tests
    @Test
    @DisplayName("Sum Of Two Variables")
    @Tag("Build_3_Test")
    @Tag("Valid_Operation_Test")
    void sumTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        addTwoVariablesTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables")
    @Tag("Build_3_Test")
    @Tag("Valid_Operation_Test")
    void subtractTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        minusTwoVariablesTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables")
    @Tag("Build_3_Test")
    @Tag("Valid_Operation_Test")
    void multiplicationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        multiplyTwoVariablesTest();
    }

    @Test
    @DisplayName("Division Of Two Variables")
    @Tag("Build_3_Test")
    @Tag("Valid_Operation_Test")
    void divisionTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        divideTwoVariablesTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables") //the expected output is correct
    @Tag("Build_3_Test")
    @Tag("Valid_Operation_Test")
    void concatenationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        concatenateTwoVariablesTest();
    }

    //invalid input tests
    @Test
    @DisplayName("Sum Of Two Variables As Letters")  //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void sumTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        addTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void subtractionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        subtractTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void multiplicationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        multiplyTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Division Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void divisionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        divideTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables As Letters") // the vars weren't concatenated
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void concatenationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        concatenateTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variables As Letters")  //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void sumOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        addOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variables As Letters")
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void subtractionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        subtractOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void multiplicationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        multiplyOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Division Of One Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void divisionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        divideOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable As Letters") //the vars don't get concatenated
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        concatenateOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variable As Missed")
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void sumOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        addMissOneVariableTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variable As Missed")
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void subtractOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        subtractMissOneVariableTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variable As Missed")
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void multiplicationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        multiplyMissOneVariableTest();
    }

    @Test
    @DisplayName("Division Of One Variable As Missed") //it throws 'Divide by zero' error
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void divisionOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        divideMissOneVariableTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable Missed") //the expected output doesn't match (it should've displayed non-missed variable but didn't)
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        concatenateOneVariableMissedTest();
    }

    @Test
    @DisplayName("Division By Zero")
    @Tag("Build_3_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Improper_Operation_Test")
    void divisionByZeroTest(){
        clickBuildSelectorTest();
        selectBuildThreeTest();
        divideByZeroTest();
    }

}
