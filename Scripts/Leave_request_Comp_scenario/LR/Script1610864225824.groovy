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

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - HR Forms/span_Leave Request'))

WebUI.click(findTestObject('Page_TAWASAL - Leave Request/input_Emergency-PaidUnpaid_-1720092522'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_From_ATCGlobalTheme_wt255blockwtMainC_6af76b'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/td_22'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_To_ATCGlobalTheme_wt255blockwtMainCon_2d8d7e'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/td_26'))

WebUI.setText(findTestObject('Object Repository/Page_TAWASAL - Leave Request/textarea_Address and Contact no. during vac_de47c7'), 
    'chennai, Tamilnadu and 678644444')

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_Leave Balance Date_ATCGlobalTheme_wt2_d3a1cc'))

WebUI.acceptAlert()

//WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/a_logout'))
WebUI.openBrowser('')

WebUI.navigateToUrl('https://172.20.110.232/ATCGlobalTheme/NoPermission.aspx')



WebUI.setText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtUse_b22bb2'), 'fadi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtPas_3db4e9'), 
    'aeHFOx8jV/A=')

//WebUI.maximizeWindow()

//WebDriver driver = DriverFactory.getWebDriver()





WebUI.click(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtLog_539a3d'))

WebUI.click(findTestObject('Object Repository/Page_ATCPortalHome/img'))

WebUI.click(findTestObject('Page_TAWASAL - Requests List/span_44329'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/div_12'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_sddsaddfdf, 67856464_ATCGlobalTheme_w_345b9b'))

//WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Requests List/a_logout'))
WebUI.openBrowser('')

WebUI.navigateToUrl('https://172.20.110.232/ATCGlobalTheme/NoPermission.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtUse_b22bb2'), 'omar')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtPas_3db4e9'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Remember login_wt18wtMainContentwtLog_539a3d'))

WebUI.click(findTestObject('Object Repository/Page_ATCPortalHome/img'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Requests List/span_44329'))

WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Leave Request/input_sddsaddfdf, 67856464_ATCGlobalTheme_w_345b9b'))

//WebUI.click(findTestObject('Object Repository/Page_TAWASAL - Requests List/a_logout'))
WebUI.closeBrowser()

