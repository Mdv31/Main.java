import model.Calculator;
import model.CalculatorException;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;


public class NegativeCalculatorTest {

    @DataProvider
    public Object[][]negativeData (){
        return new Object[][]{
                {"+","4","ффф"},
                {"-","1","2"},
                {"*","2","50"},
                {"/","8","0"}};
    }
    @Test(dataProvider = "negativeData")//, expectedExceptions = CalculatorException.class)
    public void negativeTest (String operator,String input1, String input2){
            String[] params = new String[3];
            params[0] = operator;
            params[1] = input1;
            params[2] = input2;
            Calculator.execute(params);
    }
}