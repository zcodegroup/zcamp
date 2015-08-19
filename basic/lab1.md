#Pengenalan Syntax Java

## Goal
* Siswa dapat membuat program sederhana tanpa melihat contekan
* Siswa faham struktur class dan main method
* Siswa dapat `compile` dan `run` program

## Durasi
30 menit

## Tools
* Text editor: notepad, gedit, vi, dan sejenisnya
* Command line atau terminal

## Materi
```java
public class Main{
	public static void main(String[] args){
		System.out.println("Hello world!");
	}
}
```
###Instruksi
1. Tulis kode di atas, kemudian simpan dengan nama Main.java
2. Compile pada command line atau terminal dengan perintah: `javac Main.java`
3. Run pada command line atau terminal dengan perintah: `java Main`
4. Pada text editor, Ctrl+A kemudian delete. Kemudian ulangi proses nomor 1 s.d. 3 tanpa melihat contekan

*Note: jangan remehkan instruksi ke-4. Pastikan Anda mengerjakannya. Usahakan Anda hafal setiap kata dan baris code di atas. Dengan begitu, pada pertemuan selanjutnya Anda akan merasa mudah.*

###Penjelasan
* Blok kode di atas kita sebut kelas Main, yaitu berdasarkan statement pada baris pertama `public class Main`. Jika Anda diminta membuat kelas `Student` maka baris pertamanya `public class Student`.
	*`public class Hitung` --- kelas Hitung
	*`public class Hewan` ---- kelas Hewan

* Nama kelas 'harus' dimulai huruf besar
	*benar `public class Employee`
	*benar `public class EmployeeBean`
	*salah `public class employee`
	*salah `public class employeebean`
	*salah `public class Employeebean`

* Nama file harus sama dengan nama kelas
