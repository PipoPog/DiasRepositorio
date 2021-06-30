USE SLEuropeia	
GO

INSERT INTO Clubes VALUES ('FC Porto', 'Portugal', 2),
('SL Benfica', 'Portugal', 3),
('Liverpool', 'Inglaterra', 1),
('Bayern Munich', 'Alemanha', 4)
GO


INSERT INTO Jogadores VALUES (1,'Agustin Marchesin','1988-03-16','Guarda-Redes','Argentino','Direito'),
(1,'Cláudio Ramos','1991-11-16','Guarda-Redes','Portuguesa','Direito'),
(1,'Pepe','1983-02-26','Defesa','Portuguesa','Esquerdo'),
(1,'Iván Marcano','1987-06-23','Defesa','Espanhol','Direito'),
(1,'Wilson Manafá','1994-07-23','Defesa','Portuguesa','Direito'),
(1,'Marko Grujic','1996-04-13','Médio','Sérvio','Direito'),
(1,'Matheus Uribe','1991-03-21','Médio','Colombiano','Esquerdo'),
(1,'Malang Sarr','1999-01-23','Defesa','Françês','Direito'),
(1,'Otávio', '1995-02-09','Médio','Brasileiro','Direito'),
(1,'Sérgio Oliveira','1992-06-02', 'Médio','Portuguesa','Direito'),
(1,'Romário Baro','2000-01-25','Médio','Portuguesa','Direito'),
(1,'Diogo Costa','1999-09-19','Guarda-Redes','Portuguesa','Direito'),
(1,'Moussa Marega','1991-04-14','Avançado','Maliense','Direito'),
(1,'Luis Díaz','1997-01-13','Avançado','Colombiano','Esquerdo'),
(1,'Mehdi Taremi','1992-07-18','Avançado','Iraniano','Direito'),
(2,'Helton Leite','1990-11-02','Guarda-Redes','Brasileiro','Direito'),
(2,'Odysseas Vlachodimos','1994-04-26','Guarda-Redes','Grego','Direito'),
(2,'Gilberto','1993-03-07','Defesa','Brasileiro','Direito'),
(2,'Grimaldo','1993-03-07','Defesa','Espanhol','Direito'),
(2,'Jan Vertonghen','1987-04-24','Defesa','Belga','Direito'),
(2,'Nicolás Otamendi','1988-02-12','Defesa','Argentino','Direito'),
(2,'Diogo Gonçalves','1997-02-12','Defesa','Portuguesa','Direito'),
(2,'Gabriel','1993-09-18','Médio','Brasileiro','Direito'),
(2,'Chiquinho','1995-07-19','Médio','Portuguesa','Direito'),
(2,'Pizzi','1989-10-06','Médio','Portuguesa','Direito'),
(2,'Samaris','1989-06-13','Médio','Grego','Direito'),
(2,'Cervi','1994-05-26','Médio','Argentino','Direito'),
(2,'Seferovic','1992-02-22','Avançado','Suiço','Direito'),
(2,'Everton','1996-03-22','Avançado','Brasileiro','Direito'),
(2,'Rafa','1995-07-19','Avançado','Portuguesa','Direito'),
(2,'Waldschdmidt','1996-05-19','Avançado','Alemão','Direito'),
(3,'Allison','1992-10-02','Guarda-Redes','Brasileiro','Direito'),
(3,'Adrian','1994-04-26','Guarda-Redes','Espanhol','Direito'),
(3,'Van Dijk','1993-03-07','Defesa','Holandês','Direito'),
(3,'Robertson','1993-03-07','Defesa','Escocês','Direito'),
(3,'Gomez','1987-04-24','Defesa','Inglês','Direito'),
(3,'Alexander-Arnold','1988-02-12','Defesa','Inglês','Direito'),
(3,'Phillips','1997-02-12','Defesa','Inglês','Direito'),
(3,'Fabinho','1993-09-18','Médio','Brasileiro','Direito'),
(3,'Thiago','1995-07-19','Médio','Espanhol','Direito'),
(3,'Henderson','1989-10-06','Médio','Inglês','Direito'),
(3,'Milner','1989-06-13','Médio','Inglês','Direito'),
(3,'Jones','1994-05-26','Médio','Inglês','Direito'),
(3,'Salah','1992-02-22','Avançado','Egipcio','Direito'),
(3,'Firmino','1996-03-22','Avançado','Brasileiro','Direito'),
(3,'Diogo Jota','1995-07-19','Avançado','Portuguesa','Direito'),
(3,'Mané','1996-05-19','Avançado','Senegalense','Direito'),
(4,'Neuer','1992-10-02','Guarda-Redes','Alemão','Direito'),
(4,'Nubel','1994-04-26','Guarda-Redes','Alemão','Direito'),
(4,'Sule','1993-03-07','Defesa','Alemão','Direito'),
(4,'Boateng','1993-03-07','Defesa','Alemão','Direito'),
(4,'Pavard','1987-04-24','Defesa','Frânces','Direito'),
(4,'Davies','1988-02-12','Defesa','Canadá','Direito'),
(4,'Lucas','1997-02-12','Defesa','Frânces','Direito'),
(4,'Kimmich','1993-09-18','Médio','Alemão','Direito'),
(4,'Goretza','1995-07-19','Médio','Alemão','Direito'),
(4,'Tolisso','1989-10-06','Médio','Francês','Direito'),
(4,'Dantas','1989-06-13','Médio','Português','Direito'),
(4,'Martinez','1994-05-26','Médio','Espanhol','Direito'),
(4,'Lewandoski','1992-02-22','Avançado','Polaco','Direito'),
(4,'Gnabry','1996-03-22','Avançado','Alemão','Direito'),
(4,'Sané','1995-07-19','Avançado','Alemão','Direito'),
(4,'Muller','1996-05-19','Avançado','Alemão','Direito')
GO
INSERT INTO Substituicoes VALUES
(1,1,1,54),
(1,22,23,54),
(2,60,61,54),
(2,62,59,54)
GO
INSERT INTO Cartoes VALUES
(1,1,'Amarelo',45),
(1,3,'Vermelho',90),
(2,33,'Amarelo',20),
(2,50,'Vermelho',80)

INSERT INTO Jogo VALUES
(1,1,3,2,0,1,4),
(1,2,4,1,1,2,3),
(2,1,4,0,3,2,4),
(2,2,3,3,2,1,3)
GO
INSERT INTO Arbitros VALUES
(1, 'Tiago Martins'),
(2,'Carlos Xistra'),
(3,'Lucílio Baptista'),
(4,'Jorge Sousa')
GO
INSERT INTO Golos VALUES
(1 , 2 , 20, 1 ),
(1 , 1 , 30, 2),
(2 , 0 , 88, 1),
(3, 0 , 88, 1),
(3, 0 , 32, 1),
(3, 0 ,11, 2),
(3, 2 , 67, 3)

INSERT INTO Classificacao VALUES
(1, 1 , 0, 0,0,0),
(2, 1 , 0, 0,0,0),
(3, 1 , 0, 0,0,0),
(4, 1 , 0, 0,0 ,0)















