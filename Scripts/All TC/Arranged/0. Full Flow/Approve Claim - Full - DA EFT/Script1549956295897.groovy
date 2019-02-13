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

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/OTC_Submit Form 7_End to End - Cheque'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.2 Check Status/Check Status - Case ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.31 RIA Application/EIO Internal Login - RIA Application - Approve'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.31 RIA Application/SEIO Internal Login - RIA Application - Approve'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.1 Submit Death Report/OTC - Submit Death Report (Full - EFT)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.41 DA Claim/SEIO Internal Login - DA Claim - Approve'), [:], 
    FailureHandling.STOP_ON_FAILURE)

