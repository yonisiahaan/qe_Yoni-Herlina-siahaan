# Yoni Herlina Siahaan

# QE - A

** Introduction Basic Programming **

Bahasa pemograman java adalah bahasa yang beriorentasi pada object, dan programa java tersusun dari bagian yang disebut dengan class. Class sendiri terdiri dari berbagai metode yang melakukan pekerjaan dan mengembalikan informasi setelah melakukan tugasnya. 

 **2 HAL PENTING YANG HARUS DIPELAJARI PADA JAVA**
    1. Bagaimana menggunakan class yang terdapat pada Java API
    2. Mempelajari Java itu sendiri 
    
    Tidak ada cara lain selain class itu sendiri yang menyatakan cara eksekusi program.
    
**ALASAN PENGGUNAAN BAHASA PROGRAM JAVA**
    1. **Java memiliki struktur/sytax yang sederhana** dibandingkan bahasa pemrograman lain
    2. **Hanya berfokus pada objek**,sehingga program komputer dapat saling berinteraksi dengan mudah hanya dengan komunikasi 1 kelompok objek
    3. **Pengamanan yang cukup ketat.** Terdapat 3 lapis pengamanan pada Java sebagai pelindung sistem dari penyalahgunaan dari orang-orang yang tidak bertanggung jawab.
    4. **Dapat digunakan pada Sytem Operasi manapun.** Bahasa pemrograman Java yang dapat digunakan pada tidak terikat ke OS apapun. Hal ini dapat dilakukan karena java merupakan platform independen. Sehingga jika dilajalankan , programa dapat di jalan perangkat manapun.
    5. **Menggunakan sistem Exception Handling.** Dimana dapat memisahkan antara pengamanan **kode kesalahan** dan **kode normal**,sehingga kode program dapat diarahkan structure ke kode program yang lebih bersih,karena jika menemukan kesalahan java akan langsung menemukan Exception. Exception dapat dikelola program tanpa memberikan dampak yang lebih buruk
    6. **Mendukung Native Method,** dimana native method artinya sebuah fungsi yang ditulis di bahasa lain seperti C dan C++. Dengan adanya native method, memungkinkan programmer menulis fungsi yang bisa dilakukan lebih cepat dibanding yang lain. 
    7. **Terdapat Garbage Collector**. Garbage Collector yang berfungsi untuk mengumpulkan sampah secara otomatis, adanya garbage collector ini programmer tidak perlu dibebani dengan adanya memori yang rusak. 
    8. **Daftar Pustaka / Library yang lengkap.** 
    9. **Terdapat Fitur GUI(Graphical User Interface).** 
    10. **Penyempurnaan dari dengan C++ (Mirip)**
    11. **Dapat digunakan di beberapa platform.** ”Write once Run everywhere”

 **TIPE DATA PADA JAVA PROGRAMMING LANGUAGE**
    Tipe data adalah sebuah pengklasifikasian berdasarkan jenis data tersebut. Tipe data dibutuhkan agar compiler dapat mengetahui bagaimana sebuah data bagaimana digunakan. 
    
    1. **Integer** : angka atau bilangan bulat
    2. **Char** : Tipe data karakter
    3. **Float** : bilangan desimal kapasitasnya lebih kecil. Menandai nilai yang presisi seperti ketelitian tunggal dengan penyimpanan 32 bit. Tipe ini memiliki kemampuan yang lebih cepat jika di gunakan pada prosesor-prosesor tertentu dan pastinya menggunakan ruang penyimpanan yang lebih kecil daripada float. Kemudian float akan bermasalah jika nlainya terlalu kecil atau terlalu besar.  
    4. **Double** : bilangan desimal juga, kapasitasnya lebih besar. Memiliki ketelitian tingkat ganda / double presisi dengan penyimpanan 64 bit. Memiliki kemampuan menghitung sistematis secara lebih cepat dari tipe float. Jika ingin menghitung dan hasil lebih real dan akurat gunakan tipe double. 
    5. **String** : kumpulan dari karakter dengan panjang tertentu dan sering kali dianggap menjadi tipe data DASAR karena tipe paling sering digunakan oleh programmer. 
    6. **Char** : tipe data untuk menyimpan satu huruf, angka, tanda baca, simbol atau spasi kosong. Biasanya digunakan untuk menyimpan karakter alphabet dengan menampilkan masing-masing karakter menggunakan kode numerik kecil. Penyimpanan karakter ini biasanya disimpan sebagai bilangan bulat tidak bertanda berukuran 8 bit dalam rentang code 0-255. 
    7. **Boolean** : tipe data yang hanya bernilai true dan false. Penting saat pengambilan suatu keputusan tertentu. 

        ```java
        //TipeData.java
        
        public class TipeData{
        	public static void main(String[] args){
        		int number = 1;
        		float angka = (float) 0.0000009;
        		double total = 0.0000000000015;
        		String word = "Alterra Academy";
        		char huruf = 'a';
        		boolean status = false;
        	}	
        }
        
        
- **ARRAY**
    
    **Array merupakan** sebuah variabel yang menampung banyak data atau angka atau karakter. Array menggunakan indeks untuk mempermudah akses terhadap data yang disimpannya.
    
    - Indeks array selalu dimulai dari 0.
    - Indeks tidak selalu dalam bentuk angka, bisa juga karakter ataupun teks.
    - Penggunaan array terdapat 3 cara yaitu :
        - String [] kelas;
        - String kelas [];
        - String [] kelas = new String[5];
    
    Pada array, untuk setiap data yang didalamnya terdapat penanda yang disebut sebagai Indeks dimana penghitungan untuk Indeks dimulai dari 0,namun untuk jumlah/kapasistas array tetap dihitung dari 1. 
    
    **Contoh 1 :**
    
    String [] kelas = {"a","b","c"}
    
    - indeks a=0,b=1,dan c=2
    - Kapasitas array 3
    
    Ketika ingin melakukan pencetakan pada array,maka akan menjadi :
    
    ```java
    System.out.println("Indeks array 1 adalah " [1]);
    //hasilnya = b
    ```
    
    **Contoh 2 :**
    
    ```java
    //Array.java
    public class Array{
    	public static void main(String[] args){
    			char[] alterra = new char[]{
    				'a','l','t','e','r','r','a'
    			}; 
    			System.out.println(alterra[0]);
    	}	
    }
    ```
    - **OPERATOR**
    
    Operator digunakan untuk melakukan operasi tertentu misalnya untuk menjumlahkan variabel dll. 
    
    Operator digunakan dalam pemograman  untuk melakukan operasi tertentu.
    
    Beberapa operator dalam java :
    
    1. Operator **Assignment (=)**
        
        Operator yang digunakan untuk memberikan nilai ke suatu variabel.
        
        ```java
        public class Operator{
        	public static void main(String[] args){
        		String word = "Alterra Academy";
        		
        		System.out.println(alterra[word]);
        	}	
        }
        
        //Hasil nya "Alterra Academy"
        ```
        
        Pada code diatas fungsi dari assignment adalah mengassign value dari “alterra acdemy” ke dalam variabel “word”
        
    2. **Operator Aritmatika** 
        
        operator ini digunakan untuk eksplisit matematika, seperti operasi aljabar dan sebagaimanya. operator yang termasuk ke aritmatika seperti -, x, +, dan : 

        java
        public class Operator{
        	public static void main(String[] args){
        	
        		int a = 10;
        		int b = 15;
        
        		int sum = a+b;
        
        		System.out.println("Hasil dari penjumlahan : " + sum);
        	}	
        }
        //Hasil nya "25"
        ```
        
    
    1. **Operator Perbandingan / Relasional dan quality**
        
        merupakan operator membandingkan dua variabel  atau membandingkan dua buah nilai apakah itu sama besar (=),Lebih kecil (<), lebih besar(>) dan hasil nya adalah bolean.
        
        ```java
        public class Operator{
        	public static void main(String[] args){
        	
        		int a = 10;
        		int b = 15;
        
        		boolean result = a > b;
        
        		System.out.println("Hasil dari kondisi : " + result;
        	}	
        }
        //Hasil nya "false"
        ```
        
    2. **Operator Conditional** 
        
        Operator conditional digunakan untuk  menghasil kan 2 kondisi yaitu “true” atau “false”  dari dua kondisi atau lebih.

