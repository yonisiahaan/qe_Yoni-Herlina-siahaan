# Yoni Herlina Siahaan


# QE-A


Iterable merupakan Sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya.

Seluruh daftar interface dalam hierarchy merupakan struktur data yang dapat dilakukan perulangan terhadap masing-masing data yang disimpan.

General-Purpose Implementations adalah implementasi yang paling sering digunakan yang didesain untuk penggunaan setiap hari.Mereka dirangkum dalam tabel berjudul General-purpose-implementations.

Seluruh daftar interface dalam hierarchy merupakan struktur data yang dapat dilakukan perulangan terhadap masing-masing data yang disimpan.

General-Purpose Implementations adalah implementasi yang paling sering digunakan yang didesain untuk penggunaan setiap hari.Mereka dirangkum dalam tabel berjudul General-purpose-implementations.

Collection merupakan kumpulan dari objek atau data yang diletakkan   dalam satu tempat yang sama (Collection of Objects).setiap kelompok objek individu yang direpresentasikan sebagai satu unit adalah untuk mengetahui sebagai kumpulan objek

Method Collection
add()
addAll()
clear()
contains()
containsAll()
equals()
hashCode()
isEmpty()
Iterator()
remove()
removeAll()
stream()
toArray()

Immutable list merupakan bagian dari list tapi tidak dapat diubah datanya.

Stack menyimpan data secara linear tetapi dalam proses penambahan dan pengambilan datanya, menggunakan last-in-first-out (LIFO), artinya data yang baru dimasukkan akan dikeluarkan terlebih dahulu Contohnya tumpukan buku.

Set merupakan sebuah struktur data yang dapat menyimpan sekumpulan data secara linear seperti ist, tetapi set  tidak dapat menerima data yang duplikat.

1. Merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linear 
2. List merupakan turunan dari interface collection 
3. List juga menerima nilai yang sama , sehingga apabila meng-input 2kali data yang sama , tetap dapat dilakukan
4. Urutan data pada list tergantung kapan data tersebut dimasukkan kedalam list, maka data yang dimasukkan pertama , akan menjadi urutan pertama , maka urutan selanjutnya akan menyusul ke urutan berikutnya. 

Method pada List :

- Menambah
- Menghapus
- Mengecek

Apakah data tersedia dalam list , dan mengecek apakah list yang satu sama dengan list yang lainnya .

Implementasi dari interface List :

- Abstract List
- Array List
    - Menyediakan penyimpanan data yang dinamis artinya tidak terikat dengan kapasitas yang dapat disimpan oleh ArrayList tersebut
    - Data yang dimpan oleh ArrayList bisa sebanyak apapun , selama memori data dari komputer masih sanggup untuk menyimpan data tersebut
    
    
    Array List Work : 
    
    Step 1 : Pembuatan Array List (Array Initialization) yang data nya masih kosong 
    
    Step 2 : Menambah elemen pada Array List , maka masing2 posisi akan terisi 
    
    Step 3 : Ketika data sudah penuh , lalu kita tetap memaksa memasukkan data kedalam Array List maka, 
    
    Step 4 : Array List akan membuat array baru dan memindahkan seluruh data pada array tersebut 
    
    Step 5 : Akan dilakukan hal yang sama , jika kapasitas penyimpanan sudah penuh 
    
    Maka sebetulnya panjang dari Array List terbatas , tetapi Array List dapat memanjangkan dirinya sehingga seolah-olah data yang dapat disimpan iyu tidak terbatas


- Linkedlist
    - Merupakan struktur data yang menyimpan setiap elemen nya saling terhubung satu sama lain , cara Linked List menghubungkan satu elemen dengan elemen yang lainnya adalah dengan menyimpan alamat memori dari masing-masing elemen , baik elemen setelah atau sebelumnya .
    - Jadi apabila ada sebuah elemen terdapat dalam Linked List , pada elemen tersebut akan menyimpan alamat memori dari elemen yang sebelumnya
    - Lalu elemen sebelumnya juga akan menyimpan alamat memori dari elemen yang sebelumnya lagi.

    Perbedaan Array List dan Linked List :

1. Secara Structure /Alur :
    
    Pada Array List —> Terbentuk ruang kosong , lalu akan diisi data 
    
    pada Linked List : 
    
    - Berbentuk seperti gerbong kereta api , elemen pertama akan menyimpan data yang akan disimpan (tidak kosong)
    - menyimpan alamat memori data yang berikutnya, maka akan terhubung elemen satu dengan elemen yang lainnya.

    - Accessing element :
    - Array List O(1) artinya konstan
    - Linked List O(n) artinya mengakses elemen yang memiliki kemungkinan untuk memerlukan waktu yang lebih lama
- Insert/remove from begining
    - Array List O(n) artinya bisa lebih lama dari Linked List
    - Linked List memiliki waktu yang lebih cepat yaitu O(1)
- Insert / remove from end
    - Array List dan Linked List memiliki waktu yang sama
- Insert /remove from middle
    - Array List dan Linked List memiliki waktu yang sama