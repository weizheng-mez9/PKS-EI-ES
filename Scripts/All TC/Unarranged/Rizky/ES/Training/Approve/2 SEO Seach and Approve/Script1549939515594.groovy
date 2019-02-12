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

WebUI.callTestCase(findTestCase('All TC/Unarranged/Rizky/Login/SEO Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rizky/SEO Search and Approve/LATIHAN'))

WebUI.click(findTestObject('Rizky/SEO Search and Approve/Tindakan'))

WebUI.click(findTestObject('Rizky/SEO Search and Approve/Kemaskini'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/SEO Search and Approve/Jenis Pengesyoran'))

WebUI.click(findTestObject('Rizky/SEO Search and Approve/Jenis Pengesyoran-Memerlukan Latihan'))

WebUI.setText(findTestObject('Rizky/SEO Search and Approve/Catatan Negeri Pegawai Pekerjaan Kanan  Catatan Pegawai Negeri Pekerjaan Kanan'), 
    'abc')

WebUI.rightClick(findTestObject('Rizky/SEO Search and Approve/Hantar'))

