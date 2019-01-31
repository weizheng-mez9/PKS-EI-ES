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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Internal_Login)

WebUI.callTestCase(findTestCase('All TC/Unarranged/YongJun/Common/Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 login username'), GlobalVariable.EiEsEmail)

WebUI.setEncryptedText(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 login password'), 'CQqwFZlbeC8=')

WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 login button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 Voucher listing tab'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Unarranged/YongJun/Common/DS3 Case Finder'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 select case checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 complete approval'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 pre logout'))

WebUI.click(findTestObject('YongJun/Disbursement/DS3/Page_PERKESO/DS3 logout'))

WebUI.closeBrowser()

