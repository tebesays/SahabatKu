-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2019 at 10:19 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sahabatku`
--

-- --------------------------------------------------------

--
-- Table structure for table `sahabat`
--

CREATE TABLE `sahabat` (
  `id_shbt` int(11) NOT NULL,
  `nama_shbt` varchar(50) NOT NULL,
  `foto_shbt` text NOT NULL,
  `panggil_shbt` varchar(50) NOT NULL,
  `tlp_shbt` varchar(50) NOT NULL,
  `alamat_shbt` text NOT NULL,
  `desk_shbt` text NOT NULL,
  `ig_shbt` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sahabat`
--

INSERT INTO `sahabat` (`id_shbt`, `nama_shbt`, `foto_shbt`, `panggil_shbt`, `tlp_shbt`, `alamat_shbt`, `desk_shbt`, `ig_shbt`) VALUES
(1, 'Haikal Naufal', 'https://pbs.twimg.com/profile_images/461498068295106560/y_3PTUGF_400x400.jpeg', 'Tebe', '082260008484', 'komplek polri munjul', 'ganteng parah orangnya', 'tebesays'),
(2, 'Gyver', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQS1O0mrtqT01GaiopVuQ6xn9yxiBGX8Vq4GZgq1bTcAbddeDAP', 'minday', '14045', 'kampung kepo lo', 'gyfar', 'mindychiara ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sahabat`
--
ALTER TABLE `sahabat`
  ADD PRIMARY KEY (`id_shbt`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sahabat`
--
ALTER TABLE `sahabat`
  MODIFY `id_shbt` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
