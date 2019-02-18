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

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/GN_Submit Form 7_End to End'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.8 OTC_Semakan/OTC_Semakan(By IC)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.3 JSA Application/EIO Internal Login - JSA Application - Approve'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.7 Case Reassignment/Case_Reassignment_Same Branch/Case reassigment_SEIO to SEIO_Same Branch'), 
    [:], FailureHandling.STOP_ON_FAILURE)

