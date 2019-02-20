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

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/Internal Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Input username'), 
    GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Input password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/btn Login'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Click Workbasket'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Click Search Case'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.1 Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Input IC'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Btn search IC'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Click CaseID'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Click EIO minute'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Input Contribution'), 
    '15.80')

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Input Salary'), 
    '4000')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Span Benefit type'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/DD Benefit type'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Span LOE'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/DD LOE'))

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Remarks'), 
    'okay')

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Btn Update'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Btn Submit'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('2.0 Check Status/Check Status - Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Click Username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Approve/Page_PERKESO/Log Out'))

WebUI.closeBrowser()

