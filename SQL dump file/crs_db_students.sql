-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: crs_db
-- ------------------------------------------------------
-- Server version	8.0.38

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
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `program` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Alice Johnson','Computer Science'),(2,'Bob Williams','Software Engineering'),(3,'Charlie Brown','Information Technology'),(4,'David Miller','Cyber Security'),(5,'Emma Wilson','Artificial Intelligence'),(6,'Fiona White','Computer Science'),(7,'George Harris','Software Engineering'),(8,'Hannah Lewis','Information Technology'),(9,'Isaac Robinson','Cyber Security'),(10,'Jessica Walker','Artificial Intelligence'),(11,'Kevin Hall','Computer Science'),(12,'Laura Young','Software Engineering'),(13,'Mark Allen','Information Technology'),(14,'Natalie King','Cyber Security'),(15,'Oliver Scott','Artificial Intelligence'),(16,'Paul Adams','Computer Science'),(17,'Quinn Nelson','Software Engineering'),(18,'Rachel Carter','Information Technology'),(19,'Samuel Evans','Cyber Security'),(20,'Tina Moore','Artificial Intelligence'),(21,'Umar Reed','Computer Science'),(22,'Victor Bailey','Software Engineering'),(23,'Wendy Barnes','Information Technology'),(24,'Xander Cooper','Cyber Security'),(25,'Yvonne Foster','Artificial Intelligence'),(26,'Zachary Gray','Computer Science'),(27,'Liam Turner','Software Engineering'),(28,'Noah Parker','Information Technology'),(29,'Olivia Mitchell','Cyber Security'),(30,'Sophia Carter','Artificial Intelligence');
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

-- Dump completed on 2025-02-27 21:55:42
