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

WebUI.callTestCase(findTestCase('Yuki/Common/Getter UserName'), [:], FailureHandling.CONTINUE_ON_FAILURE)

def StrA = GlobalVariable.UserName

def StrB

def Counter = 1

while (!(StrB.equals(StrA)) && !(Counter > findTestData('User-SEIO').getRowNumbers())) {
    StrB = findTestData('User-SEIO').getValue(2, Counter)

    if (StrB.equals(StrA)) {
        StrEmail = findTestData('User-SEIO').getValue(1, Counter)

        GlobalVariable.InternalEmail = StrEmail

        System.out.println(StrEmail)
    }
    
    Counter++
}

