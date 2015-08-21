# Input dari user

## Goal
* Siswa memahami cara untuk menerima input dari luar

## Durasi
20 menit

## Tools
* Text editor: notepad, gedit, vi, dan sejenisnya
* Command line atau terminal

## Materi
```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int n = scanner.nextInt();
        System.out.println("Anda memasukan angka: " + n);
    }
}
```
### Instruksi
Simpan, compile, run code program di atas

### Output Program
```
Masukan Angka: <silahkan masukan angka kemudian enter>
Anda memasukan angka: <angka yang Anda masukan akan tampil di sini>
```

### Penjelasan
```java
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
```
Pada blok kode ini Anda mendeklarasikan sebuah objek `scanner`. Objek scanner ini kemudian digunakan untuk meminta masukan dari user. Dalam kasus ini program secara spesifik meminta masukan berupa angka (integer). Sehingga menggunakan `.nextInt()`. Scanner tidak ada dalam library sehingga perlu kita lakukan import library dengan perintah: `import java.util.Scanner`


### Latihan
1. Buat sebuah program yang menerima input String (name) kemudian program akan mengeluarkan tulisan: "Selamat belajar, [name]"

	Contoh
	```
	windu
	Selamat belajar, windu
	```

	```
	wito
	Selamat belajar, wito
	```
2. Zinedine sedang belajar membuat program untuk mencatat penjualan di warung umi nya. Sebagai awalan dia ingin programnya menerima inputan nama barang **B** dan jumlah barang **N**. Program akan menampilkan tulisan: "Penjualan **B** sebanyak **N**"

	Contoh
	```
	Buku
	5
	Penjualan Buku sebanyak 5
	```
	```
	Pensil
	3
	Penjualan Pensil sebanyak 3
	```

### Bantuan
Untuk menerima input String gunakan `.nextLine()`. Untuk menerima input integer gunakan `.nextInt()`