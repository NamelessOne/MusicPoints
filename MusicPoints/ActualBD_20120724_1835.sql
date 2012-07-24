-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.63-0ubuntu0.10.04.1


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema MUSICPOINTSDATABASE
--

CREATE DATABASE IF NOT EXISTS MUSICPOINTSDATABASE;
USE MUSICPOINTSDATABASE;
CREATE TABLE  `MUSICPOINTSDATABASE`.`BOOKMARK` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `music_point_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `BOOKMARK_FK1` (`music_point_id`),
  KEY `BOOKMARK_FK2` (`user_id`),
  CONSTRAINT `BOOKMARK_FK1` FOREIGN KEY (`music_point_id`) REFERENCES `MUSIC_POINT` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `BOOKMARK_FK2` FOREIGN KEY (`user_id`) REFERENCES `USER` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`MAP_POINT` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place_x` varchar(128) DEFAULT NULL,
  `place_y` varchar(128) DEFAULT NULL,
  `map_x` varchar(128) DEFAULT NULL,
  `map_y` varchar(128) DEFAULT NULL,
  `link` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`METRO_POINT` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `music_point_id` int(11) DEFAULT NULL,
  `metro_station_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `METRO_POINT_FK1` (`music_point_id`),
  KEY `MUSIC_POINT_FK2` (`metro_station_id`),
  CONSTRAINT `METRO_POINT_FK1` FOREIGN KEY (`music_point_id`) REFERENCES `MUSIC_POINT` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `MUSIC_POINT_FK2` FOREIGN KEY (`metro_station_id`) REFERENCES `METRO_STATION` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`METRO_STATION` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `line` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`MUSIC_POINT` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `address` varchar(1024) DEFAULT NULL,
  `ration` smallint(6) DEFAULT NULL,
  `description` varchar(2048) DEFAULT NULL,
  `prices` varchar(1024) DEFAULT NULL,
  `equipment` varchar(2048) DEFAULT NULL,
  `contacts` varchar(1024) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `schedule` varchar(1024) DEFAULT NULL,
  `map_point_id` int(11) DEFAULT NULL,
  `phones` varchar(256) DEFAULT NULL,
  `emails` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `music_point_fk1` (`map_point_id`),
  CONSTRAINT `music_point_fk1` FOREIGN KEY (`map_point_id`) REFERENCES `MAP_POINT` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`PHOTO` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(256) DEFAULT NULL,
  `point_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `PHOTO_FK1` (`point_id`),
  CONSTRAINT `PHOTO_FK1` FOREIGN KEY (`point_id`) REFERENCES `MUSIC_POINT` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`REVIEW` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `text` varchar(2048) DEFAULT NULL,
  `mark` smallint(6) DEFAULT NULL,
  `music_point_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `REVIEW_FK1` (`user_id`),
  KEY `REVIEW_FK2` (`music_point_id`),
  CONSTRAINT `REVIEW_FK1` FOREIGN KEY (`user_id`) REFERENCES `USER` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `REVIEW_FK2` FOREIGN KEY (`music_point_id`) REFERENCES `MUSIC_POINT` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`USER` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(128) DEFAULT NULL,
  `email` char(128) DEFAULT NULL,
  `about` varchar(1024) DEFAULT NULL,
  `show_contacts` smallint(6) DEFAULT NULL,
  `user_pic_file` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE  `MUSICPOINTSDATABASE`.`VIDEO` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(256) DEFAULT NULL,
  `point_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `VIDEO_FK1` (`point_id`),
  CONSTRAINT `VIDEO_FK1` FOREIGN KEY (`point_id`) REFERENCES `MUSIC_POINT` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