- **INPUT/OUPUT**
    
    **Input adalah** nilai yang kita masuk kan ke program 
    
    **Proses adalah** step by step yang dilakukan untuk mengelola input menjadi output
    
    **Ouput adalah** hasil dari pengelolahan dari input.
    
    - **3 Class Untuk Mengambil Inputnya yaitu:**
        - **1. Class scanner**
            
            **Scanner adalah** class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard agar kita bisa melakukan scanner kita perlu mengimport nya ke dalam kode nya dan ada library khusus untuk scanner.
            
            Untuk menggunakan Scanner, kita perlu 
            
            - membuat objek dari class Scanner, class tersebut berada didalam package *java.util.** ,
            - jadi kita perlu menginport packagenya terlebih dahulu,
            - setelah package dan objek selesai dibuat,
            - selanjutnya kita membutuhkan sebuah variabel untuk menampung nilai yang di inputkan dari user.
            
            Contoh :
            
            ```java
            import java.util.Scanner;
            public class Operator{
            	public static void main(String[] args){
            		
            		String nama, alamat;
            		int usia, gaji;
            		
            		Scanner keyboard = new Scanner(Syatem.in);
            
            		System.out.println("### Data Karyawan Alterra");
            		System.out.println("Nama : ");
            		nama = keyboard.nextLine();
            		System.out.println("Alamat : ");
            		alamat = keyboard.nextLine();
            		System.out.println("Usia : ");
            		usia = keyboard.nextInt();
            		System.out.println("Gaji : ");
            		gaji = keyboard.nextInt();
            		
            		
            		System.out.println("=================");
            		System.out.println("Nama karyawan: " + nama);
            		System.out.println("Alamat karyawan: " + alamat);
            		System.out.println("Usia karyawan: " + usia);
            		System.out.println("Gaji karyawan: " + gaji);
            	}	
            }
            ```
            
        - **2. Class BufferedReader**
            
            Pada bagian ini, kita akan menggunakan class BufferedReader, class tersebut berada di dalam package *java.io*, class ini digunakan untuk mendapatkan input dari user, hampir sama seperti Scanner, yang membedakan hanya cara penulisan syntaxnya saja.
            
        - **3. Class JOption**
            
            Cara terakhir untuk mendapatkan input dari user adalah dengan menggunakan class JOptionPane calss tersebut terdapat pada package *javax.swing*. Berbeda dari class sebelunya, JOptionPane memiliki tampilan visual atau GUI untuk memudahkan pengguna, tampilan tersebut berupa dialog box standard yang memfasilitasi kepada user untuk mengkonfirmasi sesuatu.
            
    **Branching adalah sebuah istilah yang digunakan untuk menyebut alur program yang bercabang.**