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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Internal_Login)

WebUI.delay(2)

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/mkcm email'), GlobalVariable.MK_CM)

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/mkcm pw'), GlobalVariable.Internal_PW)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/Login Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/Button PENDAFTARAN KES'))

WebUI.callTestCase(findTestCase('All TC/Arranged/1. Common/Name and IC Generator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/insert mobile number'), '99999999999')

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/Submit Button'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/Kategori carian - MyKad'), '2', true)

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/Insert IC'), GlobalVariable.ICRand)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/Search Button'))

WebUI.focus(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_CM/To verify record existed'))

