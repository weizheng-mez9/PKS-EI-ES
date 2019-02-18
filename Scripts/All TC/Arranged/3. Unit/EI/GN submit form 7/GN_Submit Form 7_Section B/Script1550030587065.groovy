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

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/span_B1'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Search Jawatan_B1 (1)'), 
    'of')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Search Jawatan_B1 (2)'), 
    'of')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/select_Ahli Geofizik Kanan_B1'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input__lastEmploymentStartDate_B2'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input__lastEmploymentStartDate_B2'), 
    '1/1/2010')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/button_Done_B2'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/span_B4'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/select_Tetap_B4'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(2)'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(3)'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(4)'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(5)'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(6)'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(7)'), 
    '3000')

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Gaji (RM)_B5(8)'), 
    '3000')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/span_B6'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/select_Diberhentikan tanpa sebab_B6'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input__averageWorkingHour_B7'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input__averageWorkingHour_B7'), '33')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Tidak_B9'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/input_Tidak_B10'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section B/Page_PERKESO/button_Halaman Seterus'))

WebUI.delay(3)

