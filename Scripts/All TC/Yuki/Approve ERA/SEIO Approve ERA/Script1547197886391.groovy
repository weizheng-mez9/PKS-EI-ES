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

WebUI.callTestCase(findTestCase('All TC/Yuki/Approve ERA/SEIO Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/a_PETI MASUK TUGAS'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/Tuntuan'))

WebUI.click(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/Expand Search Field'))

WebUI.callTestCase(findTestCase('All TC/Yuki/Common/Getter Approval ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/Approval ID'), GlobalVariable.ApprovalID)

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/Search Button'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Yuki/Approve ERA/While Loop 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Yuki/Approve ERA/While Loop 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/Kelulusan Pembayaran'), 'test')

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/SEIO Approve ERA/Hantar Button'))

