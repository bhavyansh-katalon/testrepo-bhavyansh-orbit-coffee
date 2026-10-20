import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.PROD.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1367, 952)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-orbit-coffee.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on h1 freshCoffeeOnYourSchedule"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/h1_freshCoffeeOnYourSchedule'))

"Step 3: Click on h1 freshCoffeeOnYourSchedule"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/h1_freshCoffeeOnYourSchedule'))

"Step 4: Click on link cart -> Navigate to page '/cart'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_cart'))

"Step 5: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_cart/link_goToCheckout'))

"Step 6: Click on button continueToDelivery"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_continueToDelivery'))

"Step 7: Click on input object (fullName)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel, 'input_object_css_value_1': input_object_css_value]))

"Step 8: Enter input value in input object (fullName)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object"
TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_1, 'input_object_css_value_1': input_object_css_value_1]), input_object)

"Step 9: Enter input value in input object (fullName)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object"
TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_2, 'input_object_css_value_1': input_object_css_value_2]), input_object_1)

"Step 10: Click on input streetAddress"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/input_streetAddress'))

"Step 11: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_streetAddress'), input_streetAddress)

"Step 12: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_streetAddress'), input_streetAddress_1)

"Step 13: Click on input city"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/input_city'))

"Step 14: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_city'), input_city)

"Step 15: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_city'), input_city_1)

"Step 16: Click on input postcode"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/input_postcode'))

"Step 17: Enter input value in input postcode"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_postcode'), input_postcode)

"Step 18: Click on button continueToDelivery"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_continueToDelivery'))

"Step 19: Click on button continueToPayment"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_continueToPayment'))

"Step 20: Click on section payment"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/section_payment'))

"Step 21: Click on button confirmAndPay"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_confirmAndPay'))

"Step 22: Click on button back"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_back'))

"Step 23: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/link_shop'))

"Step 24: Click on link classicRoast -> Navigate to page '/coffees/classic-roast'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_classicRoast'))

"Step 25: Click on button addToBag (addToBag)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_classic_roast/button_addToBag"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_classic_roast/button_addToBag', ['button_addToBag_InternalRoleButtonName_1': button_addToBag_InternalRoleButtonName, 'button_addToBag_css_value_1': button_addToBag_css_value]))

"Step 26: Click on button oneMore"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/button_oneMore'))

"Step 27: Click on button addToBag (addToBag)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_coffees_classic_roast/button_addToBag"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_coffees_classic_roast/button_addToBag', ['button_addToBag_InternalRoleButtonName_1': button_addToBag_InternalRoleButtonName_1, 'button_addToBag_css_value_1': button_addToBag_css_value_1]))

"Step 28: Click on link allCoffee -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_classic_roast/link_allCoffee'))

"Step 29: Click on div coffeeGrid"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/div_coffeeGrid'))

"Step 30: Click on link brightOrigin -> Navigate to page '/coffees/bright-origin'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_brightOrigin'))

"Step 31: Click on button addToBag"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_bright_origin/button_addToBag'))

"Step 32: Click on link orbitCoffee -> Navigate to page '/'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_bright_origin/link_orbitCoffee'))

"Step 33: Click on h3 chooseACoffee"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/h3_chooseACoffee'))

"Step 34: Click on link learnToBrew -> Navigate to page '/guides'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_learnToBrew'))

"Step 35: Click on link frenchPressGuide -> Navigate to page '/guides/french-press'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides/link_frenchPressGuide'))

"Step 36: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides_french_press/link_shop'))

"Step 37: Click on link cart -> Navigate to page '/cart'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_cart'))

"Step 38: Click on button moreClassicRoast"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_cart/button_moreClassicRoast'))

"Step 39: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_cart/link_goToCheckout'))

"Step 40: Click on button expressDelivery"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_expressDelivery'))

"Step 41: Click on button continueToPayment"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_continueToPayment'))

