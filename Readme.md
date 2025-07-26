Performance Sequential vs Parallel 
--

Buat riset sederhana tentang tingkat paralel pada suatu test.

1. Berikan laporan time (waktu) jika ada 2 atau lebih test menggunakan sekuensial.
2. Berikan laporan time (waktu) jika ada 2 atau lebih test menggunakan paralel.
3. Berikan insight dari kedua hasil tersebut.

Langkah Pembuatan
--
1. membuat 2 class yang beri nama:TestClassA & TestClassB
2. di setiap masing-masing class, diberikan 2 method pegujian sederhana
3. diberikan perulangan (for) di masing-masing method dari 2 class untuk memberi beban kerja pengganti dari thread.sleep. 
apabila ingin menggunakan thread.sleep juga bisa
4. buat folder/package resources di folder test
6. buat sequencetest.xml yang berisi sequence di folder/package resources dan 
7. buat paralleltest.xml di folder/package resources untuk parallel nya
8. atur bagian pom.xml nya menambahkan maven testng, dan tambahkan di bagian configuration:
   <suiteXmlFile>src/test/resources/sequencetest.xml</suiteXmlFile>
   <suiteXmlFile>src/test/resources/paralleltest.xml</suiteXmlFile>
9. jika sudah, maka dapat dijalankan melalui terminal jika menggunakan vscode
10. jika dijalankan menggunakan intiliej maka bisa memilih sidebar kiri maven, klik clean & test secara bersamaan, lalu klik run
11. untuk menjalankan test, dibagian pom nya tepat di configuration, di pilih, yg mana mau dijalankan dulu, sequence atau parallel .xml nya
12. untuk melihat report, bisa ke folder target, cari "surefire-reports" dan pilih index.html, open with browser 
13. maka akan terlihat perbandingannya dibawah berikut

Hasil Pengujian
--
1. Sequential: dari gambar berikut dapat ditarik kesimpulan bahwa "total running time = 23 ms"
dengan method A01 = 17ms, A02 = 3ms, B01 = 2ms, B02 = 1ms.

![img_2.png](img_2.png)

2. Parallel: dari gambar berikut dapat ditarik kesimpulan bahwa "total running time = 35 ms"
   dengan method A01 = 16ms, A02 = 16ms, B01 = 2ms, B02 = 1ms. dengan thread.count = 2

![img_3.png](img_3.png)

Kesimpulan
--

1. Sequnce akan berjalan sesuai urutan, namun parallel bisa berjalan bersamaan di thread yang berbeda,
terlihat waktu eksekusi nya ada yg sama di parallel, maka penggunaan parallel sudah benar
2. Parallel tidak selalu lebih cepat
banyak faktor kenapa ini bisa terjadi, bisa karna ram pc user atau overhead dari pembentukkan dan pengelolaan thread
3. parallel cocok untuk menjalankan banyak test case, sehingga mempercepat total waktu testing secara signifikan
