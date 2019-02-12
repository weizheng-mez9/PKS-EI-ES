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

WebUI.callTestCase(findTestCase('All TC/Arranged/Default/ES/OB Login Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Kemaskini Profile'))

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Enter Tarikh Lahir'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Enter Tarikh Lahir'), '05/01/1976')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Done - button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Umur'), '45')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Status Perkahwinan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Status Perkahwinan - Berkahwin'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Kewarganegaraan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Kewarganegaraan - Malaysia'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Bangsa'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Bangsa - Cina'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Agama'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Agama - Buddha'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Jantina'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Jantina - Lelaki'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Alamat'), 'Jalan YEO')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Negeri'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Negeri  - Johor'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Bandar'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Bandar - Type Batu Pahat'), 'Batu Pahat')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Click Batu Pahat'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Postkod 1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Postkod 1 - Type Postkod 83000'), '83000')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Postkod 1 - Select Postkod 83000'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/No. Tel Bimbit'), '0987654321')

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Email'), 'yeo@yopmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Maklumat Lain'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Maklumat Lain - Tidak'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Lesen Memandu - D'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/1 - Maklumat Asas/Seterusnya - button'))

WebUI.delay(3)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/2 - Maklamat Kerjaya/Maklamat Kerjaya Info'), 'Good day to you all! Lets work till we all die!')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/2 - Maklamat Kerjaya/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/2 - Maklamat Kerjaya/Seterusnya - button'))

WebUI.delay(3)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Institusi'), 'INTI University')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Negara'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Negara - Type Malay'), 'Malay')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Negara - Select Malaysia'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Pencapaian'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Pencapaian - Doktor Falsafah'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Tahun Tamat Belajar'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Tahun Tamat Belajar - Type 1980'), '1980')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Tahun Tamat Belajar - Select 1980'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Bidang Pengajian'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Bidang Pengajian - Sain komputer'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Tambah - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/3 - Maklumat Akademik/Seterusnya - button'))

WebUI.delay(3)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Tarikh Mula'), '25/05/2017')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Done - button 1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Tarikh Tamat'), '23/09/2018')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Done - button 2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Nama Majikan'), 'Mezza9 lor')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Industri'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Industri - Information Service Activiti'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Sub Industri'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Sub Industri - Communication'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Jawatan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Jawatan - Arkitek (Perisian Komputer)'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Pengkhususan Kerja'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Pengkhususan Kerja - Teknologi pemakanan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Peranan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Peranan - Konsultan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Status Jawatan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Status Jawatan - Eksekutif Kanan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Gaji'), '10000')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Tambah - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/4 - Pengalaman Bekerja/Seterusnya - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/5 - Latihan dan Sijil/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/5 - Latihan dan Sijil/Seterusnya - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Expand Kemahiran'))

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Jenis Kemahiran 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Jenis Kemahiran 1 - Analisa Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Tahap 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Tahap 1 - Asas'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Tambah - button 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Expand Kemahiran Bahasa'))

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Bahasa'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Bahasa  - Cina'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Pembacaan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Pembacaan - Baik 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Penulisan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Penulisan - Baik 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Pertuturan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Pertuturan - Baik 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Jenis Kemahiran 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Jenis Kemahiran 2 - C Programming'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Tahap 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Tahap 2  - Sederhana'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Tambah - button 2'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/6 - Kemahiran dan Kemahiran Bahasa/Seterusnya - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Expand Pilihan Pekerjaan'))

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Pilihan Pekerjaan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Pilihan Pekerjaan - Associate Pentadbiran'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Pengkhususan kerja'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Pengkhususan kerja - Kejuruteraan - Elektronik'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Peranan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Peranan - Jurutera Penyelidikan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Status jawatan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Status jawatan - Eksekutif Kanan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Jenis Pekerjaan'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Jenis Pekerjaan - Tetap'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Anggaran gaji'), 
    '14000')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Negeri'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Negeri - Johor'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Bandar'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Bandar - Type Batu Pahat'), 
    'Batu Pahat')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Bandar - Select Batu Pahat'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Tambah - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/7 - Pilihan Pekerjaan dan Tetapan Privasi/Seterusnya - button'))

WebUI.delay(3)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/Nama'), 'Kenny Chiam ')

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/Nama Majikan'), 'Mezza 10 lorrr')

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/Majikan Alamat'), 'Jalan Mezza 10')

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/No. Telefon'), '01112373486')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/Tambah - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/Simpan - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/8 - Rujukan/Seterusnya - button'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Expand Pelan Komit Pekerjaan'))

not_run: WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Memahami TC'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jenis Aktiviti Pencarian Pekerjaan 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jenis Aktiviti Pencarian Pekerjaan 1 - Pencarian Pekerjaan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Penerangan Aktiviti Pencarian Pekerjaan 1'), 
    'Finding work for life')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jumlah Aktiviti 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jumlah Aktiviti 1 - 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Kekerapan Aktiviti dalam sebulan 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Kekerapan Aktiviti dalam sebulan 1 - 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Tambah - button 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jenis Aktiviti Pencarian Pekerjaan 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jenis Aktiviti Pencarian Pekerjaan 2 - Permohonan Pekerjaan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Penerangan Aktiviti Pencarian Pekerjaan 2'), 
    'Finding work for life!!!')

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jumlah Aktiviti 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Jumlah Aktiviti 2 - 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Kekerapan Aktiviti dalam sebulan 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Kekerapan Aktiviti dalam sebulan 2 - 4'))

WebUI.delay(2)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/9 - Pengakuan Orang Berinsurans/Tambah - button 2'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/Log Out/Click on IC No.'))

WebUI.delay(3)

WebUI.click(findTestObject('Kenny/OB Fill UJP Info/Log Out/Log Out'))

WebUI.delay(3)

