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

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/a_PENYENARAIAN ORANG BERINSURA (1) (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/span_--Sila Pilih-- (7) (1) (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/li_MyKAD (1) (2)'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/input_MyKAD_searchValue (1) (2)'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/button_Cari_1 (1) (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/a_Semak_5'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/a_Semak_3'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/a_Semak_2 (1)'))

WebUI.selectOptionByValue(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/select_--Sila Pilih--LulusTola (1)'), 
    'P', true)

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/textarea_Catatan_remarks (1)'), 
    'ok')

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/button_Hantar (9)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/a_hazah.mahmadperkeso.gov.my (4) (1) (1) (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/4. ESO - Approve ERA/Page_PERKESO/a_Log Out (5) (1) (1) (2)'))

WebUI.callTestCase(findTestCase('All TC/KinJun/5.0 ERA process/5. IP login - Agree ERA'), [:], FailureHandling.STOP_ON_FAILURE)

