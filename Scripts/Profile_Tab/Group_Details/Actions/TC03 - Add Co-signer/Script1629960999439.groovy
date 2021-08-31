import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/div_Group DetailsCompleted'))

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/button_Actions'))

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/button_Add Co-signer'))

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__firstName'), 'Katy Perry')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__lastName'), 'Hilary')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__email_1'), 'katyperryhilary@gmail.com')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__phone'), '1 (231) 231-2312')

WebUI.selectOptionByValue(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    'March', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/select_Day123456789101112131415161718192021_40ab5b'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/select_Year20212020201920182017201620152014_f874ed'), 
    '1990', true)

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__fullAddress'), '9')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/p_95 Wall Street, New York, NY, USA'))

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__unitNumber'), '123')

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/button_Contractor  Freelancer'))

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__employer'), 'Starbucks')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__employmentStatement'), 'Senior Barista')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__declaredMonthlyIncome'), '1000')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__workEmail'), 'katy@starbucks.com')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__employerEmail'), 'recruitmenthr@starbucks.com')

WebUI.setText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input__employerPhone'), '1 (231) 231-2312')

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/button_650-700'))

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/label_Yes'))

WebUI.setEncryptedText(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/input_No_ssn'), 'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.click(findTestObject('Object Repository/Actions_Addcosigner/Page_addcosigner/button_Save'))

WebUI.closeBrowser()

