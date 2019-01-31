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

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/Tick_H1'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/Tick_H4'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/Tick_H5'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_upload button_I'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_choose file button_I'), 
    'C:\\Users\\LENOVO\\Desktop\\22.1.18.txt')

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_button_Tambah Dokumen_I'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_upload button_I (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/input_Ya_optradio_I'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_choose file button_I'), 
    'C:\\Users\\LENOVO\\Desktop\\22.1.18.txt')

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_button_Tambah Dokumen_I'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_upload button_I (3)'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/input_Ya_optradio_I'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_choose file button_I'), 
    'C:\\Users\\LENOVO\\Desktop\\22.1.18.txt')

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_button_Tambah Dokumen_I'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_upload button_I (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/Page_PERKESO/input_Tidak_optradio'))

WebUI.delay(3)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/input_Maklumat Account'), 
    'test')

WebUI.delay(3)

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/input_Kenyataan Pemohon'), 
    'testing')

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_button_Hantar'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/click_button_Hantar (1)'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.IC = WebUI.getText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/strong_821210105280 (1)'))

WebUI.callTestCase(findTestCase('ZhiHao/common/Setter_GN_IC'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.password = WebUI.getText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/strong_k76N7BsG (1)'))

WebUI.callTestCase(findTestCase('ZhiHao/common/Setter_GN_PW'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.CaseID = WebUI.getText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section H/Page_PERKESO/strong_SIPE1119060000038 (1)'))

WebUI.callTestCase(findTestCase('ZhiHao/common/Setter_CASE_ID'), [:], FailureHandling.STOP_ON_FAILURE)

