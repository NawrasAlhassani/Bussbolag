-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Värd: 127.0.0.1
-- Tid vid skapande: 31 maj 2016 kl 12:51
-- Serverversion: 10.1.13-MariaDB
-- PHP-version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databas: `bussbolag`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `resenar`
--

CREATE TABLE `resenar` (
  `ResenarID` int(11) NOT NULL,
  `Namn` varchar(255) NOT NULL,
  `Personnr` int(12) DEFAULT NULL,
  `Adress` varchar(255) DEFAULT NULL,
  `Mobilnr` int(13) DEFAULT NULL,
  `ReseIDResenar` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `resenar`
--

INSERT INTO `resenar` (`ResenarID`, `Namn`, `Personnr`, `Adress`, `Mobilnr`, `ReseIDResenar`) VALUES
(1, 'Atilla', 930507, 'Klövergatan 14', 700000000, NULL),
(2, 'Nawras', 950707, 'Engelskagången 15', 711111111, NULL);

-- --------------------------------------------------------

--
-- Tabellstruktur `stad`
--

CREATE TABLE `stad` (
  `StadsID` int(11) NOT NULL,
  `Land` varchar(255) NOT NULL,
  `Stad` varchar(255) NOT NULL,
  `Sprak` varchar(255) NOT NULL,
  `Valuta` varchar(255) NOT NULL,
  `ReseIDStad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `stad`
--

INSERT INTO `stad` (`StadsID`, `Land`, `Stad`, `Sprak`, `Valuta`, `ReseIDStad`) VALUES
(1, 'Tyskland', 'Berlin', 'Tyska', 'Euro', NULL),
(2, 'Tyskland', 'München', 'Tyska', 'Euro', NULL),
(3, 'Danmark', 'Köpenhamn', 'Danska', 'Krone', NULL),
(4, 'Danmark', 'Helsingör', 'Danska', 'Krone', NULL),
(5, 'Danmark', 'Odense', 'Danska', 'Krone', NULL),
(6, 'Sverige', 'Stockholm', 'Svenska', 'Krona', NULL),
(7, 'Sverige', 'Göteborg', 'Svenska', 'Krona', NULL),
(8, 'Sverige', 'Malmö', 'Svenska', 'Krona', NULL),
(9, 'Sverige', 'Helsingborg', 'Svenska', 'Krona', NULL);

-- --------------------------------------------------------

--
-- Tabellstruktur `tur`
--

CREATE TABLE `tur` (
  `ReseID` int(11) NOT NULL,
  `Veckonr` varchar(255) NOT NULL,
  `Kostnad` varchar(255) NOT NULL,
  `Forbokning` varchar(255) NOT NULL,
  `Fullbokat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellstruktur `tur_resenar`
--

CREATE TABLE `tur_resenar` (
  `ReseIDResenarTur` int(11) NOT NULL,
  `ReseIDResenar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellstruktur `tur_veckotidtabell`
--

CREATE TABLE `tur_veckotidtabell` (
  `ReseIDTabell` int(11) NOT NULL,
  `ReseIDVeckoTur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellstruktur `veckotidtabell`
--

CREATE TABLE `veckotidtabell` (
  `VeckoID` int(11) NOT NULL,
  `Datum` varchar(255) NOT NULL,
  `Avresetid` varchar(255) NOT NULL,
  `Ankomsttid` varchar(255) NOT NULL,
  `ReseIDVtabell` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `resenar`
--
ALTER TABLE `resenar`
  ADD PRIMARY KEY (`ResenarID`),
  ADD KEY `ReseIDResenar` (`ReseIDResenar`);

--
-- Index för tabell `stad`
--
ALTER TABLE `stad`
  ADD PRIMARY KEY (`StadsID`),
  ADD KEY `ReseIDStad` (`ReseIDStad`);

--
-- Index för tabell `tur`
--
ALTER TABLE `tur`
  ADD PRIMARY KEY (`ReseID`);

--
-- Index för tabell `tur_resenar`
--
ALTER TABLE `tur_resenar`
  ADD PRIMARY KEY (`ReseIDResenarTur`,`ReseIDResenar`),
  ADD KEY `ReseIDResenar` (`ReseIDResenar`);

--
-- Index för tabell `tur_veckotidtabell`
--
ALTER TABLE `tur_veckotidtabell`
  ADD PRIMARY KEY (`ReseIDTabell`,`ReseIDVeckoTur`),
  ADD KEY `ReseIDVeckoTur` (`ReseIDVeckoTur`);

--
-- Index för tabell `veckotidtabell`
--
ALTER TABLE `veckotidtabell`
  ADD PRIMARY KEY (`VeckoID`),
  ADD KEY `ReseIDVtabell` (`ReseIDVtabell`);

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
  MODIFY `StadsID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT för tabell `tur`
--
ALTER TABLE `tur`
  MODIFY `ReseID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT för tabell `veckotidtabell`
--
ALTER TABLE `veckotidtabell`
  MODIFY `VeckoID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restriktioner för dumpade tabeller
--

--
-- Restriktioner för tabell `resenar`
--
ALTER TABLE `resenar`
  ADD CONSTRAINT `ReseIDResenar` FOREIGN KEY (`ReseIDResenar`) REFERENCES `tur` (`ReseID`);

--
-- Restriktioner för tabell `stad`
--
ALTER TABLE `stad`
  ADD CONSTRAINT `ReseIDStad` FOREIGN KEY (`ReseIDStad`) REFERENCES `tur` (`ReseID`);

--
-- Restriktioner för tabell `tur_resenar`
--
ALTER TABLE `tur_resenar`
  ADD CONSTRAINT `tur_resenar_ibfk_1` FOREIGN KEY (`ReseIDResenarTur`) REFERENCES `tur` (`ReseID`),
  ADD CONSTRAINT `tur_resenar_ibfk_2` FOREIGN KEY (`ReseIDResenar`) REFERENCES `resenar` (`ResenarID`);

--
-- Restriktioner för tabell `tur_veckotidtabell`
--
ALTER TABLE `tur_veckotidtabell`
  ADD CONSTRAINT `tur_veckotidtabell_ibfk_1` FOREIGN KEY (`ReseIDTabell`) REFERENCES `veckotidtabell` (`VeckoID`),
  ADD CONSTRAINT `tur_veckotidtabell_ibfk_2` FOREIGN KEY (`ReseIDVeckoTur`) REFERENCES `tur` (`ReseID`);

--
-- Restriktioner för tabell `veckotidtabell`
--
ALTER TABLE `veckotidtabell`
  ADD CONSTRAINT `ReseIDVtabell` FOREIGN KEY (`ReseIDVtabell`) REFERENCES `tur` (`ReseID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
