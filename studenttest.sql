/*
 Navicat Premium Data Transfer

 Source Server         : yang
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : studenttest

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 24/08/2022 09:59:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `c_id` int NOT NULL,
  `c_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `c_teacher` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '谭云熙', 'paC043iTzW');
INSERT INTO `course` VALUES (2, '杨秀英', '8QJAivNPMG');
INSERT INTO `course` VALUES (3, '马宇宁', 'Q44lwnSPEo');
INSERT INTO `course` VALUES (4, '李震南', 'ulorE1Rd0k');
INSERT INTO `course` VALUES (5, '严璐', 'bjBpOcO5Kw');
INSERT INTO `course` VALUES (6, '余詩涵', 'kZ7mgUih3R');
INSERT INTO `course` VALUES (7, '贾子韬', 'bVgywP1ECV');
INSERT INTO `course` VALUES (8, '顾宇宁', 'cfpx4Uw1WO');
INSERT INTO `course` VALUES (12, '罗晓明', 'Fv3noj4We6');
INSERT INTO `course` VALUES (13, '杜震南', 'x9QBKJCNoy');
INSERT INTO `course` VALUES (14, '杜杰宏', 'PwKuz1N5SD');
INSERT INTO `course` VALUES (15, '梁致远', 'uYNgFnNjA5');
INSERT INTO `course` VALUES (16, '汪宇宁', 'yDrzCrMKLf');
INSERT INTO `course` VALUES (17, '吴詩涵', 'z4O4liFoLi');
INSERT INTO `course` VALUES (18, '高璐', '0WYkQVi7ON');
INSERT INTO `course` VALUES (19, '孔震南', '2wTuXIuB5H');
INSERT INTO `course` VALUES (20, '丁致远', 'FrJt79STFs');
INSERT INTO `course` VALUES (21, '姜宇宁', '7j2w81xdZy');
INSERT INTO `course` VALUES (22, '方晓明', 'ogDXtHGTaV');
INSERT INTO `course` VALUES (23, '薛晓明', 'aIbn3tiLI3');
INSERT INTO `course` VALUES (24, '周晓明', 'I3lapZEIhk');
INSERT INTO `course` VALUES (25, '陆秀英', '9FLyzLGCPZ');
INSERT INTO `course` VALUES (26, '熊秀英', 'Xu54NDb4eI');
INSERT INTO `course` VALUES (27, '向子异', 'WdVXXovj2n');
INSERT INTO `course` VALUES (28, '夏子韬', 'NkmLMwLzwQ');
INSERT INTO `course` VALUES (29, '罗晓明', '0Sk7qFyqab');
INSERT INTO `course` VALUES (30, '冯睿', '9hraaWQTdw');
INSERT INTO `course` VALUES (31, '邱秀英', 'tpWtqT9tYx');
INSERT INTO `course` VALUES (32, '高詩涵', 'KjYliy9Jsk');
INSERT INTO `course` VALUES (33, '杨岚', 'PZqCfJpX2I');
INSERT INTO `course` VALUES (34, '曹云熙', 'rCG45frVdj');
INSERT INTO `course` VALUES (35, '余宇宁', 'ZQRdD5UwM6');
INSERT INTO `course` VALUES (36, '汤嘉伦', 'LYfrTkSoj7');
INSERT INTO `course` VALUES (37, '秦睿', 'esDFAED9G4');
INSERT INTO `course` VALUES (38, '段璐', 'g5tXEt3cHe');
INSERT INTO `course` VALUES (39, '余璐', 'uPnWLRVnvT');
INSERT INTO `course` VALUES (40, '潘嘉伦', 'XDzFimBDDz');
INSERT INTO `course` VALUES (41, '冯璐', 'Eq75JWkPes');
INSERT INTO `course` VALUES (42, '于岚', 'viz8DwndYP');
INSERT INTO `course` VALUES (43, '郑睿', 'Sf0DlfbHlu');
INSERT INTO `course` VALUES (44, '熊致远', 'gXxNFi8JtQ');
INSERT INTO `course` VALUES (45, '韦杰宏', 'Bp206PAwxd');
INSERT INTO `course` VALUES (46, '孙致远', 'K2R6VMScYj');
INSERT INTO `course` VALUES (47, '彭安琪', 'vWno9a8N9K');
INSERT INTO `course` VALUES (48, '莫安琪', '8NFoWRFsfU');
INSERT INTO `course` VALUES (49, '孙晓明', 'QjYpCtqP1U');
INSERT INTO `course` VALUES (50, '杨岚', 'IWRsvrMh0R');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int NOT NULL,
  `u_pwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `u_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `u_role` int NOT NULL,
  `u_isdelete` int NOT NULL,
  `u_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '47xavOSidg', '135-4233-0585', 351, 518, '龚子韬');
INSERT INTO `user` VALUES (2, '9EaqsMnkbN', '167-7106-6600', 983, 877, '彭致远');
INSERT INTO `user` VALUES (3, 'FbaMLuUTiF', '769-1851-0510', 236, 369, '蔡安琪');
INSERT INTO `user` VALUES (4, '3HFRRhuS5r', '164-9708-5085', 535, 232, '余晓明');
INSERT INTO `user` VALUES (5, 'taMNvmrRBm', '769-573-9275', 40, 510, '姚岚');
INSERT INTO `user` VALUES (6, 'L9HsblbTQh', '10-0190-2893', 268, 741, '邱嘉伦');
INSERT INTO `user` VALUES (7, 'O7NkEMH3zz', '21-1481-9748', 904, 969, '汤秀英');
INSERT INTO `user` VALUES (8, 'NWACbTCIOr', '769-6427-9253', 292, 755, '范震南');
INSERT INTO `user` VALUES (9, 'lI3CPy8pEb', '198-5224-6883', 683, 53, '程子韬');
INSERT INTO `user` VALUES (10, 'Cn6t9ntzJn', '155-4448-8731', 896, 715, '袁宇宁');
INSERT INTO `user` VALUES (11, 'xHRS6sdfZN', '28-558-3053', 362, 226, '曹睿');
INSERT INTO `user` VALUES (12, 'wwnBOJ8PB2', '755-5891-2425', 876, 491, '王嘉伦');
INSERT INTO `user` VALUES (13, 'BiWz2pdPw9', '147-0390-6227', 509, 178, '陈岚');
INSERT INTO `user` VALUES (14, 'cxNjENbVLE', '159-1283-3029', 249, 604, '朱秀英');
INSERT INTO `user` VALUES (15, 'tfSx042lft', '760-6480-2763', 448, 681, '吕震南');
INSERT INTO `user` VALUES (16, 'cuUSNtt05s', '28-7631-9157', 726, 379, '黄岚');
INSERT INTO `user` VALUES (17, 'oT7BmpTj7d', '142-2987-6580', 936, 244, '陆子异');
INSERT INTO `user` VALUES (18, 'prVrmsC4gc', '760-607-6743', 583, 147, '钟詩涵');
INSERT INTO `user` VALUES (19, '0jOVJmlg9a', '20-520-5930', 723, 871, '于睿');
INSERT INTO `user` VALUES (20, 'AWqdMbsAcu', '145-5331-9655', 432, 198, '崔宇宁');
INSERT INTO `user` VALUES (21, 'ovRjDxGwE3', '28-287-6712', 37, 318, '朱震南');
INSERT INTO `user` VALUES (22, 'aYjVfsnu5X', '20-1057-7799', 10, 759, '卢詩涵');
INSERT INTO `user` VALUES (23, 'EOlZDtSGa4', '131-8153-6685', 804, 426, '雷杰宏');
INSERT INTO `user` VALUES (24, 'lCY1AYuucI', '141-9138-0646', 175, 742, '刘晓明');
INSERT INTO `user` VALUES (25, 'NfYRf0bEbM', '755-9429-7636', 910, 402, '史岚');
INSERT INTO `user` VALUES (26, 'YOlB99jTbH', '131-9452-2887', 832, 758, '张岚');
INSERT INTO `user` VALUES (27, 'nIjowBxO2b', '135-1272-1424', 274, 508, '蒋睿');
INSERT INTO `user` VALUES (28, '9TEPnhZ7To', '146-7013-9475', 973, 376, '何睿');
INSERT INTO `user` VALUES (29, 'qP32BcsjuL', '769-461-5285', 457, 542, '梁嘉伦');
INSERT INTO `user` VALUES (30, 'NeXOzLyVGc', '21-7694-7320', 493, 874, '邹致远');
INSERT INTO `user` VALUES (31, '1mv5196K1P', '147-5695-5065', 712, 235, '崔岚');
INSERT INTO `user` VALUES (32, 'oILcCOaYPf', '146-9077-0388', 275, 114, '任云熙');
INSERT INTO `user` VALUES (33, 'PVZ9gXJO6X', '10-418-0603', 946, 90, '林詩涵');
INSERT INTO `user` VALUES (34, 'FyM7gVn4pU', '157-1532-8369', 407, 804, '熊秀英');
INSERT INTO `user` VALUES (35, 'kcbejAxT6I', '760-0715-6127', 988, 37, '邵子异');
INSERT INTO `user` VALUES (36, 'gTvHGJMlb8', '769-911-2992', 898, 107, '王云熙');
INSERT INTO `user` VALUES (37, 'd3ZbNLwmhh', '10-405-3083', 820, 587, '卢子异');
INSERT INTO `user` VALUES (38, 'wysJbEi4cO', '769-0043-5367', 232, 981, '蔡睿');
INSERT INTO `user` VALUES (39, 'dI2Aytjc3F', '28-410-2920', 712, 933, '夏詩涵');
INSERT INTO `user` VALUES (40, 'FUDssf697K', '130-4737-6313', 659, 636, '朱子异');
INSERT INTO `user` VALUES (41, 'q8bUXdIHTM', '28-9699-7669', 218, 128, '卢震南');
INSERT INTO `user` VALUES (42, 'QQufhOQC4A', '159-6575-1672', 843, 409, '苏子异');
INSERT INTO `user` VALUES (43, 'jlOjMKhOXr', '10-922-0992', 597, 699, '沈晓明');
INSERT INTO `user` VALUES (44, 'wTV2VOsENd', '147-3729-3397', 449, 873, '贾杰宏');
INSERT INTO `user` VALUES (45, 'gCGphtwRG1', '136-2004-9866', 75, 337, '石子韬');
INSERT INTO `user` VALUES (46, 'F5shd50o25', '760-8641-0674', 463, 313, '曾震南');
INSERT INTO `user` VALUES (47, 'VfMHZsKwdm', '21-1176-8679', 641, 141, '余宇宁');
INSERT INTO `user` VALUES (48, 'j7jQGpHd3j', '158-3340-2279', 503, 325, '梁子韬');
INSERT INTO `user` VALUES (49, 'gCK0lfoNjG', '143-3060-8585', 720, 144, '魏子异');
INSERT INTO `user` VALUES (50, 'bBDSuSCCcV', '167-4156-4721', 444, 805, '向云熙');

SET FOREIGN_KEY_CHECKS = 1;
