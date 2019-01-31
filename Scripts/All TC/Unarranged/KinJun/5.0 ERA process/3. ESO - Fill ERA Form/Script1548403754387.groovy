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

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/button_Semak Kelayakan'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__dutyDateStr'), 
    '1/1/2019')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/button_Done'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__compName'), 'shell')

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Pilih--_22'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_ACCOMMODATION'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_Akauntan Dana Kanan'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input_Done_select2-search__fie'), 
    'da')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_Akauntan Dana'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__jobSalary'), 
    '3590')

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Pilih--_23'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_Eksekutif Kanan'))

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Pilih--_24'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_Kewangan- Kewangan korperat'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Pilih--_25'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_Company Secretary'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__empAddress'), 
    'setapak')

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Pilih--_26'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_JOHOR'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Pilih--_27'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input_concat(id(  select2-city'), 
    'mua')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_MUAR'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/span_--Sila Isikan--'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input_concat(id(  select2-post'), 
    '841')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/li_84150'))

WebUI.delay(3)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__officerName'), 
    'ali')

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__officerContact'), 
    '999999999')

WebUI.setText(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input__officerEmail'), 
    'ali999999@yopmail.com')

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/input_D. Pengisytiharan Orang (1)'))

WebUI.click(findTestObject('KinJun/5.0 ERA process/3. ESO - Fill ERA Form/Page_PERKESO/button_Hantar_1'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/5.0 ERA process/4. ESO - Approve ERA'), [:], FailureHandling.STOP_ON_FAILURE)

