# README

Nama: Zainal Arifin
NIM:  2501179
Kelas:MKB 3A

# Kalkulator BMI

Aplikasi desktop sederhana untuk menghitung Body Mass Index (BMI) menggunakan JavaFX dan Maven.

## Fitur

- Input tinggi badan (cm atau m) dan berat badan (kg atau lb)
- Hasil BMI beserta keterangan kategori (kurang, normal, berlebih, obesitas)
- Validasi input

## Struktur Project

```
src/main
├── java
│   ├── controller   BmiController.java
│   ├── main         MainApp.java
│   └── model        Bmi.java
└── resources        form-bmi.fxml
```

## Kebutuhan

- JDK 21 atau lebih baru
- Apache Maven (atau gunakan `mvnw` bawaan project)

## Cara Menjalankan

### Lewat terminal

```bash
git clone https://github.com/zenalarif/Kalkulator_BMI.git
cd Kalkulator_BMI
mvn javafx:run
```

Tanpa Maven terpasang, gunakan wrapper:

```bash
./mvnw javafx:run        # Linux / macOS
mvnw.cmd javafx:run      # Windows
```

### Lewat NetBeans

1. Buka **File > Open Project**, pilih folder project ini.
2. Klik kanan project, pilih **Run Maven > Goals...**
3. Isi goal dengan `javafx:run`, lalu klik **OK**.

## Cara Penggunaan

1. Isi tinggi badan dan pilih satuannya.
2. Isi berat badan dan pilih satuannya.
3. Klik **Calculate** untuk melihat BMI dan keterangannya.
4. Klik **Exit** untuk menutup aplikasi.

## Kategori BMI

| BMI          | Kategori             |
|--------------|----------------------|
| < 18,5       | Berat badan kurang   |
| 18,5 – 24,9  | Berat badan normal   |
| 25 – 29,9    | Berat badan berlebih |
| >= 30        | Obesitas             |


<img width="201" height="170" alt="Screenshot 2026-11-02 095320" src="https://github.com/user-attachments/assets/6273948b-a7ab-46cb-b225-0cc8ff1ccd2d" />
