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

WebUI.navigateToUrl(GlobalVariable.Public_Login)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/Common Activity - Getter/Getter IC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/input_Terlupa Kata Laluan_j_us'), 
    GlobalVariable.IC)

WebUI.callTestCase(findTestCase('All TC/Unarranged/KinJun/Common Activity - Getter/Getter Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/input_Terlupa Kata Laluan_j_pa'), 
    GlobalVariable.Password)

not_run: WebUI.setEncryptedText(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/input_Terlupa Kata Laluan_j_pa'), 
    'ijU90FugcKc6jzSwM39kxQ==')

WebUI.click(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/input_Terlupa Kata Laluan_logi'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/button_Setuju'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/a_881125566570'))

WebUI.delay(3)

WebUI.click(findTestObject('KinJun/5.0 ERA process/5. IP login - Agree ERA/Page_PERKESO/a_Log Out'))

