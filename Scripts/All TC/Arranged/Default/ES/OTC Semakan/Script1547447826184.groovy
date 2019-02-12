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

WebUI.callTestCase(findTestCase('All TC/Arranged/Common/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Yuki/Approval ERA/OTC Semakan/IC Number'), GlobalVariable.IC)

WebUI.click(findTestObject('Yuki/Approval ERA/OTC Semakan/Semak Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/OTC Semakan/SIPE'))

GlobalVariable.UserName = WebUI.getText(findTestObject('Yuki/Approval ERA/OTC Semakan/SEIO'))

WebUI.callTestCase(findTestCase('All TC/Arranged/Common/Setter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

