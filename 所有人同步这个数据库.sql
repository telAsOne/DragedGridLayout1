# Host: localhost  (Version: 5.5.47)
# Date: 2018-09-04 15:48:10
# Generator: MySQL-Front 5.3  (Build 4.234)



#
# Structure for table "admininfo"
#
use testbilibili;
DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(25) DEFAULT NULL,
  `admin_psw` varchar(25) DEFAULT NULL,
  `admin_state` varchar(25) DEFAULT '在职',
  `start_time` varchar(50) DEFAULT NULL,
  `end_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "admininfo"
#

/*!40000 ALTER TABLE `admininfo` DISABLE KEYS */;
INSERT INTO `admininfo` VALUES (1,'Lisi','1234','在职',NULL,NULL),(2,'wangwu','1234','在职',NULL,NULL),(3,'admin','123456','停职',NULL,NULL);
/*!40000 ALTER TABLE `admininfo` ENABLE KEYS */;

#
# Structure for table "adminorrole"
#

DROP TABLE IF EXISTS `adminorrole`;
CREATE TABLE `adminorrole` (
  `ar_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `start_time` varchar(50) DEFAULT NULL,
  `end_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ar_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "adminorrole"
#

/*!40000 ALTER TABLE `adminorrole` DISABLE KEYS */;
INSERT INTO `adminorrole` VALUES (1,1,1,NULL,NULL),(2,2,2,NULL,NULL),(3,1,3,NULL,NULL);
/*!40000 ALTER TABLE `adminorrole` ENABLE KEYS */;

#
# Structure for table "attention"
#

DROP TABLE IF EXISTS `attention`;
CREATE TABLE `attention` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `attention_user_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "attention"
#

/*!40000 ALTER TABLE `attention` DISABLE KEYS */;
/*!40000 ALTER TABLE `attention` ENABLE KEYS */;

#
# Structure for table "chat"
#

DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `chat_id` int(11) NOT NULL AUTO_INCREMENT,
  `chat_content` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `reply_user_id` int(11) NOT NULL,
  `specified` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`chat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "chat"
#

/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;

#
# Structure for table "collection"
#

DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `state` int(11) NOT NULL,
  `items_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "collection"
#

#
# Structure for table "comic"
#

