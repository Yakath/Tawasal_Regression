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

WebUI.click(findTestObject('Page_TAWASAL - Requests List/a_HR Forms'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Travel Authorization'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/textarea_Purpose Of Travel_ATCGlobalTheme_w_24d457'), 
    'Onsite Training and Test')

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/textarea_Organization_ATCGlobalTheme_wt20bl_973682'), 
    'ATC')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_From_ATCGlobalTheme_wt20blockwtMainCo_ece7b4'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/td_8'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_To_ATCGlobalTheme_wt20blockwtMainCont_a85645'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/td_17'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_Visa Required_-847584917'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/a_Add Destination'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_Destination _WebPatterns_wt13blockwtMainContentwt15'), 
    'india')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_Date _WebPatterns_wt13blockwtMainCont_65215d'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/td_23'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_Date _WebPatterns_wt13blockwtMainContentwt14'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/textarea_Comments_ATCGlobalTheme_wt20blockw_a0bf20'), 
    'training for the IT Security')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Travel Authorization Form/input_Comments_ATCGlobalTheme_wt20blockwtMa_a7c7cb'))

WebUI.acceptAlert()

