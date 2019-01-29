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

WebUI.navigateToUrl(GlobalVariable.General_Login)

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Setuju (3) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_No. Kad Pengenalan_ipNew (3) (1) (2) (3) (1)'), 
    '770923145832')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Semak (3) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Nama Majikan_loeEmployer (3) (1) (1) (1) (1) (1) (1) (1)'), 
    'gre')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_GREAT EASTERN GENERAL INSUR (3) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_(Tarikh kehilangan peker (2) (1) (1) (1) (1) (1) (1) (1)'), 
    '13/1/2019')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Done (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Mohon (3) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/select_--Sila Pilih--Pejabat P (2) (1) (1) (1) (1) (1) (1) (1)'), 
    '22', true)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (19) (2) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__employeeDobStr (1) (1) (1) (1) (1) (1) (1) (1)'), 
    '1/9/2019')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Done (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_-- (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-race (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'cin')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Cina (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_1 (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-gend (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'le')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Lelaki (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_-- (2) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Malaysia (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_1 (2) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Bujang (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__address1 (1) (1) (1) (1) (1) (1) (1)'), 
    'qwerty')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_2 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_JOHOR (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--Sila Pilih-- (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-city (1) (1) (1) (1) (1) (1) (1)'), 
    'mua')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_MUAR (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--Sila Isikan-- (1) (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-post (1) (1) (1) (1) (1) (1) (1)'), 
    '841')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_84150 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__mobileContact1 (1) (1) (1) (1) (1) (1) (1)'), 
    '123456789')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (29) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_3 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-posi (1) (1) (1) (1) (1) (1) (1)'), 
    'da')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Akauntan Dana (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__lastEmploymentStartDtSt (1) (1) (1) (1) (1) (1) (1)'), 
    '1/1/2018')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Done (2) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_4 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Tetap (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Gaji (RM)_salaryInfoList (1) (1) (1) (1) (1) (1) (1)'), 
    '3950')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Gaji (RM)_salaryInfoList_5 (1) (1) (1) (1) (1) (1) (1)'), 
    '3950')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Gaji (RM)_salaryInfoList_9 (1) (1) (1) (1) (1) (1) (1)'), 
    '3950')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Gaji (RM)_salaryInfoList_14 (1) (1) (1) (1) (1) (1) (1)'), 
    '3950')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Gaji (RM)_salaryInfoList_19 (1) (1) (1) (1) (1) (1) (1)'), 
    '3950')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Gaji (RM)_salaryInfoList_23 (1) (1) (1) (1) (1) (1) (1)'), 
    '3950')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_5 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Bersara (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__averageWorkingHour (1) (1) (1) (1) (1) (1) (1)'), 
    '16')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tidak_compensationInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tidak_fileCaseInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tidak_unregisterCaseInd (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (39) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__employerInfo.employerAd (1) (1) (1) (1) (1) (1) (1)'), 
    'setapak')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_6 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_JOHOR_1 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--Sila Pilih-- (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-city (1) (1) (1) (1) (1) (1) (1)'), 
    'mua')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_MUAR_1 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--Sila Isikan-- (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-post (1) (1) (1) (1) (1) (1) (1)'), 
    '841')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_84150_1 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tidak_employerInfo.emplo (1) (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__employerInfo.employerCo (1) (1) (1) (1) (1) (1) (1)'), 
    'ali')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__employerInfo.employerCo_10 (1) (1) (1) (1) (1) (1) (1)'), 
    '987654321')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (49) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (59) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__totalExpYear (1) (1) (1) (1) (1) (1) (1)'), 
    '1')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tahun_totalExpMonth (1) (1) (1) (1) (1) (1) (1)'), 
    '2')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_7 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_TIADA PENDIDIKAN FORMAL (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_10 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_concat(id(  select2-pref (1) (1) (1) (1) (1) (1) (1)'), 
    'da')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_Akauntan Dana (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_9 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_JOHOR_2 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tidak_disabilityInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Tidak_disabilityApplyInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (69) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/span_--_12 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/li_AMBANK BERHAD (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_F3. Nombor akaun bank (A (1) (1) (1) (1) (1) (1) (1)'), 
    '987656789012')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (79) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(4)

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Hubungan dengan Orang Be (1) (1) (1) (1) (1) (1) (1)'), 
    'hannn')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Hubungan dengan Orang Be_11 (1) (1) (1) (1) (1) (1) (1)'), 
    '98889802323')

WebUI.setText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Hubungan dengan Orang Be_22 (1) (1) (1) (1) (1) (1) (1)'), 
    '1/9/1999')

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Done (2) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Halaman Seterus (89) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__declAckInfoInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__declAckRepayInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input__declAckLegalInd (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/i_Mandatori_fa fa-upload (1) (1) (1) (1) (1) (1) (1)'))

WebUI.sendKeys(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_--Sila Pilih--_singleFil (1) (1) (1) (1) (1) (1) (1)'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Tambah Dokumen (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/i_Mandatori_fa fa-upload_4 (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/label_Ya (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_--Sila Pilih--_singleFil (2) (1) (1) (1) (1) (1)'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/i_Tambah Dokumen_icon-upload (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/i_Mandatori_fa fa-upload_5 (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Ya_optradio (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_--Sila Pilih--_singleFil (2) (1) (1) (1) (1) (1)'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Tambah Dokumen (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/i_Mandatori_fa fa-upload_6 (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_Ya_optradio (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/input_--Sila Pilih--_singleFil (2) (1) (1) (1) (1) (1)'), 
    'C:\\Users\\LENOVO\\Desktop\\1.png')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Tambah Dokumen (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/button_Hantar (2) (1) (1) (1) (1) (1)'))

WebUI.delay(5)

GlobalVariable.IC = WebUI.getText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/No KP (1) (1) (1) (1)'))

WebUI.callTestCase(findTestCase('KinJun/Common Activity - Setter/Setter IC'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.Password = WebUI.getText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/strong_39GMeVUN'))

WebUI.callTestCase(findTestCase('KinJun/Common Activity - Setter/Setter Password'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.CaseID = WebUI.getText(findTestObject('KinJun/1.0 Submit Form 7/1.0 - Fillup Form 7 - EFT/Page_PERKESO/strong_SIPE1119060000034'))

WebUI.callTestCase(findTestCase('KinJun/Common Activity - Setter/Setter Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('KinJun/2.0 Check Status/Check Status - Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

