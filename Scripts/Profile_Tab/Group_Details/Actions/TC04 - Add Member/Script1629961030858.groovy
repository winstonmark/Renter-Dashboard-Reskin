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

WebUI.click(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/div_Group DetailsCompleted'))

WebUI.click(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/button_Actions'))

WebUI.click(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/button_Add a Member'))

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__firstName'), 'Bea')

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__lastName'), 'Alonzo')

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__email_1'), 'beaalonzo@gmail.com')

CustomKeywords.'com.poplar.RenterProspect.addRenterDetails'()

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__phone'), '1 (231) 231-2312')

WebUI.selectOptionByValue(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    'June', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/select_Day123456789101112131415161718192021_71ec95'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/select_Year20212020201920182017201620152014_f874ed'), 
    '1967', true)

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__fullAddress'), '32')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/p_300 Vesey Street, New York, NY, USA'))

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__unitNumber'), '121')

WebUI.click(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/button_Employed'))

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__employer'), 'GMA Network')

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__employmentStatement'), 'Test')

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__declaredMonthlyIncome'), '2000')

WebUI.setText(findTestObject('Object Repository/Actions_AddMember/Page_Poplar Homes/input__workEmail'), 'beaalonzo@gmanetwork.com')

WebUI.click(findTestObject('Actions_AddMember/Page_Poplar Homes/button_Save'))

WebUI.delay(5)

