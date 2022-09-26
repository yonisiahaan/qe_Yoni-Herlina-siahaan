# Yoni Herlina Siahaan

# QE-A

- APA Itu BDD
    
    >Proses software development yang menerapakan penulisan test case sebelum developer menuliskan intruction code nya. Proses BDD sendiri berfokus pada komponen-komponen nya dalam sistem  test case di tulis dalam bahasa pemograman. serupa dengan TDD juga menerapkan konsep test first namun dengan fokus yang berbeda developer akan menuliskan scenario yang menjelaskan behavior sistem dari sprefektif pengguna. scenario di tuliskan dengan format bahasa dengan yang mudah di pahami oleh seluruh stackholder dalam pengembangan sistem .
    
    - Tujuan utama BDD
        
        untuk meningkatkan  komunikasi dan kolaborasi antara seluruh stack hoder, tim bisnis maupun teknikal yang terlibat dalm pengembangan sistem . Hal ini dapat membantu dalam memastikan bahwa fitur-fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim , komunikasi yang baik dapat menyatukan presepsi tasckholder berbeda-beda dalam suatu pemahaman dalam ekspetasi yang sama serta fitu-fitur dalam sistem memenuhi kebutuhan pengguna dan menghasilkan bisnis value. Prinsip dasr BDD adalah mendeskripsikan behaviour dari sebuah sistem tanpa melibatkan pejelasan implementasi secara rinci . Terdapat pemisahaan antara kedua nya , dalam pendekatan BDD seluruh stackholder, teknik kal dan non tecnikal salaing berkolaborasi untuk mendeskripsikan kebutah pengguna dan kebutuhan fucsional sistem yang dituliskan melalalui picture file, deskripsi yang ada di picture file berperan sebagai test logic dan kemudian akan menjadi dasar bagi quality assurence.
        
        Dalam menuliskan test skrip implementasi pengujian dan dasr bagi developer dalam menuliskan implementasi code nya untuk membangun sistem .
        
        Picture file pada BDD dituliskan menngunakan bahsa gerkin dengan format dalam bahasa inggris yang mudah dipahami oleh siapa pun.

        - Apa itu Cucumber
    
    untuk melakukan serangkain behaviour test ada sebuah tools yang di sebut cucumber , cucumer adalah sebuah toolsd yang mendukung BDD.  Cucumber membaca searangkain ketentuan yang dapat di eksekusi diaman ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakuakan apa yang dituliskan dalam ketentuan tersebut.

    Cara menginstal cucumber :

Pertama,pastiin udh install java 17 yang udh kukirim
trus pastiin udh make java 17 juga di local environment kita
pastiin di intelij juga udh make java 17 cara memeriksanya: java --verison)
trus kalau udh,bikin project maven kayak yang dibikin ka aisyah kmrn
pomnya ,masukin yang udh aku kasih dari tag propertiesnya sampe kebawah
Terus mvn clean verify di terminal
Baru masukin la yang udh kita kerjain kayak kak aisyah kemarin
trus nge runnya pake mvn clean verify lagi