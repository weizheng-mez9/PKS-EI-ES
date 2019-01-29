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

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A4. EmployeeDob'), '10/01/2019')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A5. Bangsa'))

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A5. Bumiputera Sabah'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A6. Jantina'))

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A6. Lelaki'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A7. Kewarganegaraan'))

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A7. Malaysia'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A8. Status Perkahwinan'))

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A8. Bujang'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A9. Address1'), 'qwertyuiop')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A10. Negeri'))

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A10. JOHOR'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A11. --Sila Pilih--'))

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A11. Done_select2-search__fie (1)'), 
    'jo')

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A11. concat(id(  select2-city'), 
    'jo')

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A11. JOHOR BAHRU'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A12. --Sila Isikan--'))

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A11. Done_select2-search__fie'), 
    '84')

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A12. 84000'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A13. mobileContact1'), '1234567890')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section A/Page_PERKESO/A14. Halaman Seterusnya'))

WebUI.delay(2)

