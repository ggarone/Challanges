CREATE TABLE IF NOT EXISTS `tss_2022`.`test` (
    `id_test` INT NOT NULL AUTO_INCREMENT,
    `titolo_test` VARCHAR(45) NOT NULL,
    `data_test` DATE NOT NULL,
    PRIMARY KEY (`id_test`));

CREATE TABLE IF NOT EXISTS `tss_2022`.`persona` (
    `id_test` INT NOT NULL,
    `id_persona` INT NOT NULL AUTO_INCREMENT,
    `punteggio_totale` INT NULL,
    `password` VARCHAR(45) NULL,
    PRIMARY KEY (`id_persona`));

CREATE TABLE IF NOT EXISTS `tss_2022`.`domanda` (
    `id_domanda` INT NOT NULL AUTO_INCREMENT,
    `testo_domanda` VARCHAR(255) NOT NULL,
    `risposta_esatta` VARCHAR(255) NOT NULL,
    `punteggio_domanda` INT NOT NULL,
    PRIMARY KEY (`id_domanda`));

CREATE TABLE IF NOT EXISTS `tss_2022`.`domandatest` (
    `id_test` INT NOT NULL,
    `id_domanda` INT NOT NULL,
    PRIMARY KEY (`id_test`, `id_domanda`));
    
INSERT INTO domanda(id_domanda,testo_domanda,risposta_esatta,punteggio_domanda) VALUE
/* Primo test */
(1,'In che anno scoppio la Seconda Guerra Mondiale?','1939',20),
(2,'In che anno usci il primo album degli Iron Maiden?','1980',20),
(3,'Unico posto in Europa con maggioranza budista?','Calmucchia',20),
(4,'Quale è il paese con più basi militari americane?','Germania',20),
/* Secondo test */
(5,'Quante sono le cosidette nazioni celtiche?','5',20),
(6,'In che anno scoppio la Rivoluzione Francese?','1789',20),
(7,'Il pomodoro è un verdura?','No',20),
(8,'In quale città è nato il Melodic Death Metal?','Goteborg',20),
/* Terzo test */
(9,'Quanti portavioni ha perso il Giappone nella Battaglia di Midway?','4',20),
(10,'Quante lingue sono ufficiali nella svizzera?','4',20),
(11,'Quanti membri ha la banda Slipknot?','9',20),
(12,'Con quanti pasi limita la Russia?','16',20),
/* Quarto test */
(13,'Quale è la moneta ufficiale in Albania?','Lek',20),
(14,'Unico paese africano con lo spagnolo com lingua ufficiale?','Guinea Equatoriale',20),
(15,'Quale è la banda musicale con più essito di vendite in Finlandia?','Nightwish',20),
(16,'Quale è lo studio creatore della saga di videogiocchi Serious Sam?','Croteam',20),
/* Quinto test */
(17,'Quanti presidenti ha avuto la Prima Repubblica spagnola?','4',20),
(18,'Che calibro utilizza il fucile Barret M82?','.50 BMG',20),
(19,'Quale era il nombre completo di Pablo Picasso','Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Santísima Trinidad Ruiz y Picasso',20),
(20,'Questi sono i migliori test del mondo?','Si',10);


INSERT INTO test(id_test,titolo_test,data_test) VALUE
(1,'Generali','2022-02-28');

INSERT INTO persona(id_test,id_persona,punteggio_totale,`password`) VALUE 
(1,1,40,'napoli99');

INSERT INTO domandatest(id_test,id_domanda) VALUE
(1,1),(1,5),(1,9),(1,18),(1,19)