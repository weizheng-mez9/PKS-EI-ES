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

WebUI.mouseOver(findTestObject('Rizky/ESO Apply/a_PERMOHONAN'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/ESO Apply/a_Latihan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Rizky/ESO Apply/Cari dengan MyKad'), '950000140001')

WebUI.click(findTestObject('Rizky/ESO Apply/Cari'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/ESO Apply/ID Kes'))

WebUI.click(findTestObject('Rizky/ESO Apply/ID KES-SIPE1119060000003'))

WebUI.delay(1)

WebUI.setText(findTestObject('Rizky/ESO Apply/Jawatan Terakhir'), '1')

WebUI.setText(findTestObject('Rizky/ESO Apply/Gaji Terakhir'), '1')

WebUI.click(findTestObject('Rizky/ESO Apply/Ujian Psikometrik -'))

WebUI.click(findTestObject('Rizky/ESO Apply/Ujian Psikometrik - Realistic'))

WebUI.click(findTestObject('Rizky/ESO Apply/Institut'))

WebUI.click(findTestObject('Rizky/ESO Apply/Institut-NIOSH HQ (BANGI)'))

WebUI.delay(3)

WebUI.click(findTestObject('Rizky/ESO Apply/Nama Kursus'))

WebUI.click(findTestObject('Rizky/ESO Apply/Nama Kursus-Safety and Health Officer ('))

WebUI.click(findTestObject('Rizky/ESO Apply/Hantar'))

