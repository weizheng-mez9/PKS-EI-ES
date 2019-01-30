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

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/mkeso email'), GlobalVariable.MK_ESO_3)

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/mkeso pw'), GlobalVariable.Internal_PW)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Login Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Button PENDAFTARAN KES'))

WebUI.callTestCase(findTestCase('All TC/Kelvin/To-call/Name and IC Generator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Kategori Kes'), '5', true)

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Catatan'), 'a')

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Submit Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Search By - My Kad'))

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Set Search value'), 'MyKad')

WebUI.sendKeys(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Set Search value - ENTER'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Insert IC'), GlobalVariable.ICRand)

WebUI.click(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/Search Button'))

WebUI.focus(findTestObject('Kelvin/Portal (10.20.24.198)/Case Reg_ESO_selfassign/To verify record existed'))

