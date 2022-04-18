import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

int randomNo = (int)(Math.random() * 100000);

Mobile.startApplication(appPath, false)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Register/android.widget.TextView - No account yet Create one'), 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Register/android.widget.EditTextName'), 'test', 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Register/android.widget.EditTextEmail'), 'test'+randomNo+'@gmail.com', 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Register/android.widget.EditTextPassword'), 'hai', 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Register/android.widget.EditTextConfirmPassword'), 'hai', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Register/android.widget.Button - REGISTER'), 0)

Mobile.takeScreenshot()

Thread.sleep(3000)

GlobalVariable.G_Email = 'test'+randomNo+'@gmail.com'

GlobalVariable.G_Password = 'hai'

Mobile.closeApplication()