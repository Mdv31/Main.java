import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PositiveCalculatorTest {

    @DataProvider
    public Object[][]positiveTest (){
        return new Object[][]{
            {"+","4","4","8"},
            {"-","5","3","2"},
            {"*","2","3","6"},
            {"/","8","2","4"}};
    }

    @Test(dataProvider = "positiveTest")
    public void positiveTest (String operator,String input1, String input2, String result) {
        String params=input1+" "+operator+" "+input2;
        Assert.assertEquals(Calculator.execute(params), result, "Позитивный тест не пройден");
    }
}


