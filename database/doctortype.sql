-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: b2o9ehup2xrkpiexyyii-mysql.services.clever-cloud.com
-- Erstellungszeit: 17. Jan 2022 um 14:03
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
-- Tabellenstruktur für Tabelle `doctortype`
--

CREATE TABLE `doctortype` (
  `id` int NOT NULL,
  `doctortype` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `doctortype`
--

INSERT INTO `doctortype` (`id`, `doctortype`) VALUES
(1, 'allgemeinmediziner'),
(2, 'hno'),
(3, 'urologie'),
(4, 'neurologie'),
(5, 'augenarzt'),
(6, 'hautarzt'),
(7, 'chirurgie'),
(8, 'frauenarzt'),
(9, 'radiologie'),
(10, 'zahnarzt'),
(11, 'kieferorthopäde'),
(12, 'psychiater'),
(13, 'gastroenterologie'),
(14, 'kinderarzt'),
(15, 'diabetologe'),
(16, 'endokrinologe'),
(17, 'kardiologe');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `doctortype`
--
ALTER TABLE `doctortype`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `doctortype`
--
ALTER TABLE `doctortype`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
