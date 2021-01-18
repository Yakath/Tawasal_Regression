import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://172.20.110.232/tawasal')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtUse_b22bb2'), 'fadi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtPas_3db4e9'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/login_page_OR/Page_Login/input_Remember login_wt18wtMainContentwtLog_539a3d'))

String ExpectedValue = '44337'

WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

//WebElement Table = driver.findElement(By.xpath("//table[@id='ATCGlobalTheme_wt158_block_wtMainContent_wtHRFormTable']"))
//'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows = Table.findElements(By.tagName('tr'))

//'To calculate no of rows In table'
int no_rows = rows.size()

println(no_rows)

//'Find a matching text in a table and performing action'
//'Loop will execute for all the rows of the table'
table: for (int i = 0; i < no_rows; i++) {
    List<WebElement> Cols = rows.get(i).findElements(By.tagName('td'))

    for (int j = 0; j < Cols.size(); j++) {
        if (Cols.get(j).getText().equalsIgnoreCase(ExpectedValue)) {
            Cols.get(1).findElement(By.cssSelector('#ATCGlobalTheme_wt158_block_wtMainContent_wtHRFormTable_ctl03_wt211')).click()

            break
        }
    }
}

WebUI.click(findTestObject('Page_TAWASAL - Residence Transfer Request/input_s565765788_ATCGlobalTheme_wt66blockwtMainContentwt53wt17'))

WebUI.closeBrowser()

