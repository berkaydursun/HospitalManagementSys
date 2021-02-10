-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 10 Şub 2021, 12:41:47
-- Sunucu sürümü: 8.0.17
-- PHP Sürümü: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `hospital_db`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `appointment_table`
--

CREATE TABLE `appointment_table` (
  `patient_id` varchar(25) COLLATE utf8_turkish_ci NOT NULL,
  `hospital_name` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `department_name` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_name` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_id` varchar(20) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `appointment_table`
--

INSERT INTO `appointment_table` (`patient_id`, `hospital_name`, `department_name`, `doctor_name`, `doctor_id`) VALUES
('10987654321', 'Bursa Hospital', 'Cardiology', 'James Bond', '12345678910');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `doctor_table`
--

CREATE TABLE `doctor_table` (
  `doctor_id` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_name` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_surname` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_hospital` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_department` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `doctor_password` varchar(12) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `doctor_table`
--

INSERT INTO `doctor_table` (`doctor_id`, `doctor_name`, `doctor_surname`, `doctor_hospital`, `doctor_department`, `doctor_password`) VALUES
('12345678910', 'James', 'Bond', 'Bursa Hospital', 'Cardiology', 'jamesbond007');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hospital_table`
--

CREATE TABLE `hospital_table` (
  `hospital_name` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `hospital_location` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `hospital_capacity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `hospital_table`
--

INSERT INTO `hospital_table` (`hospital_name`, `hospital_location`, `hospital_capacity`) VALUES
('Bursa Hospital', 'Bursa', 1500);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `patient_table`
--

CREATE TABLE `patient_table` (
  `patient_id` varchar(25) COLLATE utf8_turkish_ci NOT NULL,
  `patient_name` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `patient_surname` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `patient_password` varchar(15) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `patient_table`
--

INSERT INTO `patient_table` (`patient_id`, `patient_name`, `patient_surname`, `patient_password`) VALUES
('10987654321', 'Berkay ', 'Dursun', '123456');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
