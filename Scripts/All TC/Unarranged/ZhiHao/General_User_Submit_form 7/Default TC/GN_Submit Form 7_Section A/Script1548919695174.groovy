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

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/input__employeeDob_A4'), '11/12/1987')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/button_Done_A4'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A5'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_Bumiputera Sabah_A5'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A6'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_Lelaki_A6'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A7'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_Malaysia_A7'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A8'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_Berkahwin_A8'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/input__address1_A9'), 'NO1, taman jaya')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A10'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_JOHOR_A10'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A11'))

WebUI.delay(3)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/input_Search Bandar_A11 (1)'), 
    'jo')

WebUI.delay(3)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/input_Search Bandar_A11 (2)'), 
    'jo')

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_JOHOR BAHRU_A11'))

WebUI.delay(5)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/span_A12'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/input_Search Postcode_A12'), 
    '80')

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/select_80000_A12'))

WebUI.delay(3)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/input__mobileContact1_A13'), '0122837465')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section A/Page_PERKESO/button_Halaman Seterus'))

WebUI.delay(5)

