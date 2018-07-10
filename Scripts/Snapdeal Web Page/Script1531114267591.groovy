import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.snapdeal.com/')

WebUI.waitForElementPresent(findTestObject('SD_Login_OR/Page_Online Shopping Site in India/Page_Online Shopping Site in India/div_Sign In'), 
    10)

WebUI.waitForElementVisible(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/div_Sign In'), 10)

WebUI.waitForElementClickable(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/div_Sign In'), 0)

WebUI.click(findTestObject('SD_Login_OR/Page_Online Shopping Site in India/Page_Online Shopping Site in India/div_Sign In'))

WebUI.waitForElementPresent(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/span_login'), 10)

WebUI.waitForElementClickable(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/span_login'), 0)

WebUI.waitForElementVisible(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/span_login'), 10)

WebUI.click(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/span_login'))

WebUI.waitForElementPresent(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/input_username'), 10)

WebUI.waitForElementClickable(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/input_username'), 10)

WebUI.waitForElementVisible(findTestObject('SD_Login_OR/Page_Online Shopping Site in India (1)/input_username'), 10)

WebUI.setText(findTestObject('SD_Login_OR/Page_Online Shopping Site in India/Page_Online Shopping Site in India/Page_Online Shopping Site in India/input_username'), 
    username)

WebUI.click(findTestObject('SD_Login_OR/Page_Online Shopping Site in India/button_continue'))

WebUI.waitForElementPresent(findTestObject('New Folder/Page_Online Shopping Site in India/button_Login Without Password'), 
    10)

WebUI.waitForElementVisible(findTestObject('New Folder/Page_Online Shopping Site in India/button_Login Without Password'), 
    10)

WebUI.waitForElementClickable(findTestObject('New Folder/Page_Online Shopping Site in India/button_Login Without Password'), 
    10)

WebUI.click(findTestObject('New Folder/Page_Online Shopping Site in India/button_Login Without Password'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

