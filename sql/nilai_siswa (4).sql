-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2019 at 05:34 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nilai_siswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nama_admin` varchar(30) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama_admin`, `email`, `password`) VALUES
(1, 'admin', 'admin@gmail.com', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `id_guru` int(11) NOT NULL,
  `nip` varchar(10) DEFAULT NULL,
  `nama_guru` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `akses` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`id_guru`, `nip`, `nama_guru`, `email`, `password`, `akses`) VALUES
(1, '120001', 'Karina Maharani', 'karina@gmail.com', 'asd123', 2),
(2, '120002', 'Ilham Fadilah', 'iyaw@gmail.com', 'iyaw12345', 1),
(3, '120003', 'Norman Adi', 'norman@gmail.com', 'norman123', 1),
(6, '120004', 'Juki Yahya', 'juki@gmail.com', 'asd123', 2);

-- --------------------------------------------------------

--
-- Table structure for table `matpel`
--

CREATE TABLE `matpel` (
  `id_matpel` int(11) NOT NULL,
  `kode_matpel` varchar(5) DEFAULT NULL,
  `nama_matpel` varchar(255) DEFAULT NULL,
  `nip` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matpel`
--

INSERT INTO `matpel` (`id_matpel`, `kode_matpel`, `nama_matpel`, `nip`) VALUES
(1, 'MTK', 'Matematika', '120001'),
(2, 'BIND', 'B.Indonesia', '120005'),
(3, 'BING', 'B.Inggris', '120006'),
(4, 'IPA', 'Ilmu Pengetahuan Alam', '120003'),
(5, 'IPS', 'Ilmu Pengetahuan Sosial', '120004'),
(6, 'PA', 'Pendidikan Agama', '120007'),
(7, 'PKN', 'Pendidikan Kewargenagaraan', '120008'),
(8, 'SBK', 'Seni Budaya dan Keterampilan', '120009'),
(9, 'PJORK', 'Pendidikan Jasmani, Olah Raga, dan Kesehatan', '120010');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `id_nilai` int(11) NOT NULL,
  `nis` varchar(10) DEFAULT NULL,
  `kode_matpel` varchar(100) DEFAULT NULL,
  `uts` int(11) DEFAULT NULL,
  `uas` int(11) NOT NULL,
  `tugas` int(11) NOT NULL,
  `tahun_ajaran` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id_nilai`, `nis`, `kode_matpel`, `uts`, `uas`, `tugas`, `tahun_ajaran`) VALUES
(2, '150001', 'MTK', 100, 0, 0, '2018/2019'),
(3, '150001', 'BIND', 100, 0, 0, '2018/2019');

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `id_siswa` int(11) NOT NULL,
  `nis` varchar(10) DEFAULT NULL,
  `jenis_kelamin` varchar(1) NOT NULL,
  `nama_siswa` varchar(50) NOT NULL,
  `alamat_siswa` text NOT NULL,
  `kelas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`id_siswa`, `nis`, `jenis_kelamin`, `nama_siswa`, `alamat_siswa`, `kelas`) VALUES
(1, '150001', 'L', 'Muhammad Firdaus', 'Jl. Swakarsa 1 No 42 RT 03 / RW 04, Jatibening Baru, Pondok Gede Bekasi', 10),
(2, '150002', 'L', 'Jajang Nurjaman', 'Jl. Raya Jakarta No 42 RT 04 / RW 01\nJatibening Baru, Pondok Gede, Bekasi', 10),
(3, '150003', 'P', 'Lala Maharani', 'Jakarta Selatan', 10),
(4, '150004', 'L', 'Jamal Jamaludin', 'Bekasi', 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`id_guru`,`email`) USING BTREE;

--
-- Indexes for table `matpel`
--
ALTER TABLE `matpel`
  ADD PRIMARY KEY (`id_matpel`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`id_nilai`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`id_siswa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `guru`
--
ALTER TABLE `guru`
  MODIFY `id_guru` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `matpel`
--
ALTER TABLE `matpel`
  MODIFY `id_matpel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `nilai`
--
ALTER TABLE `nilai`
  MODIFY `id_nilai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `siswa`
--
ALTER TABLE `siswa`
  MODIFY `id_siswa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
