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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.swyfft.com/')

int rowNo

for (rowNo = 1; rowNo < 100; rowNo++) {
    markdata = WebUI.setText(findTestObject('TextField_Address'), findTestData('New Test Data').getValue(1, rowNo))

    WebUI.delay(3)

    WebUI.click(findTestObject('Button_GetQuote'))

    WebUI.delay(10)

    popupnotpresent = WebUI.verifyElementNotPresent(findTestObject('Button_ClosePopUp'), 0)

    if (popupnotpresent == true) {
        // WebUI.click(findTestObject('Button_2pc'))
        //WebUI.delay(10)
        elemementnotpresent = WebUI.verifyAlertNotPresent(20)

        WebUI.delay(2)

        WebUI.setText(findTestObject('Input_FirstHomeValue'), variable_HomeValue200k)

        WebUI.delay(2)

        WebUI.click(findTestObject('Button_Customize'))

        minimumwarning = WebUI.verifyElementPresent(findTestObject('Msg_Minimum'), 0)

        if (minimumwarning == true) {
            minimumvalue = WebUI.getText(findTestObject('Msg_Minimum'))

            newminimumvalue = minimumvalue.replaceAll('[Please enter a value greater than or equal to . ]', '')

            log.logWarning('Value to be entered is' + newminimumvalue)

            WebUI.refresh()

            WebUI.setText(findTestObject('Input_FirstHomeValue'), newminimumvalue)

            log.logWarning('Inputting the new minimum value ' + newminimumvalue)

            WebUI.delay(3)

            WebUI.click(findTestObject('Button_Customize'))

            //WebUI.refresh()
            WebUI.click(findTestObject('Button_Customize'))

            log.logWarning('Clicking the customize button')

            WebUI.delay(3)

            WebUI.click(findTestObject('Button_WaterValue'))

            log.logWarning('Clicking the Water value Button')

            WebUI.delay(3)

            WebUI.click(findTestObject('Button_WaterValue20k'))

            log.logWarning('Setting Water value to 20k')

            WebUI.delay(3)

            WebUI.click(findTestObject('Button_Print'))

            //interract with printing
            
			//WebUI.sendKeys(findTestObject('Page_f'), Keys.chord(Keys.CONTROL, 'p'))
			//WebUI.delay(2)
			//Robot r = new Robot();
			//r.keyPress(KeyEvent.VK_ENTER);
			//r.keyRelease(KeyEvent.VK_ENTER);
			
            //WebUI.delay(3)

            WebUI.navigateToUrl('https://www.swyfft.com/')
        } else {
		
                      log.logWarning('Navigating to home on else statement')
			           WebUI.delay(3)
			
						WebUI.click(findTestObject('Button_Customize'))
			
						//WebUI.refresh()
						WebUI.click(findTestObject('Button_Customize'))
			
						log.logWarning('Clicking the customize button')
			
						WebUI.delay(3)
			
						WebUI.click(findTestObject('Button_WaterValue'))
			
						log.logWarning('Clicking the Water value Button')
			
						WebUI.delay(3)
			
						WebUI.click(findTestObject('Button_WaterValue20k'))
			
						log.logWarning('Setting Water value to 20k')
			
						WebUI.delay(3)
			
						//WebUI.click(findTestObject('Button_Print'))

                     WebUI.navigateToUrl('https://www.swyfft.com/')
        }
    } else {
        log.logWarning('Navigating to home on else statement' + markdata)

        WebUI.click(findTestObject('Button_ClosePopUp'))
    }
	WebUI.navigateToUrl('https://www.swyfft.com/')
}

