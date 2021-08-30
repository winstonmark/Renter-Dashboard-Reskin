package com.poplarhomes.renterdash
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ProfileTab {

	@Given("User is logged in the Poplar Homes Renter Dashboard")
	def log_in_renterdash() {
		WebUI.callTestCase(findTestCase("Test Cases/Login/login_renterdash"), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User is in the Profile Tab")
	def check_profile_tab_exist() {
		WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check Profile Tab"), null, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should see General Details sub-tab")
	def check_general_details_subtab_exist() {
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check General Details Sub-tab"), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User should see Group Details sub-tab")
	def check_group_details_subtab_exist() {
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check Group Details Sub-tab"), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User should see Employment Details sub-tab")
	def check_employment_details_subtab() {
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check Employment Details Sub-tab"), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User should see Documents sub-tab")
	def check_documents_subtab() {
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check Documents Sub-tab"), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User should see Credit Check sub-tab")
	def check_credits_subtab() {
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check Credit Sub-tab"), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User should also see the Complete Now Banner")
	def check_completenow_banner () {
		WebUI.callTestCase(findTestCase("Test Cases/Profile_Tab/Check CompleteNow Banner"), null, FailureHandling.STOP_ON_FAILURE)
	}
}