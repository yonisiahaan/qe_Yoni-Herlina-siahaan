# Yoni Herlina Siahaan

# Kelas A

OOP merupakan sebuah paradigma teknik pemograman yang berorientasi object. Pada OOP, fungsi dan variable dibungkus dalam sebuah objek atau class yang dapat saling berinteraksi, sehingga membentuk sebuah program. 

- **Tujuan OOP**
    - Mempermudah pengembangan sebuah program yang memiliki fungsi yang dibungkus kedalam object ataupun class.
    - Meminimalisir program dan membuatnya tertata rapi
    - Mempercepat pembuatan aplikasi

    - **Beberapa teknik OOP**
    - **Class**
        - Bertugas mengumpulkan prosedur atau fungsi dan variabel dalam satu tempat.
        - Class merupakan blue print dari sebuah object atau cetakan dalam membuat object.
        - Class akan mempresetasekan object yang akan dibuat.
        - Format : PascalCase. Contoh: BilanganGenap.java
    - **Object**
        
        Sebuah variabel instance yang merupakan wujud dari class. Object juga digambarkan dengan variabel dan method. 
        
    - **Atribut**
        
        Bagian dari sebuah class yang masih berhubungan erat dengan class tersebut. Atribut biasa disebuat denga properties sebuah class. Cth : class Car, dengan atribut speed
        
        ```java
        public class Car{
        	int speed;
        	int listCar;
        	int tire;
        }
        ```
        
    - **Method**
        
        Menjelaskan bagaimana suatu atribut beraksi, seperti tingkah laku atau behaviour yang dapat digambarkan oleh suatu method. Method akan disesuaikan dengan problem yang ada. 
        
    - **Inheritance (+ Extends)**
        
        Hubungan antara 2 objek atau lebih, dimana terdapat sebuah objek utama yang mewariskan atribut / method yang mewakilinya kepada objek lainnya baik secara sebagian atau keseluruhan. Contoh : seeokor anak kucing ialah berjenis mamalia. Ia akan mewarisi ciri dari induknya seperti bulu, mata, telinga.

        - **Access Modifier**
    
    **Ada 3 macam Acsess Modifier dalam Java, yaitu**
    
    - **Public**, modifier Public akan membuat member dan class bisa diakses dari mana saja.
    - **Private**, modifier Privat hanya akan membuat member atau kelas hanya bisa diakses dari dalam kelas itu sendiri. Modifier Privat tidak bisa diberikan kepada kelas, enum, dan interface.
    - **Protected**, modifier Protected akan membuat member atau kelas hanya bisa diakses dari kelas itu sendiri, sub class atau kelas anak, dan file yang satu package dengannya.