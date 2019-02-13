import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Internal_Login)

WebUI.setText(findTestObject('ZhiHao/OTC_Semakan/OTC_Semakan(by IC)/Page_PERKESO/input_username'), 'dalilah.taib@perkeso.gov.my')

WebUI.setEncryptedText(findTestObject('ZhiHao/OTC_Semakan/OTC_Semakan(by IC)/Page_PERKESO/input_password'), 'CQqwFZlbeC8=')

WebUI.click(findTestObject('ZhiHao/OTC_Semakan/OTC_Semakan(by IC)/Page_PERKESO/click_login'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.1 Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ZhiHao/OTC_Semakan/OTC_Semakan(by IC)/Page_PERKESO/input_(Baru)_nric'), GlobalVariable.IC)

WebUI.click(findTestObject('ZhiHao/OTC_Semakan/OTC_Semakan(by IC)/Page_PERKESO/button_Semak'))

GlobalVariable.UserName = WebUI.getText(findTestObject('ZhiHao/OTC_Semakan/OTC_Semakan(by IC)/Page_PERKESO/td_JHEIO3'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.2 Setter/Setter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

