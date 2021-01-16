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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Tawasal_login_TC_1'), [('username') : 'osama', ('password') : '123456'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Residence Renewal Request'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Residence Renewal Request/input_Passport No_ATCGlobalTheme_wt82blockw_2adf0c'), 
    'S45566577')

WebUI.click(findTestObject('ResidenceRenewal/Page_TAWASAL - Residence Renewal Request/input_End Date of Residence_ATCGlobalTheme__08d7cb'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Residence Renewal Request/td_17'))

WebUI.takeAreaScreenshot(null)

WebUI.closeBrowser()

