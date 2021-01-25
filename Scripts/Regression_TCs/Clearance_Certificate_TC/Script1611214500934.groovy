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

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Clearance Certificate'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Clearance Type_1493514626'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Clearance Date_ATCGlobalTheme_wt75blo_a2308d'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/td_22'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Resignation Date_ATCGlobalTheme_wt75b_03151a'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/td_28'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Notice Period_ATCGlobalTheme_wt75bloc_199ba7'), 
    '3')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Resignation Effective Date_ATCGlobalT_a0cf3e'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_Phone Number_ATCGlobalTheme_wt75block_c48bd4'), 
    '67844566')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Clearance Form/input_please enter the contact number that _bfad8b'))

WebUI.click(findTestObject('Page_TAWASAL - Clearance Form/Page_TAWASAL - Clearance Form/input_please enter the contact number that you will be using after leaving ATC_ATCGlobalTheme_wt75blockwtMainContentwt82'))

WebUI.acceptAlert()

