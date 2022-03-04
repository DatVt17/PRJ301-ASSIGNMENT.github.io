

CREATE DATABASE `healthcarelogistics` 

USE `healthcarelogistics`;

/*Table structure for table `bookings` */

DROP TABLE IF EXISTS `bookings`;

CREATE TABLE `bookings` (
  `cname` varchar(100) DEFAULT NULL,
  `tname` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `types` varchar(100) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bookings` */

insert  into `bookings`(`cname`,`tname`,`location`,`mobile`,`types`,`date`) values ('krishna','shiva','hyderabad','9632507410','Erythrocyte count','2019-02-06');

/*Table structure for table `cdetails` */

DROP TABLE IF EXISTS `cdetails`;

CREATE TABLE `cdetails` (
  `cname` varchar(100) DEFAULT NULL,
  `tname` varchar(100) DEFAULT NULL,
  `typeoftest` varchar(100) DEFAULT NULL,
  `sampletype` varchar(100) DEFAULT NULL,
  `cost` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cdetails` */

insert  into `cdetails`(`cname`,`tname`,`typeoftest`,`sampletype`,`cost`) values ('krishna','shiva','Erythrocyte count','Hair','200');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `cnumber` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`username`,`password`,`email`,`location`,`cnumber`) values ('krishna','krishna','krishna@gmail.com','hyderabad','7850211221');

/*Table structure for table `customerdetails` */

DROP TABLE IF EXISTS `customerdetails`;

CREATE TABLE `customerdetails` (
  `cname` varchar(100) DEFAULT NULL,
  `types` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `addedby` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customerdetails` */

insert  into `customerdetails`(`cname`,`types`,`email`,`mobile`,`addedby`) values ('krish','Blood','shiva@gmail.com','789456120','shiva');

/*Table structure for table `equipments` */

DROP TABLE IF EXISTS `equipments`;

CREATE TABLE `equipments` (
  `name` varchar(100) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `equipments` */

insert  into `equipments`(`name`,`image`) values ('Sterile glass or plastic tube with rubber caps','tube.PNG'),('Injections','injections.PNG');

/*Table structure for table `technician` */

DROP TABLE IF EXISTS `technician`;

CREATE TABLE `technician` (
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `cnumber` varchar(100) DEFAULT NULL,
  `timings` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `technician` */

insert  into `technician`(`username`,`password`,`email`,`location`,`cnumber`,`timings`) values ('shiva','shiva','shiva@gmail.com','hyderabad','789456123','10am - 04pm');

/*Table structure for table `tests` */

DROP TABLE IF EXISTS `tests`;

CREATE TABLE `tests` (
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tests` */

insert  into `tests`(`name`) values ('Hemoglobin(HB)'),('Erythrocyte count'),('Total cholesterol'),('Total thyroxine');

