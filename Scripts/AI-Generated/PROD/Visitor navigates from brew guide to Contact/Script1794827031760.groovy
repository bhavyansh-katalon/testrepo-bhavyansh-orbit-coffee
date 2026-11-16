import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.PROD.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1225, 926)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-orbit-coffee.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link brewGuides -> Navigate to page '/guides'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_brewGuides'))

"Step 3: Click on link frenchPressGuide -> Navigate to page '/guides/french-press'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides/link_frenchPressGuide'))

"Step 4: Click on link contact -> Navigate to page '/contact'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides_french_press/link_contact'))

"Step 5: Click on input yourName"

// Bind values to the variables in the locators of "AI-Generated/PROD/Page_contact/input_yourName"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/input_yourName', ['input_yourName_nameRedacted': input_yourName_nameRedacted]))

"Step 6: Click on input email"

// TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/input_email'))

"Step 7: Enter input value in input email"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/input_email'), input_email)

"Step 8: Enter input value in input yourName"

// Bind values to the variables in the locators of "AI-Generated/PROD/Page_contact/input_yourName"
TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/input_yourName', ['input_yourName_nameRedacted': input_yourName_nameRedacted_1]), input_yourName)

"Step 9: Enter input value in input yourName"

// Bind values to the variables in the locators of "AI-Generated/PROD/Page_contact/input_yourName"
TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/input_yourName', ['input_yourName_nameRedacted': input_yourName_nameRedacted_2]), input_yourName_1)

"Step 10: Click on div contactName"

// Bind values to the variables in the locators of "AI-Generated/PROD/Page_contact/div_contactName"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/div_contactName', ['div_contactName_nameRedacted': div_contactName_nameRedacted]))

"Step 11: Select option with input value from select topic"

TrueTestScripts.selectOption(findTestObject('AI-Generated/PROD/Page_contact/select_topic'), select_topic, "label", true)

"Step 12: Click on textarea message"

// TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/textarea_message'))

"Step 13: Enter input value in textarea message"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_contact/textarea_message'), textarea_message)

"Step 14: Click on button sendMessage"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/button_sendMessage'))

"Step 15: Click on link backToShop -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/link_backToShop'))

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Visitor navigates from brew guide to Contact_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}