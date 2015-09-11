# Operasi Aritmatika

## Goal
* Siswa mengethaui syntax java untuk melakukan penjumlahan, pengurangan, perkalian, pembagian, modulo, increment dan decrement

## Durasi
20 menit

## Tools
* Text editor: notepad, gedit, vi, dan sejenisnya
* Command line atau terminal

## Materi
```java
public class Aritmatika{
	public static void main(String[] args){
		int a = 10;
		int b = 20;

		//penjumlahan
		int c = a + b;

		//pengurangan
		int d = a - b;

		//perkalian
		int e = a * b;

		//pembagian
		int f = b / a;

		//modulo
		int g = b % a;

		//increment
		++a;

		//decrement
		--a;

		System.out.println("a = " + a + " | b = " + b);
		System.out.println("penjumlahan a + b: " + c);
		System.out.println("pengurangan a - b: " + d);
		System.out.println("perkalian a * b: " + e);
		System.out.println("pembagian b * a: " + f);
		System.out.println("modulo b % a: " + g);
		System.out.println("modulo 5 % 2: " + 5 % 2);
		System.out.println("modulo 7 % 3: " + 7 % 3);
	}
}
```
## Output
```
a = 10 | b = 20
penjumlahan a + b: 30
pengurangan a - b: -10
perkalian a * b: 200
pembagian b * a: 2
modulo b % a: 0
modulo 5 % 2: 1
modulo 2 % 5: 2
```

## Penjelasan
* `Modulo` adalah sisa hasil pembagian. `5 % 2` dapat dijabarkan menjadi `5 - ((5 / 2) * 2) = 5 - (2 * 2) = 5 - 4 = 1`. Catatan `5 / 2` di-floor ya sehingga hasilnya `2` bukan `2.5`.

	7 % 3 adalah 1

	8 % 2 adalah 0

	15 % 6 adalah 3
* `Increment` adalah 'tambah satu'. Komputer akan menambahkan satu dari variable yang diincrement. Misal `int x = 4; ++x;` maka nilai x menjadi 5.
* `Decrement` adalah 'kurangi satu'. Komputer akan mengurangi satu dari variable yang didecrement. Misal `int y = 4; --y;` makan nilai y menjadi 3



## Latihan
* Buat sebuah program yang menerima 2 input integer **A** dan **B**. Program akan memberikan dua output **X** dan **Y**. Di mana **X** adalah penjumlahan dari **A** dan **B**, sedangkan **Y** adalah **A** dikurangi **B**. `X = A + B` dan `Y = A - B`.

	Contoh

	```
	7
	8
	15
	-1
	```
	```
	120
	100
	220
	20
	```
* Zinedine mengembangkan program sebelumnya yang dia buat. Kali ini dia ingin programnya dapat melakukan perhitungan. Pertama user akan diminta memasukan nama barang. Kedua user akan diminata memasukan harga satuan barang. Ketiga user akan diminta memasukan jumlah barang yang dijual. Kemudian program akan menampilkan text: 'Total yang harus dibayar ...'.
	
	Tampilan

		Nama Barang: <s>
		Harga Barang: <p>
		Jumlah Barang: <n>
		Total yang harus dibayar dari penjualan <s> : <p * n>

	Contoh

	```
	Nama Barang: Buku
	Harga Barang: 2000
	Jumlah Barang: 5
	Total yang harus dibayar dari penjualan Buku: 10000
	```
	```
	Nama Barang: Pensil
	Harga Barang: 1000
	Jumlah Barang: 8
	Total yang harus dibayar dari penjualan Pensil: 8000
	```
* Zara diberikan sejumlah kue oleh umi. Dia diminta untuk membagian kue tersebut ke beberapa tetangga di sekitar rumah. Bantu Zara untuk menentukan berapa kue yang harus diberi ke setiap tetangga, dengan catatan setiap tetangga harus menerima jumlah kue yang sama.

	Tampilan

		Jumlah Kue: <x>
		Jumlah Tetangga: <y>
		Jumlah kue yang akan diberikan ke setiap tetangga adalah: <x / y>

	Contoh

		Jumlah Kue: 20
		Jumlah Tetangga: 5
		Jumlah kue yang akan diberikan ke setiap tetangga adalah: 4