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

WebUI.callTestCase(findTestCase('All TC/YongJun/Common/Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 login username'), GlobalVariable.EiEsEmail)

WebUI.setEncryptedText(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 login password'), 'CQqwFZlbeC8=')

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 login button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 GPFI Listing'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/YongJun/Common/DS1 Case Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 select case checkbox'))

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 generate payment voucher'))

WebUI.delay(1)

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 accept generation button'))

WebUI.delay(3)

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 select prepare payment voucher checkbox'))

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 accept prepare voucher'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 complete button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 pre logout'))

WebUI.click(findTestObject('YongJun/Disbursement/DS1/Page_PERKESO/DS1 logout button'))

WebUI.closeBrowser()

