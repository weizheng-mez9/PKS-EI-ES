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

not_run: WebUI.callTestCase(findTestCase('All TC/KinJun/5.0 ERA process/1. ESO - Internal Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.acceptAlert()

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/input__age_1 (1)'), '21')

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_21 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_Buddha_1 (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/input__email (1)'), 'abcjhk@yopmail.com')

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_2 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_2 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_1 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_RM3001-RM 4000 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_4 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_Tidak (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_5 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_Bekerja (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_10 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_2_5 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_11 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_3 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_13 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_4 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_14 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_3_1 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/input_Saya telah membaca dan m (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_15 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_Pencarian Pekerjaan (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/textarea__ecpDetails (1)'), 
    'abc')

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_16 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_2_6 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_17 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_4_1 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/button_Tambah (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_15 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_Permohonan Pekerjaan (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/textarea__ecpDetails (1)'), 
    'abc')

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_16 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_2_6 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_17 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_4_1 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/button_Tambah (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/input__obIpContactDate (1)'), 
    '1/1/2019')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/button_Done (5) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/span_--Sila Pilih--_19 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/li_OB Telah Kembali Bekerja (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/textarea_Catatan Pegawai Perkh (1)'), 
    'return')

WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/button_Hantar_1 (1)'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/KinJun/5.0 ERA process/3. ESO - Fill ERA Form'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/a_hazah.mahmadperkeso.gov.my (4) (1) (1) (1) (1)'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/a_Log Out (5) (1) (1) (1) (1)'))

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/input_D. Pengisytiharan Orang (1)'))

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/2. ESO - Fill UJP/Page_PERKESO/button_Hantar_2'))

