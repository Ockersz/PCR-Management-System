-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 24, 2021 at 05:05 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
-- --------------------------------------------------------

--
-- Table structure for table `tbl_loginhistory`
--

DROP TABLE IF EXISTS `tbl_loginhistory`;
CREATE TABLE IF NOT EXISTS `tbl_loginhistory` (
  `username` varchar(20) NOT NULL,
  `datetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_loginhistory`
--

INSERT INTO `tbl_loginhistory` (`username`, `datetime`) VALUES
('Himsara', '2021-08-24 18:45:28'),
('Himsara', '2021-08-24 18:52:38'),
('Himsara', '2021-08-24 18:57:37'),
('Himsara', '2021-08-24 19:16:24'),
('Himsara', '2021-08-24 19:32:12'),
('Himsara', '2021-08-24 19:48:20'),
('Himsara', '2021-08-24 19:55:58'),
('Himsara', '2021-08-24 19:58:38'),
('Himsara', '2021-08-24 20:00:09'),
('Himsara', '2021-08-24 20:02:10'),
('Himsara', '2021-08-24 21:45:19'),
('Himsara', '2021-08-24 21:47:48');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_registerdusernamepass`
--

DROP TABLE IF EXISTS `tbl_registerdusernamepass`;
CREATE TABLE IF NOT EXISTS `tbl_registerdusernamepass` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_registerdusernamepass`
--

INSERT INTO `tbl_registerdusernamepass` (`username`, `password`) VALUES
('Himsara', 'Himsara56');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_testinfo`
--

DROP TABLE IF EXISTS `tbl_testinfo`;
CREATE TABLE IF NOT EXISTS `tbl_testinfo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sampleid` varchar(20) NOT NULL,
  `vname` varchar(50) NOT NULL,
  `vid` varchar(13) NOT NULL,
  `vgender` varchar(8) NOT NULL,
  `vage` int NOT NULL,
  `vtel` varchar(13) NOT NULL,
  `vaddres` varchar(50) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  `Province` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `District` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`id`,`sampleid`),
  UNIQUE KEY `sampleid` (`sampleid`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_testinfo`
--

INSERT INTO `tbl_testinfo` (`id`, `date`, `sampleid`, `vname`, `vid`, `vgender`, `vage`, `vtel`, `vaddres`, `status`, `Province`, `District`) VALUES
(1, '2021-08-24 18:46:50', '1', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(2, '2021-08-24 18:47:27', '2', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(3, '2021-08-24 18:47:33', '3', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(4, '2021-08-24 18:47:37', '4', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(5, '2021-08-24 18:47:41', '5', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(6, '2021-08-24 18:47:44', '6', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(7, '2021-08-24 18:47:48', '7', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(8, '2021-08-24 18:47:52', '8', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Ragama', 'Negative', 'Western', 'Gampaha'),
(9, '2021-08-24 18:48:41', '9', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Possitive', 'Central', 'Nuwara Eliya'),
(10, '2021-08-24 18:48:45', '10', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Possitive', 'Central', 'Nuwara Eliya'),
(11, '2021-08-24 18:49:02', '11', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Not Tested', 'Central', 'Nuwara Eliya'),
(12, '2021-08-24 18:49:20', '12', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Not Tested', 'NorthCentral', 'Anuradhapura'),
(13, '2021-08-24 18:49:25', '13', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Not Tested', 'NorthCentral', 'Anuradhapura'),
(14, '2021-08-24 18:49:30', '14', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Not Tested', 'NorthCentral', 'Anuradhapura'),
(15, '2021-08-24 18:49:34', '15', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Nuwara Eliya', 'Not Tested', 'NorthCentral', 'Anuradhapura'),
(16, '2021-08-24 18:50:29', '16', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Badulla', 'Not Tested', 'Uva', 'Badulla'),
(17, '2021-08-24 18:50:33', '17', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Badulla', 'Not Tested', 'Uva', 'Badulla'),
(18, '2021-08-24 18:50:38', '18', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Badulla', 'Not Tested', 'Uva', 'Badulla'),
(19, '2021-08-24 18:50:42', '19', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Badulla', 'Not Tested', 'Uva', 'Badulla'),
(20, '2021-08-24 18:50:49', '20', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Badulla', 'Not Tested', 'Uva', 'Badulla'),
(21, '2021-08-24 19:50:19', '21', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Jaffna', 'Possitive', 'Northern', 'Jaffna'),
(22, '2021-08-24 19:51:25', '22', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Puttalam', 'Possitive', 'NorthWestern', 'Puttalam'),
(23, '2021-08-24 19:51:56', '23', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Kandana', 'Possitive', 'Western', 'Gampaha'),
(24, '2021-08-24 19:52:23', '24', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Kandana', 'Possitive', 'NorthCentral', 'Anuradhapura'),
(25, '2021-08-24 19:53:15', '25', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Kandana', 'Possitive', 'Central', 'Matale'),
(26, '2021-08-24 19:53:34', '26', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Kandana', 'Possitive', 'Sabaragamuwa	', 'Kegalle'),
(27, '2021-08-24 19:53:47', '27', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Kandana', 'Possitive', 'Eastern', 'Trincomalee'),
(28, '2021-08-24 19:54:03', '28', 'Himsara', '199934512621', 'male', 22, '0770462998', 'Kandana', 'Possitive', 'Uva', 'Badulla');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_userinfo`
--

DROP TABLE IF EXISTS `tbl_userinfo`;
CREATE TABLE IF NOT EXISTS `tbl_userinfo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `nic` varchar(13) NOT NULL,
  `age` int NOT NULL,
  `contact` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `work_role` varchar(18) NOT NULL,
  `workid` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_userinfo`
--

INSERT INTO `tbl_userinfo` (`id`, `name`, `nic`, `age`, `contact`, `address`, `work_role`, `workid`) VALUES
(1, 'Himsara Edurusungha', '199934512621', 22, '0770462998', 'Ragama', 'Doctor', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
