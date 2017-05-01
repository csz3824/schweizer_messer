
DROP TABLE IF EXISTS `health`;
CREATE TABLE `health` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键|csz3824|2017-04-04',
  `health` varchar(255) DEFAULT NULL COMMENT '健康监测的值|csz3824|2017-04-04',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`health` (`id`, `health`) VALUES ('1', 'health');
