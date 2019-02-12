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

WebUI.navigateToUrl('http://10.20.24.188/eisportal/insured/login')

WebUI.callTestCase(findTestCase('All TC/Arranged/Common/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Kenny/OB Login/Email Address'), GlobalVariable.IC)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/Arranged/Common/Getter Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Kenny/OB Login/Password'), GlobalVariable.Password)

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Login/Login Buton'))

WebUI.delay(3)

