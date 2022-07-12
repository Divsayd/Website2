CREATE TABLE IF NOT EXISTS `CONTACT_MSG`
  `contact_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `mobileNum` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `message` varchar(500) NOT NULL,
  `status` varchar(10) NOT NULL,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `updated_by` varchar(50) DEFAULT NULL
);