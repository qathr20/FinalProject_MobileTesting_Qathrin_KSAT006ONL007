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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\BTDP\\Katalon Studio\\Final Project 2\\Mobile Testing\\app-debug.apk', true)

Mobile.setText(findTestObject('Object Repository/Deposit/android.widget.EditText - Username'), 'nad', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Deposit/android.widget.EditText - Password'), 'Ac996/o0Ln/ek6pvjB4p+A==', 
    0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.TextView - You do not have any accounts, click below to add an account'), 
    0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.Button - CANCEL'), 0)

Mobile.setText(findTestObject('Object Repository/Deposit/android.widget.EditText - Account Name'), 'nad', 0)

Mobile.setText(findTestObject('Object Repository/Deposit/android.widget.EditText - Initial Balance (Optional)'), '500', 
    0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.Button - ADD'), 0)

Mobile.closeApplication()

