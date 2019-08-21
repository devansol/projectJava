-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2019 at 04:01 AM
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
(1, 'admin', 'admin@gmail.com', 'admin');

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
(6, '120001', 'Riri Nurairi', 'riri@gmail.com', 'riri123', 2),
(7, '120002', 'Dita Riri', 'dita@gmail.com', 'dita123', 1);

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
-- Table structure for table `matpel_guru`
--

CREATE TABLE `matpel_guru` (
  `id_matpel_guru` int(11) NOT NULL,
  `nip` varchar(6) NOT NULL,
  `kode_matpel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matpel_guru`
--

INSERT INTO `matpel_guru` (`id_matpel_guru`, `nip`, `kode_matpel`) VALUES
(1, '120001', 'MTK'),
(4, '120002', 'MTK');

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
  `tahun_ajaran` varchar(20) NOT NULL,
  `semester` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id_nilai`, `nis`, `kode_matpel`, `uts`, `uas`, `tugas`, `tahun_ajaran`, `semester`) VALUES
(15, '150001', 'MTK', 90, 90, 90, '2019/2020', 1),
(16, '150001', 'BIND', 100, 80, 90, '2019/2020', 1),
(17, '150001', 'BING', 0, 0, 0, '2019/2020', 1),
(18, '150001', 'IPA', 0, 0, 0, '2019/2020', 1),
(19, '150001', 'IPS', 0, 0, 0, '2019/2020', 1),
(20, '150001', 'PA', 0, 0, 0, '2019/2020', 1),
(21, '150001', 'PKN', 0, 0, 0, '2019/2020', 1),
(22, '150001', 'SBK', 0, 0, 0, '2019/2020', 1),
(23, '150001', 'PJORK', 0, 0, 0, '2019/2020', 1),
(24, '150001', 'MTK', 0, 0, 0, '2019/2020', 2),
(25, '150001', 'BIND', 0, 0, 0, '2019/2020', 2),
(26, '150001', 'BING', 0, 0, 0, '2019/2020', 2),
(27, '150001', 'IPA', 0, 0, 0, '2019/2020', 2),
(28, '150001', 'IPS', 0, 0, 0, '2019/2020', 2),
(29, '150001', 'PA', 0, 0, 0, '2019/2020', 2),
(30, '150001', 'PKN', 0, 0, 0, '2019/2020', 2),
(31, '150001', 'SBK', 0, 0, 0, '2019/2020', 2),
(32, '150001', 'PJORK', 0, 0, 0, '2019/2020', 2),
(33, '150002', 'MTK', 0, 0, 0, '2019/2020', 1),
(34, '150002', 'BIND', 0, 0, 0, '2019/2020', 1),
(35, '150002', 'BING', 0, 0, 0, '2019/2020', 1),
(36, '150002', 'IPA', 0, 0, 0, '2019/2020', 1),
(37, '150002', 'IPS', 0, 0, 0, '2019/2020', 1),
(38, '150002', 'PA', 0, 0, 0, '2019/2020', 1),
(39, '150002', 'PKN', 0, 0, 0, '2019/2020', 1),
(40, '150002', 'SBK', 0, 0, 0, '2019/2020', 1),
(41, '150002', 'PJORK', 0, 0, 0, '2019/2020', 1),
(42, '150002', 'MTK', 0, 0, 0, '2019/2020', 2),
(43, '150002', 'BIND', 0, 0, 0, '2019/2020', 2),
(44, '150002', 'BING', 0, 0, 0, '2019/2020', 2),
(45, '150002', 'IPA', 0, 0, 0, '2019/2020', 2),
(46, '150002', 'IPS', 0, 0, 0, '2019/2020', 2),
(47, '150002', 'PA', 0, 0, 0, '2019/2020', 2),
(48, '150002', 'PKN', 0, 0, 0, '2019/2020', 2),
(49, '150002', 'SBK', 0, 0, 0, '2019/2020', 2),
(50, '150002', 'PJORK', 0, 0, 0, '2019/2020', 2);

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
  `kelas` int(11) DEFAULT NULL,
  `tahun_ajaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`id_siswa`, `nis`, `jenis_kelamin`, `nama_siswa`, `alamat_siswa`, `kelas`, `tahun_ajaran`) VALUES
(12, '150001', 'P', 'Jingga', 'Jakarta', 5, '2019/2020');

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
-- Indexes for table `matpel_guru`
--
ALTER TABLE `matpel_guru`
  ADD PRIMARY KEY (`id_matpel_guru`);

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
  MODIFY `id_guru` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `matpel`
--
ALTER TABLE `matpel`
  MODIFY `id_matpel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `matpel_guru`
--
ALTER TABLE `matpel_guru`
  MODIFY `id_matpel_guru` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `nilai`
--
ALTER TABLE `nilai`
  MODIFY `id_nilai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
--
-- AUTO_INCREMENT for table `siswa`
--
ALTER TABLE `siswa`
  MODIFY `id_siswa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
