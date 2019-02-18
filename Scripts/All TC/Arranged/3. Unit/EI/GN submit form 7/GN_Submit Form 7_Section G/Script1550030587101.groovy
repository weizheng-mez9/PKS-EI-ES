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

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/input_Name Waris_G2'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/input_Name Waris_G2'), 
    'qwertyuiop')

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/click_Kad Pengenalan_G2'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/input_Kad Pengenalan_G2'), 
    '111111223333')

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/click_Tarikh Kelahiran_G2'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/input_Tarikh Kelahiran_G2'), 
    '1/1/1977')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/click_button_Done'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/span_Isteri_G2'))

WebUI.delay(1)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/select_Adik-beradik_G2'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section G/Page_PERKESO/button_Halaman Seterus'))

WebUI.delay(5)

