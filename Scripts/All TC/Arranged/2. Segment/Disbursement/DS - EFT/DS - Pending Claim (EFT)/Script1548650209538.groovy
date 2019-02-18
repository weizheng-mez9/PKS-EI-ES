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

WebUI.delay(2)

WebUI.setText(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS input username'), 'hq1ds@perkeso.gov.my')

WebUI.setEncryptedText(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS input password'), 'CQqwFZlbeC8=')

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS click login button'))

WebUI.delay(2)

GlobalVariable.EiEsCaseID = WebUI.getText(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/Get Case ID'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Arranged/3. Unit/EI/Disbursement Common/SetterCaseID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS case check box'))

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS accept case button'))

WebUI.delay(2)

WebUI.setText(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS input value date'), '01/01/2019')

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/DS Accept Value Date Button'))

WebUI.delay(3)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/Pre logout'))

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Pending Claim (EFT)/Page_PERKESO/Log out button'))

WebUI.closeBrowser()

