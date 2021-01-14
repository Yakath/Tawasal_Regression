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

WebUI.click(findTestObject('Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Page_TAWASAL - HR Forms/span_Manpower Request'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Name_ATCGlobalTheme_wt171blockwtMainC_a92b57'), 
    'Ravi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/select_AmericanArmenianAustralianBahrainiBa_7c6b65'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Civil ID_ATCGlobalTheme_wt171blockwtM_298a6b'), 
    '288454545454')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Passport No_ATCGlobalTheme_wt171block_da061a'), 
    'S232324')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_PhoneMobile_ATCGlobalTheme_wt171block_b2c42c'), 
    '67893456')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/textarea_Job Description_ATCGlobalTheme_wt1_a3431a'), 
    'IT tehcnicain')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Email_ATCGlobalTheme_wt171blockwtMain_b80be9'), 
    'ravi@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/select_6504 - Develop  Implement Dept Inter_9e860a'), 
    '6503 - Develop & Implement Dept Service  ', true)

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Job Title_ATCGlobalTheme_wt171blockwt_e62b8b'), 
    'sr.Engineer')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Manpower Request/input_Document.pdf_ATCGlobalTheme_wt171bloc_de10d1'))

WebUI.uploadFile(findTestObject('Page_TAWASAL - Manpower Request/div_Upload Files'), 'C:\\Users\\Lenovo\\Documents\\datepicker\\datepicker.txt')

WebUI.click(findTestObject('Page_TAWASAL - Manpower Request/input_Upload Files_ATCGlobalTheme_wt171blockwtMainContentwt250'))

WebUI.acceptAlert()

