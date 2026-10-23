import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.PROD.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1200, 625)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-orbit-coffee.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link contact -> Navigate to page '/contact'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_contact'))

"Step 3: Enter input value in input yourName"

// Bind values to the variables in the locators of "AI-Generated/PROD/Page_contact/input_yourName"
TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/input_yourName', ['input_yourName_nameRedacted': input_yourName_nameRedacted]), input_yourName)

"Step 4: Enter input value in input email"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/input_email'), input_email)

"Step 5: Select option with input value from select topic"

TrueTestScripts.selectOption(findTestObject('AI-Generated/PROD/Page_contact/select_topic'), select_topic, "label", true)

"Step 6: Enter input value in textarea message"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/textarea_message'), textarea_message)

"Step 7: Click on button sendMessage -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/button_sendMessage'))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Enter and send a contact message_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}