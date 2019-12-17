/*
 Navicat Premium Data Transfer

 Source Server         : lianjie
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 26/11/2019 20:53:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 18rj1
-- ----------------------------
DROP TABLE IF EXISTS `18rj1`;
CREATE TABLE `18rj1`  (
  `年级编号` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `班级编号` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `班级名称` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `学号` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `身高` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `体重` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `肺活量` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `50米跑` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `立定跳远` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `坐位体前屈` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `800米跑` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `1000米跑` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `一分钟仰卧起坐` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `引体向上` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `左眼裸眼视力` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `右眼裸眼视力` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 18rj1
-- ----------------------------
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020101', '朱翔宇', '181.3', '65', '3293', NULL, '153', '7.8', NULL, NULL, NULL, '2', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020102', '曾灿', '169.1', '52.8', '3109', NULL, '178', '21.5', NULL, NULL, NULL, '14', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020103', '闻龙俊', '173', '83.8', '3375', NULL, '200', '17.8', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020104', '谭冲', '177.3', '78.7', '4684', NULL, '223', '5.7', NULL, NULL, NULL, '6', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020105', '李罡', '175.2', '66.9', '3796', NULL, '206', '6.3', NULL, NULL, NULL, '6', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020108', '谢耀锋', '179', '66.4', '4344', NULL, '223', '-3.8', NULL, NULL, NULL, '8', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020106', '魏章龙', '172', '70.9', '3634', NULL, '206', '4.6', NULL, NULL, NULL, '3', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020146', '徐哲颢', '171.5', '86.9', '2574', NULL, '196', '-1.4', NULL, NULL, NULL, '2', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020109', '谭锐', '172.1', '64.5', '4136', NULL, '179', '10.2', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020110', '杨邦国', '169.3', '72.6', '3256', NULL, '221', '16.1', NULL, NULL, NULL, '2', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020111', '赵玉莹', '163.1', '73.3', '2924', NULL, '143', '15.3', NULL, NULL, '24', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020112', '张晓珣', '164.1', '67.6', '2938', NULL, '164', '18.8', NULL, NULL, '29', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020113', '吉嘉慧', '159.4', '49.8', '1302', NULL, '141', '18.7', NULL, NULL, '29', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020114', '卫鹏怡', '155.5', '46.8', '2107', NULL, '158', '16', NULL, NULL, '25', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020116', '卢义澳', '180.9', '70.7', '4296', NULL, '214', '12.9', NULL, NULL, NULL, '6', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020107', '田松源', '167.1', '57.5', '2335', NULL, '220', '-1.3', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020147', '许红斌', '167.8', '57.3', '3303', NULL, '208', '12.5', NULL, NULL, NULL, '11', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020115', '王荟', '162.8', '61.1', '2089', NULL, '126', '3.6', NULL, NULL, '3', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020143', '邹靖波', '172.8', '79', '4734', NULL, '189', NULL, NULL, NULL, NULL, '9', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020144', '关柯俊', '185.4', '96', '4212', NULL, '218', '11.7', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020145', '王余忠', '174.9', '78.9', '3758', NULL, '204', '28.2', NULL, NULL, NULL, '7', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020140', '肖行程', '170', '52.7', '2930', NULL, '195', '5', NULL, NULL, NULL, '3', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020133', '江新明', '168.7', '56.9', '1796', NULL, '215', '17.7', NULL, NULL, NULL, '9', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020124', '王金帅', '174.7', '69.9', '4085', NULL, '216', '1.8', NULL, NULL, NULL, '7', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020125', '安梁辉', '171.2', '63.3', '4041', NULL, '201', '17.8', NULL, NULL, NULL, '11', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020126', '师舟', '162', '60.3', '1505', NULL, '144', '5.3', NULL, NULL, '18', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020127', '李泽', '169.5', '65', '3575', NULL, '226', '29.3', NULL, NULL, NULL, '4', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020128', '郭旭', '169.4', '77.4', '4328', NULL, '195', '-.2', NULL, NULL, NULL, '4', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020129', '王盛琛', '173.1', '63.6', '4404', NULL, '220', '10.6', NULL, NULL, NULL, '12', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020130', '董建坤', '169.6', '54.6', '4141', NULL, '193', NULL, NULL, NULL, NULL, '4', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020142', '王雨', '178.4', '90.3', '3691', NULL, '198', '15.2', NULL, NULL, NULL, '5', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020132', '姚德宇', '178.6', '73.1', '3896', NULL, '211', '21.5', NULL, NULL, NULL, '7', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020141', '王申奥', '172.8', '60.4', '3415', NULL, '199', NULL, NULL, NULL, NULL, '4', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020134', '吴明', '171.5', '52.1', '2708', NULL, '196', '11', NULL, NULL, NULL, '10', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020135', '何俊彦', '173.9', '80.6', '4650', NULL, '171', '8.5', NULL, NULL, NULL, '5', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020136', '吴克龙', '178', '66.8', '2601', NULL, '190', '3.7', NULL, NULL, NULL, '5', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020137', '王楚豫', '163.2', '78.2', '4613', NULL, '173', '17.7', NULL, NULL, NULL, '2', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020138', '徐翊桓', '168.4', '53.3', '2804', NULL, '219', '1.1', NULL, NULL, NULL, '9', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020139', '方子豪', '165', '45.8', '2728', NULL, '184', '3.1', NULL, NULL, NULL, '13', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020131', '王凡', '168.6', '46.8', '3412', NULL, '223', '22.1', NULL, NULL, NULL, '7', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020121', '刘丙成', '177.7', '59.5', '3420', NULL, '211', '13.8', NULL, NULL, NULL, '3', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020123', '马成群', '170.5', '60.7', '4149', NULL, '213', '13.2', NULL, NULL, NULL, '10', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020117', '崔泽森', '169.9', '74.6', '2336', NULL, '213', '12.6', NULL, NULL, NULL, '9', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020118', '高静', '164.9', '46.9', '2559', NULL, '181', '15.2', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020119', '晏东婷', '158', '62.4', '1228', NULL, '155', '15.8', NULL, NULL, '30', NULL, NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020120', '董攀', '175.1', '66', '3230', NULL, '200', '-1.1', NULL, NULL, NULL, '10', NULL, NULL);
INSERT INTO `18rj1` VALUES ('42', '1810201', '18软件1班', '181020122', '冯润波', '168.2', '65', '3014', NULL, '191', '-1.9', NULL, NULL, NULL, '10', NULL, NULL);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `email` varchar(60) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'Jack', '男', 'jack@qq.com', '1980-01-04');
INSERT INTO `tb_user` VALUES (2, 'federal', '男', 'pete@126.com', '1980-01-04');

SET FOREIGN_KEY_CHECKS = 1;
