CREATE DATABASE /*!32312 IF NOT EXISTS*/`wileystore` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `wileystore`;

/*Table structure for table `candidate_skills` */

DROP TABLE IF EXISTS `skillstore`;
CREATE TABLE `skillstore`(
    skill_id INT AUTO_INCREMENT PRIMARY KEY,
    book_name VARCHAR(255) NOT NULL,
    isbn INT NOT NULL,
    author VARCHAR(255) NOT NULL,
    edition INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=INNODB;

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`(
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
) ENGINE=INNODB;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`(
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
) ENGINE=INNODB;