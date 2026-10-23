package perf

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class ChromeTrace {

	/** Saves the trace events collected since the last call. Call it while the browser is open. */
	@Keyword
	static String save(String label) {
		def entries = DriverFactory.getWebDriver().manage().logs().get('performance').getAll()
		def slurper = new JsonSlurper()
		def events = []
		entries.each { entry ->
			def message = slurper.parseText(entry.getMessage()).message
			if (message?.method == 'Tracing.dataCollected') {
				def params = message.params
				if (params?.value instanceof List) {
					events.addAll(params.value)
				} else if (params) {
					events.add(params)
				}
			}
		}
		if (events.isEmpty()) {
			return null
		}
		String name = label.replaceAll('[^A-Za-z0-9]+', '_') + '_' + System.currentTimeMillis() + '.trace.json'
		new File(RunConfiguration.getReportFolder(), name).text = JsonOutput.toJson([traceEvents: events])
		new KeywordLogger().logInfo('Chrome performance trace saved: ' + name, ['attachment': name])
		return name
	}
}