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

WebUI.click(findTestObject('Page_TAWASAL - HR Forms/span_Training Request'))

WebUI.setText(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/textarea_Course Name_ATCGlobalTheme_wt119bl_9adf52'), 
    'PMP')

WebUI.setText(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/textarea_Place of Training_ATCGlobalTheme_w_a96bcc'), 
    'External Trainer')

WebUI.click(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/input_From Date_ATCGlobalTheme_wt119blockwt_bfe0c7'))

WebUI.click(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/td_2'))

WebUI.click(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/input_To Date_ATCGlobalTheme_wt119blockwtMa_8dd491'))

WebUI.click(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/td_25'))

WebUI.click(findTestObject('Object Repository/TrainingRequest/Page_TAWASAL - Training Request/input_Duration of Training_ATCGlobalTheme_w_3ab7f3'))

WebUI.acceptAlert()

