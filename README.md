# TugasKelompokPengembanganAplikasiMobileKelompok1
Tugas Kelompok Pengembangan Aplikasi Mobile Kelompok1 TI-A

Anggota :
1. Athalariiq FIldzahhanan Ardian (245150707111052)
2. Gede Raditya Dharma Putra Ayudia (245150700111028)
3. I Gusti Ngurah Anantawijaya (245150700111027)
4. Zeva Wyakta Zaylendra (245150700111033)

# Panduan Push Project Android Studio ke Repository

README ini berisi langkah-langkah push project Android Studio ke repository GitHub dengan penjelasan yang sederhana dan mudah dipahami.

Repository project:

```bash
https://github.com/afrdian/TugasKelompokPengembanganAplikasiMobileKelompok1.git
```

## Persiapan

Sebelum mulai, pastikan:

- Project Android Studio sudah ada dan bisa dibuka.
- Git sudah terpasang di komputer.
- Kamu sudah bisa mengakses akun GitHub yang dipakai untuk push.
- Terminal Android Studio atau terminal biasa sudah siap digunakan.

## Langkah Push Pertama Kali

Bagian ini dipakai kalau project belum pernah di-push ke repository.

### 1. Buka project Android Studio

Buka project yang ingin dikirim ke repository.

### 2. Buka terminal

Di Android Studio, klik tab `Terminal` di bagian bawah.

Kalau menggunakan terminal biasa, masuk dulu ke folder project:

```bash
cd path/ke/folder-project
```

Contoh di Windows:

```bash
cd D:\AndroidStudioProjects\MyApp
```

Contoh di Linux atau macOS:

```bash
cd ~/AndroidStudioProjects/MyApp
```

### 3. Inisialisasi Git

Kalau project belum menggunakan Git, jalankan:

```bash
git init
```

Perintah ini cukup dilakukan satu kali di awal.

### 4. Hubungkan project ke repository

Jalankan:

```bash
git remote add origin https://github.com/afrdian/TugasKelompokPengembanganAplikasiMobileKelompok1.git
```

Untuk memastikan remote berhasil ditambahkan, cek dengan:

```bash
git remote -v
```

### 5. Cek file yang akan dikirim

Gunakan:

```bash
git status
```

Perintah ini menampilkan file yang belum masuk ke Git.

### 6. Tambahkan semua file project

Jalankan:

```bash
git add .
```

Perintah ini menyiapkan semua perubahan agar bisa di-commit.

### 7. Buat commit pertama

Jalankan:

```bash
git commit -m "Initial commit"
```

Commit adalah catatan perubahan yang akan dikirim ke repository.

### 8. Gunakan branch `main`

Jalankan:

```bash
git branch -M main
```

Perintah ini memastikan branch utama bernama `main`.

### 9. Push ke repository

Jalankan:

```bash
git push -u origin main
```

Penjelasan singkat:

- `push` untuk mengirim project ke GitHub.
- `origin` adalah nama remote repository.
- `main` adalah branch utama.
- `-u` dipakai agar push berikutnya cukup menggunakan `git push`.

### Ringkasan Push Pertama Kali

```bash
git init
git remote add origin https://github.com/afrdian/TugasKelompokPengembanganAplikasiMobileKelompok1.git
git status
git add .
git commit -m "Initial commit"
git branch -M main
git push -u origin main
```

## Langkah Update Project Berikutnya

Bagian ini dipakai kalau project sudah pernah di-push sebelumnya, lalu kamu melakukan perubahan dan ingin mengirim update baru.

### 1. Pastikan perubahan sudah selesai

Simpan semua file yang sudah kamu edit di Android Studio.

### 2. Cek perubahan

Jalankan:

```bash
git status
```

Dengan perintah ini, kamu bisa melihat file apa saja yang berubah.

### 3. Tambahkan perubahan ke Git

Jalankan:

```bash
git add .
```

### 4. Buat commit baru

Jalankan:

```bash
git commit -m "Menambahkan perubahan terbaru"
```

Pesan commit bisa diganti sesuai isi perubahan, misalnya:

```bash
git commit -m "Memperbaiki tampilan halaman login"
```

### 5. Push update ke repository

Jalankan:

```bash
git push
```

Karena sebelumnya sudah memakai `git push -u origin main`, maka untuk update berikutnya biasanya cukup `git push`.

### Ringkasan Update Berikutnya

```bash
git status
git add .
git commit -m "Pesan perubahan"
git push
```

## Kalau Muncul Error

### Error `remote origin already exists`

Artinya project sudah pernah dihubungkan ke repository.

Gunakan:

```bash
git remote set-url origin https://github.com/afrdian/TugasKelompokPengembanganAplikasiMobileKelompok1.git
```

### Error push ditolak

Biasanya karena repository online punya perubahan yang belum ada di lokal.

Gunakan:

```bash
git pull origin main --rebase
git push origin main
```

### Diminta login saat push

Kalau memakai GitHub, biasanya kamu perlu login ke akun GitHub atau menggunakan Personal Access Token (PAT), bukan password biasa.

## Tips Penting

- Jalankan `git status` sebelum commit agar kamu tahu file apa saja yang akan dikirim.
- Pastikan file yang tidak perlu ikut dikirim sudah masuk ke `.gitignore`.
- Untuk project Android Studio, file hasil build sebaiknya tidak ikut di-push.
- 

## Penutup

Kalau langkah-langkah di atas dijalankan dengan benar, maka project Android Studio kamu akan berhasil dikirim dan diperbarui di repository GitHub.
DAN SELESAIIIIIIIIIIIIIIIII
