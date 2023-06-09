-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2020 at 03:22 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sarasi_book_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `book_table`
--

CREATE TABLE `book_table` (
  `book_id` int(6) NOT NULL,
  `book_name` varchar(30) DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `purch_price` int(4) DEFAULT NULL,
  `quantity` int(4) DEFAULT NULL,
  `sell_price` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `book_table`
--

INSERT INTO `book_table` (`book_id`, `book_name`, `category`, `author`, `purch_price`, `quantity`, `sell_price`) VALUES
(1, 'Gaming is life', 'games', 'lakshan', 200, 3, 400),
(2, 'Harry Potter', 'N', 'J.K.R.', 500, 0, 1500);

-- --------------------------------------------------------

--
-- Table structure for table `customer_book`
--

CREATE TABLE `customer_book` (
  `cus_id` int(6) NOT NULL,
  `book_id` int(6) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer_book`
--

INSERT INTO `customer_book` (`cus_id`, `book_id`, `date`) VALUES
(1, 2, '2020-03-05'),
(2, 2, '2020-03-06'),
(3, 1, '2020-03-06'),
(4, 1, '2020-03-06');

-- --------------------------------------------------------

--
-- Table structure for table `customer_stationery`
--

CREATE TABLE `customer_stationery` (
  `cus_id` int(6) NOT NULL,
  `sta_id` int(6) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer_stationery`
--

INSERT INTO `customer_stationery` (`cus_id`, `sta_id`, `date`) VALUES
(2, 1, '2020-03-06'),
(4, 2, '2020-03-06');

-- --------------------------------------------------------

--
-- Table structure for table `customer_table`
--

CREATE TABLE `customer_table` (
  `cus_id` int(6) NOT NULL,
  `cus_name` varchar(30) DEFAULT NULL,
  `cus_tele` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer_table`
--

INSERT INTO `customer_table` (`cus_id`, `cus_name`, `cus_tele`) VALUES
(1, 'Naruto', 778657450),
(2, 'Sasuke', 778657453),
(3, 'Kakashi', 754567890),
(4, 'Sakura', 754567895);

-- --------------------------------------------------------

--
-- Table structure for table `publisher_book`
--

CREATE TABLE `publisher_book` (
  `pub_id` int(6) NOT NULL,
  `book_id` int(6) NOT NULL,
  `date` date DEFAULT NULL,
  `cost` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `publisher_book`
--

INSERT INTO `publisher_book` (`pub_id`, `book_id`, `date`, `cost`) VALUES
(1, 1, '2020-03-01', 1000),
(2, 2, '2020-03-02', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `publisher_table`
--

CREATE TABLE `publisher_table` (
  `pub_id` int(6) NOT NULL,
  `pub_name` varchar(30) DEFAULT NULL,
  `pub_tele` int(10) DEFAULT NULL,
  `pub_mail` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `publisher_table`
--

INSERT INTO `publisher_table` (`pub_id`, `pub_name`, `pub_tele`, `pub_mail`) VALUES
(1, 'kushan', 712345678, 'kushan@gmail.com'),
(2, 'chandima', 778678970, 'chandima@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `stationery_table`
--

CREATE TABLE `stationery_table` (
  `sta_id` int(6) NOT NULL,
  `sta_name` varchar(20) DEFAULT NULL,
  `purch_price` int(4) DEFAULT NULL,
  `quantity` int(4) DEFAULT NULL,
  `sell_price` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `stationery_table`
--

INSERT INTO `stationery_table` (`sta_id`, `sta_name`, `purch_price`, `quantity`, `sell_price`) VALUES
(1, 'pen', 10, 99, 20),
(2, 'pencil', 5, 99, 10);

-- --------------------------------------------------------

--
-- Table structure for table `supplier_stationery`
--

CREATE TABLE `supplier_stationery` (
  `sup_id` int(6) NOT NULL,
  `sta_id` int(6) NOT NULL,
  `date` date DEFAULT NULL,
  `cost` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `supplier_stationery`
--

INSERT INTO `supplier_stationery` (`sup_id`, `sta_id`, `date`, `cost`) VALUES
(1, 1, '2020-03-02', 1000),
(2, 2, '2020-03-04', 500);

-- --------------------------------------------------------

--
-- Table structure for table `supplier_table`
--

CREATE TABLE `supplier_table` (
  `sup_id` int(6) NOT NULL,
  `sup_name` varchar(20) DEFAULT NULL,
  `sup_tele` int(10) DEFAULT NULL,
  `sup_mail` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `supplier_table`
--

INSERT INTO `supplier_table` (`sup_id`, `sup_name`, `sup_tele`, `sup_mail`) VALUES
(1, 'eranga', 778090987, 'eranga@gmail.com'),
(2, 'podda', 776789945, 'podda@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book_table`
--
ALTER TABLE `book_table`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `customer_book`
--
ALTER TABLE `customer_book`
  ADD PRIMARY KEY (`cus_id`,`book_id`);

--
-- Indexes for table `customer_stationery`
--
ALTER TABLE `customer_stationery`
  ADD PRIMARY KEY (`cus_id`),
  ADD UNIQUE KEY `sta_id` (`sta_id`);

--
-- Indexes for table `customer_table`
--
ALTER TABLE `customer_table`
  ADD PRIMARY KEY (`cus_id`);

--
-- Indexes for table `publisher_book`
--
ALTER TABLE `publisher_book`
  ADD UNIQUE KEY `pub_id` (`pub_id`),
  ADD UNIQUE KEY `book_id` (`book_id`);

--
-- Indexes for table `publisher_table`
--
ALTER TABLE `publisher_table`
  ADD PRIMARY KEY (`pub_id`);

--
-- Indexes for table `stationery_table`
--
ALTER TABLE `stationery_table`
  ADD PRIMARY KEY (`sta_id`);

--
-- Indexes for table `supplier_stationery`
--
ALTER TABLE `supplier_stationery`
  ADD UNIQUE KEY `sup_id` (`sup_id`),
  ADD UNIQUE KEY `sta_id` (`sta_id`);

--
-- Indexes for table `supplier_table`
--
ALTER TABLE `supplier_table`
  ADD PRIMARY KEY (`sup_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer_book`
--
ALTER TABLE `customer_book`
  ADD CONSTRAINT `customer_book_ibfk_2` FOREIGN KEY (`cus_id`) REFERENCES `customer_table` (`cus_id`);

--
-- Constraints for table `customer_stationery`
--
ALTER TABLE `customer_stationery`
  ADD CONSTRAINT `customer_stationery_ibfk_1` FOREIGN KEY (`cus_id`) REFERENCES `customer_table` (`cus_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `customer_stationery_ibfk_2` FOREIGN KEY (`sta_id`) REFERENCES `stationery_table` (`sta_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `publisher_book`
--
ALTER TABLE `publisher_book`
  ADD CONSTRAINT `publisher_book_ibfk_2` FOREIGN KEY (`pub_id`) REFERENCES `publisher_table` (`pub_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `supplier_stationery`
--
ALTER TABLE `supplier_stationery`
  ADD CONSTRAINT `supplier_stationery_ibfk_2` FOREIGN KEY (`sup_id`) REFERENCES `supplier_table` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
