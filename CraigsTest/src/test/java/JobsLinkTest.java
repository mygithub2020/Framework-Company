import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.lang.InterruptedException;

/**
 * Created with IntelliJ IDEA.
 * User: Sharma
 * Date: 1/3/14
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class JobsLinkTest extends CraigsBase
{
    @BeforeMethod(dependsOnMethods = {"setUp"})
    private void go_to_Website()
    {
        driver.get(siteUrl);
    }

    @Test
    public void job_section_Link_Test() throws InterruptedException
    {
        String xpath_Start = jobs_start_link;
        String xpath_End = jobs_end_link;

        for (int i = 1; i <= 33; i++)
        {
            clickByXpath(xpath_Start + i + xpath_End);
            System.out.println(driver.getTitle());
            //String pageTitle = driver.findElement(By.xpath(link_Page_Title)).getText();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }

    }
    @AfterTest
    private void close_Browser()
    {
        driver.quit();
    }

}
