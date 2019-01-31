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

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/D1. NO_otherActiveEmploye'))

WebUI.delay(4)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/D2. Halaman Seterusnya'))

WebUI.delay(5)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E1. Input__totalExpYear'), 
    '1')

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E1. Tahun_totalExpMonth'), 
    '1')

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E2. Edu-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E2. PMRPT3'))

WebUI.delay(3)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E3. Job-Choice'))

WebUI.delay(2)

WebUI.setText(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E3. Done_select2-search__fie'), 
    're')

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E3. Arkitek Reka Bentuk'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E4. Job_Location'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E4. JOHOR'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E7. NO_disability'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E8. NO_disabilityApplyInd'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E9. YES_ReEmployment'))

WebUI.delay(2)

WebUI.click(findTestObject('KeatMun/Form 7_default/OTC_Submit Form 7_Section D-E/Page_PERKESO/E10. Halaman Seterusnya'))

WebUI.delay(3)

