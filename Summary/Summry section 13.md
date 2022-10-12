# Yoni Herlina Siahaan

# QE-A

Map merupakan struktur data yang ada di java yang dapat digunakan untuk menyimpan banyak data di dalam nya. 

Bentuk Map di Java
**HashMap**
Merupakan implementasi dari map yang menggunakan algoritma struktur data **hashtable**

Untuk membuat HashMap, kita terlebih dahulu membuat variabel “Bulan” tipe variabel bulan adalah map yang Q nya berupa “string” dan value nya berupa “Integer” dan variabel bulan ini kita buat yang baru kemudian kita mengisi tiga data hashMap tersebut.

WeakHashMap
WeakHashMap juga mengunakan Hashtable tetapi bedanya WeakHashMap Q itu dapat di hilangkan jika tidak digunakan saat kita memanggil System.gc(); ini akan menyebabkan beberapa Q yang tidak ada lagi data nya akan hilang dari map.

IdentityHashMap
IdentityHashMap juga menggunakan HashTable tetapi jika Q referensi yang berbeda maka akan dianggap sebagai data yang berbeda.

LinkedHashMap
LinkedHashMap tidak ada perbedaan yang signifikan dengan hashMap yang biasa tetapi secara internal HashMap menerapkan doublelinklist dan juga HashTable sebagai struktur data di dalam map nya.

ImmutableMap
ImmutableMap artinya tidak dapat di ubah jadi map dalam bentuk ini tidak dapat di ubah isi nya baik ditambah atau mengubah data yang sudah ada.

Sorted Map
Artinya yang dapat di urutkan baik secara asceding maupun descending dan masing-masing penerapan map ini memiliki cara sorted nya sendiri 

