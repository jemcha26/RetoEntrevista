-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-08-2019 a las 22:34:31
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `table_customers`
--

CREATE TABLE IF NOT EXISTS `table_customers` (
  `customer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_apellidos` varchar(255) DEFAULT NULL,
  `customer_date_of_birth` date DEFAULT NULL,
  `customer_edad` bigint(20) DEFAULT NULL,
  `customer_names` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `table_customers`
--

INSERT INTO `table_customers` (`customer_id`, `customer_apellidos`, `customer_date_of_birth`, `customer_edad`, `customer_names`) VALUES
(1, 'hdjdjkdjd', '1989-06-26', 30, 'hdhdh'),
(2, 'perez dulanto', '1990-11-26', 28, 'juan'),
(3, 'Zapata dulanto', '1998-07-03', 21, 'juan Diego');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
