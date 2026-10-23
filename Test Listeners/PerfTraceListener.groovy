import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.webui.driver.DriverFactory

import perf.ChromeTrace

class PerfTraceListener {

	@AfterTestCase
	def saveChromeTrace(TestCaseContext testCaseContext) {
		try {
			DriverFactory.getWebDriver()
		} catch (Exception browserClosed) {
			return
		}
		ChromeTrace.save(testCaseContext.getTestCaseId())
	}
}