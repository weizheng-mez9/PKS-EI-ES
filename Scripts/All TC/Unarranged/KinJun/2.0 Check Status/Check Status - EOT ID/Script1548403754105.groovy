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

WebUI.navigateToUrl(GlobalVariable.EOT_Check)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/2.0 Check Status/Check Status - EOT ID/Page_PERKESO/Input IC'), 
    GlobalVariable.IC)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/Common Activity - Getter/Getter EOT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/2.0 Check Status/Check Status - EOT ID/Page_PERKESO/Input EOT'), 
    GlobalVariable.EOT)

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/2.0 Check Status/Check Status - EOT ID/Page_PERKESO/Btn Check'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/While Loop/While Loop - EOT ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/While Loop/While Loop - EOT Username'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

