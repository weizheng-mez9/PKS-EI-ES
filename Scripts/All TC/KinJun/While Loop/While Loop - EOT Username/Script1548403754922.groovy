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

//def tempCaseOwner

// = GlobalVariable.IDkes
TestObject caseNum = new TestObject()

//TestObject caseOwner = new TestObject()

boolVerify = true

counterA = 1

counterB = 1

counterF = 1

while (boolVerify.equals(true)) {
    strXpathA = (('(id("dependentApplicationTable")/tbody[1]/tr[@class="odd"]/td[3])[' + counterA) + ']')
	

    strXpathB = (('(id("dependentApplicationTable")/tbody[1]/tr[@class="even"]/td[3])[' + counterB) + ']')

    //strXpathNameA = (('(id("suVoucherListTableId")/tbody[1]/tr[@class="odd"]/td[11])[' + counterA) + ']')
    //strXpathNameB = (('(id("suVoucherListTableId")/tbody[1]/tr[@class="even"]/td[11])[' + counterB) + ']')
    modVal = (counterF % 2)

    if (modVal.equals(1)) {
        caseNum.addProperty('xpath', ConditionType.EQUALS, strXpathA, true)

        //caseOwner.addProperty('xpath',ConditionType.EQUALS,strXpathNameA,true)
        counterA++
    }
    
    if (modVal.equals(0)) {
        caseNum.addProperty('xpath', ConditionType.EQUALS, strXpathB, true)

        //caseOwner.addProperty('xpath',ConditionType.EQUALS,strXpathNameB,true)
        counterB++
    }
    
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

