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

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - HR Forms/span_Leave Request'))

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/input_Annual_-1720092522'))

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/input_From_ATCGlobalTheme_wt255blockwtMainC_6af76b'))

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/td_18'))

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/input_To_ATCGlobalTheme_wt255blockwtMainCon_2d8d7e'))

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/td_26'))

WebUI.setText(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/textarea_Address and Contact no. during vac_de47c7'), 
    '69003564, chennai India')

WebUI.click(findTestObject('Object Repository/LeaveRequest_OR/Page_TAWASAL - Leave Request/input_Leave Balance Date_ATCGlobalTheme_wt2_d3a1cc'))

WebUI.acceptAlert()

