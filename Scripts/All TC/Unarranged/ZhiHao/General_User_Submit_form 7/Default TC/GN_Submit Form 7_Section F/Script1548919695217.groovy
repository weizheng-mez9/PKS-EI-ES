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

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section F/Page_PERKESO/input_Tidak_F1'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section F/Page_PERKESO/span_F2'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section F/Page_PERKESO/select_ALLIANCE BANK BERHAD_F2'))

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section F/Page_PERKESO/input_Nombor akaun bank_F3'))

WebUI.setText(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section F/Page_PERKESO/input_Nombor akaun bank_F3'), 
    '556677')

WebUI.click(findTestObject('ZhiHao/General_User_Submit_form 7/GN_Submit Form 7_Section F/Page_PERKESO/button_Halaman Seterus'))

WebUI.delay(3)

