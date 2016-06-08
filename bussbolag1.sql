-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Värd: 127.0.0.1
-- Tid vid skapande: 08 jun 2016 kl 16:50
-- Serverversion: 10.1.13-MariaDB
-- PHP-version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databas: `bussbolag1`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `bokningar`
--

CREATE TABLE `bokningar` (
  `TurID` int(11) NOT NULL,
  `ResenarID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `bokningar`
--

INSERT INTO `bokningar` (`TurID`, `ResenarID`) VALUES
(2, 2);

-- --------------------------------------------------------

--
-- Tabellstruktur `resenar`
--

CREATE TABLE `resenar` (
  `ResenarID` int(11) NOT NULL,
  `Namn` varchar(255) NOT NULL,
  `Personnr` int(12) DEFAULT NULL,
  `Adress` varchar(255) DEFAULT NULL,
  `Mobilnr` int(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `resenar`
--

INSERT INTO `resenar` (`ResenarID`, `Namn`, `Personnr`, `Adress`, `Mobilnr`) VALUES
(1, 'Kalle', NULL, NULL, NULL),
(2, 'Markus', 160607, 'Storgatan 7', 799999999);

-- --------------------------------------------------------

--
-- Tabellstruktur `stad`
--

CREATE TABLE `stad` (
  `StadsID` int(11) NOT NULL,
  `Land` varchar(255) NOT NULL,
  `Stad` varchar(255) NOT NULL,
  `Sprak` varchar(255) NOT NULL,
  `Valuta` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `stad`
--

INSERT INTO `stad` (`StadsID`, `Land`, `Stad`, `Sprak`, `Valuta`) VALUES
(1, 'Sverige', 'Malmö', 'Svenska', 'SEK'),
(2, 'Sverige', 'Stockholm', 'Svenska', 'SEK'),
(3, 'Danmark', 'Köpenhamn', 'Danska', 'DKK'),
(4, 'Tyskland', 'Hamburg', 'Tyska', 'EURO'),
(5, 'Tyskland', 'Dortmund', 'Tyska', 'EURO');

-- --------------------------------------------------------

--
-- Tabellstruktur `tur`
--

CREATE TABLE `tur` (
  `ReseID` int(11) NOT NULL,
  `Veckonr` varchar(255) NOT NULL,
  `Kostnad` varchar(255) NOT NULL,
  `Forbokning` varchar(255) NOT NULL,
  `Fullbokat` varchar(255) NOT NULL,
  `AvgarFran` int(11) DEFAULT NULL,
  `AnkommerTill` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `tur`
--

INSERT INTO `tur` (`ReseID`, `Veckonr`, `Kostnad`, `Forbokning`, `Fullbokat`, `AvgarFran`, `AnkommerTill`) VALUES
(1, '40', '150', '', '', 1, 2),
(2, '40', '100', '', '', 1, 3),
(3, '40', '100', '', '', 4, 3),
(4, '40', '780', '', '', 2, 1),
(5, '12', '380', '', '', 3, 1),
(6, '13', '340', '', '', 3, 4),
(7, '23', '459', '', '', 5, 2),
(8, '26', '245', '', '', 2, 3);

-- --------------------------------------------------------

--
-- Tabellstruktur `veckotidtabell`
--

CREATE TABLE `veckotidtabell` (
  `VeckoID` int(11) NOT NULL,
  `Datum` varchar(255) NOT NULL,
  `Avresetid` varchar(255) NOT NULL,
  `Ankomsttid` varchar(255) NOT NULL,
  `TurID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `veckotidtabell`
--

INSERT INTO `veckotidtabell` (`VeckoID`, `Datum`, `Avresetid`, `Ankomsttid`, `TurID`) VALUES
(1, '2016-06-03', '15.00', '17.00', 1);

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `bokningar`
--
ALTER TABLE `bokningar`
  ADD PRIMARY KEY (`TurID`,`ResenarID`),
  ADD KEY `ResenarID` (`ResenarID`);

--
-- Index för tabell `resenar`
--
ALTER TABLE `resenar`
  ADD PRIMARY KEY (`ResenarID`);

--
-- Index för tabell `stad`
--
ALTER TABLE `stad`
  ADD PRIMARY KEY (`StadsID`);

--
-- Index för tabell `tur`
--
ALTER TABLE `tur`
  ADD PRIMARY KEY (`ReseID`),
  ADD KEY `AvgarFran` (`AvgarFran`),
  ADD KEY `AnkommerTill` (`AnkommerTill`);

--
-- Index för tabell `veckotidtabell`
--
ALTER TABLE `veckotidtabell`
  ADD PRIMARY KEY (`VeckoID`),
  ADD KEY `TurID` (`TurID`);

--
-- AUTO_INCREMENT för dumpade tabeller
--

--
-- AUTO_INCREMENT för tabell `resenar`
--
ALTER TABLE `resenar`
  MODIFY `ResenarID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT för tabell `stad`
--
ALTER TABLE `stad`
  MODIFY `StadsID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT för tabell `tur`
--
ALTER TABLE `tur`
  MODIFY `ReseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT för tabell `veckotidtabell`
--
ALTER TABLE `veckotidtabell`
  MODIFY `VeckoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restriktioner för dumpade tabeller
--

--
-- Restriktioner för tabell `bokningar`
--
ALTER TABLE `bokningar`
  ADD CONSTRAINT `bokningar_ibfk_1` FOREIGN KEY (`TurID`) REFERENCES `tur` (`ReseID`),
  ADD CONSTRAINT `bokningar_ibfk_2` FOREIGN KEY (`ResenarID`) REFERENCES `resenar` (`ResenarID`),
  ADD CONSTRAINT `bokningar_ibfk_3` FOREIGN KEY (`TurID`) REFERENCES `tur` (`ReseID`);

--
-- Restriktioner för tabell `tur`
--
ALTER TABLE `tur`
  ADD CONSTRAINT `tur_ibfk_1` FOREIGN KEY (`AvgarFran`) REFERENCES `stad` (`StadsID`),
  ADD CONSTRAINT `tur_ibfk_2` FOREIGN KEY (`AnkommerTill`) REFERENCES `stad` (`StadsID`);

--
-- Restriktioner för tabell `veckotidtabell`
--
ALTER TABLE `veckotidtabell`
  ADD CONSTRAINT `veckotidtabell_ibfk_1` FOREIGN KEY (`TurID`) REFERENCES `tur` (`ReseID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
