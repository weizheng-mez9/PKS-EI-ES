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

WebUI.setText(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Input Username'), 'nadia.harun@perkeso.gov.my')

WebUI.setEncryptedText(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Input Password'), 'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Btn Login'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Input IC'), GlobalVariable.IC)

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Btn Check'))

GlobalVariable.UserName = WebUI.getText(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/TD Username'))

WebUI.callTestCase(findTestCase('Common Activity - Setter/Setter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Click Username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/2.0 Check Status/Check Status - Case ID/Page_PERKESO/Log Out'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/IC List Remover'), [:], FailureHandling.STOP_ON_FAILURE)

