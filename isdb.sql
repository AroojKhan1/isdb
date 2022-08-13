-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: isdb
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (2,'test','test',0,NULL,NULL),(3,'test','test',0,NULL,NULL),(4,'','',0,'2022-08-09',NULL);
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_USER'),(2,'ROLE_USER'),(3,'ROLE_USER'),(4,'ROLE_USER'),(5,'ROLE_USER'),(6,'ROLE_USER'),(7,'ROLE_USER'),(8,'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scam_report`
--

DROP TABLE IF EXISTS `scam_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scam_report` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `report` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL,
  `website_name` varchar(255) DEFAULT NULL,
  `reporting_user_id` bigint DEFAULT NULL,
  `verified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6sdi32gn906q5m0g0g91b1pt2` (`reporting_user_id`),
  CONSTRAINT `FK6sdi32gn906q5m0g0g91b1pt2` FOREIGN KEY (`reporting_user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scam_report`
--

LOCK TABLES `scam_report` WRITE;
/*!40000 ALTER TABLE `scam_report` DISABLE KEYS */;
INSERT INTO `scam_report` VALUES (1,'its not workinh','abs.com','regular','abs',1,'Y'),(2,'it is scam','bbs.com','regular','bbs',2,'Y'),(3,'bakws','kkm.com','regular','kkm',2,'Y'),(15,'not good','hbo.com','expert','hbo',NULL,''),(16,'not good','hbo.com','expert','bbc',NULL,'Y'),(17,'seems fake','sams.web','regular','sams',NULL,'Y'),(18,'seems fake','sams.web','regular','sams',NULL,NULL),(19,'bakwas admi h','rumi.com','expert','rumi',NULL,NULL),(24,'not very solud','solidground.com','expert','solid ground',NULL,'Y'),(25,'doesnt look legit','rei.com','expert','rei',NULL,NULL);
/*!40000 ALTER TABLE `scam_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scams_reported`
--

DROP TABLE IF EXISTS `scams_reported`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scams_reported` (
  `website_id` bigint NOT NULL,
  `scam_report_id` bigint NOT NULL,
  KEY `FK5rop7x4ltsu69jv51ruvvrcms` (`scam_report_id`),
  KEY `FKmfc8628miyq7nyt3c07c3m9vp` (`website_id`),
  CONSTRAINT `FK5rop7x4ltsu69jv51ruvvrcms` FOREIGN KEY (`scam_report_id`) REFERENCES `scam_report` (`id`),
  CONSTRAINT `FKmfc8628miyq7nyt3c07c3m9vp` FOREIGN KEY (`website_id`) REFERENCES `website` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scams_reported`
--

LOCK TABLES `scams_reported` WRITE;
/*!40000 ALTER TABLE `scams_reported` DISABLE KEYS */;
/*!40000 ALTER TABLE `scams_reported` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thread`
--

DROP TABLE IF EXISTS `thread`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thread` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `post_id` bigint NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbld0rmljjlex1lfjg2c1vtotr` (`post_id`),
  CONSTRAINT `FKbld0rmljjlex1lfjg2c1vtotr` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thread`
--

LOCK TABLES `thread` WRITE;
/*!40000 ALTER TABLE `thread` DISABLE KEYS */;
/*!40000 ALTER TABLE `thread` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `company` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,NULL,'ayekh@gmail.com','aye','kh',NULL,'$2a$10$RnOvnoQImGRorGLXkRvlqucQsXj2c1kry0oXEuPtzfk59IGB/s.Ja',NULL,NULL,NULL,NULL),(2,NULL,'us.rkhan@gmail.com','rum','khn',NULL,'$2a$10$NIBDL17Wna0jYd5rpxtms.m0vSfk8nbQ3IoFKkts9aRODnnCiCRhW',NULL,NULL,NULL,NULL),(3,NULL,'dangeru@gmail.com','far','anw',NULL,'$2a$10$pprsEhkqWQeZvFscFssfdezosYNZYEkWJ86nPpAcIoNTp7QUh7VI6',NULL,NULL,NULL,NULL),(4,NULL,'fari.droid@gmail.com','fareeha','anwar',NULL,'$2a$10$R1DpeMQcljDne6JuEUyz1uhBhzUkaP2.SmDxuUHnnGFzPCDmyIGxm',NULL,NULL,NULL,NULL),(5,NULL,'userone@gmail.com','user','one',NULL,'$2a$10$pG1CWN6WHsv7UZ20DydtyucGSPlwBIlucVpa173UlYZPapXDqmolq',NULL,NULL,NULL,NULL),(6,'$2a$10$2KFpl1MPLhp5a3JQgljsHutYu1RAcTo3WwmTATMY.SdwMc.oGc5tW','usert','user','Two','amz','expert','dev','cs','usertwo@gmail.com','VA'),(7,'amz','userthree','user','three','dev','$2a$10$3NQR/O6aiktI4jW84fVCZO.tApf2kryMV4TxK/Eh.P8yLYJTHnDxm','cs','va','userthree@gmail.com','expert'),(8,'PoppiEnterprise','poppy98','poppy','topi','CTO','$2a$10$fnP/YuSnCU/K9xecsbafFeIOHvL.x6WJdR57IOpidH7c.E3Qc2aeO','MA pass','VA','popitopi@gmail.com','expert');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_roles` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`),
  CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `website`
--

DROP TABLE IF EXISTS `website`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `website` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `age` varchar(255) DEFAULT NULL,
  `domain_name` varchar(255) DEFAULT NULL,
  `linked_in_emps` varchar(255) DEFAULT NULL,
  `num_reports` int DEFAULT NULL,
  `redirected` varchar(255) DEFAULT NULL,
  `scam_percentage` double DEFAULT NULL,
  `secure` varchar(255) DEFAULT NULL,
  `similar_domain` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `virus_scan` varchar(255) DEFAULT NULL,
  `website_name` varchar(255) DEFAULT NULL,
  `ads` varchar(255) DEFAULT NULL,
  `flashy_images` varchar(255) DEFAULT NULL,
  `funky_ui` varchar(255) DEFAULT NULL,
  `offers_gifts` varchar(255) DEFAULT NULL,
  `pop_ups` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `website`
--

LOCK TABLES `website` WRITE;
/*!40000 ALTER TABLE `website` DISABLE KEYS */;
INSERT INTO `website` VALUES (1,'',NULL,NULL,NULL,'',0,NULL,NULL,NULL,NULL,NULL,'','','','',''),(2,'22',NULL,NULL,NULL,'',0,NULL,NULL,NULL,NULL,NULL,'','','','',''),(8,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'solidgroun.com',NULL,'solidground',NULL,NULL,NULL,NULL,NULL),(10,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'solidground.com',NULL,'solid ground',NULL,NULL,NULL,NULL,NULL),(38,'',NULL,NULL,NULL,'',0,NULL,NULL,NULL,NULL,NULL,'','','','',''),(39,'',NULL,NULL,NULL,'',0,NULL,NULL,NULL,NULL,NULL,'','','','','');
/*!40000 ALTER TABLE `website` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-13  1:18:01
