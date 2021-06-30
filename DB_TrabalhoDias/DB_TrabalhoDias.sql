CREATE DATABASE SLEuropeia
GO
USE SLEuropeia
GO

--criar tabelas

CREATE TABLE Clubes (
    cod_clube		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_clube PRIMARY KEY,
    nome			VARCHAR(55),
    pais			VARCHAR(55),
	classificacao_anterior	INTEGER
)
CREATE TABLE Jornada (
    cod_jornada      INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_jornada PRIMARY KEY,
	cod_equipa		INTEGER
)
CREATE TABLE Jogadores (
    cod_jogador		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_jogador PRIMARY KEY,
	cod_clube		INTEGER,
    nome			VARCHAR(55),
    datanascimento	DATE,
	posicao			VARCHAR(55),
	nacionalidade   VARCHAR(55),
	pe_dominante	VARCHAR(55)
)
CREATE TABLE Jogo (
    cod_jogo		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_jogo PRIMARY KEY,
	cod_jornada		INTEGER,
	equip_casa		INTEGER,
	equip_fora		INTEGER,
	local			VARCHAR(20),
    classificacao	INTEGER,
	tempo			INTEGER,
)
CREATE TABLE Cartoes (
    cod_cartao		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_cartao PRIMARY KEY,
	cod_jogo		INTEGER,
	cod_jogador		INTEGER,
    corcartao		VARCHAR(20),
    tempo			INTEGER,
)
CREATE TABLE Substituicoes (
    cod_subs		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_subs PRIMARY KEY,
	cod_jogo		INTEGER,
	codjogador_ent		INTEGER,
    codjogador_sai		INTEGER,
    tempo			INTEGER,
)
CREATE TABLE Arbitros (
    cod_arbitro		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_arbitro PRIMARY KEY,
	cod_jogo		INTEGER,
	nome			VARCHAR(55),
)
CREATE TABLE Golos (
    cod_golos		INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_golos PRIMARY KEY,
	cod_jogo		INTEGER,
	golos_anulados	INTEGER,
    tempo			INTEGER,
	jogador			INTEGER
)

-- Altering for references


ALTER TABLE Jornada 
ADD CONSTRAINT fk_jornada_equipas FOREIGN KEY(cod_equipa) REFERENCES Clubes(cod_clube)

ALTER TABLE Jogadores 
ADD CONSTRAINT fk_jogadores_clube FOREIGN KEY(cod_clube) REFERENCES Clubes(cod_clube)

ALTER TABLE Jogo 
ADD CONSTRAINT fk_jogo_jornada FOREIGN KEY(cod_jornada) REFERENCES Jornada(cod_jornada),
CONSTRAINT fk_jogo_clubes FOREIGN KEY(equip_casa) REFERENCES Clubes(cod_clube),
CONSTRAINT fk_jogo_clube FOREIGN KEY(cod_jornada) REFERENCES Clubes(cod_clube)

ALTER TABLE Cartoes 
ADD CONSTRAINT fk_cartoes_jogo FOREIGN KEY(cod_jogo) REFERENCES Jogo(cod_jogo),
CONSTRAINT fk_cartoes_jogador FOREIGN KEY(cod_jogador) REFERENCES Jogadores(cod_jogador)

ALTER TABLE Substituicoes 
ADD CONSTRAINT fk_substituicoes_jogo FOREIGN KEY(cod_jogo) REFERENCES Jogo(cod_jogo),
CONSTRAINT fk_substituicoes_jogador FOREIGN KEY(codjogador_ent) REFERENCES Jogadores(cod_jogador),
CONSTRAINT fk_substituicao_jogador FOREIGN KEY(codjogador_sai) REFERENCES Jogadores(cod_jogador) -- both related to cod-jogador - same row in same table

ALTER TABLE Arbitros 
ADD CONSTRAINT fk_arbitro_jogo FOREIGN KEY(cod_jogo) REFERENCES Jogo(cod_jogo)

ALTER TABLE Golos 
ADD CONSTRAINT fk_golos_jogo FOREIGN KEY(cod_jogo) REFERENCES Jogo(cod_jogo),
CONSTRAINT fk_golos_jogador FOREIGN KEY(jogador) REFERENCES Jogadores(cod_jogador)

CREATE TABLE Classificacao (
	cod_liga INTEGER NOT NULL IDENTITY(1,1) CONSTRAINT pk_cod_liga PRIMARY KEY,
	cod_equipa INTEGER,
	classificacao INTEGER,
	vitorias INTEGER,
	derrotas INTEGER,
	empates INTEGER,
	pontos INTEGER
)

ALTER TABLE Classificacao 
ADD CONSTRAINT fk_classificacao_jogo FOREIGN KEY(cod_equipa) REFERENCES Clubes(cod_clube)