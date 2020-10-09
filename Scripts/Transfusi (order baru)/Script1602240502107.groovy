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

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Dashboard/a_Transfusi'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Dashboard/a_Order Baru'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/a_Tambah permintaan'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input_Kode rumah sakit_kode-rs'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__tanggal_permintaan'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/th_Today'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/select_- Pilih Bagian                      _0f266d'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__tanggal_diperlukan'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/th_Today'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/select_-- Silahkan Pilih UDD PMI --        _27a8a2'), 
    'ND', true)

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/span_Pilih No Rekam Medis'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__tanggal_lahir'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/td_27'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/select_- Pilih Diagnosisi Klinis           _08f2f5'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/select_- Pilih Jenis Permintan             _205588'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__alasan_transfusi'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__hemoglobin'), '13')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/label_Tidak'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/label_Tidak_1'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/label_Tidak_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input_FFP (Fresh Frozen Plasma)_quantity18'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input_FFP (Fresh Frozen Plasma)_produk_darah18'))

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__nama_dokter'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__nama_pengambil_sampel_darah_pasien'), 
    'tesr')

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/input__tanggal_pengambilan_sampel_darah'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/th_Today'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/span_RS Test'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_App Rumah Sakit  Order Baru Pasien/a_Logout_1'))

WebUI.closeBrowser()

