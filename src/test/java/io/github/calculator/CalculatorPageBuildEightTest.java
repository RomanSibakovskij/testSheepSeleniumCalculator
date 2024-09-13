package io.github.calculator;

import org.junit.jupiter.api.*;

public class CalculatorPageBuildEightTest extends TestMethods{

    //valid input tests
    @Test
    @DisplayName("Sum Of Two Variables")
    @Tag("Build_8_Test")
    @Tag("Valid_Operation_Test")
    void sumTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        addTwoVariablesTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables") //it doesn't perform requested operation correctly
    @Tag("Build_8_Test")
    @Tag("Valid_Operation_Test")
    void subtractTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        minusTwoVariablesTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables")
    @Tag("Build_8_Test")
    @Tag("Valid_Operation_Test")
    void multiplicationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        multiplyTwoVariablesTest();
    }

    @Test
    @DisplayName("Division Of Two Variables") //it doesn't perform requested operation correctly
    @Tag("Build_8_Test")
    @Tag("Valid_Operation_Test")
    void divisionTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        divideTwoVariablesTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables") //it concatenates vars vice versa
    @Tag("Build_8_Test")
    @Tag("Valid_Operation_Test")
    void concatenationTwoVariablesTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        concatenateTwoVariablesTest();
    }

    //invalid input tests
    @Test
    @DisplayName("Sum Of Two Variables As Letters")  //the expected output is correct (no result)
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void sumTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        addTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void subtractionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        subtractTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void multiplicationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        multiplyTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Division Of Two Variables As Letters") //the expected output is correct (no result)
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void divisionTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        divideTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of Two Variables As Letters") //the two vars are concatenated vice versa
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Two_Variables_As_Letters_Test")
    void concatenationTwoVariablesAsLettersTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        concatenateTwoVariablesAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variables As Letters")  //it displays 'num2 is not a number' instead of 'num1 is not a number' -> error mismatch
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void sumOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        addOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variables As Letters") //it displays 'num1 is not a number' instead of 'num2 is not a number' -> error mismatch
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void subtractionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        subtractOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variables As Letters") //it displays 'num2 is not a number' instead of 'num1 is not a number' -> error mismatch
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void multiplicationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        multiplyOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Division Of One Variables As Letters") //it displays 'num1 is not a number' instead of 'num2 is not a number' -> error mismatch
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void divisionOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        divideOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable As Letters") // it concatenates two vars vice versa
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableAsLetterTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        concatenateOneVariableAsLettersTest();
    }

    @Test
    @DisplayName("Sum Of One Variable As Missed")
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void sumOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        addMissOneVariableTest();
    }

    @Test
    @DisplayName("Subtraction Of One Variable As Missed")
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void subtractOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        subtractMissOneVariableTest();
    }

    @Test
    @DisplayName("Multiplication Of One Variable As Missed")
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void multiplicationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        multiplyMissOneVariableTest();
    }

    @Test
    @DisplayName("Division Of One Variable As Missed") //it throws 'Divide by zero' error
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_Missed_Test")
    void divisionOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        divideMissOneVariableTest();
    }

    @Test
    @DisplayName("Concatenation Of One Variable Missed")
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("One_Variable_As_A_Letter_Test")
    void concatenationOneVariableMissedTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        concatenateOneVariableMissedTest();
    }

    @Test
    @DisplayName("Division By Zero") //doesn't terminate the operation
    @Tag("Build_8_Test")
    @Tag("Invalid_Operation_Test")
    @Tag("Improper_Operation_Test")
    void divisionByZeroTest(){
        clickBuildSelectorTest();
        selectBuildEightTest();
        divideByZeroTest();
    }
}
