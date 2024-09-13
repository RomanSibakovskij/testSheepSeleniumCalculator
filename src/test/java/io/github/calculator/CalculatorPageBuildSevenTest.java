package io.github.calculator;

import org.junit.jupiter.api.*;

public class CalculatorPageBuildSevenTest extends TestMethods{

    //valid input tests
    @Test
    @DisplayName("Sum Of Two Variables") //it doesn't perform requested operation correctly
    @Tag("Build_7_Test")
    @Tag("Valid_Operation_Test")
    void sumTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        addTwoVariablesTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables") //it doesn't perform requested operation correctly
    @Tag("Build_7_Test")
    @Tag("Valid_Operation_Test")
    void subtractTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        minusTwoVariablesTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables") //it doesn't perform requested operation correctly
    @Tag("Build_7_Test")
    @Tag("Valid_Operation_Test")
    void multiplicationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        multiplyTwoVariablesTest();
    }

    @Test
    @DisplayName("Division Of Two Variables") //it doesn't perform requested operation correctly
    @Tag("Build_7_Test")
    @Tag("Valid_Operation_Test")
    void divisionTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        divideTwoVariablesTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables") //the expected output is correct
    @Tag("Build_7_Test")
    @Tag("Valid_Operation_Test")
    void concatenationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        concatenateTwoVariablesTest();
    }

    //invalid input tests
    @Test
    @DisplayName("Sum Of Two Variables As Letters")  //the expected output is correct (no result)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void sumTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        addTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void subtractionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        subtractTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void multiplicationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        multiplyTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Division Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void divisionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        divideTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables As Letters") //the two vars aren't concatenated
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void concatenationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        concatenateTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variables As Letters")  //it gives out an incorrect result (instead of giving none)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void sumOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        addOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variables As Letters")
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void subtractionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        subtractOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variables As Letters") //it gives out an incorrect result (instead of giving none)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void multiplicationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        multiplyOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Division Of One Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void divisionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        divideOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable As Letters") // it doesn't concatenate two vars
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        concatenateOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variable As Missed")
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void sumOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        addMissOneVariableTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variable As Missed")
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void subtractOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        subtractMissOneVariableTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variable As Missed")
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void multiplicationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        multiplyMissOneVariableTest();
    }

    @Test
    @DisplayName("Division Of One Variable As Missed") //it doesn't throw 'Divide by zero' error
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void divisionOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        divideMissOneVariableTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable Missed")
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        concatenateOneVariableMissedTest();
    }

    @Test
    @DisplayName("Division By Zero")
    @Tag("Build_7_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Improper_Operation_Test")
    void divisionByZeroTest(){
        clickBuildSelectorTest();
        selectBuildSevenTest();
        divideByZeroTest();
    }
}
