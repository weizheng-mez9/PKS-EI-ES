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

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input LoginID'), 
    'nadia.harun@perkeso.gov.my')

WebUI.setEncryptedText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input Login Pass'), 
    'CQqwFZlbeC8=')

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Login'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Laporan Kematian'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.1 Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input IP IC'), 
    GlobalVariable.IC)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Check IC'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input DOD'), 
    '25/6/2019')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn DOB'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input DependentName'), 
    'qwertyuiop')

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input DependentIC'), 
    '111111223333')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Span submission'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input Submission'), 
    'pe')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/li_Penyerahan Penuh (2) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Upload Certificate'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input doc'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Certificate'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Upload IC'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input doc'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn IC'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Upload Relationship'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input doc'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Relationship'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(3)

not_run: WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Upload bank'))

not_run: WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input doc'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Bank'))

not_run: WebUI.delay(3)

not_run: WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Next Page'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input Address'), 
    'setapak')

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Span State'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/DD State'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Span City'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input City'), 
    'mua')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/DD City'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Span Postcode'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input Postcode'), 
    '841')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/DD Postcode'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input DependentTel'), 
    '987654321')

WebUI.setText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Input DependentEmail'), 
    'abcabcabc@yopmail.com')

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Btn Submit'))

WebUI.delay(3)

GlobalVariable.EOT = WebUI.getText(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/EOT ID'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.2 Setter/Setter EOT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Click Username'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.1 Submit Death Report/OTC - Submit Death Report (Full - Cheque)/Page_PERKESO/Log Out'))

WebUI.callTestCase(findTestCase('2.0 Check Status/Check Status - EOT ID'), [:], FailureHandling.STOP_ON_FAILURE)

