import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class NegativeCalculatorTest {

    @DataProvider
    public Object[][]negativeData (){
        return new Object[][]{
                {"plus","1","1"},
                {"+","4","ффф"},
                {"-","one","two"},
                {"+","null","null"},
                {"-","","2"},
                {"*","2","5 0"},
                {"/","8","0"}};
    }
    @Test(dataProvider = "negativeData", expectedExceptions = {CalculatorException.class})
    public void negativeTest (String operator,String input1, String input2){
            String[] params = new String[3];
            params[0] = operator;
            params[1] = input1;
            params[2] = input2;
            Calculator.execute(params);
    }
}