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

WebUI.delay(3)

WebUI.setText(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/1.username'), 'faizal.hamid@perkeso.gov.my')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/2.password'), 'CQqwFZlbeC8=')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/3.login'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/4. Laporan Kematian Tab'))

WebUI.delay(3)

WebUI.setText(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/5. IP_IC'), '950000140002')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/6.Death_Semak_Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/7. DateOfDeath'), '17/06/2019')

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/8. Dependent_Name'), 'qwertyuiop')

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/9. Dependent_IC'), '111111223333')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/10. Upload_Document'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/11.--Sila Pilih--_singleFile'), GlobalVariable.TextFilePathCommon+ "\\UploadDoc.txt")

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/12.button_Tambah Dokumen'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/OTC_Death Report/Page_PERKESO/13.button_Hantar'))

WebUI.delay(2)

