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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://report.tesbo.io:443/loginPage')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SignUp/Page_Adminmart Template - The Ultimate Mult_15046d/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Adminmart Template - The Ultimate Mult_15046d/input_Name _UserName'), 
    'Demo')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Adminmart Template - The Ultimate Mult_15046d/input_Organization _OrgName'), 
    'QAble')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Adminmart Template - The Ultimate Mult_15046d/input_Email _email'), 
    'testdemo@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_Adminmart Template - The Ultimate Mult_15046d/input_Password _password'), 
    'KxcImXXup0BI3KWJR/WGjg==')

WebUI.click(findTestObject('Object Repository/SignUp/Page_Adminmart Template - The Ultimate Mult_15046d/button_Sign Up'))

WebUI.verifyTextPresent('Registration Successfully Please login with your credentials Now', false)

WebUI.comment('Sign up successfully')

WebUI.closeBrowser()

