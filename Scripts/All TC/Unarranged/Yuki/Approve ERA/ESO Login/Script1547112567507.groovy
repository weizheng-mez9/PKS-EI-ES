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

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.Internal_Login)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Unarranged/Yuki/Common/Internal Email Finder - ESO'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Yuki/Approval ERA/OTC Login/Email'), GlobalVariable.InternalEmail)

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Yuki/Approval ERA/OTC Login/Password'), 'CQqwFZlbeC8=')

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/OTC Login/Login Button'))

