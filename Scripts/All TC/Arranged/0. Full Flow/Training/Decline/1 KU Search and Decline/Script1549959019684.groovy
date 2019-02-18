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

WebUI.callTestCase(findTestCase('All TC/Arranged/3. Unit/ES/KU Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rizky/KU Search and Approve/Tindakan'))

WebUI.click(findTestObject('Rizky/KU Search and Approve/Tindakan-Kemaskini'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Rizky/KU Search and Approve/Jenis Kelulusan'))

not_run: WebUI.click(findTestObject('Rizky/KU Search and Approve/Jenis Kelulusan-Lulus'))

not_run: WebUI.click(findTestObject('Rizky/KU Search and Decline/Jenis Kelulusan-Lain-lain'))

not_run: WebUI.setText(findTestObject('Rizky/KU Search and Approve/Catatan Ketua Unit Vokasional'), 'abcd')

WebUI.click(findTestObject('Rizky/KU Search and Approve/Kes Baru'))

WebUI.click(findTestObject('Rizky/KU Search and Approve/Kes Baru-Sedang Berkursus'))

WebUI.click(findTestObject('Rizky/KU Search and Approve/Tarikh Mula'))

WebUI.click(findTestObject('Rizky/KU Search and Approve/Tarikh Mula-18'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Rizky/KU Search and Approve/Tarikh Mula-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Rizky/KU Search and Approve/Tarikh Tamat'))

WebUI.click(findTestObject('Rizky/KU Search and Approve/Tarikh Tamat-19'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Rizky/KU Search and Approve/Tarikh Tamat-Done'))

WebUI.verifyElementClickable(findTestObject('Rizky/KU Search and Approve/Hantar'))

