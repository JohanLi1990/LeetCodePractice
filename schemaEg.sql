-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.9.1-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for solissdb
CREATE DATABASE IF NOT EXISTS `solissdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `solissdb`;

-- Dumping structure for table solissdb.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `BrandName` varchar(150) NOT NULL,
  `Interface` varchar(150) DEFAULT NULL,
  `OSType` varchar(50) DEFAULT NULL,
  `Platform` varchar(255) DEFAULT NULL,
  `supItem` varchar(50) DEFAULT NULL,
  `MPName` varchar(255) NOT NULL,
  `MPPDMRef` varchar(100) DEFAULT NULL,
  `CIName` varchar(255) DEFAULT NULL,
  `Scheme` varchar(255) DEFAULT NULL,
  `Application` varchar(1000) DEFAULT NULL,
  `Applets` varchar(1000) DEFAULT NULL,
  `PAPDMRef` varchar(20) DEFAULT NULL,
  `CIPDMRef` varchar(20) DEFAULT NULL,
  `CIReleaseDate` varchar(20) DEFAULT NULL,
  `ChipPDMRef` varchar(20) DEFAULT NULL,
  `ChipCode` varchar(60) DEFAULT NULL,
  `FormFactor` varchar(150) DEFAULT NULL,
  `AdditionalInfo` varchar(1000) DEFAULT NULL,
  `CreatedBy` varchar(50) DEFAULT NULL,
  `ModifiedDate` datetime DEFAULT NULL,
  `SolissInternalId` bigint(20) DEFAULT NULL,
  `Version` varchar(50) DEFAULT NULL,
  `CreationDate` datetime DEFAULT NULL,
  `ModifiedBy` varchar(50) DEFAULT NULL,
  `Status` enum('Live','Test','Obsolete','Deleted','Temp') DEFAULT NULL,
  `Workflow` int(11) NOT NULL,
  `XmlName` varchar(255) NOT NULL,
  `ParentsId` bigint(10) DEFAULT NULL,
  `Labels` varchar(4096) DEFAULT NULL,
  `CatalogType` varchar(255) DEFAULT 'Product',
  `MinCertExpirationDate` date DEFAULT NULL,
  `Antenna` varchar(50) DEFAULT NULL,
  `ContactProtocol` varchar(20) DEFAULT NULL,
  `ContactlessProtocol` varchar(20) DEFAULT NULL,
  `AuthenticationMethod` varchar(10) DEFAULT NULL,
  `CardbodyType` varchar(255) DEFAULT NULL,
  `ProductManager` varchar(50) DEFAULT NULL,
  `UsageInfo` varchar(1000) DEFAULT NULL,
  `LOEReference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93834 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
