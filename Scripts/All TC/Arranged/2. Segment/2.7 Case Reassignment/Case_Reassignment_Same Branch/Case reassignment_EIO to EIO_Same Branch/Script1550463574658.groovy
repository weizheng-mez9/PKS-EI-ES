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

WebUI.setText(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/input_username'), 
    'jhseio4@perkeso.gov.my')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/input_password'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_login_button'))

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_SENARAI KES'))

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_Carian Kes'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.1 Getter/Getter Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/input_case id'), 
    GlobalVariable.CaseID)

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.1 Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/input_No Kad Pengenalan'), 
    GlobalVariable.IC)

WebUI.delay(3)

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_button_Cari'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_button_Tindakan'))

WebUI.delay(2)

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_Menugas Semula'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.1 Getter/Getter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

def StrA = GlobalVariable.UserName

def StrB = WebUI.getText(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/Get Text_Nama Pegawai'))

System.out.println(StrB)

if (!(StrA == StrB)) {
    WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/input_Jumlah Kes_staffRadio_1'))
} else {
    WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/input_EIO_staffRadio_2'))
}

WebUI.setText(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/insert_catatan'), 
    'ok go')

WebUI.click(findTestObject('ZhiHao/Case_Reassignment_Same Branch/Case reassignment_EIO to EIO_Same Branch/Page_PERKESO/click_button_Tugaskan'))

WebUI.delay(3)

