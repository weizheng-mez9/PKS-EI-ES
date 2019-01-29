import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Tarik Lahir'), '01/01/1995')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Done Button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Umur'), '23')

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Status'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Status - Bujang'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Kewarganegaraan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Kewarganegaraan - Malaysia'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bangsa'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bangsa - Melayu'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Agama'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Agama - Islam'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jantina'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jantina - Lelaki'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Alamat Surat-menyurat'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Negara 1'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Negeri - Melaka'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bandar 1'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bandar Melaka'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Postcode'))

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Postcode - 730'), '73000')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Postcode - 73000'))

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Mobile Number'), '0121234567')

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Email'), 'fiowbe@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bilangan Tanggungan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bilangan Tanggungan -0'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pendapatan isi Rumah'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pendapatan isi Rumah - RM0-1000'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Apakah Anda Mempunyai'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Apakah Anda Mempunyai - Ya'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Status Pekerjaan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Status Pekerjaan - Bekerja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Career Objective'), '123')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Matlamat Kerjaya'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Matlamat Kerjaya - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap Kemahiran'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap Kemahiran - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap Keyakinan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap Keyakinan - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap pengetahuan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap pengetahuan - 1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Sekolah'), 'kolej')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Negara'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Negara - Afghanistan'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pencapaian'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pencapaian - TIADA PENDIDIKAN FORMAL'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahun Tamat Belajan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahun Tamat Belajan - 1900'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bidang Pengajian'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bidang Pengajian - LITERASI DAN NUMERASI'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Add Button for Academic Qualification'))

WebUI.delay(4)

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/Fresh Graduate'))

WebUI.delay(3)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jenis Kemahiran'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jenis Kemahiran - Abacus'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Tahap - Asas'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Adding Button for Kemahiran'))

WebUI.delay(3)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bahasa'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bahasa - Inggris'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pembacaan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pembacaan - Baik'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Penulisan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Penulisan Baik'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pertuturan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pertuturan - Baik'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Adding Button for Bahasa'))

WebUI.delay(3)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pilihan Pekerjaan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pilihan Pekerjaan - Pembangun Perisian  Pengatu'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pengkhusuan kerja'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Pengkhusuan kerja - Kewangan- Kewangan korperat'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Penaraan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Penaraan - Setiausaha Syarikat'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jenis Pekerjaan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jenis Pekerjaan - Tetap'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Angaraan gaji'), '3000')

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Negeri 2'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Negeri - JOHOR'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bandar 2'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Bandar - AJIL'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Status Jawatan'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Status Jawatan - Bukan Eksekutif'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Adding for Pilihan Pekerjaan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Rujukan NAMA'), 'NAMA')

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Rujukan Number'), '0123456789')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Adding for Rujukan'))

WebUI.delay(2)

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/input__listEmpDeclarationSelec'))

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/input__listEmpDeclarationSelec_1'))

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/input__listEmpDeclarationSelec_2'))

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/input__listEmpDeclarationSelec_3'))

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/input__listEmpDeclarationSelec_4'))

WebUI.delay(1)

WebUI.check(findTestObject('Yuki/Approval ERA/UJP/input_Saya telah membaca dan m'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/jenis Aktiviti'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/jenis Aktiviti - Pencarian Pekerjaan'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Penerangan'), 'note')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jumlah Aktiviti'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jumlah Aktiviti - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Kekerapan Aktiviti'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Kekerapan Aktiviti - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Adding for PKP'))

WebUI.delay(5)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/jenis Aktiviti'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jenis Aktiviti - Permohonan Pekerjaan'))

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Penerangan'), 'note')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jumlah Aktiviti'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Jumlah Aktiviti - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Kekerapan Aktiviti'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Kekerapan Aktiviti - 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Adding for PKP'))

WebUI.verifyElementChecked(findTestObject('Yuki/Approval ERA/UJP/Case Category'), 0)

WebUI.verifyElementText(findTestObject('Yuki/Approval ERA/UJP/Case Refered Date'), '')

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/UJP/Contact Date'), '01/01/2019')

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Done Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Recommendation'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Recommendation - Return to work'))

WebUI.click(findTestObject('Yuki/Approval ERA/UJP/Hantar Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Semak'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Yuki/Approval ERA/ERA Form/Tarik Duti Laporan'), '01/01/2019')

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Done Button'))

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Nama Majikan'), 'Nama majikan')

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Industri'))

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Industri - Accomodation'))

WebUI.delay(1)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Jawatan'))

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Jawatan - con'), 'con')

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Jawatan - Ahli Economi'))

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Gaji'), '1000')

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Status Jawatan'))

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Status Jawatan - Bukan Eksekutif'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Pengkhususan'))

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Pengkhususan - Kewangan'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Penaran'))

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Penaran - Company Secretary'))

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Alamat kediaman'), 'test')

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Negeri'))

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Negeri - JOHOR'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Bandar'))

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Bandar - joh'), 'joh')

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Bandar - Johor Bahru'))

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Postcode'))

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Postcode - 774'), '774')

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Postcode - 77400'))

WebUI.delay(2)

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Nama Pegawai'), 'Nama Pegawai')

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/No Tel Pegawai'), '123456789')

WebUI.delay(1)

WebUI.setText(findTestObject('Yuki/Approval ERA/ERA Form/Emel Pegawai'), 'Pegawai@pekero.gov.my')

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Uploading Button'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Yuki/Approval ERA/ERA Form/Uploading File'), GlobalVariable.TextFilePathCommon + '//UploadDoc.txt')

WebUI.delay(2)

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Tambah Button'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.check(findTestObject('Yuki/Approval ERA/ERA Form/Declaration Check'))

WebUI.click(findTestObject('Yuki/Approval ERA/ERA Form/Hantar Button'))

