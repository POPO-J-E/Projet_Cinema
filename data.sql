-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- GÃ©nÃ©rÃ© le : Mer 30 Novembre 2011 Ã  19:32
-- Version du serveur: 5.5.8
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de donnÃ©es: 'cinema'
--

-- --------------------------------------------------------

--
-- Structure de la table 'acteur'
--

--
-- Contenu de la table 'acteur'
--

INSERT INTO acteur (no_act, nom_act, pren_act, date_naiss, date_deces) VALUES
(1, 'Reno', 'Jean', '1948-07-30', NULL),
(5, 'Portman', 'Natalie', '1981-06-09', NULL),
(7, 'Dujardin', 'Jean', '1972-06-19', NULL),
(8, 'Bourvil', '', '1917-07-27', '1970-09-23'),
(12, 'De Funes', 'Louis', '1914-07-31', '1983-01-27'),
(13, 'Anglade', 'Jean-Hugues', '1955-07-29', NULL),
(15, 'Lambert', 'Christophe', '1957-03-29', NULL);

-- --------------------------------------------------------

--
-- Structure de la table 'categorie'
--

--
-- Contenu de la table 'categorie'
--

INSERT INTO categorie (code_cat, libelle_cat) VALUES
('AC', 'Action'),
('CO', 'ComÃ©die'),
('PO', 'Policier'),
('WE', 'Western');

-- --------------------------------------------------------

--
-- Structure de la table 'film'
--

--
-- Contenu de la table 'film'
--

INSERT INTO film (no_film, titre, duree, date_sortie, budget, montant_recette, no_rea, code_cat) VALUES
(1, 'LÃ©on', 110, '1994-04-14', 17531000, 69250000, 3, 'PO'),
(2, 'Cash', 100, '2008-04-23', 18340000, 60340000, 4, 'PO'),
(3, 'La grande vadrouille', 132, '1966-12-01', 7227000, 51258000, 2, 'AC'),
(4, 'Subway', 104, '1985-04-10', 10567000, 70500000, 3, 'PO');

-- --------------------------------------------------------

--
-- Structure de la table 'personnage'
--


--
-- Contenu de la table 'personnage'
--

INSERT INTO personnage (no_per, no_film, no_act, nom_pers) VALUES
(1, 1, 1, 'LÃ©on'),
(2, 1, 5, 'Mathilda'),
(3, 2, 1, 'Maxime Dubreuil'),
(4, 2, 7, 'Cash'),
(5, 3, 8, 'Augustin Bouvet'),
(6, 3, 12, 'Stanislas Lefort'),
(7, 4, 1, 'Le Batteur'),
(8, 4, 13, 'Le Roller'),
(9, 4, 15, 'Fred');

-- --------------------------------------------------------

--
-- Structure de la table 'realisateur'
--

--
-- Contenu de la table 'realisateur'
--

INSERT INTO realisateur (no_rea, nom_rea, pren_rea) VALUES
(1, 'Oury', 'GÃ©rard'),
(2, 'Chabrol', 'Claude'),
(3, 'Besson', 'Luc'),
(4, 'Besnard', 'Eric');
