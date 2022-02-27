-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: b2o9ehup2xrkpiexyyii-mysql.services.clever-cloud.com
-- Erstellungszeit: 17. Jan 2022 um 14:02
-- Server-Version: 8.0.22-13
-- PHP-Version: 7.3.33-1+ubuntu18.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `b2o9ehup2xrkpiexyyii`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `symptoms`
--

CREATE TABLE `symptoms` (
  `id` int NOT NULL,
  `symptom` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `doctortype_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `symptoms`
--

INSERT INTO `symptoms` (`id`, `symptom`, `doctortype_id`) VALUES
(1, 'anxiety', 12),
(2, 'birth control', 8),
(3, 'asthma', 1),
(4, 'blood in urine', 3),
(5, 'blurred vision', 5),
(6, 'back pain', 1),
(7, 'bleeding nose', 2),
(8, 'coronavirus', 1),
(9, 'confusion', 12),
(10, 'dental problems', 10),
(11, 'depression', 12),
(12, 'ear and hearing problems', 2),
(13, 'eye and vision problems', 5),
(14, 'ear infection', 2),
(15, 'feeling sick or unwell', 1),
(16, 'haemorrhoids', 13),
(17, 'men\'s sexual health', 3),
(18, 'pain when urinating', 3),
(19, 'pill (\'the pill\')', 8),
(20, 'period pain', 8),
(21, 'skin problems', 6),
(22, 'spine injury', 4),
(23, 'self harm', 12),
(24, 'teeth and dental problems', 10),
(25, 'unable to lift arms', 4),
(26, ' magnetic resonance imaging', 9),
(27, ' computed tomography', 9),
(28, 'ultrasound scan', 9),
(29, 'virus', 1),
(30, 'women\'s sexual health', 8),
(31, 'headaches', 1),
(32, 'fever', 1),
(33, 'sniffle', 1),
(34, 'cough', 1),
(35, 'sore throat', 1),
(36, 'fatigue', 4),
(37, 'stomach pain', 13),
(38, 'breathlessness', 1),
(39, 'chest pain', 17),
(40, 'abdominal pain', 13),
(41, 'pelvic pain', 8),
(42, 'food intolerance', 16),
(43, 'diabetes', 15),
(44, 'nausea', 1),
(45, 'discoloration of the skin', 6),
(46, 'menstrual cramps', 8),
(47, 'mood swings', 16),
(48, 'forgetfulness', 4),
(49, 'diarrhea', 1),
(50, 'vomiting', 1),
(51, 'constipation', 13),
(52, 'irritability(premenstrual, hormonal)', 8),
(53, 'numbness', 2),
(54, 'braces', 11);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `symptoms`
--
ALTER TABLE `symptoms`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_symptoms2doctortype` (`doctortype_id`) USING BTREE;

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `symptoms`
--
ALTER TABLE `symptoms`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `symptoms`
--
ALTER TABLE `symptoms`
  ADD CONSTRAINT `fk_diseases2doctortype` FOREIGN KEY (`doctortype_id`) REFERENCES `doctortype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
