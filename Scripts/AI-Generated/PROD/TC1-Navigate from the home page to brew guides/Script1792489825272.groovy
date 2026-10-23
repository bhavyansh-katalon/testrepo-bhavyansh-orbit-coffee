import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.PROD.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
//	WebUI.setViewPortSize(1469, 214)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-orbit-coffee.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on h1 freshCoffeeOnYourSchedule"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/h1_freshCoffeeOnYourSchedule'))

"Step 3: Click on link brewGuides -> Navigate to page '/guides'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_brewGuides'))

"Step 4: Click on div headerContent -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides/div_headerContent'))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate from the home page to brew guides_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}