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

WebUI.callTestCase(findTestCase('Login/Tawasal_login_TC_1'), [('username') : 'osama', ('password') : '123456'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Page_TAWASAL - HR Forms/span_Phone Internet Services'))

WebUI.click(findTestObject('Object Repository/phoneinternetserviceTC/Page_TAWASAL -PhoneInternet Services Request/input_International Subscription_ATCGlobalT_f540a7'))

WebUI.click(findTestObject('Object Repository/phoneinternetserviceTC/Page_TAWASAL -PhoneInternet Services Request/input_Internet on Mobile 5 KD (100 GB  1000_9d2a5e'))

WebUI.setText(findTestObject('Object Repository/phoneinternetserviceTC/Page_TAWASAL -PhoneInternet Services Request/input_Reason_ATCGlobalTheme_wt59blockwtMain_8a2cb1'), 
    'To speak with customer')

WebUI.click(findTestObject('Object Repository/phoneinternetserviceTC/Page_TAWASAL -PhoneInternet Services Request/input_Reason_ATCGlobalTheme_wt59blockwtMain_7b2fbe'))

WebUI.acceptAlert()

