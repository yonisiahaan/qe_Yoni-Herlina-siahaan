# Yoni Herlina Siahaan

# Kelas A

**Linux command :** sebuah utilitas sistem operasi linux, semua tugas dasar dan tugas lanjutan dapat dijalankan dengan commans. Commands dapat dijalankan di terminal linux. 

**Terminal** : Antarmuka baris perintah untuk berinteraksi dengan sistem yang mirip dengan Command Prompt di Operasi Windows. 

Commands di linux sensitif dengan huruf besar dan huruf kecil.

> **The command line is fully text-based, Very useful because it’s faster than using a GUI.**
> 

Baris perintah sepenuhnya **berbasis teks,** Sangat berguna karena **lebih cepat daripada** menggunakan **GUI**.

> Kelebihan Command Line : 
1. Less Resources 
Command line ringan digunakan sehingga tidak mengharuskan komputer untuk memiliki spesifikasi tinggi bila ingin menggunakan command line. 
2. Repetiteve Task Friendly
Dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali
3. Powerful
Karena hanya menggunakan teks, antar muka system operasi ini terlihat lebih stabil dibanding GUI. 

Contoh server jaringan basis command line : DEBIAN SERVER

Linex Commands Structure
Is : menampilkan semua file di directory kerja, namun dalam prakteknya command tanpa option dan paramaetr hampir tidak berguna.  Kita butuh daftar dari file di directory tertentu pada kondis yang lebih kompleks, jika tanpa menggunakan options dan paramater. 

Akan ada lebih dari 1 option dan parameter dalam satu commands.
command [options] [parameters]

#contoh
> ls -a /usr
> ls -a -l
> ls -al

Basic Commands
1. **cal** : fungsi menampilkan kalender 
2. **date** : menampilkan  tanggal dan waktu yang tertera di OS kita.

File System Command
- **touch** : **membuat file baru yang kosong melalui baris perintah linux**
    
    **touch / home / username /web.html**
    
    membuat file html berjudul web dibawah directory dokumen
    
- **cat** : **membuat daftar konten atau isi file pada standard output.**
    
    **cat nama_file.txt**
    
- **cp** : **menyalin file dari directory saat ini ke directory yang berbeda**
    
    **cp / sinery.jpg /home / username / pitcure**
    
    **cp / namafile / directory tujuan** 
    
    menyalin sinery.jpg ke directory ini ke directory pitcure
    
- **mv** : **memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti / mengubah nama file**
    1. memindahkan file
        
        **mv / nama.txt /home / username / document**
        
    2. mengganti nama file
        
        **mv / nama.txt  nama_baru.txt** 
        
- **rm** : **menghapus directory beserta isinya.** Namun harus berhati-hati saat kita berada di directory  yang ingin dihapus, karena nantinya jika sudah dihapus tidak dapat dikembalikan.

- **mkdir** : **membuat directory baru.**
    
    **mkdir music** 
    
    maka directory baru yang muncul ialah music. 
    
- **rmdir** : **menghapus directory. Namun hanya boleh digunakan untuk menghapus directory yang KOSONG saja.**

 

- **cd** : **menjelajahi file dan directory linux. Memerlukan path penuh nama directory tergantung nama directory saat ini kita berada.**
    
    saat ini berada pada :  **/home/username/documents**
    
    ingin membuka : **photos** di directory **documents**
    
    cara : **cd photos**
    
- **pwd** : **mencari path dari directory yang kita gunakan saat ini**. Command ini akan mengembalikan path yang absolut yang pada dasarnya merupakan path semua directory yang diawali dengan garis miring.
    
    **/home / username /**

 Processes Control Commands
 - **Top : menampilkan daftar proses yang berlangsung dan seberapa banyak ruang CPU yang digunakan tiap proses tersebut.**
    
    Melakukan pengawasan terhadap penggunaan resources sistem sangatlah disarankan terutama ketika kita harus mencari tahu proses mana yang harus dimatikan karena terlalu banyak menggunakan resources. 
    
- **Clear : membersihkan terminal jika didalamnya sudah terdapat banyak sekali command.**
    
    
- **History : Mengecek kembali command yang sudah ditambahkan sebelumnya.** 

Utilities Programs Command
- **ls : menampilkan semua file yang ada di directory kerja kita.**
- **Which : mencari file yang akan di eksekusi terkait dengan command yang diberikan**
- **SUDO (Super User Do) : menjalankan task yang memerlukan hak akses/ permission/administratif. Namun tidak disarankan untuk tes harian, karena dapat terjadi error kapan saja apabila kita melakukan kesalahan.**
- **Find : untuk mencari file & directory. Command ini lebih ditujukan pada file yang berlokasi di dalam directory yang diberikan.**
    
    Contoh : ingin mencari file bernama “notes.txt” didalam directory home dan sub directory nya. 
    
    find / home -name notes.txt

File Access Permissions
- **chmod : membaca , menulis, dan manjalankan permission dari file dan directory.**
- **chown : mengubah/ mentransfer kepemilikan file ke user yang spesifik.**  Karena kita tahu bahwa semua file dimiliki oleh user khusus.
chown linuxuser2 file.txt
maksud: menentukan LINUXUSER2 yang akan menjadi pemiliki dari file.txt 

Output dari sebuah comment
- **Permission** : permission dari sebuah directory
- **Count of File** : jumlah file yang ada di directory tersebut
- **Owned by (User)** : user yang memiliki directory ini
- **Owned by (Group)** : group yang memiliki directory ini
- **Size** : kapasitas dari directory ini
- **Create Date** : tanggal dibuat nya directory ini
- **File/Directory Name** : nama directory

Shell Script
- Shell, Program that functions as a bridge between the user and the kernel.
- Shell Script, a programming language compiled based on shell commands.
- **Shell Script adalah** sebuah bahasa pemograman yang disusun berdasarkan command-command shell.
- **Shell merupakan** program sebagai jembatan antara user dan kernel.
- **Keuntungan menggunakan Shell Script :**
    
    **Masalah :** Ketika ingin mengeksekusi command secara berturut-turut, hal itu harus menunggu command pertama dahulu, lalu bisa melakukan command yang berikutnya. **Solusi :** Dengan adanya SHELL SCRIPT tidak perlu menunggu lagi dan cukup menuliskan apa saja yang akan dilakukan sesuai urutan dan kemudian dieksekusi denga satu klik.


