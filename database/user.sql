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
-- Tabellenstruktur für Tabelle `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(40) NOT NULL,
  `password` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(40) NOT NULL,
  `firstname` varchar(40) NOT NULL,
  `lastname` varchar(40) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `dateofbirth` date NOT NULL,
  `street` varchar(40) NOT NULL,
  `housenumber` varchar(40) NOT NULL,
  `city` varchar(40) NOT NULL,
  `zipcode` varchar(40) NOT NULL,
  `lat` double NOT NULL,
  `lng` double NOT NULL,
  `healthinformation` varchar(1000) NOT NULL,
  `insurancename` varchar(40) NOT NULL,
  `insurancetype` varchar(40) NOT NULL,
  `admin` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`, `firstname`, `lastname`, `gender`, `dateofbirth`, `street`, `housenumber`, `city`, `zipcode`, `lat`, `lng`, `healthinformation`, `insurancename`, `insurancetype`, `admin`) VALUES
(1, 'admin', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 'nabil@google.com', 'nabil', 'akir', 'm', '2005-06-01', 'gruneliusstr', '103', 'frankfurt', '60599', 50.09920169999999, 8.722334499999999, 'no previous illnesses', 'aok hessen', 'public', 1),
(2, 'test', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', 'test@gmx.net', 'Tim', 'Mache', 'd', '2001-09-02', 'Teststr', '98', 'Offenbach am Main', '60599', 50.13145977989272, 8.69255162989272, '', '', 'private', 0),
(3, 'LuanTest', '03dd46b7449addc139339b7849d8bfda038ea714e54e6acff77241cf66810204', 'jamyc19@gmail.com', 'Luan', 'Test', 'm', '2002-07-19', 'Rua da Felicidade', '030', 'Florianópolis', '60431', 50.13145977989272, 8.69255162989272, 'Tô de boa', 'Joa', 'public', 0),
(4, 'hoaaang', '45e07a1045393aa08021f62a27f6d75fc9d49b14b34ddbe2f395d595cb769819', 'nguyen_hoang0507@yahoo.com', 'Hoang', 'N', 'm', '2000-07-05', 'Straße', '57', 'Frankfurt am Main', '65934', 50.13145977989272, 8.69255162989272, 'no information', 'AOK', 'public', 0),
(5, 'noel.b', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 'noel.b@gmx.net', 'Noel', 'Bromkamp', 'f', '2001-12-20', 'jeroom beckstraat', '4', 'Antwerpen, Belgien', '2100', 51.2299792, 4.4584069, 'diabetes', '', 'private', 0);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
