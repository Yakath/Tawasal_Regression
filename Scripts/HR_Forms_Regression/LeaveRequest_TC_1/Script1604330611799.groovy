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

WebUI.callTestCase(findTestCase('Login/Tawasal_login_TC_1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Leave Request'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_Annual_-1720092522_1'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_From_ATCGlobalTheme_wt30blockwtMainCo_1b6db0'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/td_23'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_To_ATCGlobalTheme_wt30blockwtMainCont_34107d'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/td_31'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Leave Request/textarea_Address and Contact no. during vac_0eae76'), 
    'chennai 600003')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_Leave Balance Date_ATCGlobalTheme_wt3_bf5753'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_Applicable from 1st Sept. 2020._RichWidgets_wt7blockwtMainContentwt8'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_I confirm that I have read, understoo_c94990'))

