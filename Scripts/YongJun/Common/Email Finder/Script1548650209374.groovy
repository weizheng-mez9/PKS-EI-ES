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

WebUI.callTestCase(findTestCase('YongJun/Common/GetterOwnerName'), [:], FailureHandling.STOP_ON_FAILURE)

def StrA = GlobalVariable.EiEsOwnerName

def StrB

def Counter = 1

while (!(StrB.equals(StrA)) && !(Counter > findTestData('DS Email-Name-Role').getRowNumbers())) {
    StrB = findTestData('DS Email-Name-Role').getValue(2, Counter)

    if (StrB.equals(StrA)) {
        StrEmail = findTestData('DS Email-Name-Role').getValue(1, Counter)

        GlobalVariable.EiEsEmail = StrEmail

        System.out.println(StrEmail)
    }
    
    Counter++
}

