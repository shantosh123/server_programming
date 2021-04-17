-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: ourelectionproject
-- ------------------------------------------------------
-- Server version	5.7.29-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answers` (
  `answer_ID` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `answer` int(11) NOT NULL,
  `feedback` varchar(255) NOT NULL,
  PRIMARY KEY (`answer_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
INSERT INTO `answers` VALUES (1,1,1,2,'participants answered 2'),(2,1,2,2,'participants answered 2'),(3,1,3,2,'participants answered 2'),(4,1,4,2,'participants answered 2'),(5,1,5,2,'participants answered 2'),(6,1,6,2,'participants answered 2'),(7,1,7,2,'participants answered 2'),(8,1,8,2,'participants answered 2'),(9,1,9,2,'participants answered 2'),(10,1,10,2,'participants answered 2'),(11,2,1,3,'participants answered 3'),(12,2,2,3,'participants answered 3'),(13,2,3,3,'participants answered 3'),(14,2,4,3,'participants answered 3'),(15,2,5,3,'participants answered 3'),(16,2,6,3,'participants answered 3'),(17,2,7,3,'participants answered 3'),(18,2,8,3,'participants answered 3'),(19,2,9,3,'participants answered 3'),(20,2,10,3,'participants answered 3'),(21,3,1,4,'participants answered 4'),(22,3,2,4,'participants answered 4'),(23,3,3,4,'participants answered 4'),(24,3,4,4,'participants answered 4'),(25,3,5,4,'participants answered 4'),(26,3,6,4,'participants answered 4'),(27,3,7,4,'participants answered 4'),(28,3,8,4,'participants answered 4'),(29,3,9,4,'participants answered 4'),(30,3,10,4,'participants answered 4'),(31,4,1,5,'participants answered 5'),(32,4,2,5,'participants answered 5'),(33,4,3,5,'participants answered 5'),(34,4,4,5,'participants answered 5'),(35,4,5,5,'participants answered 5'),(36,4,6,5,'participants answered 5'),(37,4,7,5,'participants answered 5'),(38,4,8,5,'participants answered 5'),(39,4,9,5,'participants answered 5'),(40,4,10,5,'participants answered 5'),(41,5,1,1,'participants answered 1'),(42,5,2,1,'participants answered 1'),(43,5,3,1,'participants answered 1'),(44,5,4,1,'participants answered 1'),(45,5,5,1,'participants answered 1'),(46,5,6,1,'participants answered 1'),(47,5,7,1,'participants answered 1'),(48,5,8,1,'participants answered 1'),(49,5,9,1,'participants answered 1'),(50,5,10,1,'participants answered 1'),(51,6,1,3,'participants answered 3'),(52,6,2,3,'participants answered 3'),(53,6,3,3,'participants answered 3'),(54,6,4,3,'participants answered 3'),(55,6,5,3,'participants answered 3'),(56,6,6,2,'participants answered 2'),(57,6,7,2,'participants answered 2'),(58,6,8,2,'participants answered 2'),(59,6,9,2,'participants answered 2'),(60,6,10,2,'participants answered 2'),(61,7,1,4,'participants answered 4'),(62,7,2,4,'participants answered 4'),(63,7,3,4,'participants answered 4'),(64,7,4,4,'participants answered 4'),(65,7,5,4,'participants answered 4'),(66,7,6,5,'participants answered 5'),(67,7,7,5,'participants answered 5'),(68,7,8,5,'participants answered 5'),(69,7,9,5,'participants answered 5'),(70,7,10,5,'participants answered 5');
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `participants`
--

DROP TABLE IF EXISTS `participants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `participants` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `party` varchar(100) DEFAULT NULL,
  `whyparliament` varchar(550) DEFAULT NULL,
  `wanttopromote` varchar(540) DEFAULT NULL,
  `profession` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `participants`
--

LOCK TABLES `participants` WRITE;
/*!40000 ALTER TABLE `participants` DISABLE KEYS */;
INSERT INTO `participants` VALUES (32,'shiva','shiva@gmail.com','55','tampere','Independence Party','dik','yessss','student'),(35,'man','man','25','aali','fffs','dsdfsf','sfsfs','sdfs'),(36,'ramkrsine','ram@gmail.com','25','ktm','Left Alliance','no','no','no');
/*!40000 ALTER TABLE `participants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `question_id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) NOT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=223 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'It is too easy to live on social security in Finland?'),(2,'The opening hours of trade and other shops must be liberalized?'),(3,'Finland needs to move to a basic income that would replace the current minimum level of social security.?'),(4,'The employee must be guaranteed by law a minimum working time.?'),(5,'The duration of earnings-related occupational safety must be shortened.?'),(6,'Outside the euro, Finland would do better.?'),(7,'Food taxation can afford to tighten.?'),(8,'State and municipal finances must be balanced primarily by cutting spending.?'),(9,'Child benefits must be increased and taxed.?'),(10,'Finland cannot afford social and health services on the current scale.?'),(55,'what is the capital city of finland'),(88,'Green Union'),(102,'what is biggest animal in the world'),(222,'ok');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-16 21:51:37
