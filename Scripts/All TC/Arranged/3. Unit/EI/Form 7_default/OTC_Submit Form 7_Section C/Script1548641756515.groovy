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

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C4. EmployerInfo'), 'qwertyuiop')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C5. Negeri'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C5. JOHOR'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C6. City'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C6. Done_select2-search__fie'), 
    'jo')

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C6. Concat(id(  select2-city'), 
    'jo')

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C6. JOHOR BAHRU'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C7. --Sila Isikan--'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C7. Done_select2-search__fie'), 
    '84')

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C7. Concat(id(  select2-post'), 
    '84')

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C7. 84000'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C8. Tidak_employerInfo.emplo'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C9. EmployerName'), 'qwertyuiop')

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C10. EmployerIC'), '1234567890')

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section C/Page_PERKESO/C11. Halaman Seterusnya'))

WebUI.delay(3)

