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

WebUI.callTestCase(findTestCase('All TC/Arranged/3. Unit/EI/Disbursement Common/Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 login username'), GlobalVariable.EiEsEmail)

WebUI.setEncryptedText(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 login password'), 'CQqwFZlbeC8=')

WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 login button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 Voucher Listing tab'))

not_run: WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 select case checkbox'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Arranged/3. Unit/EI/Disbursement Common/DS2 Case Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 approve button'))

WebUI.delay(1)

WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 complete approval button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 pre logout'))

WebUI.click(findTestObject('YongJun/Disbursement/DS2/Page_PERKESO/DS2 logout'))

WebUI.closeBrowser()

