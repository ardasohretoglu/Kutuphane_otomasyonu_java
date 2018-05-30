-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 30 May 2018, 12:14:05
-- Sunucu sürümü: 10.1.32-MariaDB
-- PHP Sürümü: 7.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `kütüphane`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text COLLATE utf32_turkish_ci NOT NULL,
  `password` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('Arda Şöhretoğlu', '12345'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kitap`
--

CREATE TABLE `kitap` (
  `id` int(11) NOT NULL,
  `Kitap Adı` text COLLATE utf32_turkish_ci NOT NULL,
  `Kitap Alt Adı` text COLLATE utf32_turkish_ci NOT NULL,
  `Kitap Seri Adı` text COLLATE utf32_turkish_ci NOT NULL,
  `Yazar` text COLLATE utf32_turkish_ci NOT NULL,
  `Yayın Evi` text COLLATE utf32_turkish_ci NOT NULL,
  `Isbn No` text COLLATE utf32_turkish_ci NOT NULL,
  `Açıklama` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `kitap`
--

INSERT INTO `kitap` (`id`, `Kitap Adı`, `Kitap Alt Adı`, `Kitap Seri Adı`, `Yazar`, `Yayın Evi`, `Isbn No`, `Açıklama`) VALUES
(2, 'Olasılıksız', 'Olasılıksız', 'Olasılıksız', 'Adam Fawer', 'Ziraat', '5123', 'Bilimkurgu romanı'),
(5, 'Plevne', 'Osman Paşa', 'Tuna', 'Sanb', 'Barbar', '3653', 'kitap');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `yayın evi`
--

CREATE TABLE `yayın evi` (
  `id` int(11) NOT NULL,
  `Yayın Evi Ad` text COLLATE utf32_turkish_ci NOT NULL,
  `Açıklama` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `yayın evi`
--

INSERT INTO `yayın evi` (`id`, `Yayın Evi Ad`, `Açıklama`) VALUES
(1, 'Yapı Kredi', 'Yayın '),
(2, 'İş Bankası', 'Yayın Evi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `yazarlar`
--

CREATE TABLE `yazarlar` (
  `id` int(11) NOT NULL,
  `Ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `Soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `Açıklama` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `yazarlar`
--

INSERT INTO `yazarlar` (`id`, `Ad`, `Soyad`, `Açıklama`) VALUES
(2, 'Sabahattin', 'Ali', 'Kuyucaklı Yusuf,Kürk mantolu madonna yazarı'),
(3, 'Dan', 'Brown', 'Yeni Kitabı Başlangıç'),
(4, 'Dante', 'Alighieri', 'Klasik roman cenehhem yazarı'),
(5, 'Kemal', 'Tahir', 'Yazar');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kitap`
--
ALTER TABLE `kitap`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `yayın evi`
--
ALTER TABLE `yayın evi`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `yazarlar`
--
ALTER TABLE `yazarlar`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kitap`
--
ALTER TABLE `kitap`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `yayın evi`
--
ALTER TABLE `yayın evi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `yazarlar`
--
ALTER TABLE `yazarlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
