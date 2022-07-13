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

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Open app again (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.FrameLayout (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - First Name (2)'), 'kang', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Last Name (2)'), 'daniel', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Country (2)'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - dan'), 'nad', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Register/android.widget.EditText - Password (5)'), 'jvg6t3zw79uIPUto+tYwHQ==', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Register/android.widget.EditText - Confirm Password (2)'), 'jvg6t3zw79uIPUto+tYwHQ==', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Create Profile (2)'), 0)

Mobile.closeApplication()

