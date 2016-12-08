CREATE DATABASE  IF NOT EXISTS `nerdstore` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `nerdstore`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: 192.168.1.101    Database: nerdstore
-- ------------------------------------------------------
-- Server version	5.7.16-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Dummy`
--

DROP TABLE IF EXISTS `Dummy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Dummy` (
  `idDummy` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDummy`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ORDERS`
--

DROP TABLE IF EXISTS `ORDERS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ORDERS` (
  `ORDER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CLIENT_NAME` varchar(45) DEFAULT NULL,
  `CLIENT_EMAIL` varchar(130) DEFAULT NULL,
  `CLIENTE_ADDRESS` varchar(45) DEFAULT NULL,
  `BRROBOTICS_ORD_ID` varchar(45) DEFAULT NULL,
  `STARKSYSTEM_ORDER_ID` varchar(45) DEFAULT NULL,
  `BRROBOTICS_VAL_TOTAL` decimal(12,2) DEFAULT NULL,
  `STARKSYSTEM_VAL_TOTAL` decimal(12,2) DEFAULT NULL,
  `CARDOPR_TRANSACTION` varchar(45) DEFAULT NULL,
  `CARDOPR_NAME` varchar(45) DEFAULT NULL,
  `CARDOPR_FEE` decimal(12,2) DEFAULT NULL,
  `ORDER_VAL_TOTAL` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'nerdstore'
--

--
-- Dumping routines for database 'nerdstore'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-07 19:21:39
