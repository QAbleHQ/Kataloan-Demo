import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.openBrowser('http://report.tesbo.io:443/loginPage')

WebUI.setText(findTestObject('Object Repository/Login/Page_Adminmart Template - The Ultimate Mult_15046d/input_Email_email'), 
    'demotest@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Adminmart Template - The Ultimate Mult_15046d/input_Password_pwd'), 
    'KxcImXXup0BI3KWJR/WGjg==')

WebUI.click(findTestObject('Object Repository/Login/Page_Adminmart Template - The Ultimate Mult_15046d/button_Sign In'))

WebUI.waitForElementPresent(findTestObject('Login/Page_Adminmart Template - The Ultimate Mult_15046d/span_Demo'), 20)

WebUI.verifyElementPresent(findTestObject('Login/Page_Adminmart Template - The Ultimate Mult_15046d/span_Demo'), 0)

WebUI.comment('Login successfully')

WebUI.closeBrowser()

