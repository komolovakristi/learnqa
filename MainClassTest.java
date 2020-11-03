import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int a = mainClass.giveLocalNumber();
        Assert.assertTrue("Number is not 14, now number = " + a, 14 == a );
    }

    @Test
    public void testGetClassNumber()
    {
        int a = mainClass.getClassNumber();
        Assert.assertTrue("not",a > 45);
    }

    @Test
    public void testGetClassString()
    {
        String a = mainClass.getClass_string();
        Assert.assertTrue("meow", a.contains("hello") || a.contains("Hello")) ;
    }
}