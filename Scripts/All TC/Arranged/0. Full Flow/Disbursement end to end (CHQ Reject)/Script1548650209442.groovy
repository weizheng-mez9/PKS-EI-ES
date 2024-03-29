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

WebUI.callTestCase(findTestCase('All TC/Arranged/0. Full Flow/Approve Claim - RIA (CHQ)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DS - CHQ/DS - Pending Claim (CHQ)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DSSU checking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DS1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DSSU checking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DS2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DSSU checking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DS3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All TC/Arranged/2. Segment/2.6 Disbursement/DS - CHQ/DS - Reject (CHQ Approved Claim)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

