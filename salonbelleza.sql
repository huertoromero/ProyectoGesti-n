-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2015 a las 14:41:18
-- Versión del servidor: 5.5.36
-- Versión de PHP: 5.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `salonbelleza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int(11) NOT NULL,
  `puesto` varchar(45) DEFAULT NULL,
  `salarioBasico` float DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `puesto`, `salarioBasico`) VALUES
(1, 'Administrador', 1000),
(2, 'Vendedor', 3000),
(3, 'Deposito', 3500),
(4, 'Recursos Humanos', 4000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `dniCliente` int(11) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Telefono` bigint(15) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `FechaDeAlta` date DEFAULT NULL,
  `FechaDeBaja` date DEFAULT NULL,
  `Estado` int(1) NOT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dniCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`dniCliente`, `Apellido`, `Nombre`, `Telefono`, `Email`, `FechaDeAlta`, `FechaDeBaja`, `Estado`, `Direccion`) VALUES
(4567894, 'martinez', 'fernando', 386555555, 'fernando@martinez', '2015-09-06', NULL, 1, 'fernando martinez 456'),
(11111111, 'Apaza', 'Silvana', 3814637256, 'silva_d@gmail.com', '2015-09-01', '0000-00-00', 1, 'barrio belgrano mc lote 12'),
(17052415, 'barrientos', 'ruben', 3865413151, 'rubengabriel_ru@hotmail.com', '1999-12-02', '2015-09-06', 0, 'concepción - tucuman'),
(20898931, 'Cejas', 'Juan Carlos', 3865256079, 'cejasjuancarlos@gmail.com', '2015-09-06', '2015-09-06', 0, 'Ricardo Rojas 900 - Alberdi'),
(22547584, 'lucas', 'fernandez', 3865426614, 'lucasfernandez@gmail.com', '2015-09-06', NULL, 1, 'lucas fernandez 456'),
(25415245, 'salazar', 'ernesto', 3865243820, 'ernerstosalazar@gmail.com', '2015-09-06', '2015-09-07', 0, 'ernesto salazar 789');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE IF NOT EXISTS `compra` (
  `idCompra` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `Hora` time DEFAULT NULL,
  `idProveedor` int(11) NOT NULL,
  `Vuelto` float DEFAULT NULL,
  `Total` int(11) NOT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `proveedor_id_idx` (`idProveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `Fecha`, `Hora`, `idProveedor`, `Vuelto`, `Total`) VALUES
(5, '2015-09-06', '01:23:00', 2, 0, 30),
(6, '2015-09-06', '02:01:00', 2, NULL, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conceptos`
--

CREATE TABLE IF NOT EXISTS `conceptos` (
  `idConcepto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  `montoFijo` float DEFAULT NULL,
  `montoVariable` float DEFAULT NULL,
  `porDefecto` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`idConcepto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `conceptos`
--

INSERT INTO `conceptos` (`idConcepto`, `descripcion`, `tipo`, `montoFijo`, `montoVariable`, `porDefecto`) VALUES
(1, 'jubilacion', 'resta', 0, 0.2, b'1'),
(2, 'obra social', 'resta', 0, 0.03, b'1'),
(3, 'salario complementario junio', 'suma', 0, 0.5, b'0'),
(4, 'Salario Complementario Diciembre', 'suma', 0, 0.5, b'0'),
(5, 'vacaciones 7 dias', 'suma', 0, 0, b'0'),
(6, 'Vacaciones 14 Dias', 'suma', 0, 0, b'0'),
(7, 'presentismo', 'suma', 140, 0, b'0'),
(8, 'Ley 23660', 'resta', 0, 0.03, b'1'),
(9, 'Aporte Obra Social', 'resta', 197, 0, b'1'),
(10, 'Aporte Sindicato', 'resta', 0, 0.02, b'1'),
(11, 'Salario Basico', 'suma', 0, 0, b'0'),
(12, 'Vacaciones 21 Dias', 'suma', 0, 0, b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleliquidacion`
--

CREATE TABLE IF NOT EXISTS `detalleliquidacion` (
  `idDetalleLiquidacion` int(11) NOT NULL AUTO_INCREMENT,
  `idLiquidacion` int(11) NOT NULL,
  `idConcepto` int(11) NOT NULL,
  `Monto` float DEFAULT NULL,
  `descuentos` float DEFAULT NULL,
  `subTotal` float NOT NULL,
  PRIMARY KEY (`idDetalleLiquidacion`),
  KEY `liquidacion_id_idx` (`idLiquidacion`),
  KEY `concepto_id_idx` (`idConcepto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `idDetalleCompra` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `subTotal` float DEFAULT NULL,
  `compra_id` int(11) NOT NULL,
  `insumo_id` int(11) NOT NULL,
  PRIMARY KEY (`idDetalleCompra`),
  KEY `compra_id_idx` (`compra_id`),
  KEY `insumo_id_idx` (`insumo_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `detalle_compra`
--

INSERT INTO `detalle_compra` (`idDetalleCompra`, `cantidad`, `subTotal`, `compra_id`, `insumo_id`) VALUES
(4, 1, 10, 5, 2),
(5, 2, 20, 5, 1),
(6, 1, 1, 5, 2),
(7, 1, 1, 5, 1),
(8, 1, 1, 5, 2),
(9, 1, 1, 5, 1),
(10, 1, 1, 6, 2),
(11, 1, 1, 6, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT,
  `subTotal` float DEFAULT NULL,
  `venta_id` int(11) NOT NULL,
  `servicio_id` int(11) NOT NULL,
  PRIMARY KEY (`idDetalleVenta`),
  KEY `venta_id_idx` (`venta_id`),
  KEY `servicio_id_idx` (`servicio_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`idDetalleVenta`, `subTotal`, `venta_id`, `servicio_id`) VALUES
(1, 100, 13, 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE IF NOT EXISTS `empleados` (
  `dniEmpleado` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `cuil` bigint(15) NOT NULL,
  `fechadeingreso` date NOT NULL,
  `telefono` bigint(11) DEFAULT NULL,
  `Mail` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `fechaBaja` date DEFAULT NULL,
  `idCategoria` int(11) NOT NULL,
  PRIMARY KEY (`dniEmpleado`),
  KEY `idCategoria` (`idCategoria`),
  KEY `idCategoria_2` (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='				';

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`dniEmpleado`, `nombre`, `apellido`, `fechaNacimiento`, `cuil`, `fechadeingreso`, `telefono`, `Mail`, `direccion`, `estado`, `fechaBaja`, `idCategoria`) VALUES
(5, 'nelson', 'vila', '1944-03-02', 20374982293, '2002-03-02', 3865535153, 'nelsonvila@gmail.com', 'rivadavia 546', 1, NULL, 1),
(36039808, 'leonardo', 'apaza', '1991-03-09', 20360398081, '2015-09-08', 3865623116, 'leonardo@apaza', 'san juan 730', 1, NULL, 2),
(37496656, 'martin', 'cejas', '1993-04-20', 20374966562, '2015-09-08', 3865656737, 'nelsoncejas@gmail.com', 'rivadavia 798', 1, NULL, 4),
(37498297, 'gabriel', 'barrientos', '1993-05-09', 20374982973, '2015-09-08', 3865333706, 'gabrielbarrientos31@gmail.com', 'monteagudo 747', 1, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupofamiliar`
--

CREATE TABLE IF NOT EXISTS `grupofamiliar` (
  `idGrupoFamiliar` int(11) NOT NULL AUTO_INCREMENT,
  `dniEmpleado` int(8) NOT NULL,
  `dni` bigint(8) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `Parentesco` varchar(30) DEFAULT NULL,
  `discapacidad` tinyint(1) DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  PRIMARY KEY (`idGrupoFamiliar`),
  KEY `fk_GrupoFamiliar_Empleado1_idx` (`dniEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `insumo`
--

CREATE TABLE IF NOT EXISTS `insumo` (
  `idInsumo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `unidad_cantidad_uso` int(11) DEFAULT NULL,
  `disponibilidad` int(4) DEFAULT NULL,
  PRIMARY KEY (`idInsumo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `insumo`
--

INSERT INTO `insumo` (`idInsumo`, `nombre`, `cantidad`, `unidad_cantidad_uso`, `disponibilidad`) VALUES
(1, 'Shampoo Head and Shouders', 3, 10, 30),
(2, 'Acondicionador Nieva', 4, 5, 20),
(3, 'Tintura Inoa Supreme Loreal', 3, 30, 90),
(4, 'rubor smart shade', 10, 10, 100),
(5, 'sombra mate ', 3, 15, 45),
(6, 'aceite de aromaterapia', 2, 10, 19),
(7, 'setfacial', 5, 15, 73),
(8, 'cera depilatoria', 3, 5, 13),
(9, 'spray para cabello', 10, 20, 196),
(10, 'gel fijador de cabello', 5, 20, 100),
(11, 'gel efecto humedo', 5, 20, 100),
(12, 'mousse ', 5, 20, 100),
(13, 'mascarilla facial', 5, 1, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `insumo_servicio`
--

CREATE TABLE IF NOT EXISTS `insumo_servicio` (
  `cantidad_uso` bit(1) NOT NULL DEFAULT b'1',
  `servicio_id` int(11) NOT NULL,
  `insumo_id` int(11) NOT NULL,
  KEY `fk_Insumo_servicio_Servicios1_idx` (`servicio_id`),
  KEY `fk_Insumo_servicio_Insumos1_idx` (`insumo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `insumo_servicio`
--

INSERT INTO `insumo_servicio` (`cantidad_uso`, `servicio_id`, `insumo_id`) VALUES
(b'1', 27, 1),
(b'1', 29, 2),
(b'1', 27, 1),
(b'1', 27, 3),
(b'1', 30, 7),
(b'1', 31, 8),
(b'1', 32, 9),
(b'1', 33, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `liquidacion`
--

CREATE TABLE IF NOT EXISTS `liquidacion` (
  `idLiquidacion` int(11) NOT NULL AUTO_INCREMENT,
  `dniEmpleado` int(11) NOT NULL,
  `FechaDesde` date NOT NULL,
  `FechaHasta` date NOT NULL,
  `SalarioNeto` float NOT NULL,
  `PeriodoDeLiquidacion` varchar(25) NOT NULL,
  `Estado` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idLiquidacion`),
  KEY `empleado_id_idx` (`dniEmpleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `liquidacion`
--

INSERT INTO `liquidacion` (`idLiquidacion`, `dniEmpleado`, `FechaDesde`, `FechaHasta`, `SalarioNeto`, `PeriodoDeLiquidacion`, `Estado`) VALUES
(1, 37498297, '2015-08-06', '2015-09-06', 4500, '8/12', 1),
(2, 36039808, '2015-08-06', '2015-08-06', 3500, '8/12', 1),
(3, 37496656, '2015-08-06', '2015-09-06', 5000, '8/12', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `idProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `RazonSocial` varchar(45) DEFAULT NULL,
  `Telefono` bigint(15) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `fechadeAlta` date DEFAULT NULL,
  `fechadeBaja` date DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `provincia` varchar(35) NOT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `RazonSocial`, `Telefono`, `Email`, `fechadeAlta`, `fechadeBaja`, `estado`, `direccion`, `provincia`) VALUES
(1, 'distribuidora avon', 3865111111, 'avon@avon', '2015-09-05', NULL, 1, 'avon 200', 'tucuman'),
(2, 'distribuidora nivea', 3865222222, 'nivea@nivea', '2015-09-05', NULL, 1, 'nivea 300', 'tucuman'),
(3, 'distribuidora head and shouders', 3865333333, 'head@shouders', '2015-09-05', NULL, 1, 'head and shouders 300', 'tucuman');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE IF NOT EXISTS `servicios` (
  `idServicio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=34 ;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`idServicio`, `nombre`, `precio`) VALUES
(5, 'tintura', 50),
(11, 'lavado pelo', 34),
(12, 'peinado', 200),
(14, 'planchita', 200),
(27, 'lavado 3', 34),
(29, 'lavado 5', 93),
(30, 'facial', 120),
(31, 'depilacion', 100),
(32, 'estilizacion de cabello', 100),
(33, 'masajes', 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) DEFAULT NULL,
  `contrasenia` varchar(45) DEFAULT NULL,
  `menuCliente` bit(1) DEFAULT NULL,
  `menuEmpleados` bit(1) DEFAULT NULL,
  `menuProveedores` bit(1) DEFAULT NULL,
  `menuSalarios` bit(1) DEFAULT NULL,
  `menuServicio` bit(1) DEFAULT NULL,
  `menuCompra` bit(1) DEFAULT NULL,
  `menuVenta` bit(1) DEFAULT NULL,
  `menuInsumo` int(1) NOT NULL DEFAULT '0',
  `dniEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `dniEmpleado` (`dniEmpleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `Usuario`, `contrasenia`, `menuCliente`, `menuEmpleados`, `menuProveedores`, `menuSalarios`, `menuServicio`, `menuCompra`, `menuVenta`, `menuInsumo`, `dniEmpleado`) VALUES
(7, 'admin2', 'c84258e9c39059a89ab77d846ddab909', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 1, 5),
(8, 'admin', '21232f297a57a5a743894ae4a801fc3', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 1, 37498297),
(9, 'vendedor', '0407e8c8285ab85509ac2884025dcf42', b'0', b'0', b'0', b'0', b'1', b'0', b'1', 0, 36039808),
(10, 'rrhh', '89f71c4e9055ee73c3bc372528a54b9c', b'0', b'0', b'0', b'1', b'0', b'0', b'0', 0, 37496656);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `idVenta` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `Hora` time DEFAULT NULL,
  `Total` float DEFAULT NULL,
  `Monto` float NOT NULL,
  `Vuelto` float DEFAULT NULL,
  `dniEmpleado` int(11) NOT NULL,
  `dniCliente` int(11) NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `empleado_id_idx` (`dniEmpleado`),
  KEY `cliente_id_idx` (`dniCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idVenta`, `Fecha`, `Hora`, `Total`, `Monto`, `Vuelto`, `dniEmpleado`, `dniCliente`) VALUES
(13, '2015-09-08', '17:36:00', 100, 120, 20, 36039808, 11111111);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `proveedor_id` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalleliquidacion`
--
ALTER TABLE `detalleliquidacion`
  ADD CONSTRAINT `concepto_id` FOREIGN KEY (`idConcepto`) REFERENCES `conceptos` (`idConcepto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `liquidacion_id` FOREIGN KEY (`idLiquidacion`) REFERENCES `liquidacion` (`idLiquidacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `compra_id` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`idCompra`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `insumo_id1` FOREIGN KEY (`insumo_id`) REFERENCES `insumo` (`idInsumo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `servicio_id` FOREIGN KEY (`servicio_id`) REFERENCES `servicios` (`idServicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `venta_id` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`idVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Filtros para la tabla `grupofamiliar`
--
ALTER TABLE `grupofamiliar`
  ADD CONSTRAINT `grupofamiliar_ibfk_1` FOREIGN KEY (`dniEmpleado`) REFERENCES `empleados` (`dniEmpleado`);

--
-- Filtros para la tabla `insumo_servicio`
--
ALTER TABLE `insumo_servicio`
  ADD CONSTRAINT `fk_Insumo_servicio_Insumos1` FOREIGN KEY (`insumo_id`) REFERENCES `insumo` (`idInsumo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Insumo_servicio_Servicios1` FOREIGN KEY (`servicio_id`) REFERENCES `servicios` (`idServicio`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `liquidacion`
--
ALTER TABLE `liquidacion`
  ADD CONSTRAINT `liquidacion_ibfk_1` FOREIGN KEY (`dniEmpleado`) REFERENCES `empleados` (`dniEmpleado`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`dniEmpleado`) REFERENCES `empleados` (`dniEmpleado`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `cliente_id` FOREIGN KEY (`dniCliente`) REFERENCES `clientes` (`dniCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `empleado_id2` FOREIGN KEY (`dniEmpleado`) REFERENCES `empleados` (`dniEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
