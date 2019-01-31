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

WebUI.click(findTestObject('Yuki/Approval ERA/Search People/PENYENARAIAN ORANG BERINSURANS'))

WebUI.click(findTestObject('Yuki/Approval ERA/Search People/Kategori Carian'))

WebUI.click(findTestObject('Yuki/Approval ERA/Search People/Kategori Carian - MyKAD'))

WebUI.callTestCase(findTestCase('All TC/Unarranged/Yuki/Common/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Yuki/Approval ERA/Search People/ID'), GlobalVariable.IC)

WebUI.click(findTestObject('Yuki/Approval ERA/Search People/Search Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/Claim Process/Semak'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Yuki/Approval ERA/Claim Process/ERA'), 'ERA')

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/Claim Process/Semak Claim'))

WebUI.delay(1)

GlobalVariable.ApprovalID = WebUI.getAttribute(findTestObject('Yuki/Approval ERA/Claim Process/Approval ID'), 'value')

WebUI.callTestCase(findTestCase('All TC/Unarranged/Yuki/Common/Setter Approval ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Yuki/Approval ERA/Claim Process/Recommendation'), 'P', false)

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/Claim Process/Hantar Button'))

