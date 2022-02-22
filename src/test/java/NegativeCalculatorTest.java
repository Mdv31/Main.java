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
//, expectedExceptions  = CalculatorException.class
    @Test(dataProvider = "negativeTest")
    public void negativeTest (String operator,String input1, String input2) {
        String[] params = new String[3];
        params[0] = operator;
        params[1] = input1;
        params[2] = input2;
        //Assert.assertNotNull(Calculator.execute(params),"Значение не 0");
        //Assert.assertNull(Calculator.execute(params));
        Exception ex = null;
        try {
            Calculator.execute(params);
        } catch (Exception e) {
            ex = e;
        }
        Assert.assertNull(ex);

        //Assert.assertFalse(false);
        //Assert.fail(Calculator.execute(params));
        //Assert.assertTrue(Calculator.execute(params).isEmpty());
        //Assert.assertTrue(Calculator.execute(params).isEmpty());
        //Assert.assertEquals(Calculator.execute(params),Calculator.execute(params));
        //Assert.fail("Exception expected.");
    }
}