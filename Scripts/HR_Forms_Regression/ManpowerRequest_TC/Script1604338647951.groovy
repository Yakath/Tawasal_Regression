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

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Manpower Request'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Name_ATCGlobalTheme_wt171blockwtMainC_a92b57'), 
    'Ravi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/select_AmericanArmenianAustralianBahrainiBa_7c6b65'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Civil ID_ATCGlobalTheme_wt171blockwtM_298a6b'), 
    '234344564656')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Passport No_ATCGlobalTheme_wt171block_da061a'), 
    'S4545566')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_PhoneMobile_ATCGlobalTheme_wt171block_b2c42c'), 
    '56777767')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/textarea_Job Description_ATCGlobalTheme_wt1_a3431a'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Email_ATCGlobalTheme_wt171blockwtMain_b80be9'), 
    'smail@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Job Title_ATCGlobalTheme_wt171blockwt_e62b8b'), 
    'Sr Engineer')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_debug.log_ATCGlobalTheme_wt171blockwt_476e1c'))

WebUI.click(findTestObject(''))

WebUI.uploadFile(findTestObject('Page_TAWASAL - Manpower Request/div_Upload Files'), 'C:\\Users\\Lenovo\\Documents\\datepicker\\datepicker.txt')

