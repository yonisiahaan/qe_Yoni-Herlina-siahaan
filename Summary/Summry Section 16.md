# Yoni Herlina Siahaan

# QE-A

API adalah singkatan untuk ”Application programming Interface”, API memiungkinkan komu/ Sistem yang terumnkasi dan pertukaran data antara 2 atau lebih software.

API Testing merupakan test yang dilakukan pada layanan dimana API yang di desain untuk berinteraksi atau berkomunukasi pada aplikasi di pastikan fungsional test nya melalui rangkaian atau set dari sebuah test. API testing diharapkan memberikan gambaran bagiamana respon dari aplikasi web tanpa atau sebelum di mulai nya siap

API testing memiliki tujuan yakni :Meluaskan cakupan testing itu sendiri dan melakukan testing sedini mungkin dimana jiwai belum sepenuhnya siap di ikut sertakan dalam proses testing.

API Testing di bedakan menjadi 3 yakni :

1. Functionality berfungsi untuk memvalidasi suatu fungsi apakah sudah berfungsi atau belum
2. Lood Test bertujuan untuk menguji kekuatan suatu sistem apakah mampu mengolah data atau beban yang diberikan
3. Security memiliki tujuan untuk keamanan dari suatu sistem.

API Testing Tools yakni :

- postman
- Frisby
- JMeter
- Rest-assured

Perbedaan API test dan Unit Test yaitu :

1. Unit test dilakukan oleh developer sedangkan API TEst dilakukan Tester
2. Unit test functional nya terpisah sedanglkan API Test tidak 
3. Unit Test Developer dapat mengakses source code sedangkan API Test tidak bisa
4. Unit Test hanya dasar fuctionality nya saja yang di test sedangkan API Test  hanya fungsi nya saja yang di test dan semua functional issue nya.
5. Unit Test scopenya terbatas dan API Test scopenya lebih luas.
6. Unit Test biasnya dilakukan sebelum build sedangkan API Test dilakukan setelah build

Tahap-tahap melakukan testing:

- spesifikasi review ini bertujuan untuk mereview dari spesifikasi API  dan use case dokumen
- Spesifikasi Development untuk memastikan detail test  dokumen dan ekspetasi hasil nya di setiap test case
- Framwork Development untuk meilih tools apa dalam API testing nanti .
- Test Case Development untuk membuat test scenario maupun test case nya
- dan terakhir Execution & Report untuk mentest secenario yang kita buat dan membuat report testing yang kita lakukan.

Contoh Test Case dalam API Testing :

1. Apakah respon sudah sesuai dengan request yang kita lakukan ?
2. Apakah reqest yang kita lakukan sudah menerima respon ?
3. Apakah fitur ini mengganggu yang lain yang sedang eksisdi.
4. apakah ada update struktur datanya.

Best Practices of API Testing:

- kita kelompokkan dulu test case kedalam beberapa kategori.
    
    contoh : satu fitur ini memilki get, post dan put kita satukan pada satu folder dengan nama tersebut.
    
- kemudian berikan judul yang sesuai pada setiap test.
    
    contoh : kita akan melakukan testing method “Get” user, kita bisa beri nama API tersebut dengan “Get User”
    
- Kemudian kita harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
- Terakhir ketika membuat test case harus dipikirkan juga segala kombinasi input API.

Types of ouput of an API yakni :

1. Biasanya berbentuk apa saja, namun pada umumnya JSON atau XML.
2. Status balikan(Response) apakah passed atau fail
3. Memanggil Fungsi API lain.

Types of Test In API Testing yakni :

- Memverifikasi apakah kita mendapatkan rspon dari API
- Memverifikasi apakah hasil input/request sudah selesai atau belum.
- Memverifikasi apakah data yang kita inputatau output sudah benar-benar berubah atau bertambah.
- Memverifikasi waktu respon yang di berikan.

 

Macam-macam Bugs saat kita melakukan testing:

1. Gagal melakukan erro handling pada keadaan tertentu.
2. Kesulitan untuk tersambung dan mendapatkan respon API.
3. Isu keamanan.
4. Erro atau Warning yang tidak tepat.
5. Struktur dari data respon tidak benar (JSON & XML)