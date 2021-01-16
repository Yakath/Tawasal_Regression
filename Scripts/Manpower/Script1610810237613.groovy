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

WebUI.click(findTestObject('Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Page_TAWASAL - HR Forms/span_Manpower Request'))

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/input_Name_ATCGlobalTheme_wt171blockwtMainC_a92b57'), 'YakathAli')

WebUI.selectOptionByValue(findTestObject('Page_TAWASAL - Manpower Request/select_AmericanArmenianAustralianBahrainiBa_7c6b65'), 
    '13', true)

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/input_Civil ID_ATCGlobalTheme_wt171blockwtM_298a6b'), '345436767788')

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/input_Passport No_ATCGlobalTheme_wt171block_da061a'), 'S43525366')

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/input_PhoneMobile_ATCGlobalTheme_wt171block_b2c42c'), '67895432')

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/input_Email_ATCGlobalTheme_wt171blockwtMain_b80be9'), 'abu@gmail.com')

WebUI.selectOptionByValue(findTestObject('Page_TAWASAL - Manpower Request/select_6504 - Develop  Implement Dept Inter_9e860a'), 
    '6503 - Develop & Implement Dept Service  ', true)

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/input_Job Title_ATCGlobalTheme_wt171blockwt_e62b8b'), 'Engineer')

WebUI.setText(findTestObject('Page_TAWASAL - Manpower Request/textarea_Job Description_ATCGlobalTheme_wt1_a3431a'), 'IT Engineer')

WebUI.click(findTestObject('Page_TAWASAL - Manpower Request/input_Document.pdf_ATCGlobalTheme_wt171bloc_de10d1'))

WebUI.acceptAlert()

WebUI.closeBrowser()

