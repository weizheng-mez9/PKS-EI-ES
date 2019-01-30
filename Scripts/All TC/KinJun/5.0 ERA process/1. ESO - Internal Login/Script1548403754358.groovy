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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Internal_Login)

WebUI.callTestCase(findTestCase('All TC/KinJun/While Loop/Internal Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/input_Terlupa Kata Laluan_j_us (2) (1) (1) (1) (1) (1) (4) (1) (1)'), 
    GlobalVariable.InternalEmail)

WebUI.setEncryptedText(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/input_Terlupa Kata Laluan_j_pa (2) (1) (1) (1) (1) (1) (4) (1) (1)'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/input_Terlupa Kata Laluan_logi (2) (1) (1) (1) (1) (1) (4) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/a_PENYENARAIAN ORANG BERINSURA (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/span_--Sila Pilih-- (7) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/li_MyKAD (1)'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/input_MyKAD_searchValue (1)'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/button_Cari_1 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/a_ZAHIRAH BINTI ZAKARIA'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/h1_ZAHIRAH BINTI ZAKARIA'))

WebUI.callTestCase(findTestCase('All TC/KinJun/5.0 ERA process/2. ESO - Fill UJP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/a_hazah.mahmadperkeso.gov.my (4) (1) (1)'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('KinJun/5.0 ERA process/1. ESO - Internal Login/Page_PERKESO/a_Log Out (5) (1) (1)'))

