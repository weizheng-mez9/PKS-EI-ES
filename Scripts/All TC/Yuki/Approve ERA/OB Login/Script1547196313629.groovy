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

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.Public_Login)

WebUI.callTestCase(findTestCase('All TC/Yuki/Common/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Yuki/Approval ERA/IP Login/IP Login IC'), GlobalVariable.IC)

WebUI.callTestCase(findTestCase('All TC/Yuki/Common/Getter Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Yuki/Approval ERA/IP Login/IP Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Yuki/Approval ERA/IP Login/Login'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Yuki/Approval ERA/IP Setuju ERA/Notis Pilihan Tab'))

WebUI.delay(3)

WebUI.click(findTestObject('Yuki/Approval ERA/IP Setuju ERA/EBSA'))

WebUI.delay(3)

WebUI.click(findTestObject('Yuki/Approval ERA/IP Setuju ERA/Setuju Button'))