"Step 42: Click on input object (cardNumber)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_3, 'input_object_css_value_1': input_object_css_value_3]))

"Step 43: Enter input value in input object (cardNumber)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object"
TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_checkout/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_4, 'input_object_css_value_1': input_object_css_value_4]), input_object_2)

"Step 44: Click on input expiry"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/input_expiry'))

"Step 45: Enter input value in input expiry"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_expiry'), input_expiry)

"Step 46: Click on input securityCode"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/input_securityCode'))

"Step 47: Enter input value in input securityCode"

TrueTestScripts.setText(findTestObject('AI-Generated/PROD/Page_checkout/input_securityCode'), input_securityCode)

"Step 48: Click on button confirmAndPay2 -> Navigate to page '/confirmed'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_checkout/button_confirmAndPay2'))

"Step 49: Click on link keepShopping -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_confirmed/link_keepShopping'))

"Step 50: Click on button roast (lightRoast)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_shop/button_roast"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_shop/button_roast', ['button_roast_InternalRoleButtonName_1': button_roast_InternalRoleButtonName, 'button_roast_css_value_1': button_roast_css_value]))

"Step 51: Click on button roast (roastMedium)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_shop/button_roast"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_shop/button_roast', ['button_roast_InternalRoleButtonName_1': button_roast_InternalRoleButtonName_1, 'button_roast_css_value_1': button_roast_css_value_1]))

"Step 52: Click on button roast (roastDark)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_shop/button_roast"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_shop/button_roast', ['button_roast_InternalRoleButtonName_1': button_roast_InternalRoleButtonName_2, 'button_roast_css_value_1': button_roast_css_value_2]))

"Step 53: Select option with input value from select priceLowToHigh"

TrueTestScripts.selectOption(findTestObject('AI-Generated/PROD/Page_shop/select_priceLowToHigh'), select_priceLowToHigh, "label", true)

"Step 54: Click on link nightOwl -> Navigate to page '/coffees/night-owl'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_nightOwl'))

"Step 55: Click on link orbitCoffee -> Navigate to page '/'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_coffees_night_owl/link_orbitCoffee'))

"Step 56: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_shop'))

"Step 57: Click on link brewGuides -> Navigate to page '/guides'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_shop/link_brewGuides'))

"Step 58: Click on link contact -> Navigate to page '/contact'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_guides/link_contact'))

"Step 59: Click on link account -> Navigate to page '/account'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_contact/link_account'))

"Step 60: Click on button skipNextDelivery (skipNextDelivery)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_account/button_skipNextDelivery"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_account/button_skipNextDelivery', ['button_skipNextDelivery_DataTestid_1': button_skipNextDelivery_DataTestid, 'button_skipNextDelivery_css_value_1': button_skipNextDelivery_css_value]))

"Step 61: Click on button skipNextDelivery (skipNextDelivery2)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_account/button_skipNextDelivery"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_account/button_skipNextDelivery', ['button_skipNextDelivery_DataTestid_1': button_skipNextDelivery_DataTestid_1, 'button_skipNextDelivery_css_value_1': button_skipNextDelivery_css_value_1]))

"Step 62: Click on button skipNextDelivery (skipNextDelivery3)"

// Bind values to the variables in the locators of "AI-Generated/PROD/Dynamic Objects/Page_account/button_skipNextDelivery"
TrueTestScripts.click(findTestObject('AI-Generated/PROD/Dynamic Objects/Page_account/button_skipNextDelivery', ['button_skipNextDelivery_DataTestid_1': button_skipNextDelivery_DataTestid_2, 'button_skipNextDelivery_css_value_1': button_skipNextDelivery_css_value_2]))

"Step 63: Click on button signOut -> Navigate to page '/'"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_account/button_signOut'))

"Step 64: Click on link account -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/PROD/Page_home/link_account'))

"Step 65: Login into Application"

TrueTestScripts.login()

"Step 66: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Enter checkout details place an order and manage deliveries_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}