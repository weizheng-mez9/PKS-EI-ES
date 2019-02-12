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

WebUI.callTestCase(findTestCase('All TC/Unarranged/Rizky/Login/IP Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rizky/IP Apply/Permohonan Latihan'))

WebUI.click(findTestObject('Rizky/IP Apply/Permohonan Latihan-Latihan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Rizky/IP Apply/Jawatan Terakhir'), 'a')

WebUI.setText(findTestObject('Rizky/IP Apply/Gaji Terakhir'), '1')

WebUI.setText(findTestObject('Rizky/IP Apply/Ujian Psikometrik'), 'a')

WebUI.click(findTestObject('Rizky/IP Apply/Institut'))

WebUI.click(findTestObject('Rizky/IP Apply/Institut-NIOSH HQ (BANGI)'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/IP Apply/Nama Kursus'))

WebUI.click(findTestObject('Rizky/IP Apply/Nama Kursus-Safety and Health Officer ('))

WebUI.click(findTestObject('Rizky/IP Apply/Hantar'))

