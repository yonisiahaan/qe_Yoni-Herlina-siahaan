# Yoni Herlina Siahaan

# QE-A

Quick Analyze

Case 1

Response Time : Rendah (LOW)

Throughput : Rendah (LOW)

Conclude : Kasus ini tidak pernah terjadi.

Case 2

Response Time : Rendah (LOW)

Throughput : Tinggi (HIGH)

Conclude : Ketika laporan menunjukkan bahwa waktu Respons rendah dan Throughput sangat tinggi. Itu berarti Server bekerja dengan sangat baik. Tes kinerja lulus atau Anda dapat mempertimbangkan untuk menambah beban dan terus mencari tahu batasan Server

Case 3

Response Time : Tinggi (HIGH)

Throughput : Rendah (LOW)

Conclude : Ketika kami menemukan skenario di mana waktu Respons untuk permintaan tinggi tetapi Throughput jauh lebih rendah Ini menandakan bahwa Server tidak cukup mampu untuk mempertahankan/mengeksekusi permintaan. Yang meminta penyetelan di sisi server

Case 4

Response Time : Tinggi (HIGH)

Throughput : Tinggi (HIGH)

Conclude : Ketika waktu Respon tinggi tetapi Throughput dibandingkan dengan Waktu respons jauh lebih tinggi Ini menyiratkan bahwa permintaan memakan waktu lebih lama karena kesalahan dalam aplikasi, mungkin skripnya tidak cukup baik. Kita tidak boleh menyalahkan waktu pemrosesan server untuk ini. Sekarang saatnya untuk mempertimbangkan faktor-faktor lain dan menyesuaikannya untuk membuat kinerja aplikasi lebih baik.

Normal Load = Kondisi suatu sistem ketika user akses sistem di angka yang biasanya heavy load = Kondisi suatu sistem ketika user akses sistem dia angka yang meledak di saat waktu khusus(ada event tertentu)

USUAL SPECIAL EVENT
==> Kapasitas user yang bisa ditampung ketika mengakses fitur yang biasanya ditujukan untuk suatu event khusus seperti 12.12(tanggal cantik)

==> Target User per hourly visit = 30 % diatas normal, maka = (0.3* 0,1827) + 0,1827 = 0,24 M

==> Average visit duration = 15 menit = 0,25 Jam

==> Concurrent User adalah = target user * average user = 0,24 *0,25 = 0,06 M

Quick Special Event
==> Kapasitas user yang bisa ditampung ketika mengakses fitur yang biasanya ditujukan untuk suatu event khusus namun dengan durasi yang sebentar, misalnya flash sale

==> Target user per hourly visit = 70% diatas normal = (0.7 * 0,1827) + 0,1827 = 0,31 M

Alasan penggunaan user 70 % diatas normal karena pada umumnya pengguna akan lebih tertarik dengan adanya event seperti flash sale ini dikarenakan barang-barang lebih murah dan banyak yang diskon sehingga event seperti ini adalah event yang ditunggu oleh user dari produk e-commerce sehingga user pun pasti akan melonjak lebih banyak dari normal load**
==> Average visit duration = 18,5 menit = 0.3 Jam

==> Conccurent User adalah = target user * average user = 0.31 * 0.3 = 0,093 M

Usage In E-Commerce :
Apa endpoint yang biasanya akan di lakukan testing :
Endpoint-endpoint yang biasa dilakukan test untuk dilihat performansi nya adalah endpoint-endpoint dari fitur yang utama dari sebuah produk itu yang dimana fitur-fitur tersebut merupakan sumber utama tujuan dibangunnya produk e-commerce. Untuk e commerce biasanya yang menjadi fitur yang HARUS dilakukan testing adalah :

Endpoint Cart

Endpoint Login

Endpoint Halaman Product

Endpoint Pembayaran

Endpoint Checkout

Endpoint Register

Kendala yang muncul ketika performance test
Salah dalam pemilihan tools untuk performance

Strategi yang digunakan tidak tepat ketika melakukan pengujian

Terbatasnya waktu serta anggaran yang dikeluarkan karena untuk melakukan performance testing biaya yang dibutuhkan sangat besar

Pemahaman yang kurang akan pentingnya performance test

Kesulitan dalam melakukan pengujian pada lingkungan produksi