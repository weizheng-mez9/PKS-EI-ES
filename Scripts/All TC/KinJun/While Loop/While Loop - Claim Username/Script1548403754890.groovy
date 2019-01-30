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
def tempCaseID

def tempCaseOwner


TestObject caseNum = new TestObject()

boolVerify = true



counterF = 1

while (boolVerify.equals(true)) {
strXpathA = ('(id("mytable")/tbody[1]/tr['+counterF+']/td[4])')

caseNum.addProperty('xpath', ConditionType.EQUALS, strXpathA, true)


boolVerify = WebUI.verifyElementPresent(caseNum, 20, FailureHandling.OPTIONAL)

if (boolVerify.equals(true)) {
    tempCaseID = WebUI.getText(caseNum)

    //tempCaseOwner = WebUI.getText(caseOwner)
    GlobalVariable.UserName = tempCaseID

    System.out.println(tempCaseID) //System.out.println(tempCaseOwner)
}

counterF++
}
WebUI.callTestCase(findTestCase('All TC/KinJun/Common Activity - Setter/Setter UserName'), [:], FailureHandling.STOP_ON_FAILURE)

