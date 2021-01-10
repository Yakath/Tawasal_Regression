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

WebUI.click(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - HR Forms/span_Manpower Request'))

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_Name_ATCGlobalTheme_wt171blockwtMainC_a92b57'), 
    'Yakath Ali')

WebUI.selectOptionByValue(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/select_AmericanArmenianAustralianBahrainiBa_7c6b65'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_Civil ID_ATCGlobalTheme_wt171blockwtM_298a6b'), 
    '287867986756')

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_Passport No_ATCGlobalTheme_wt171block_da061a'), 
    'S346545657')

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_PhoneMobile_ATCGlobalTheme_wt171block_b2c42c'), 
    '6756464767')

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/textarea_Job Description_ATCGlobalTheme_wt1_a3431a'), 
    'IT Technicaina')

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_Email_ATCGlobalTheme_wt171blockwtMain_b80be9'), 
    'avu@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/select_6504 - Develop  Implement Dept Inter_9e860a'), 
    '6503 - Develop & Implement Dept Service  ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/select_6504 - Develop  Implement Dept Inter_9e860a'), 
    '6504 - Develop & Implement Dept Internal Service  ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/select_6504 - Develop  Implement Dept Inter_9e860a'), 
    '6503 - Develop & Implement Dept Service  ', true)

WebUI.setText(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_Job Title_ATCGlobalTheme_wt171blockwt_e62b8b'), 
    'Sr Engineer')

WebUI.click(findTestObject('Object Repository/ManpowerRequest/Page_TAWASAL - Manpower Request/input_common.txt_ATCGlobalTheme_wt171blockw_2ac57d'))

WebUI.acceptAlert()

WebUI.acceptAlert()

