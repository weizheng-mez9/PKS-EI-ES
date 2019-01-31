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

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input__employer address_C4'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input__employer address_C4'), 
    '11, hahaha')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/span_C5'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/select_JOHOR_C5'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/span_C6'))

WebUI.delay(2)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input_Done_select2-search__fie_C6_C7'), 
    'jo')

WebUI.delay(2)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input_Search Bandar_C6'), 
    'jo')

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/select_JOHOR BAHRU_C6'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/span_C7'))

WebUI.delay(2)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input_Done_select2-search__fie_C6_C7'), 
    '80')

WebUI.delay(2)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input_Search Postcode_C7'), 
    '80')

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/select_80000_C7'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input_Tidak_C8'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input__employerInfo_C9'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input__employerInfo_C9'), 
    'riki')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input__employerInfo_contact_C10'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/input__employerInfo_contact_C10(2)'), 
    '01988838746')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/button_Halaman Seterus'))

WebUI.delay(5)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section C-D/Page_PERKESO/button_Halaman Seterus (section D)'))

WebUI.delay(5)

