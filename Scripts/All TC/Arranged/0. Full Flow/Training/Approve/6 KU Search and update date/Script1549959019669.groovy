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

WebUI.callTestCase(findTestCase('All TC/Arranged/3. Default/ES/KU Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rizky/KU Search and update date/Tindakan'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Tindakan-Kemaskini'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/KU Search and update date/Tarikh Mula'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Tarikh Mula-18'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Tarikh Mula-Done'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Tarikh Tamat'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Tarikh Tamat-19'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Tarikh Tamat-Done'))

WebUI.click(findTestObject('Rizky/KU Search and update date/Hantar'))

