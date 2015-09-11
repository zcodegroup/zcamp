# Pengulangan Menggunakan For

## Goal
* Siswa mengethaui syntax java untuk melakukan pengulangan menggunakan `FOR`
* Siswa memahami kapan `FOR` digunakan

## Durasi
20 menit

## Tools
* Text editor: notepad, gedit, vi, dan sejenisnya
* Command line atau terminal

## Materi

#### Kenapa Pakai FOR?
Pada materi sebelumnya kita belajar untuk menampilkan tulisan menggunakan perintah, `System.out.println('Bingo!');`. Jika kita ingin menampilkan tulisan tesebut sebanyak 3 kali maka kita akan menuliskan perintah yang sama sebanyak 3 kali.

```java
System.out.println('Bingo!');
System.out.println('Bingo!');
System.out.println('Bingo!');
```

Bagaimana jika kita ingin menampilkan tulisan tersebut sebanyak 100 kali misalkan. Menuliskan perintah yang sama berkali2 adalah cara yang kurang tepat. Kode kita akan menjadi sangat panjang karenanya. Sehingga untuk melakukan ini kita dapat menggunakan fungsi pengulangan. Dalam materi ini kita akan mempelajari fungsi pengulangan menggunakan `FOR`.


#### Bagaimana FOR bekerja?
```java
for(int i=0; i<100; i++){
	System.out.println("Bingo!");
}
```

Potongan program di atas akan melakukan pengulangan untuk menampilkan tulisan `Bingo!` sebanyak 100 kali. Perintah tersebut sangat pendek bukan? Bandingkan jika kita harus menulis perintah yang sama sebanyak 100 baris.

Variable `i` pada potongan program di atas berfungsi sebagai penghitung, sudah berapa kali pengulangan ini berjalan. Bagaimana cara kerja for?

1. Ngasih tahu komputer ada variable i yang nilainya 0
2. Cek apakah i kurang dari 100? Saat ini nilai i adalah 0. Jadi pertanyaan ini akan dijawab, YES.
3. Karena jawaban pada langkah sebelumnya YES, maka program akan menampilkan tulisan 'Bingo!'
4. Selanjutnya nilai i akan diincrement dengan perintah `i++`. Sehingga niali i menjadi 1
5. Seperti pada step ke-2, program akan cek, apakah i kurang dari 100? Saat ini nilai i sudah menjadi 1. `1 < 100` jawabannya YES
6. Sama seperti step ke-3, karena jawaban pada langkah sebelumnya YES, maka program akan menampilkan tulisan 'Bingo!'
7. Nili i akan diincrement lagi, sehingga nilai i menjadi 2
8. Step ke-2 sampai ke-4 akan dilakukan terus menerus sehingga kondisi `i<100` TIDAK terpenuhi. Mulai kapan kondisi tersebut tidak terpenuhi? Saat nilai i sama dengan 100. `100 < 100` jawabannya NO. Saat ini fungsi pengulangan akan berakhir



#### Bagaimana FOR dapat membantu hidup saya?
```java
for(int i=0; i<100; i++){
	System.out.println("Bingo! ke-" + i);
}
```

Nilai i pada fungsi pengulangan di atas dapat kita pakai pada blok `for`. Sehingga pada banyak kasus hal ini akan menjadi sangat bermanfaat. Potongan program tersebut akan menghasilkan output sebagai berikut:

```
Bingo! ke-0
Bingo! ke-1
.
.
.
Bingo! ke-99
```

Kenapa mulainya dari 0 bukan dari 1? Karena kita memberikan nilai awal untuk i adalah 0 (`int i=0`). 

Kenapa akhirnya 99 bukan 100? Karena pada saat i bernilai 100, kondisi `i < 100` tidak terpenuhi, sehingga program g sempet untuk menampilkan `Bingo! ke-100`.


```
int n = 5;
int faktorial = 1;
for(int i=1; i<=n; i++){
	faktorial = faktorial * i;
}
```

Potongan program tersebut akan membantu kita melakukan penghitungan faktorial dari `5` (`5!`). Dalam setiap pengulangan tersebut akan dilakukan perkalian dengan hasil sebelumnya. Dengan kata lain, proses tersebut membentuk operasi perkalian sebagai berikut: `1 x 2 x 3 x 4 x 5`. Dalam contoh di atas, nilai i dimulai dari 1 dan pada pengecekan ada kondisi sama dengan. Ini sedikit perubahan saja:

`for(int i=0; i<5; i++)` ===> memproses dari 0 s.d. 4

`for(int i=1; i<=5; i++)` ===> memproses dari 1 s.d. 5





