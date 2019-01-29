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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

//need Looper here
WebUI.callTestCase(findTestCase('KinJun/Common Activity - Getter/Getter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('KinJun/While Loop/Internal Email Finder'), [:], FailureHandling.STOP_ON_FAILURE)

def tempCaseID

def targetCaseID = GlobalVariable.InternalEmail

// = GlobalVariable.IDkes
TestObject caseNum = new TestObject()

boolVerify = true

counterA = 1

counterB = 1

counterF = 1

while (boolVerify.equals(true)) {
    strXpathA = (('(id("staffListTable")/tbody[1]/tr[@class="odd"]/td[1]/input[1])[' + counterA) + ']')

    strXpathB = (('(id("staffListTable")/tbody[1]/tr[@class="even"]/td[1]/input[1])[' + counterB) + ']')

    modVal = (counterF % 2)

    if (modVal.equals(1)) {
        caseNum.addProperty('xpath', ConditionType.EQUALS, strXpathA, true)

        counterA++
    }
    
    if (modVal.equals(0)) {
        caseNum.addProperty('xpath', ConditionType.EQUALS, strXpathB, true)

        counterB++
    }
    
    boolVerify = WebUI.verifyElementPresent(caseNum, 30, FailureHandling.OPTIONAL)

    if (boolVerify.equals(true)) {
        tempCaseID = WebUI.getText(caseNum)

        if (!(tempCaseID.equals(targetCaseID))) {
            WebUI.click(caseNum)

            counterF = 0

            break
        }
    }
    
    counterF++
}

