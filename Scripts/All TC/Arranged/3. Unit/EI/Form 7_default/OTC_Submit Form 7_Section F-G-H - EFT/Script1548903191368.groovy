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

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/F1. Tidak_bankrupt'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/F2. Bank Name'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/F2. AFFIN BANK BERHAD'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/F3. Nombor akaun bank'), 
    '1234567890')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/F4. Halaman Seterusnya'))

WebUI.delay(5)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/G2. Hubungan dengan OB-nama'), 
    'qwertyuiop')

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/G2. Hubungan dengan OB-ic.no'), 
    '111111223333')

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/G2. Hubungan dengan OB-DOB'), 
    '10/01/2019')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/G2. Span_Bapa'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/G2. Choose_Isteri'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/G3. Halaman Seterusnya'))

WebUI.delay(5)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/H1. declAckInfoInd'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/H2. declAckRepayInd'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/H3. declAckLegalInd'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i1. mandatory_document1'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i1.--Sila Pilih--_singleFil'), 
    GlobalVariable.TextFilePathCommon + '\\UploadDoc.txt')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i1.Add - Tambah Dokumen (1)'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i2. mandatory_document2'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i2. input_Ya_optradio'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i1.--Sila Pilih--_singleFil'), 
    GlobalVariable.TextFilePathCommon + '\\UploadDoc.txt')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i2. button_Tambah Dokumen'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i3. mandatory_document3'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i2. input_Ya_optradio'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i1.--Sila Pilih--_singleFil'), 
    GlobalVariable.TextFilePathCommon + '\\UploadDoc.txt')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i2. button_Tambah Dokumen'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i4. mandatory_document4'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i4. _Ya_optradio'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i1.--Sila Pilih--_singleFil'), 
    GlobalVariable.TextFilePathCommon + '\\UploadDoc.txt')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/i2. button_Tambah Dokumen'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/button_Hantar'))

WebUI.delay(3)

GlobalVariable.UserName = WebUI.getText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/strong_FAST2'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.2 Setter/Setter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.IC = WebUI.getText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/strong_950000140051'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.2 Setter/Setter IC'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.CaseID = WebUI.getText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/strong_SIPE1119070000004'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.2 Setter/Setter Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.Password = WebUI.getText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section F-G-H/Page_PERKESO/strong_OOPQe0i4'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/1.2 Setter/Setter Password'), [:], FailureHandling.STOP_ON_FAILURE)

