-- MySQL dump 10.13  Distrib 5.7.18, for Win32 (AMD64)
--
-- Host: localhost    Database: info
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `admins`
--

DROP TABLE IF EXISTS `admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admins` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `ID` int(11) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admins`
--

LOCK TABLES `admins` WRITE;
/*!40000 ALTER TABLE `admins` DISABLE KEYS */;
INSERT INTO `admins` VALUES ('Admin','password',1);
/*!40000 ALTER TABLE `admins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `streams`
--

DROP TABLE IF EXISTS `streams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `streams` (
  `StreamID` int(11) NOT NULL,
  `StreamType` varchar(5) DEFAULT NULL,
  `StreamName` varchar(10) DEFAULT NULL,
  `StreamDuration` int(11) DEFAULT NULL,
  `StreamFees` int(11) DEFAULT NULL,
  `StrEligibility` varchar(5) DEFAULT NULL,
  `Seats` int(11) DEFAULT NULL,
  PRIMARY KEY (`StreamID`),
  UNIQUE KEY `StreamName` (`StreamName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `streams`
--

LOCK TABLES `streams` WRITE;
/*!40000 ALTER TABLE `streams` DISABLE KEYS */;
INSERT INTO `streams` VALUES (10001,'SE','CCWP_PHP',12,8000,'UG/PG',15),(10002,'SE','CCCP',12,7000,'10+2',55),(10003,'SE','CCFA',12,7000,'10+2',49),(10004,'SE','ITES_BPO',12,7000,'10+2',57),(10005,'SE','CECN',12,7000,'10+2',49),(20001,'LTT','A_LEVEL',48,31000,'O_LVL',60),(20002,'LTT','O_LEVEL',48,16000,'10+2',120),(20003,'LTT','ADHNS',48,25000,'Grad',60),(30001,'STT','CCAJ',8,4000,'10+2',120),(30002,'STT','RMEP',8,5000,'10+2',60),(30003,'STT','ESDPIC',8,8000,'DPLMA',60),(30004,'STT','DSIP',12,16000,'UG',60),(30005,'STT','STP',6,3500,'10+2',NULL),(30006,'STT','PTP',4,1500,'BTech',NULL);
/*!40000 ALTER TABLE `streams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `StudentID` int(11) NOT NULL,
  `StName` varchar(40) DEFAULT NULL,
  `StCategory` varchar(3) DEFAULT NULL,
  `StreamID` int(11) DEFAULT NULL,
  `StQualification` varchar(10) DEFAULT NULL,
  `StGender` varchar(15) NOT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Mayank Sinha','GEN',30006,'BTech','Male'),(2,'Saurabh','OBC',30006,'BTech','Male');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-08 17:17:13
