-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2022 at 10:36 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_jual`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `harga_barang` float NOT NULL,
  `jumlah_barang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga_barang`, `jumlah_barang`) VALUES
(1, 'Motherboard', 350000, 18),
(2, 'SSD 512GB', 600000, 25),
(3, 'HDD 1TB', 400000, 14),
(4, 'Mouse', 85000, 39),
(5, 'Monitor', 6000000, 9),
(6, 'Speaker', 125000, 3),
(7, 'Casing CPU', 250000, 19),
(8, 'VGA GTX 1050', 2000000, 4),
(9, 'Fan', 100000, 30),
(10, 'Keyboard Logitech', 1300000, 30);

-- --------------------------------------------------------

--
-- Table structure for table `detailjual`
--

CREATE TABLE `detailjual` (
  `no_faktur` varchar(11) NOT NULL,
  `kode_barang` varchar(5) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detailjual`
--

INSERT INTO `detailjual` (`no_faktur`, `kode_barang`, `jumlah`) VALUES
('FJ001', '2', 3),
('FJ002', '1', 2),
('FJ002', '3', 2),
('FJ003', '1', 4);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idPelanggan` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `nohp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`idPelanggan`, `nama`, `jk`, `alamat`, `nohp`) VALUES
(1, 'Jovi J', 'Laki Laki', 'Bandung', '081313162548'),
(2, 'Julian', 'Laki Laki', 'Bandung', '081313162541'),
(3, 'Hendri', 'Laki Laki', 'Bandung', '081313162542'),
(4, 'Stein', 'Laki Laki', 'Bandung', '081313162543'),
(5, 'Drevilia', 'Perempuan', 'Bandung', '081313162544'),
(6, 'Aprilia', 'Perempuan', 'Bandung', '081313162545'),
(7, 'Nisa', 'Perempuan', 'Bandung', '081313162546'),
(8, 'Evi', 'Perempuan', 'Bandung', '081313162547'),
(9, 'Windah', 'Laki Laki', 'Bandung', '081313162549'),
(10, 'Erina', 'Perempuan', 'Bandung', '081313162540');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `no_faktur` varchar(11) NOT NULL,
  `tgl_penjualan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`no_faktur`, `tgl_penjualan`) VALUES
('FJ001', '2021-11-03'),
('FJ002', '2021-11-04'),
('FJ003', '2021-11-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idPelanggan`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`no_faktur`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
