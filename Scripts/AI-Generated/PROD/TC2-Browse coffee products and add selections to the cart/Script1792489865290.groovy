import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.PROD.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1469, 921)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-orbit-coffee.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on h1 freshCoffeeOnYourSchedule"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/h1_freshCoffeeOnYourSchedule'))

"Step 3: Click on nav mainNavigation"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/nav_mainNavigation'))

"Step 4: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_shop'))

"Step 5: Click on link brewGuides -> Navigate to page '/guides'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_brewGuides'))

"Step 6: Click on link contact -> Navigate to page '/contact'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides/link_contact'))

"Step 7: Click on link account -> Navigate to page '/login'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/link_account'))

"Step 8: Click on div headerNavigation"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_login/div_headerNavigation'))

"Step 9: Click on link orbitCoffee -> Navigate to page '/'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_login/link_orbitCoffee'))

"Step 10: Click on link account -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_account'))

"Step 11: Login into Application"

TrueTestScripts.login()

"Step 12: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_account/link_shop'))

"Step 13: Click on link classicRoast -> Navigate to page '/coffees/classic-roast'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_classicRoast'))

"Step 14: Click on button addToCart"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/button_addToCart'))

"Step 15: Click on button oneMore"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/button_oneMore'))

"Step 16: Click on button addToCart"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/button_addToCart'))

"Step 17: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/link_shop'))

"Step 18: Click on link easyDecaf -> Navigate to page '/coffees/easy-decaf'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_easyDecaf'))

"Step 19: Click on button subscribeAndSaveTenPercent (oneKg)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_1': button_subscribeAndSaveTenPercent_InternalRoleButtonName, 'button_subscribeAndSaveTenPercent_css_value_1': button_subscribeAndSaveTenPercent_css_value]))

"Step 20: Click on button subscribeAndSaveTenPercent (subscribeAndSaveTenPercent)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_1': button_subscribeAndSaveTenPercent_InternalRoleButtonName_1, 'button_subscribeAndSaveTenPercent_css_value_1': button_subscribeAndSaveTenPercent_css_value_1]))

"Step 21: Click on button subscribeAndSaveTenPercent (filter)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_1': button_subscribeAndSaveTenPercent_InternalRoleButtonName_2, 'button_subscribeAndSaveTenPercent_css_value_1': button_subscribeAndSaveTenPercent_css_value_2]))

"Step 22: Click on button oneMore"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_easy_decaf/button_oneMore'))

"Step 23: Click on button addToCart"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_easy_decaf/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_1': button_subscribeAndSaveTenPercent_InternalRoleButtonName_3, 'button_subscribeAndSaveTenPercent_css_value_1': button_subscribeAndSaveTenPercent_css_value_3]))

"Step 24: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_easy_decaf/link_shop'))

"Step 25: Click on link honeyProcess -> Navigate to page '/coffees/honey-process'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_honeyProcess'))

"Step 26: Click on button addToCart"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_honey_process/button_addToCart'))

"Step 27: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_honey_process/link_shop'))

"Step 28: Click on link sunriseBlend -> Navigate to page '/coffees/sunrise-blend'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_sunriseBlend'))

"Step 29: Double-click on button oneMore"

WebUI.doubleClick(findTestObject('AI-Generated/PROD/Page_coffees_sunrise_blend/button_oneMore'))

"Step 30: Click on button oneMore"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_sunrise_blend/button_oneMore'))

"Step 31: Click on button subscribeAndSaveTenPercent (subscribeAndSaveTenPercent)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_2': button_subscribeAndSaveTenPercent_InternalRoleButtonName_4, 'button_subscribeAndSaveTenPercent_css_value_2': button_subscribeAndSaveTenPercent_css_value_4]))

"Step 32: Click on button subscribeAndSaveTenPercent (frenchPress)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_2': button_subscribeAndSaveTenPercent_InternalRoleButtonName_5, 'button_subscribeAndSaveTenPercent_css_value_2': button_subscribeAndSaveTenPercent_css_value_5]))

"Step 33: Click on button subscribeAndSaveTenPercent (oneKg)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_2': button_subscribeAndSaveTenPercent_InternalRoleButtonName_6, 'button_subscribeAndSaveTenPercent_css_value_2': button_subscribeAndSaveTenPercent_css_value_6]))

"Step 34: Click on button addToCart"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_sunrise_blend/button_subscribeAndSaveTenPercent', ['button_subscribeAndSaveTenPercent_InternalRoleButtonName_2': button_subscribeAndSaveTenPercent_InternalRoleButtonName_7, 'button_subscribeAndSaveTenPercent_css_value_2': button_subscribeAndSaveTenPercent_css_value_7]))

"Step 35: Click on link brewGuides -> Navigate to page '/guides'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_sunrise_blend/link_brewGuides'))

"Step 36: Click on link frenchPressGuide -> Navigate to page '/guides/french-press'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides/link_frenchPressGuide'))

"Step 37: Click on small grind"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides_french_press/small_grind'))

"Step 38: Click on link classicRoast -> Navigate to page '/coffees/classic-roast'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides_french_press/link_classicRoast'))

"Step 39: Click on link contact -> Navigate to page '/contact'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/link_contact'))

"Step 40: Click on link account -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/link_account'))

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Browse coffee products and add selections to the cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}