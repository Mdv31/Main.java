import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PositiveCalculatorTest {

    @DataProvider
    public Object[][]positiveData  (){
        return new Object[][]{
            {"+","4","4","8"},
            {"-","5","3","2"},
            {"*","2","3","6"},
            {"/","8","2","4"}};
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest (String operator,String input1, String input2, String result) {
        String[] params = new String[3];
        params[0]= operator;
        params[1]= input1;
        params[2]= input2;
        String result1=Float.toString(Float.parseFloat(result));
        Assert.assertEquals(Calculator.execute(params), result1, "Позитивный тест не пройден");
    }
}


