
CREATE TABLE IF NOT EXISTS `booking` (
  `booking_id` int(11) NOT NULL auto_increment,
  `booking_name` varchar(255) NOT NULL,
  `booking_place` varchar(255) NOT NULL,
  PRIMARY KEY  (`booking_id`)
) ;
