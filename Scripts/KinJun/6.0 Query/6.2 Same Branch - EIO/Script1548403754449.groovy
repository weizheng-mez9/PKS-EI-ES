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

WebUI.callTestCase(findTestCase('KinJun/While Loop/Internal Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Input username'), GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Input password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Btn login'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Click workbasket'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Click SearchCase'))

WebUI.callTestCase(findTestCase('KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Input IC'), GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Btn Search'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Click CaseID'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Btn Query'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Span branch'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/DD Branch'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Span officer'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/DD Officer'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('KinJun/While Loop/While Loop - Query'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/remarks'), 'query')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Btn Query2'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Click username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/6.0 Query/6.2 Same branch - EIO/Page_PERKESO/Log out'))

WebUI.callTestCase(findTestCase('KinJun/2.0 Check Status/Check Status - Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('KinJun/6.0 Query/6.6 Query back'), [:], FailureHandling.STOP_ON_FAILURE)

