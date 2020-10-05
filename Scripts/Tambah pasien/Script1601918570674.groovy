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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev-rs.sidoni.xyz/')

WebUI.click(findTestObject('Object Repository/Page_SIDONI - LANDING PAGE/a_SIDONI RS (Rumah Sakit)'))

WebUI.setText(findTestObject('Object Repository/Page_Login Mitra RS SIDONI/input_Selamat Datang_email'), 'rs.test@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Mitra RS SIDONI/input_Selamat Datang_password'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login Mitra RS SIDONI/input_Selamat Datang_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Dashboard/span_Pasien'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/input__nomor_rekam_medis'), '123456')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/form_Nomor Rekam Medis                     _881517'))

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/input__nama_pasien'), 'James')

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/input__alamat_pasien'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/td_14'))

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/input__telefon_pasien'), '0897585578')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/label_O'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/label_'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/label_Perempuan'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/label_Laki Laki'))

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/input_Penanggung Jawab_penanggung_jawab'), 
    'Michael')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Pasien/button_Simpan'))

