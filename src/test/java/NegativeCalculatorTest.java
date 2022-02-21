import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;


public class NegativeCalculatorTest {

    @DataProvider
    public Object[][]negativeTest (){
        return new Object[][]{
                {"+","4","a"},
                {"-","5","-3"},
                {"*","2","50"},
                {"/","8","0"}};
    }

    @Test(dataProvider = "negativeTest", expectedExceptions  = CalculatorException.class)
    public void negativeTest (String operator,String input1, String input2) {
        String[] params = new String[3];
        params[0]= operator;
        params[1]= input1;
        params[2]= input2;
        //Assert.assertNotNull(Calculator.execute(params),"Значение не 0");
        //Assert.assertNull(Calculator.execute(params));
        Calculator.execute(params);
        Assert.assertFalse(true);
        //Assert.fail(Calculator.execute(params));
    }
}