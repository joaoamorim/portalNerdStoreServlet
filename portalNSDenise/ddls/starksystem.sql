CREATE DATABASE  IF NOT EXISTS `starksystem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `starksystem`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: 192.168.1.101    Database: starksystem
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
-- Table structure for table `DISCOUNT_RULES`
--

DROP TABLE IF EXISTS `DISCOUNT_RULES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DISCOUNT_RULES` (
  `ID_OFFER` int(11) NOT NULL AUTO_INCREMENT,
  `ID_PRODUCT` int(11) NOT NULL,
  `DESCRIPTION` varchar(45) DEFAULT NULL,
  `QTD_MIN` int(11) NOT NULL,
  `QTD_MAX` int(11) NOT NULL,
  `RULE` varchar(45) NOT NULL,
  `START_OFFER` datetime DEFAULT NULL,
  `END_OFFER` datetime DEFAULT NULL,
  PRIMARY KEY (`ID_OFFER`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `PEDIDOS`
--

DROP TABLE IF EXISTS `PEDIDOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PEDIDOS` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `CLIENTE` varchar(40) NOT NULL,
  `ENDERECO` varchar(100) NOT NULL,
  `ESTADO` varchar(10) NOT NULL,
  `QTD_REATOR_SOLAR` int(11) NOT NULL,
  `QTD_REATOR_ARK` int(11) NOT NULL,
  `TOTAL_REATOR_SOLAR` double NOT NULL,
  `TOTAL_REATOR_ARK` double NOT NULL,
  `TOTAL` double NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `PRODUCTS`
--

DROP TABLE IF EXISTS `PRODUCTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRODUCTS` (
  `PRODUCT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRICE` decimal(12,2) DEFAULT NULL,
  `DESCRIPTION` varchar(45) DEFAULT NULL,
  `PICTURE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `STOCK`
--

DROP TABLE IF EXISTS `STOCK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `STOCK` (
  `PRODUCT_ID` int(11) NOT NULL,
  `QTD` int(11) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'starksystem'
--

--
-- Dumping routines for database 'starksystem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-07 19:22:08
