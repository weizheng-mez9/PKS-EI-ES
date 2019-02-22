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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.General_Login)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/button_Setuju'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/IC List Checker'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/input_No. Kad Pengenalan'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/button_Semak'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/span_Nama Majikan'))

WebUI.delay(3)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/input_Nama Majikan'), 'pet')

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/select_PETRONAS'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/input_Tarikh kehilangan pekerjaan'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/select_loe_date'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/button_Mohon'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/select_pejabat_perkeso'))

WebUI.selectOptionByValue(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/select_pejabat_perkeso'), 
    '22', true)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Application_Reg/Page_PERKESO/button_Halaman Seterus'))

WebUI.delay(5)

