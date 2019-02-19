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

WebUI.callTestCase(findTestCase('While Loop/Internal Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Input username'), 
    GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Input password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Btn Login'))

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Click workbasket'))

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Click Search Case'))

WebUI.callTestCase(findTestCase('Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Input IC'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Btn SearchIC'))

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Click CaseID'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Click EIO minute'))

WebUI.delay(3)

WebUI.setText(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Input contribution'), 
    '4000')

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Span benefit type'))

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/DD benefit type'))

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Span LOE'))

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/DD LOE'))

WebUI.setText(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Remarks'), 
    'okay')

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Btn Update'))

WebUI.delay(10)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Btn submit'))

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Click username'))

WebUI.delay(3)

WebUI.click(findTestObject('3.1 RIA Application/EIO Internal Login - RIA Application - Approve/Page_PERKESO/Log Out'))

WebUI.callTestCase(findTestCase('2.0 Check Status/Check Status - Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

