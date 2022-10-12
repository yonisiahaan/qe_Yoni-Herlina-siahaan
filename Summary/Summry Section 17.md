# Yoni Herlina Siahan

# QE-A

- **Manual Testing**
    
    Pengertian manual Testing(pengujian manual) adalah langkah mencari cacat (Bug) pada program perangkat lunak, pada metode ini tester atau penguji berperan penting sebagai pengguna akhir untuk pengecekan semua fitur aplikasi bekerja dengan benar. Penguji melakukan mengecekan secara manual, tanpa mengunakan tools atau scrips bertujuan untuk memastikan jika aplikasi yang di uji bebac cacat dan aplikasi perangkat lunak dapat bekerja sesuai dengan yang di harapkan. Manual testing berperan penting saat pengujian visual, dimana autometion tools tidak adapat melakukan nya. manaual Tester dapat mengetahui kontras nya antar button dan background yang lebih terang sehingga user kesulit membedakan mencari “button” dan memahami tindakan yang di ambil.User interface(UI) Feedback adalah hal yang digunakan automation testing.
    
    - **Kelebihan Saat Melakukan Manual Testing**
        1. Mendapatkam Visual Feedback
            
            tools dan skrip tidak mendapatkan opini maupun input mengenai tampilan UI 
            
        2. Less expensive the softend project
            
            jika melakukan test aplikasi sederhana yang tidak terlalu updates maka manual testing tidak perlu menggunakan tools atau software yang mahal.
            
        3. The human ellements
            
            Bisa mendapatkan feedback secara dari orang secara langsung sehingga mengtahui suka dan tidak suka, dimana automation tools memberikan feedback tersebut.
            
    - **Kekurangan Saat Melakukan Manual Testing**
        1. kurang teliti dari automation testing, tekadang terdapat human erro , ketidak telitian sehingga jika menggunakan automation testing akan mengurangi bug yang terlewat.
        2. Not possible reuse , jika menemukan perubahan maka melakukan pengecekan awal agar memastikan perubahan baru tidak merusak aplikasi yang sudah jadi serta kelelahan dari tester.  jika QA tester sangat familiar dengan aplikasi yang dia test sacara terus-menerus sehingga QE tester sangat memahami alur dari aplikasi tersebut.
