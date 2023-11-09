drop table if EXISTS registro;
drop table if EXISTS users;
drop table if EXISTS green;

CREATE TABLE registro (
    codigo_de_registro int(15) NOT NULL,
    firmeza_de_green   int(15),
    humedad            int(15),
    altura_de_siega    int(15),
    bote               int(15),
    velocidad          int(15),
    color              int(15),
    fecha              DATE,
    temperatura        int(15),
    volumen_siega      int(15),
    numero_hoyo        int(15)
);

CREATE TABLE users(
    USR VARCHAR(50) PRIMARY KEY,
    PWD VARCHAR(50),
    ROL VARCHAR(50)
);

CREATE TABLE green (
    codigo_hoyo int PRIMARY KEY
);

INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('1', '2', '10', '7', '2', '3', '16', '18', '10', '1', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('1', '4', '8', '6', '6', '10', '16', '8', '5', '1', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('1', '8', '10', '10', '6', '7', '14', '15', '6', '1', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('1', '9', '5', '10', '3', '9', '42', '7', '3', '1','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('1', '2', '10', '9', '1', '7', '33', '18', '8', '1','2023_01_05');

INSERT INTO registro (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1', '2023_01_06');

INSERT INTO registro (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('1', '2', '10', '7', '2', '3', '16', '18', '10', '1', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '4', '8', '6', '6', '10', '16', '8', '5', '1', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '10', '10', '6', '7', '14', '15', '6', '1', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '9', '5', '10', '3', '9', '42', '7', '3', '1','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '2', '10', '9', '1', '7', '33', '18', '8', '1','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('1', '8', '5', '6', '8', '4', '36', '21', '5', '1','2023_01_18');



INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('2', '2', '10', '7', '2', '3', '16', '18', '10', '2', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('2', '4', '8', '6', '6', '10', '16', '8', '5', '2', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('2', '8', '10', '10', '6', '7', '14', '15', '6', '2', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('2', '9', '5', '10', '3', '9', '42', '7', '3', '2','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('2', '2', '10', '9', '1', '7', '33', '18', '8', '2','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('2', '2', '10', '7', '2', '3', '16', '18', '10', '2', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '4', '8', '6', '6', '10', '16', '8', '5', '2', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '10', '10', '6', '7', '14', '15', '6', '2', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '9', '5', '10', '3', '9', '42', '7', '3', '2','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '2', '10', '9', '1', '7', '33', '18', '8', '2','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('2', '8', '5', '6', '8', '4', '36', '21', '5', '2','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('3', '2', '10', '7', '2', '3', '16', '18', '10', '3', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('3', '4', '8', '6', '6', '10', '16', '8', '5', '3', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('3', '8', '10', '10', '6', '7', '14', '15', '6', '3', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('3', '9', '5', '10', '3', '9', '42', '7', '3', '3','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('3', '2', '10', '9', '1', '7', '33', '18', '8', '3','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('3', '2', '10', '7', '2', '3', '16', '18', '10', '3', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '4', '8', '6', '6', '10', '16', '8', '5', '3', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '10', '10', '6', '7', '14', '15', '6', '3', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '9', '5', '10', '3', '9', '42', '7', '3', '3','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '2', '10', '9', '1', '7', '33', '18', '8', '3','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('3', '8', '5', '6', '8', '4', '36', '21', '5', '3','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('4', '2', '10', '7', '2', '3', '16', '18', '10', '4', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('4', '4', '8', '6', '6', '10', '16', '8', '5', '4', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('4', '8', '10', '10', '6', '7', '14', '15', '6', '4', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('4', '9', '5', '10', '3', '9', '42', '7', '3', '4','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('4', '2', '10', '9', '1', '7', '33', '18', '8', '4','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('4', '2', '10', '7', '2', '3', '16', '18', '10', '4', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '4', '8', '6', '6', '10', '16', '8', '5', '4', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '10', '10', '6', '7', '14', '15', '6', '4', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '9', '5', '10', '3', '9', '42', '7', '3', '4','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '2', '10', '9', '1', '7', '33', '18', '8', '4','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('4', '8', '5', '6', '8', '4', '36', '21', '5', '4','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('5', '2', '10', '7', '2', '3', '16', '18', '10', '5', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('5', '4', '8', '6', '6', '10', '16', '8', '5', '5', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('5', '8', '10', '10', '6', '7', '14', '15', '6', '5', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('5', '9', '5', '10', '3', '9', '42', '7', '3', '5','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('5', '2', '10', '9', '1', '7', '33', '18', '8', '5','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('5', '2', '10', '7', '2', '3', '16', '18', '10', '5', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '4', '8', '6', '6', '10', '16', '8', '5', '5', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '10', '10', '6', '7', '14', '15', '6', '5', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '9', '5', '10', '3', '9', '42', '7', '3', '5','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '2', '10', '9', '1', '7', '33', '18', '8', '5','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('5', '8', '5', '6', '8', '4', '36', '21', '5', '5','2023_01_18');

    
INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('6', '2', '10', '7', '2', '3', '16', '18', '10', '6', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('6', '4', '8', '6', '6', '10', '16', '8', '5', '6', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('6', '8', '10', '10', '6', '7', '14', '15', '6', '6', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('6', '9', '5', '10', '3', '9', '42', '7', '3', '6','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('6', '2', '10', '9', '1', '7', '33', '18', '8', '6','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('6', '2', '10', '7', '2', '3', '16', '18', '10', '6', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '4', '8', '6', '6', '10', '16', '8', '5', '6', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '10', '10', '6', '7', '14', '15', '6', '6', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '9', '5', '10', '3', '9', '42', '7', '3', '6','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '2', '10', '9', '1', '7', '33', '18', '8', '6','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('6', '8', '5', '6', '8', '4', '36', '21', '5', '6','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('7', '2', '10', '7', '2', '3', '16', '18', '10', '7', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('7', '4', '8', '6', '6', '10', '16', '8', '5', '7', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('7', '8', '10', '10', '6', '7', '14', '15', '6', '7', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('7', '9', '5', '10', '3', '9', '42', '7', '3', '7','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('7', '2', '10', '9', '1', '7', '33', '18', '8', '7','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('7', '2', '10', '7', '2', '3', '16', '18', '10', '7', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '4', '8', '6', '6', '10', '16', '8', '5', '7', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '10', '10', '6', '7', '14', '15', '6', '7', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '9', '5', '10', '3', '9', '42', '7', '3', '7','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '2', '10', '9', '1', '7', '33', '18', '8', '7','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('7', '8', '5', '6', '8', '4', '36', '21', '5', '7','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('8', '2', '10', '7', '2', '3', '16', '18', '10', '8', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('8', '4', '8', '6', '6', '10', '16', '8', '5', '8', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('8', '8', '10', '10', '6', '7', '14', '15', '6', '8', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('8', '9', '5', '10', '3', '9', '42', '7', '3', '8','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('8', '2', '10', '9', '1', '7', '33', '18', '8', '8','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('8', '2', '10', '7', '2', '3', '16', '18', '10', '8', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '4', '8', '6', '6', '10', '16', '8', '5', '8', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '10', '10', '6', '7', '14', '15', '6', '8', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '9', '5', '10', '3', '9', '42', '7', '3', '8','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '2', '10', '9', '1', '7', '33', '18', '8', '8','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('8', '8', '5', '6', '8', '4', '36', '21', '5', '8','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('9', '2', '10', '7', '2', '3', '16', '18', '10', '9', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('9', '4', '8', '6', '6', '10', '16', '8', '5', '9', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('9', '8', '10', '10', '6', '7', '14', '15', '6', '9', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('9', '9', '5', '10', '3', '9', '42', '7', '3', '9','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('9', '2', '10', '9', '1', '7', '33', '18', '8', '9','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('9', '2', '10', '7', '2', '3', '16', '18', '10', '9', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '4', '8', '6', '6', '10', '16', '8', '5', '9', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '10', '10', '6', '7', '14', '15', '6', '9', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '9', '5', '10', '3', '9', '42', '7', '3', '9','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '2', '10', '9', '1', '7', '33', '18', '8', '9','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('9', '8', '5', '6', '8', '4', '36', '21', '5', '9','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('10', '2', '10', '7', '2', '3', '16', '18', '10', '10', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('10', '4', '8', '6', '6', '10', '16', '8', '5', '10', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('10', '8', '10', '10', '6', '7', '14', '15', '6', '10', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('10', '9', '5', '10', '3', '9', '42', '7', '3', '10','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('10', '2', '10', '9', '1', '7', '33', '18', '8', '10','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('10', '2', '10', '7', '2', '3', '16', '18', '10', '10', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '4', '8', '6', '6', '10', '16', '8', '5', '10', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '10', '10', '6', '7', '14', '15', '6', '10', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '9', '5', '10', '3', '9', '42', '7', '3', '10','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '2', '10', '9', '1', '7', '33', '18', '8', '10','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('10', '8', '5', '6', '8', '4', '36', '21', '5', '10','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('11', '2', '10', '7', '2', '3', '16', '18', '10', '11', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('11', '4', '8', '6', '6', '10', '16', '8', '5', '11', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('11', '8', '10', '10', '6', '7', '14', '15', '6', '11', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('11', '9', '5', '10', '3', '9', '42', '7', '3', '11','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('11', '2', '10', '9', '1', '7', '33', '18', '8', '11','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('11', '2', '10', '7', '2', '3', '16', '18', '10', '11', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '4', '8', '6', '6', '10', '16', '8', '5', '11', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '10', '10', '6', '7', '14', '15', '6', '11', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '9', '5', '10', '3', '9', '42', '7', '3', '11','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '2', '10', '9', '1', '7', '33', '18', '8', '11','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('11', '8', '5', '6', '8', '4', '36', '21', '5', '11','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('12', '2', '10', '7', '2', '3', '16', '18', '10', '12', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('12', '4', '8', '6', '6', '10', '16', '8', '5', '12', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('12', '8', '10', '10', '6', '7', '14', '15', '6', '12', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('12', '9', '5', '10', '3', '9', '42', '7', '3', '12','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('12', '2', '10', '9', '1', '7', '33', '18', '8', '12','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('12', '2', '10', '7', '2', '3', '16', '18', '10', '12', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '4', '8', '6', '6', '10', '16', '8', '5', '12', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '10', '10', '6', '7', '14', '15', '6', '12', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '9', '5', '10', '3', '9', '42', '7', '3', '12','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '2', '10', '9', '1', '7', '33', '18', '8', '12','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('12', '8', '5', '6', '8', '4', '36', '21', '5', '12','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('13', '2', '10', '7', '2', '3', '16', '18', '10', '13', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('13', '4', '8', '6', '6', '10', '16', '8', '5', '13', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('13', '8', '10', '10', '6', '7', '14', '15', '6', '13', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('13', '9', '5', '10', '3', '9', '42', '7', '3', '13','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('13', '2', '10', '9', '1', '7', '33', '18', '8', '13','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('13', '2', '10', '7', '2', '3', '16', '18', '10', '13', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '4', '8', '6', '6', '10', '16', '8', '5', '13', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '10', '10', '6', '7', '14', '15', '6', '13', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '9', '5', '10', '3', '9', '42', '7', '3', '13','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '2', '10', '9', '1', '7', '33', '18', '8', '13','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '13','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('14', '2', '10', '7', '2', '3', '16', '18', '10', '14', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('14', '4', '8', '6', '6', '10', '16', '8', '5', '14', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('14', '8', '10', '10', '6', '7', '14', '15', '6', '14', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('14', '9', '5', '10', '3', '9', '42', '7', '3', '14','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('14', '2', '10', '9', '1', '7', '33', '18', '8', '14','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('14', '2', '10', '7', '2', '3', '16', '18', '10', '14', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '4', '8', '6', '6', '10', '16', '8', '5', '14', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '10', '10', '6', '7', '14', '15', '6', '14', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '9', '5', '10', '3', '9', '42', '7', '3', '14','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '2', '10', '9', '1', '7', '33', '18', '8', '14','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('13', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('14', '8', '5', '6', '8', '4', '36', '21', '5', '14','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('15', '2', '10', '7', '2', '3', '16', '18', '10', '15', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('15', '4', '8', '6', '6', '10', '16', '8', '5', '15', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('15', '8', '10', '10', '6', '7', '14', '15', '6', '15', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('15', '9', '5', '10', '3', '9', '42', '7', '3', '15','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('15', '2', '10', '9', '1', '7', '33', '18', '8', '15','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('15', '2', '10', '7', '2', '3', '16', '18', '10', '15', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '4', '8', '6', '6', '10', '16', '8', '5', '15', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '10', '10', '6', '7', '14', '15', '6', '15', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '9', '5', '10', '3', '9', '42', '7', '3', '15','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '2', '10', '9', '1', '7', '33', '18', '8', '15','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('15', '8', '5', '6', '8', '4', '36', '21', '5', '15','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('16', '2', '10', '7', '2', '3', '16', '18', '10', '16', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('16', '4', '8', '6', '6', '10', '16', '8', '5', '16', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('16', '8', '10', '10', '6', '7', '14', '15', '6', '16', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('16', '9', '5', '10', '3', '9', '42', '7', '3', '16','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('16', '2', '10', '9', '1', '7', '33', '18', '8', '16','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('16', '2', '10', '7', '2', '3', '16', '18', '10', '16', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '4', '8', '6', '6', '10', '16', '8', '5', '16', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '10', '10', '6', '7', '14', '15', '6', '16', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '9', '5', '10', '3', '9', '42', '7', '3', '16','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '2', '10', '9', '1', '7', '33', '18', '8', '16','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('16', '8', '5', '6', '8', '4', '36', '21', '5', '16','2023_01_18');


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('17', '2', '10', '7', '2', '3', '16', '18', '10', '17', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('17', '4', '8', '6', '6', '10', '16', '8', '5', '17', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('17', '8', '10', '10', '6', '7', '14', '15', '6', '17', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('17', '9', '5', '10', '3', '9', '42', '7', '3', '17','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('17', '2', '10', '9', '1', '7', '33', '18', '8', '17','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('17', '2', '10', '7', '2', '3', '16', '18', '10', '17', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '4', '8', '6', '6', '10', '16', '8', '5', '17', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '10', '10', '6', '7', '14', '15', '6', '17', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '9', '5', '10', '3', '9', '42', '7', '3', '17','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '2', '10', '9', '1', '7', '33', '18', '8', '17','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('17', '8', '5', '6', '8', '4', '36', '21', '5', '17','2023_01_18');  


INSERT INTO registro
     (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('18', '2', '10', '7', '2', '3', '16', '18', '10', '18', '2023_01_01');
INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('18', '4', '8', '6', '6', '10', '16', '8', '5', '18', '2023_01_02');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('18', '8', '10', '10', '6', '7', '14', '15', '6', '18', '2023_01_03');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
 ('18', '9', '5', '10', '3', '9', '42', '7', '3', '18','2023_01_04');

INSERT INTO registro
 (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('18', '2', '10', '9', '1', '7', '33', '18', '8', '18','2023_01_05');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_06');

INSERT INTO registro
(codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
('18', '2', '10', '7', '2', '3', '16', '18', '10', '18', '2023_01_07');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '4', '8', '6', '6', '10', '16', '8', '5', '18', '2023_01_08');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '10', '10', '6', '7', '14', '15', '6', '18', '2023_01_09');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '9', '5', '10', '3', '9', '42', '7', '3', '18','2023_01_10');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '2', '10', '9', '1', '7', '33', '18', '8', '18','2023_01_11');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_12');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_13');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_14');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_15');

   INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_16');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_17');

INSERT INTO registro
    (codigo_de_registro, altura_de_siega, firmeza_de_green, velocidad, bote, color, humedad, temperatura, volumen_siega, numero_hoyo, fecha)
VALUES
    ('18', '8', '5', '6', '8', '4', '36', '21', '5', '18','2023_01_18');  


INSERT INTO USERS (USR, PWD, ROL) VALUES ('Carlos', 'Wepelin', 'Greenkeper');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('Manolo', 'Loceto', 'Apuntador');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('Paco', 'Selimo', 'Apuntador');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('Martin', 'depoke', 'Apuntador');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('Rodolfo', 'tiapos', 'Apuntador');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('dichao', 'wang', 'Greenkeper');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('dani', 'montero', 'Greenkeper');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('edu', 'hernandez', 'Greenkeper');
INSERT INTO USERS (USR, PWD, ROL) VALUES ('oscar', 'sanchez', 'Greenkeper');


INSERT INTO green (codigo_hoyo) VALUES ('1');
INSERT INTO green (codigo_hoyo) VALUES ('2');
INSERT INTO green (codigo_hoyo) VALUES ('3');
INSERT INTO green (codigo_hoyo) VALUES ('4');
INSERT INTO green (codigo_hoyo) VALUES ('5');
INSERT INTO green (codigo_hoyo) VALUES ('6');
INSERT INTO green (codigo_hoyo) VALUES ('7');
INSERT INTO green (codigo_hoyo) VALUES ('8');
INSERT INTO green (codigo_hoyo) VALUES ('9');
INSERT INTO green (codigo_hoyo) VALUES ('10');
INSERT INTO green (codigo_hoyo) VALUES ('11');
INSERT INTO green (codigo_hoyo) VALUES ('12');
INSERT INTO green (codigo_hoyo) VALUES ('13');
INSERT INTO green (codigo_hoyo) VALUES ('14');
INSERT INTO green (codigo_hoyo) VALUES ('15');
INSERT INTO green (codigo_hoyo) VALUES ('16');
INSERT INTO green (codigo_hoyo) VALUES ('17');
INSERT INTO green (codigo_hoyo) VALUES ('18');

