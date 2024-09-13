package io.github.calculator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorPage extends BasePage{

    //error message
    @FindBy(xpath = "//label[@id='errorMsgField']")
    private WebElement invalidVariableText;

    //calculator type selector
    @FindBy(xpath = "//select[@id='selectBuild']")
    private WebElement buildSelector;

    //build options
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='0']")
    private WebElement buildPrototypeOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='1']")
    private WebElement buildOneOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='2']")
    private WebElement buildTwoOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='3']")
    private WebElement buildThreeOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='4']")
    private WebElement buildFourOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='5']")
    private WebElement buildFiveOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='6']")
    private WebElement buildSixOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='7']")
    private WebElement buildSevenOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='8']")
    private WebElement buildEightOption;
    @FindBy(xpath = "//select[@id='selectBuild']/option[@value='9']")
    private WebElement buildNineOption;

    //variables input fields elements
    @FindBy(xpath = "//input[@id='number1Field']")
    private WebElement num1InputField;
    @FindBy(xpath = "//input[@id='number2Field']")
    private WebElement num2InputField;

    //logical operator dropdown selector element
    @FindBy(xpath = "//select[@id='selectOperationDropdown']")
    private WebElement operatorSelector;

    //logical operator elements
    @FindBy(css = "form [value='0']")
    private WebElement plusOperator;
    @FindBy(css = "form [value='2']")
    private WebElement timesOperator;
    @FindBy(css = "form [value='1']")
    private WebElement minusOperator;
    @FindBy(css = "form [value='3']")
    private WebElement divideOperator;
    @FindBy(css = "form [value='4']")
    private WebElement concatenateOperator;

    //calculate button
    @FindBy(xpath = "//input[@id='calculateButton']")
    private WebElement calculateButton;

    //answer response output element
    @FindBy(xpath = "//input[@id='numberAnswerField']")
    private WebElement answerTextField;

    //clear button
    @FindBy(xpath = "//input[@id='clearButton']")
    private WebElement clearButton;

    //input data
    private int number1;
    private int number2;


    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    //build selector select method
    public void clickBuildSelector(){buildSelector.click();}

    //build option selection methods
    public void selectPrototypeOption(){buildPrototypeOption.click();}
    public void selectPrototypeOne(){buildOneOption.click();}
    public void selectPrototypeTwo(){buildTwoOption.click();}
    public void selectPrototypeThree(){buildThreeOption.click();}
    public void selectPrototypeFour(){buildFourOption.click();}
    public void selectPrototypeFive(){buildFiveOption.click();}
    public void selectPrototypeSix(){buildSixOption.click();}
    public void selectPrototypeSeven(){buildSevenOption.click();}
    public void selectPrototypeEight(){buildEightOption.click();}
    //public void selectPrototypeNine(){buildNineOption.click();} //it's not finished yet on the webpage

    //input data picker from generator
    public void inputData() {
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        number1 = testDataGenerator.generateRandomNumber1();
        number2 = testDataGenerator.generateRandomNumber2();

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //generated data logger
        generatedDataLogger();
    }

    //data input methods
    public void inputNumberOne() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys(String.valueOf(number1));
    }
    public void inputNumberTwo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys(String.valueOf(number2));
    }

    //logical op selector
    public void selectOperatorDropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(operatorSelector));
        operatorSelector.click();
    }

    //calculate button method
    public void clickCalculateButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        calculateButton.click();
    }

    //clear button method
    public void clickClearButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(clearButton));
        clearButton.click();
    }

    //logical operators choice methods
    public void selectPlusOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(plusOperator));
        plusOperator.click();
    }
    public void selectTimesOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(timesOperator));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", timesOperator);
        timesOperator.click();
    }
    public void selectMinusOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(minusOperator));
        minusOperator.click();
    }
    public void selectDivideOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(divideOperator));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", divideOperator);
        divideOperator.click();
    }

    //concatenate operator method
    public void selectConcatenateOperator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(concatenateOperator));
        concatenateOperator.click();
    }

    //invalid input methods (letters as variables)

    public void inputLettersIntoNum1InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys("AsD");
    }
    public void inputLettersIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys("BsD");
    }

    //invalid input methods (one var is missing)

    public void missInputNum1InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num1InputField));
        num1InputField.sendKeys("");
    }
    public void missInputIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys("");
    }

    public void inputDataDivByZero() {
        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        if (true) {
            // number1 has to be greater than zero for the 'division by zero'
            number1 = testDataGenerator.generateRandomNumber1();
            while (number1 == 0) {
                number1 = testDataGenerator.generateRandomNumber1();
            }
        }
        number2 = 0;

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //generated data logger
        generatedDataLogger();
    }

    //generated data logger method
    public void generatedDataLogger(){
        logger.info("Generated data: " + "\n");
        logger.info("Number 1: " + number1);
        logger.info("Number 2: " + number2);
    }

    //invalid input method (divide by zero)
    public void inputZeroIntoNum2InputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(num2InputField));
        num2InputField.sendKeys(String.valueOf(0));
    }

    //calculator build selector assert methods
    public boolean isBuildPrototypeOptionDisplayed(){return buildPrototypeOption.isDisplayed();}
    public boolean isBuildOneOptionDisplayed(){return buildOneOption.isDisplayed();}
    public boolean isBuildTwoOptionDisplayed(){return buildTwoOption.isDisplayed();}
    public boolean isBuildThreeOptionDisplayed(){return buildThreeOption.isDisplayed();}
    public boolean isBuildFourOptionDisplayed(){return buildFourOption.isDisplayed();}
    public boolean isBuildFiveOptionDisplayed(){return buildFiveOption.isDisplayed();}
    public boolean isBuildSixOptionDisplayed(){return buildSixOption.isDisplayed();}
    public boolean isBuildSevenOptionDisplayed(){return buildSevenOption.isDisplayed();}
    public boolean isBuildEightOptionDisplayed(){return buildEightOption.isDisplayed();}
    public boolean isBuildNineOptionDisplayed(){return buildNineOption.isDisplayed();}

    //assert methods
    public boolean isNum1InputFieldDisplayed() {return num1InputField.isDisplayed();}
    public boolean isNum2InputFieldDisplayed() {return num2InputField.isDisplayed();}
    public boolean isOperatorSelectorDisplayed() {return operatorSelector.isDisplayed();}
    public boolean isCalculateButtonDisplayed(){return calculateButton.isDisplayed();}

    //assert operator options methods
    public boolean isPlusSelected(){return plusOperator.isSelected();}
    public boolean isTimesSelected(){return timesOperator.isSelected();}
    public boolean isMinusSelected(){return minusOperator.isSelected();}
    public boolean isDivideSelected(){return divideOperator.isSelected();}

    //concatenate operator assert
    public boolean isConcatenateSelected(){return concatenateOperator.isSelected();}

    //input data getter
    public int getNumber1(){return number1;}
    public int getNumber2(){return number2;}

    //input field data getter (for negative tcs)

    public String getNumber1Values(){return num1InputField.getAttribute("value");}
    public String getNumber2Values(){return num2InputField.getAttribute("value");}

    //answer getter
    public String getCalculationAnswer() {return answerTextField.getAttribute("value");}

    //error message getter
    public String getInvalidVariableMessage() {return invalidVariableText.getText();}
}
