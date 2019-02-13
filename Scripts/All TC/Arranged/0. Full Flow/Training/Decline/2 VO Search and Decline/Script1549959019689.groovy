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

WebUI.callTestCase(findTestCase('All TC/Arranged/3. Default/ES/VO Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/VO Search and Aprove/Tindakan'))

WebUI.click(findTestObject('Rizky/VO Search and Aprove/Tindakan-Kemaskini'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/VO Search and Aprove/Jenis Keputusan'))

not_run: WebUI.click(findTestObject('Rizky/VO Search and Aprove/Jenis Keputusan-Maklumat Lengkap'))

WebUI.click(findTestObject('Rizky/VO Search and Decline/Jenis Keputusan-Maklumat Tidak Lengkap  Han'))

WebUI.setText(findTestObject('Rizky/VO Search and Aprove/Catatan Pegawai Vokasional (Ibu Pejabat)'), 'abc')

WebUI.delay(2)

WebUI.rightClick(findTestObject('Rizky/VO Search and Aprove/Hantar'))

