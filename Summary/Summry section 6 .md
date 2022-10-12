# Yoni Herlina Siahaan

# A

Dokumentasi Pengujian

Test Scenario
Merupakan sekumpulan langkah-langkah sistem matis yang di susun software tester agar sistem yang di test sesuai kebutuhan user. Memenuhi standar tertentu dan berfungsi dengan baik dan juga merupakan tingkatan tetinggi dari test case
	Tujuan : 
		1. Memudahkan tester dan developer untuk melakukan testing
		2. Menjadi sadar untuk pengembangan project
		3. Menjadi  dasar klien atau product owner menyesuaikan reguitment 
	Tools :
		1. Google Spreadsheet.
		2. Test rail
		3. Case io
		
Bagaimana membuat test scenario yang baik, berikut kriteria nya:

    Test case creation dibutuhkan untuk memudahkan seorang QA untuk melakukan testing menurut perspektif end user terhadap aplikasi yang sedang dikembangkan agar sesuai dengan kebutuhan. Test creation tentunya membuat QA melakukan investasi waktu dalam pengujian aplikasi agar lebih efektif.
    
    1. Inline with system requirement

	Sistem Requirement itu adalah kunci, sehingga kita dapat menyusun test scenario sesuai flow yang telah ditentukan.
        
    2. Give Context
        
        User bersikap seolah-olah perlu melakukan hal tersebut. 
        
    3. Give Detail
        
        Berikan rincian secara spesifik hal-hal yang perlu diketahui oleh user 
        
    4. Crystal clear - Easy to Understand

What is a Test Case ?
    Rancangan atau rangkaian mengenai tindakan yang dilakukan oleh software tester untuk melakukan verifikasi terhadap fitur atau fungsi tertentu dari sebuah perangkat lunak 

Pembuatan test case
    
    Tujuan : memastikan bahwa suatu sistem dapat dijalankan dengan baik sesuai dengan kebutuhan awal awal, serta mampu memberikan respon ketika terdapat suatu masukan yang tidak valid. 
    
-. Test case mempunyai komponen seperti berikut :
    - Id
    - Description
    - Pre-condition
    - Test step
    - Expected Result
    - Actual result
    - Status
    
- Test case bertindak sebagai titik awal dalam pelaksanaan pengujian suatu sistem. Dari test case biasanya akan diketahui sistem berjalan normal atau tidak.

        Berikan penjelasan secara detail terkait tes step dan spesifikasi expected result. Sehingga akan memudahkan kita dalam melakukan proses testing.
 
Beberapa hal di perhatikan dalam membuat test case:
	1. Test di buat dengan sederhana dan transparan
	2. Users in mind, tujuan utama pembangunan perangkat lunak adalah untuk membuat khasus uji yang memenuhi persyaratan clien mudah di gunakan dan operasikan dengan demikian software tester mampu membuatkan sistem uji dengan mengingat prespektif pengguna akhir.
	3. Hindari perulangan khasus uji.
	Dalam pembuatan test case usahan pengujian yang berulang, jika test case di perlukan untuk beberapa case lain. Jika penguji memanggil test case lain maka peguji dapat memanggil free condition.
	
  Dalam pembuatan test case jangan mengasumsikan firtur dari perangkat yang sedang di uji. Dimana pengujian harus sesuaikan ketentuan dan dokumen spesifikasi, dalam pengujian pastikan software tester udah memeriksa semua fitur sistem secara keseluruhan dan juga memenuhi persyaratan perangkat lunak yang ada di dokumen spesifikasi. Software testing dapat menggunakan traceability Matrix untuk memastikan bahwa tidak ada fungsi yang belum teruji. Test case harus dapat diindentifikasi, nama dari test case id harus indefikasi sehingga memudahkan software tester melacak eror atau meindentifikasikan persyaratan perangkat lunak pada tahap berikut nya.

	4. Repeat table and soft stending 
	Dalam pembuatan test case, test case harus menghasilkan hasil sama setiap kali tidak pedulu siapa penguji nya.
	
	5. Peer review
	Peer review dibauat harus dapat di tinjau oleh orang lain, hal ini memungkinkan orang lain menemukan cacat yang terlewatkan.
	
Contoh test case

Test case positif 
	- Enter valid email and valid password

Test case negatif 
	- Enter valid email and invalid Password
	- Enter valid email and valid Password
	- Enter invalid email and invalid Password
