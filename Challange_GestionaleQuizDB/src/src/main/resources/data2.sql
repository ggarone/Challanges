CREATE TABLE IF NOT EXISTS `user` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_user`)
);

CREATE TABLE IF NOT EXISTS `test` (
    `id_test` INT NOT NULL AUTO_INCREMENT,
    `titolo_test` VARCHAR(255) NOT NULL,
    `data_test` DATE NOT NULL,
    PRIMARY KEY (`id_test`)
);

CREATE TABLE IF NOT EXISTS `domanda` (
    `id_domanda` INT NOT NULL AUTO_INCREMENT,
    `testo_domanda` VARCHAR(255) NOT NULL,
    `risposta_esatta` VARCHAR(255) NOT NULL,
    `punteggio_domanda` TINYINT NOT NULL unsigned,
    PRIMARY KEY (`id_domanda`)
);

CREATE TABLE IF NOT EXISTS `user_test` (
   `id_test` int NOT NULL,
   `id_user` int NOT NULL,
   `punteggio_totale` int DEFAULT NULL,
   PRIMARY KEY (`id_test`,`id_user`)
);

CREATE TABLE IF NOT EXISTS `domandatest` (
    `id_test` INT NOT NULL,
    `id_domanda` INT NOT NULL,
    PRIMARY KEY (`id_test`, `id_domanda`)
);