DROP TABLE IF EXISTS `comic`;
CREATE TABLE `comic` (
  `comic_id` int(11) NOT NULL AUTO_INCREMENT,
  `comic_name` varchar(100) NOT NULL,
  `state` varchar(10) NOT NULL DEFAULT '未审核',
  `praises` int(11) NOT NULL,
  `chapter` int(11) NOT NULL,
  `recently` datetime NOT NULL,
  `information` varchar(200) NOT NULL,
  `read_number` int(11) NOT NULL,
  `gift_number` int(11) NOT NULL,
  `gift` int(11) NOT NULL,
  `portrait` varchar(70) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`comic_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "comic"
#

/*!40000 ALTER TABLE `comic` DISABLE KEYS */;
/*!40000 ALTER TABLE `comic` ENABLE KEYS */;

#
# Structure for table "comicchapter"
#

DROP TABLE IF EXISTS `comicchapter`;
CREATE TABLE `comicchapter` (
  `cc_id` int(11) NOT NULL AUTO_INCREMENT,
  `chapter` int(11) NOT NULL,
  `comic_id` int(11) NOT NULL,
  `cartoon_pictures` varchar(100) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cc_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "comicchapter"
#

/*!40000 ALTER TABLE `comicchapter` DISABLE KEYS */;
/*!40000 ALTER TABLE `comicchapter` ENABLE KEYS */;

#
# Structure for table "comiclabel"
#

DROP TABLE IF EXISTS `comiclabel`;
CREATE TABLE `comiclabel` (
  `cl_id` int(11) NOT NULL AUTO_INCREMENT,
  `cl_name` varchar(50) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cl_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "comiclabel"
#

/*!40000 ALTER TABLE `comiclabel` DISABLE KEYS */;
/*!40000 ALTER TABLE `comiclabel` ENABLE KEYS */;

#
# Structure for table "comicoreview"
#

DROP TABLE IF EXISTS `comicoreview`;
CREATE TABLE `comicoreview` (
  `cr_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `cr_text` varchar(150) NOT NULL,
  `state` varchar(10) NOT NULL DEFAULT '未审核',
  `praises` int(11) NOT NULL,
  `reply` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cr_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "comicoreview"
#

/*!40000 ALTER TABLE `comicoreview` DISABLE KEYS */;
/*!40000 ALTER TABLE `comicoreview` ENABLE KEYS */;

#
# Structure for table "comicorlabel"
#

DROP TABLE IF EXISTS `comicorlabel`;
CREATE TABLE `comicorlabel` (
  `col_id` int(11) NOT NULL AUTO_INCREMENT,
  `cl_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`col_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "comicorlabel"
#

/*!40000 ALTER TABLE `comicorlabel` DISABLE KEYS */;
/*!40000 ALTER TABLE `comicorlabel` ENABLE KEYS */;





/*!40000 ALTER TABLE `draft` DISABLE KEYS */;
/*!40000 ALTER TABLE `draft` ENABLE KEYS */;

#
# Structure for table "extension"
#

DROP TABLE IF EXISTS `extension`;
CREATE TABLE `extension` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `video_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "extension"
#

/*!40000 ALTER TABLE `extension` DISABLE KEYS */;
INSERT INTO `extension` VALUES (1,5,NULL,NULL),(2,4,NULL,NULL);
/*!40000 ALTER TABLE `extension` ENABLE KEYS */;

#
# Structure for table "history"
#

DROP TABLE IF EXISTS `history`;
CREATE TABLE `history` (
  `h_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `items_id` int(11) NOT NULL,
  `TIME` datetime NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "history"
#

/*!40000 ALTER TABLE `history` DISABLE KEYS */;
/*!40000 ALTER TABLE `history` ENABLE KEYS */;

#
# Structure for table "integralrecord"
#

DROP TABLE IF EXISTS `integralrecord`;
CREATE TABLE `integralrecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `operation_time` varchar(100) NOT NULL,
  `integral_state` int(11) NOT NULL,
  `integral_describe` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "integralrecord"
#

/*!40000 ALTER TABLE `integralrecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `integralrecord` ENABLE KEYS */;

#
# Structure for table "menuinfo"
#

DROP TABLE IF EXISTS `menuinfo`;
CREATE TABLE `menuinfo` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(50) DEFAULT NULL,
  `state` varchar(25) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `iconCls` varchar(50) DEFAULT NULL,
  `start_time` varchar(50) DEFAULT NULL,
  `end_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

#
# Data for table "menuinfo"
#

/*!40000 ALTER TABLE `menuinfo` DISABLE KEYS */;
INSERT INTO `menuinfo` VALUES (1,'系统管理','close',NULL,0,NULL,NULL,NULL),(2,'作品管理','close',NULL,0,NULL,NULL,NULL),(3,'参数管理','close',NULL,0,NULL,NULL,NULL),(4,'用户管理','close','http://localhost:8080/bilibiliThree/user',1,NULL,NULL,NULL),(5,'角色管理','close','http://localhost:8080/bilibiliThree/role',1,NULL,NULL,NULL),(6,'漫画管理','close',NULL,2,NULL,NULL,NULL),(7,'文章管理','close',NULL,2,NULL,NULL,NULL),(8,'首页管理','close','',0,NULL,NULL,NULL),(9,'滑动图片管理','close','http://localhost:8080/bilibiliThree/admin/index/slide/ui',8,NULL,NULL,NULL);
/*!40000 ALTER TABLE `menuinfo` ENABLE KEYS */;


#
# Structure for table "reply"
#

DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `user_id` int(11) NOT NULL,
  `publishtime` date NOT NULL,
  `modifytime` date NOT NULL,
  `topic_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`reply_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "reply"
#

/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;

#
# Structure for table "review"
#

DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
  `review_id` int(11) NOT NULL AUTO_INCREMENT,
  `userA_id` int(11) NOT NULL,
  `review_text` varchar(150) NOT NULL,
  `reviewContentUrl` varchar(200) NOT NULL,
  `state` varchar(10) NOT NULL,
  `praises` int(11) NOT NULL,
  `reply` int(11) NOT NULL,
  `reviewState` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`review_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "review"
#

/*!40000 ALTER TABLE `review` DISABLE KEYS */;
/*!40000 ALTER TABLE `review` ENABLE KEYS */;

#
# Structure for table "roleinfo"
#

DROP TABLE IF EXISTS `roleinfo`;
CREATE TABLE `roleinfo` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(25) DEFAULT NULL,
  `start_time` varchar(50) DEFAULT NULL,
  `end_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "roleinfo"
#

/*!40000 ALTER TABLE `roleinfo` DISABLE KEYS */;
INSERT INTO `roleinfo` VALUES (1,'用户管理员',NULL,NULL),(2,'rr管理员',NULL,NULL);
/*!40000 ALTER TABLE `roleinfo` ENABLE KEYS */;

#
# Structure for table "roleormenu"
#

DROP TABLE IF EXISTS `roleormenu`;
CREATE TABLE `roleormenu` (
  `mo_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`mo_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "roleormenu"
#

/*!40000 ALTER TABLE `roleormenu` DISABLE KEYS */;
INSERT INTO `roleormenu` VALUES (1,1,8,NULL,NULL),(2,1,9,NULL,NULL);
/*!40000 ALTER TABLE `roleormenu` ENABLE KEYS */;

#
# Structure for table "slideimg"
#

DROP TABLE IF EXISTS `slideimg`;
CREATE TABLE `slideimg` (
  `slide_id` int(11) NOT NULL AUTO_INCREMENT,
  `slide_title` varchar(50) NOT NULL,
  `slide_content` varchar(100) NOT NULL,
  `IsShow` int(11) NOT NULL,
  `ImageUrl` varchar(120) NOT NULL,
  `IsEnabled` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `linkAddress` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`slide_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Data for table "slideimg"
#

/*!40000 ALTER TABLE `slideimg` DISABLE KEYS */;
INSERT INTO `slideimg` VALUES (8,'a31d','asda',0,'/bilibiliThree/fileProject//jyz/images/slide/slide8.jpg',0,NULL,NULL,'asd'),(9,'asdsaasd','asdsada',0,'/bilibiliThree/fileProject//jyz/images/slide/slide9.jpg',0,NULL,NULL,'asdasd'),(10,'asdas','asd',0,'/bilibiliThree/fileProject//jyz/images/slide/slide10.jpg',0,NULL,NULL,'sds');
/*!40000 ALTER TABLE `slideimg` ENABLE KEYS */;

#
# Structure for table "systemmessage"
#

DROP TABLE IF EXISTS `systemmessage`;
CREATE TABLE `systemmessage` (
  `stM_id` int(11) NOT NULL AUTO_INCREMENT,
  `stM_title` varchar(100) NOT NULL,
  `stM_content` varchar(500) NOT NULL,
  `stM_skipUrl` varchar(50) NOT NULL,
  `stM_releaseTime` datetime DEFAULT NULL,
  PRIMARY KEY (`stM_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "systemmessage"
#

/*!40000 ALTER TABLE `systemmessage` DISABLE KEYS */;
/*!40000 ALTER TABLE `systemmessage` ENABLE KEYS */;

#
# Structure for table "topic"
#

DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `topic_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `user_id` int(11) NOT NULL,
  `publishtime` date NOT NULL,
  `modifytime` date NOT NULL,
  `replycount` int(11) NOT NULL,
  `clickcount` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`topic_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "topic"
#

/*!40000 ALTER TABLE `topic` DISABLE KEYS */;
/*!40000 ALTER TABLE `topic` ENABLE KEYS */;

#
# Structure for table "user_record"
#

DROP TABLE IF EXISTS `user_record`;
CREATE TABLE `user_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_Time` datetime NOT NULL,
  `user_id` int(11) NOT NULL,
  `ip_address` varchar(100) NOT NULL,
  `login_address` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "user_record"
#

/*!40000 ALTER TABLE `user_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_record` ENABLE KEYS */;

#
# Structure for table "userchat"
#

DROP TABLE IF EXISTS `userchat`;
CREATE TABLE `userchat` (
  `userchat_id` int(11) NOT NULL AUTO_INCREMENT,
  `chat_userA` int(11) NOT NULL,
  `chat_userB` int(11) NOT NULL,
  `statr_time` datetime NOT NULL,
  `userA_look` varchar(200) NOT NULL,
  `userB_look` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`userchat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "userchat"
#

/*!40000 ALTER TABLE `userchat` DISABLE KEYS */;
/*!40000 ALTER TABLE `userchat` ENABLE KEYS */;

#
# Structure for table "userchatdetails"
#

DROP TABLE IF EXISTS `userchatdetails`;
CREATE TABLE `userchatdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chat_id` int(11) NOT NULL,
  `news_text` varchar(100) NOT NULL,
  `statr_time` datetime NOT NULL,
  `user_send_msg_id` int(10) NOT NULL,
  `user_msg_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "userchatdetails"
#

/*!40000 ALTER TABLE `userchatdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `userchatdetails` ENABLE KEYS */;

#
# Structure for table "userinfo"
#

DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(25) NOT NULL,
  `uer_psw` varchar(25) NOT NULL,
  `sex` char(4) NOT NULL,
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `LEVEL` int(11) NOT NULL,
  `integral` int(11) NOT NULL,
  `email` varchar(25) DEFAULT NULL,
  `nickname` varchar(25) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_login_time` datetime NOT NULL,
  `end_time` datetime DEFAULT NULL,
  `head_portrait` varchar(50) NOT NULL,
  `comments` varchar(255) DEFAULT '这个人很懒，还没有新签名(＾Ｕ＾)ノ~ＹＯ',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `nickname` (`nickname`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "userinfo"
#

/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES (1,'15074906630','1872475078','1','15074906630',6,1000,'2429769645@qq.com','怠柚子','2018-08-31 10:12:00','2018-08-31 16:34:00',NULL,'333','这个人很懒，还没有新签名(＾Ｕ＾)ノ~ＹＯ');
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;

#
# Structure for table "userjoin"
#

DROP TABLE IF EXISTS `userjoin`;
CREATE TABLE `userjoin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `joinfrom` int(11) DEFAULT NULL,
  `jointo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "userjoin"
#

/*!40000 ALTER TABLE `userjoin` DISABLE KEYS */;
/*!40000 ALTER TABLE `userjoin` ENABLE KEYS */;

#
# Structure for table "userritingcenter"
#

DROP TABLE IF EXISTS `userritingcenter`;
CREATE TABLE `userritingcenter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `p_id` int(11) NOT NULL,
  `menu_name` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `is_open` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "userritingcenter"
#

/*!40000 ALTER TABLE `userritingcenter` DISABLE KEYS */;
/*!40000 ALTER TABLE `userritingcenter` ENABLE KEYS */;

#
# Structure for table "video"
#

DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `video_id` int(11) NOT NULL AUTO_INCREMENT,
  `video_name` varchar(50) NOT NULL,
  `video_image` varchar(50) NOT NULL,
  `video_info` varchar(500) DEFAULT NULL,
  `video_upOfUser` int(11) DEFAULT NULL,
  `video_UpTime` datetime DEFAULT NULL,
  `video_type` varchar(50) DEFAULT NULL,
  `video_state` int(11) DEFAULT '0',
  `playSum` int(11) DEFAULT NULL,
  `collectSum` int(11) DEFAULT NULL,
  `supportSum` int(11) DEFAULT NULL,
  `comentSum` int(11) DEFAULT NULL,
  `end_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`video_id`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

#
# Data for table "video"
#

/*!40000 ALTER TABLE `video` DISABLE KEYS */;
INSERT INTO `video` VALUES (4,'1','1','1',1,'2018-09-04 14:50:14',NULL,1,1,2,3,4,'2018-09-04 15:31:35'),(5,'1','1','1',1,'2018-09-04 14:50:44',NULL,1,1,2,3,4,'2018-09-04 15:31:37'),(6,'1','1','1',1,'2018-09-04 14:50:55',NULL,1,1,2,3,4,'2018-09-04 15:31:41'),(7,'1','1','1',1,'2018-09-04 14:50:57',NULL,1,1,2,3,4,'2018-09-04 15:31:40'),(8,'1','1','1',1,'2018-09-04 14:50:58',NULL,1,1,2,3,4,'2018-09-04 15:31:43'),(9,'1','1','1',1,'2018-09-04 14:50:59',NULL,1,1,2,3,4,'2018-09-04 15:31:47'),(10,'1','1','1',1,'2018-09-04 14:50:59',NULL,1,1,2,3,4,'2018-09-04 15:31:45'),(11,'1','1','1',1,'2018-09-04 14:51:00',NULL,1,1,2,3,4,'2018-09-04 15:31:55'),(12,'1','1','1',1,'2018-09-04 14:51:01',NULL,1,1,2,3,4,'2018-09-04 15:31:53'),(13,'1','1','1',1,'2018-09-04 14:51:01',NULL,1,1,2,3,4,'2018-09-04 15:31:56'),(14,'1','1','1',1,'2018-09-04 14:51:02',NULL,1,1,2,3,4,'2018-09-04 15:31:57'),(15,'1','1','1',1,'2018-09-04 14:51:03',NULL,1,1,2,3,4,'2018-09-04 15:31:58'),(16,'1','1','1',1,'2018-09-04 14:51:03',NULL,1,1,2,3,4,'2018-09-04 15:31:59'),(17,'1','1','1',1,'2018-09-04 14:51:04',NULL,1,1,2,3,4,'2018-09-04 15:32:00');
/*!40000 ALTER TABLE `video` ENABLE KEYS */;

#
# Structure for table "videolabel"
#

DROP TABLE IF EXISTS `videolabel`;
CREATE TABLE `videolabel` (
  `vl_id` int(11) NOT NULL AUTO_INCREMENT,
  `vl_pid` int(11) NOT NULL,
  `vl_name` varchar(50) NOT NULL,
  `isLookHome` varchar(1) DEFAULT '0' COMMENT '是否显示在首页',
  `HomeName` varchar(50) NOT NULL DEFAULT '',
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `icon` varchar(100) DEFAULT '' COMMENT '分类图标',
  PRIMARY KEY (`vl_id`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

#
# Data for table "videolabel"
#

/*!40000 ALTER TABLE `videolabel` DISABLE KEYS */;
INSERT INTO `videolabel` VALUES (1,0,'动画','0','animation','2018-07-24 11:50:58','2018-07-24 11:50:58','icon-animation'),(2,0,'番剧','0','bangumi','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-bangumi'),(3,0,'音乐','0','dance','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-dance'),(4,0,'舞蹈','0','music','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-music'),(5,0,'游戏','0','game','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-game'),(6,0,'科技','0','technology','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-technology'),(7,0,'生活','0','life','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-life'),(8,0,'鬼畜','0','guichu','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-guichu'),(9,0,'时尚','0','fasion','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-fasion'),(10,0,'广告','0','gg','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-gg'),(11,0,'娱乐','0','yule','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-yule'),(12,0,'影视','1','movies','2018-07-24 11:54:43','2018-07-24 11:54:43','icon-movies');
/*!40000 ALTER TABLE `videolabel` ENABLE KEYS */;

#
# Structure for table "videoorlabel"
#

DROP TABLE IF EXISTS `videoorlabel`;
CREATE TABLE `videoorlabel` (
  `vol_id` int(11) NOT NULL AUTO_INCREMENT,
  `video_id` int(11) NOT NULL,
  `vl_id` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`vol_id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

#
# Data for table "videoorlabel"
#

/*!40000 ALTER TABLE `videoorlabel` DISABLE KEYS */;
INSERT INTO `videoorlabel` VALUES (1,4,1,NULL,NULL),(2,5,1,NULL,NULL),(3,6,1,NULL,NULL),(4,7,1,NULL,NULL),(5,8,1,NULL,NULL),(6,9,1,NULL,NULL),(7,10,1,NULL,NULL),(8,11,1,NULL,NULL),(9,12,1,NULL,NULL),(10,13,2,NULL,NULL),(11,14,2,NULL,NULL),(12,15,2,NULL,NULL),(13,16,3,NULL,NULL),(14,17,4,NULL,NULL);
/*!40000 ALTER TABLE `videoorlabel` ENABLE KEYS */;

#
# Structure for table "videoreview"
#

DROP TABLE IF EXISTS `videoreview`;
CREATE TABLE `videoreview` (
  `vr_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `vr_text` varchar(150) NOT NULL,
  `state` varchar(10) NOT NULL,
  `praises` int(11) NOT NULL,
  `reply` int(11) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`vr_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "videoreview"
#

/*!40000 ALTER TABLE `videoreview` DISABLE KEYS */;
/*!40000 ALTER TABLE `videoreview` ENABLE KEYS */;






DROP TABLE IF EXISTS `draft`;
/*草稿表*/
CREATE TABLE draft(
	draft_id INT PRIMARY KEY AUTO_INCREMENT,
	
	#用户id
	user_id  INT,

	#草稿标题   
	draft_title    NVARCHAR(300)  NOT NULL,
	#草稿标题图	
	draft_imgTitle      LONGTEXT, 
	#草稿内容地址  
	draft_content_address   VARCHAR(300),   					
	#类型    
	draft_type    NVARCHAR (300),
	#分类    
	draft_classification    NVARCHAR (300),
	#标签
	draft_label VARCHAR(300),	
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);

DROP TABLE IF EXISTS `daily`;
/*用户日常表(相当于qq里的说说)*/
CREATE TABLE daily(
	#日常主键	id  
	 daily_id  INT  PRIMARY KEY AUTO_INCREMENT ,     				
	#用户id  
     daily_user_id INT  ,  					
	#连接日常评论表的id   
	daily_comments_id  	INT ,
	#日常图片地址
        daily_imgAddress    NVARCHAR(300)  NOT NULL,
	#日常内容  //注意： 字段类型  TEXT      VARCHAR表示不了
	daily_content      TEXT,			
	#是否可转发(使用检查约束)1表示可以转发，2表示不可转发
	 daily_WhetherForwarded CHAR  CHECK (daily_WhetherForwarded IN('1','2')) ,		  
	#点赞数
	daily_praiseNumber  INT,
	#浏览数  
	 daily_browse_number  INT,
	#收藏数 
	daily_collection_number	INT,
	#标签
	label varchar(300),					
	#审核是否通过 1代表通过、2代表不通过，3代表审核中(默认约束 3)
	 daily_audit  CHAR CHECK(daily_audit IN('1','2','3')) , 	
	#收藏夹分类 		这个字段是（5）
	favorites_classification	INT, 	 
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);
DROP TABLE IF EXISTS `dailyComments`;
/*日常评论表 dailyComments*/
CREATE TABLE dailyComments(
	#日常评论表id 主键
	    id   INT  PRIMARY 	KEY AUTO_INCREMENT,			
	#连接日常表 
	  daily_id    		INT, 
	#用户Aid
	 user_comments_A    INT ,
	#用户Bid 
	 user_comments_B   INT ,
	#评论内容
	  content    NVARCHAR(300)   NOT NULL,
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);

DROP TABLE IF EXISTS `painting`;
/*绘画表*/
CREATE TABLE painting(
	#绘画主键id   主键INT
	painting_id    INT PRIMARY KEY AUTO_INCREMENT,     					
	#用户id
	painting_user_id  INT,
	#连接绘画评论表的id 
	painting_comments_id  	INT,
	#绘画图片地址
	painting_imgAddress	NVARCHAR(300) NOT NULL,
	#绘画内容//注意： 字段类型  TEXT        VARCHAR表示不了
	painting_content        TEXT,			   
	#是否可转发(使用检查约束)1表示可以转发，2表示不可转发
	painting_WhetherForwarded   CHAR CHECK(painting_WhetherForwarded IN('1','2')),			
	#点赞数
	painting_praiseNumber		INT ,
	#收藏数    	
	painting_collection_number	INT ,		
	#属性		
	painting_attribute  	NVARCHAR(300),
	#分类        默认约束（4）因为4表示相簿分类
	painting_classification	INT DEFAULT 4,
	#浏览数        
	painting_browse_number	INT,		
	#资源标签          
	painting_sourceLabel_label    NVARCHAR(300),
	#其他标签          
	painting_otherLabel_label    NVARCHAR(300),
	#审核是否通过  	1代表通过、2代表不通过，3代表审核中(默认约束 3)
	painting_audit   CHAR CHECK(painting_audit IN('1','2','3')),
	#收藏夹分类 		这个字段是（5）
	favorites_classification	INT, 
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);

/*绘画评论表  paintingComments*/

DROP TABLE IF EXISTS `paintingComments`;
CREATE TABLE paintingComments(
	#绘画评论表id    主键
	id     INT PRIMARY KEY AUTO_INCREMENT,				
	#连接绘画表   
	daily_id    INT,	
	#用户Aid    
	user_comments_A  INT,	
	#用户Bid  
	user_comments_B   INT,		
	#评论内容        
	content     NVARCHAR(300) NOT NULL,		
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);


DROP TABLE IF EXISTS `columns`;
/*专栏投稿表*/
CREATE TABLE columns(
	#专栏id    	主键
	column_id   INT PRIMARY KEY AUTO_INCREMENT,		
	#用户id
	user_id  INT,
	#专栏标题   
	column_title    NVARCHAR(300)  NOT NULL,
	#专栏标题图	
	column_imgTitle      longtext  NOT NULL, 
	#专栏内容    注意： 字段类型  TEXT
	column_content_address   varchar(300),   					
	#类型    
	column_type    NVARCHAR (300),
	#分类    
	column_classification    NVARCHAR (300),
	#收藏夹分类 		这个字段是（4）
	favorites_classification	INT, 
	#是否可转发	(使用检查约束)1表示可以转发，2表示不可转发
	column_WhetherForwarded  CHAR CHECK (column_WhetherForwarded IN('1','2')),	
	#审核是否通过  1代表通过、2代表不通过，3代表审核中   (默认约束 3)
	audit   CHAR CHECK(audit IN('1','2','3')), 
	#标签
	label varchar(300),	
	#阅读数量      
	reading_number     INT,
	#评论数量      
	comments_number     INT,
	#喜欢数量	
	like_number    INT, 	
	#收藏数量	
	collection_number     	INT,
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);