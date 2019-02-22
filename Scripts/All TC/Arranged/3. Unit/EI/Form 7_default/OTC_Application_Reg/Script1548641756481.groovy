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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Internal_Login)

WebUI.delay(3)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/1.username'), 'faizal.hamid@perkeso.gov.my')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/2.password'), 'CQqwFZlbeC8=')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/3.login button'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/4. Permohonan tab'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/5.button_Setuju'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/IC List Checker'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/6.No. Kad Pengenalan'), GlobalVariable.IC)

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/7.button_Semak'))

WebUI.delay(4)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/8. Nama Majikan Dropdown'))

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/8. LOE emp'), 'pet')

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/8. PETRONAS'))

WebUI.delay(2)

Date TodayDate = new Date()

//capture today's date
SimpleDateFormat CurrentDateNoFilter = new SimpleDateFormat()



//allow editing on date captured
CurrentDateNoFilter.applyPattern('dd/MM/yyyy')



//applying to show today's date
String CurrentDate = CurrentDateNoFilter.format(TodayDate)
System.out.println(CurrentDate)
date=CurrentDate

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/9.Tarikh kehilangan pkj'), date)

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/9. Date Picker Done Button '))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/10.button_Mohon'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/11.Tarikh Terima_stampedDtS'), '10/01/2019')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/11. Date Picker Done Button'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/11.button_TERUSKAN'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/12.--Sila Pilih--PejabatPKS'), 
    '22', true)

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Application_Reg/Page_PERKESO/13. Halaman Seterusnya'))

