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

WebUI.click(findTestObject('Page_TAWASAL - HR Forms/span_Residence Information Transfer'))

WebUI.setText(findTestObject('Object Repository/ResidenceInfoTransfer/Page_TAWASAL - Residence Information Transfer/input_Old Passport No_ATCGlobalTheme_wt11bl_66abdc'), 
    'S456546565')

WebUI.setText(findTestObject('Object Repository/ResidenceInfoTransfer/Page_TAWASAL - Residence Information Transfer/input_New Passport No_ATCGlobalTheme_wt11bl_c59311'), 
    'T454654677')

WebUI.setText(findTestObject('Object Repository/ResidenceInfoTransfer/Page_TAWASAL - Residence Information Transfer/input_Residence No_ATCGlobalTheme_wt11block_5ea9cf'), 
    '4557657457878')

WebUI.click(findTestObject('Object Repository/ResidenceInfoTransfer/Page_TAWASAL - Residence Information Transfer/input_End Date of Residence_ATCGlobalTheme__680620'))

WebUI.click(findTestObject('Object Repository/ResidenceInfoTransfer/Page_TAWASAL - Residence Information Transfer/td_30'))

WebUI.click(findTestObject('Object Repository/ResidenceInfoTransfer/Page_TAWASAL - Residence Information Transfer/input_End Date of Residence_ATCGlobalTheme__58ccb5'))

WebUI.acceptAlert()

WebUI.closeBrowser()

