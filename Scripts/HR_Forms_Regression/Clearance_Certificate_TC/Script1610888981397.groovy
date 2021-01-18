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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://172.20.110.232/ATCGlobalTheme/NoPermission.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtUse_b22bb2'), 'osama')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtPas_3db4e9'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtLog_539a3d'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Clearance Certificate'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Clearance Type_1493514626'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Clearance Date_ATCGlobalTheme_wt75blo_a2308d'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/td_29'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Resignation Date_ATCGlobalTheme_wt75b_03151a'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/td_27'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Notice Period_ATCGlobalTheme_wt75bloc_199ba7'), 
    '3')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_please enter the contact number that _bfad8b'))

WebUI.acceptAlert()

