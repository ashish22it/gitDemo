package QAAutomation.MavenJava;
import org.testng.annotations.Test;
public class SeleniumTest // Mandatory to append 'Test' keyword after the class names in test folder so that maven recognize it as per its algorithm. 
{
    @Test
    public void browserAutomations()
    {
        System.out.println("browserAutomations");
    }
    @Test
    public void elementsUI()
    {
        System.out.println("elementsUI");
    }
}