- **Automation Testing**
    
    Merupakan testing yang membutuhkan automation tools untuk menjalankan test case , untuk maelakukan proses automation testing Quality Assurens perlu untuk membuat code atau skirip testing. Skrips tersebut akan digunakan dalam batuan automation testing tools yang telah ditulis dengan benar kemudian di jalankan dengan automation testing akan melakukan validasi sacara otomatis pada software yang di testing. Automation testing bergantung pada skrips test seacra otomatis berfungsi untuk membandingakan hasil yang diharapkan dengan hasil yang sebenar nya. quality assuren juga akan melihat apakah software sudah berjalan sesuai ekspetasi atau tidak .
    
    - **Kelebihan Saat mengunakan Automation Testing**
        1. Dapat menemukan lebih banyak dari pada manual tester.
        2. Kecepatan dan efesiensi
            
            skrip lebih cepat dari pada tester sehingga dapat cepat selesai menemukan bug
            
        3. Test dapat dilakuakan sacara berulang dengan koding yang dapat di upload secara berkala. jika mendapatkan selalu mendapatkan update perubahan masing-masing unit atau fitur maka tidak perlu menulis skrip setiap saat dan dapat digunakan kembali Regretion Testing.
    - **Kekurangan Saat mengunakan Automation Testing**
        1. Biaya nya lebih mahal karena mengunakan Automation tools namun mengurangi waktu serta usabilitas
        2. Kurangnnya human elemen 
            
            Seperti pada info sebelum nya manual testing memberikan human eleman , melakukan interaksi human saeacar visual 
            
        3. Tiadak adanya feedback mengenai UI
            
            tanpa adanya human elemen maka tidak bisa melakukan pengecekan seperti warna kontraks, pemilihan font dan button size.
            
    - **Kenapa Mengunakan Automation Testing**
        
        Automation testing adalah cara yang terbaik untuk meningkatkan efektivitas cakupan pengujian  dan kecepatan eksekusi daalam pengujian perangkat lunak. Software automation testing penting karena beberapa alasan berikut ini :
        
        1. Manual testing yang dilakukan dari semua alut kerja, bidang , semua scenario negatif akan memakan waktu dan uang.
        2. Sulit menguji situs, multi bahasa secara manual.
        3. Automation test  dalam perangkat lunak akan memerlukan campur tangan manusia. kita dapat menjalankan automation test tanpa pengawasan .
        4. Automation test meningkatkan kecepatan dari eksekusi test
        5. Test automation membantu meningkatkan code dari test itu sendiri.
    - **Ada beberapa test case yang dapat kita automat**
        1. Test case tersebut di executed berulangkali .
            
            ketika melakukan nya seacra manual itu akan membuang waktu kita sebaik nya itu kita automet.
            
        2. Test case yang sulit atau susah dilakukan seacara manual
        3. Test case yang membutuhkan waktu lama saat melakukan test manual.
    - **Test case yang tidak bisa di automet**
        1. Test case yang dirancang dan tidak di executed sama sekali  
        2. serta test case yang memiliki request sering berubah-ubah
    - **Proses Automation Testing**
        1. Test tools selection
            
            Pemilihan tools sangat bergantung teknologi yang digunakan untuk membangun aplikasi sedang di uji
            
        2. Define scope of automation 
            
            Merupakan area dimana aplikasi software yang sedang di uji akan diotomisasi
            
            ada beberapa point untuk menentukan scope :
            
            - Yang pertama fitur-fitur yang penting untuk bisnis
            - scenario yang memiliki banyak data
            - fungsionalitas umum diselurus aplikasi
            - Kelayakan teknis
            - sejauh mana komponen bisnis digunakan kambali
            - kompleksitas test case
            - kemampuan dapat mengunakan test case yang sama untuk pengujian lintas brows
        3. Planning, design and development 
            
            Selama fase ini kita akan membuat strategi dan rencana automation yang nanti nya akan  berisi beruapa yang tools automation yang  dipilih , desan kerangkang dan fitur-fitur nya, Item automation yang didalam dan diluar cakupan persiapan test case automation, jadwal dan time line dari skripting serta hasil automation testing yang berupa report 
            
        4. Test execution
            
            Skrip yang akan dibuat akan dijalani pada fase ini , skrip membutuhkan inputan data sebelum di set untuk di jalankan setelah di execution akan menghasilkan sebuah report atas hasil dari automation test yang kita jalankan , execution yang dijalankan dapat manual test atau automation 
            
        5. Maintenance 
            
            test automation maintenance adalah face dimana automation test dilakukan untuk menguji apakah fungsionalitas baru apakah perangkat lunak atau software berfungsi dengan baik atau tidak . automation test mantenance dilakukan setelah skrip automation baru ditambahkan dan perlu direview untuk meningkatkan efeksivitas skrip automation setiap siklus rilis yang berurutan 
            
        - **Automation Best Practices**
            1. Scope automation perlu dijelaskan seacra rinci sebelum dimulai nya projek, ini menetapkan ekspektive automation dengan benar 
            2. Memilih automation tools yang tepat , saat memilih jangan di pilih sesuai dengan popularitas saja tapi sesuai persyaratan automation dengan performace test nya .
            3. Memilih framwork yang sesuai 
            4. skripting yang standar
                
                standar yang sesuai untuk automation testing, beberapa standar tersebut adalah :
                
                - Pembuatan skrip, commen dan tipe code harus seragam
                - selanjutnya penanganan pengecualian yang memadai, bagaimana kesalahan ditangani pada kegagalan sistem atau perilaku aplikasi yang tidak terduga
                - merror mistek yang ditentukan user akan di standarisasi  agar dipahami oleh tester
            5. Measure metrics
                
                keberhasilan automation ditentukan dengan membandingakn efrot manual dengan ifort automation tapi juga membandingkan beberapa matriks seperti : 
                
                - presentasi bug yang ditemukan
                - waktu yang diperlukan untuk automation testing setiap siklus liris
                - waktu minimal untuk rilis
                - indeks kepuasan user
                - serta peningkatan produktivitas