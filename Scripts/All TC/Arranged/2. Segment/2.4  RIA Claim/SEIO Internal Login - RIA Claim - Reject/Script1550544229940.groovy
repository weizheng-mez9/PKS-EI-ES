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

WebUI.setText(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Input username'), 
    GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Input password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Btn login'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Click workbasket'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Click Claim'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Click SearchClaim'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Common Activity - Getter/Getter Approval ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Input approvalID'), 
    GlobalVariable.ApprovalID)

WebUI.callTestCase(findTestCase('Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Input IC'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Btn Search'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Click approvalID'))

WebUI.callTestCase(findTestCase('While Loop/While Loop - Claim Click'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Input payment remarks'), 
    'ok')

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Btn reject payment'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Click username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/4.0 RIA Claim/SEIO Internal Login - RIA Claim - Reject/Page_PERKESO/Log out'))

