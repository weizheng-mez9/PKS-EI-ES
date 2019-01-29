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

WebUI.setText(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS login username'), 
    'hq1ds@perkeso.gov.my')

WebUI.setEncryptedText(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS login password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS login button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS approved claim tab'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS select approved case checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS generate m2e button'))

WebUI.delay(45)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS select download m2e button'))

WebUI.delay(2)

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS pre logout'))

WebUI.click(findTestObject('YongJun/Disbursement/Disbursement - EFT/DS - Approved Claim (EFT)/Page_PERKESO/DS logout button'))

WebUI.closeBrowser()

