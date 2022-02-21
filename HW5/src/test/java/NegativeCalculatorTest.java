import model.Calculator;
        import org.testng.Assert;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;


public class NegativeCalculatorTest {

    @DataProvider
    public Object[][]negativeTest (){
        return new Object[][]{
                {"+","4","-15"},
                {"-","5","0 3"},
                {"*","2","a"},
                {"/","8","0"}};
    }

    @Test(dataProvider = "negativeTest")
    public void negativeTest (String operator,String input1, String input2) {
        //Assert.assertEquals(Calculator.execute(operator, input1, input2), true);
        Assert.assertNotNull(Calculator.execute(operator, input1, input2),"Значение не 0");
    }
}