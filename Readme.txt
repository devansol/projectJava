Langkah penggunaan Aplikasi : 

1. Import Database di Mysql
- Menjalankan XAMPP pada pc anda
- Buat Database terlebih dahulu dengan nama nilai_siswa
- Import file nilai_siswa.sql yang sudah disediakan di 
  dalam folder sql
- tunggu proses import sampai selesai, maka otomatis database 
  sudah terisi sesuai kebutuhan aplikasi

2. Menjalankan aplikasi
- Buka netbeans, lalu klik file->open project, pilih projectnya
- Klik button Run pada netbeans untuk menjalankan aplikasi ketika aplikasi sudah di import
- Jika berhasil maka form login akan tampil dan silahkan anda login menggunakan 
  username : admin@gmail.com, password : admin, (user ini secara otomatis ada ketika kita
  import database di awal tadi, karena diselipkan script user admin)
- jika ingin menambahkan / menghapus / mengedit data siswa , silahkan klik button data siswa 
  pada tampilan menu utama
- jika ingin menambahkan / menghapus / mengedit data guru , silahkan klik button data guru
  pada tampilan menu utama
- Jika anda ingin menambahkan / mengedit nilai siswa, silahkan login menggunakan data guru
  yang sudah dibuat dengan mengguanakan email & password
- Hak akses 1 sebagai wali kelas , hak akses 2 sebagai guru mata pelajaran
- Jika anda login sebagai wali kelas, button yang aktif adalah "input nilai", "cetak rapot"
  anda bisa menambahkan sesuai mata pelajaran yang ingin anda tambahkan, dan mencetak rapot siswa sesuai
  nama siswa, kelas, dan tahun ajaran yang dipilih
- Jika anda login sebagai guru mata pelajaran, button yang aktif adalah hanya "input nilai", 
  anda hanya dapat menambahkan nilai sesuai mata pelajaran yang diajarkan