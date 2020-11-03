import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int a = mainClass.giveLocalNumber();
        Assert.assertTrue("The number is not 14, now the number = " + a, 14 == a );
    }

    @Test
    public void testGetClassNumber()
    {
        int a = mainClass.getClassNumber();
        Assert.assertTrue("The number isn't bigger than 45, now the number = " + a,a > 45);
    }

    @Test
    public void testGetClassString()
    {
        String a = mainClass.getClass_string();
        Assert.assertTrue("the string " + a + " doesn't contain the substring hello or Hello", a.contains("hello") || a.contains("Hello")) ;
    }
}