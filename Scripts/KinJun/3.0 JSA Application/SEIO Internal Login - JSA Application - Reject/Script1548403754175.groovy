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

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Input username'), 
    GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Input password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn Login'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Click workbasket'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Click Search Case'))

WebUI.callTestCase(findTestCase('KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Input IC'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn SearchIC'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Click CaseID'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn Reject'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Span RejectReason'))

WebUI.delay(5)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/DD RejectReason'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn Confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Click Username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/SEIO Internal Login - JSA Application - Reject/Page_PERKESO/Log Out'))

