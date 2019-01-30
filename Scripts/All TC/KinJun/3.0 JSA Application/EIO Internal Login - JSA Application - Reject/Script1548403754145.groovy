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

WebUI.callTestCase(findTestCase('All TC/KinJun/While Loop/Internal Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Input Username'), 
    GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Input Password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn Login'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Click workbasket'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Click Search Case'))

WebUI.callTestCase(findTestCase('All TC/KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Input IC'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn SearchIC'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Click CaseID'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Click EIO minute'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Input Contribution'), 
    '15.80')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Span benefits type'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/DD benefits type'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Span LOE'))

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/DD Loe'))

WebUI.setText(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Remarks'), 
    'okay')

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn Update'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Btn Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Click Username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/3.0 JSA Application/EIO Internal Login - JSA Application - Reject/Page_PERKESO/Log Out'))

WebUI.callTestCase(findTestCase('All TC/KinJun/2.0 Check Status/Check Status - Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

