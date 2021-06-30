USE SLEuropeia	
GO

INSERT INTO Clubes VALUES ('FC Porto', 'Portugal', 2),
('SL Benfica', 'Portugal', 3),
('Liverpool', 'Inglaterra', 1),
('Bayern Munich', 'Alemanha', 4)
GO


INSERT INTO Jogadores VALUES (1,'Agustin Marchesin','1988-03-16','Guarda-Redes','Argentino','Direito'),
(1,'Cl�udio Ramos','1991-11-16','Guarda-Redes','Portuguesa','Direito'),
(1,'Pepe','1983-02-26','Defesa','Portuguesa','Esquerdo'),
(1,'Iv�n Marcano','1987-06-23','Defesa','Espanhol','Direito'),
(1,'Wilson Manaf�','1994-07-23','Defesa','Portuguesa','Direito'),
(1,'Marko Grujic','1996-04-13','M�dio','S�rvio','Direito'),
(1,'Matheus Uribe','1991-03-21','M�dio','Colombiano','Esquerdo'),
(1,'Malang Sarr','1999-01-23','Defesa','Fran��s','Direito'),
(1,'Ot�vio', '1995-02-09','M�dio','Brasileiro','Direito'),
(1,'S�rgio Oliveira','1992-06-02', 'M�dio','Portuguesa','Direito'),
(1,'Rom�rio Baro','2000-01-25','M�dio','Portuguesa','Direito'),
(1,'Diogo Costa','1999-09-19','Guarda-Redes','Portuguesa','Direito'),
(1,'Moussa Marega','1991-04-14','Avan�ado','Maliense','Direito'),
(1,'Luis D�az','1997-01-13','Avan�ado','Colombiano','Esquerdo'),
(1,'Mehdi Taremi','1992-07-18','Avan�ado','Iraniano','Direito'),
(2,'Helton Leite','1990-11-02','Guarda-Redes','Brasileiro','Direito'),
(2,'Odysseas Vlachodimos','1994-04-26','Guarda-Redes','Grego','Direito'),
(2,'Gilberto','1993-03-07','Defesa','Brasileiro','Direito'),
(2,'Grimaldo','1993-03-07','Defesa','Espanhol','Direito'),
(2,'Jan Vertonghen','1987-04-24','Defesa','Belga','Direito'),
(2,'Nicol�s Otamendi','1988-02-12','Defesa','Argentino','Direito'),
(2,'Diogo Gon�alves','1997-02-12','Defesa','Portuguesa','Direito'),
(2,'Gabriel','1993-09-18','M�dio','Brasileiro','Direito'),
(2,'Chiquinho','1995-07-19','M�dio','Portuguesa','Direito'),
(2,'Pizzi','1989-10-06','M�dio','Portuguesa','Direito'),
(2,'Samaris','1989-06-13','M�dio','Grego','Direito'),
(2,'Cervi','1994-05-26','M�dio','Argentino','Direito'),
(2,'Seferovic','1992-02-22','Avan�ado','Sui�o','Direito'),
(2,'Everton','1996-03-22','Avan�ado','Brasileiro','Direito'),
(2,'Rafa','1995-07-19','Avan�ado','Portuguesa','Direito'),
(2,'Waldschdmidt','1996-05-19','Avan�ado','Alem�o','Direito'),
(3,'Allison','1992-10-02','Guarda-Redes','Brasileiro','Direito'),
(3,'Adrian','1994-04-26','Guarda-Redes','Espanhol','Direito'),
(3,'Van Dijk','1993-03-07','Defesa','Holand�s','Direito'),
(3,'Robertson','1993-03-07','Defesa','Escoc�s','Direito'),
(3,'Gomez','1987-04-24','Defesa','Ingl�s','Direito'),
(3,'Alexander-Arnold','1988-02-12','Defesa','Ingl�s','Direito'),
(3,'Phillips','1997-02-12','Defesa','Ingl�s','Direito'),
(3,'Fabinho','1993-09-18','M�dio','Brasileiro','Direito'),
(3,'Thiago','1995-07-19','M�dio','Espanhol','Direito'),
(3,'Henderson','1989-10-06','M�dio','Ingl�s','Direito'),
(3,'Milner','1989-06-13','M�dio','Ingl�s','Direito'),
(3,'Jones','1994-05-26','M�dio','Ingl�s','Direito'),
(3,'Salah','1992-02-22','Avan�ado','Egipcio','Direito'),
(3,'Firmino','1996-03-22','Avan�ado','Brasileiro','Direito'),
(3,'Diogo Jota','1995-07-19','Avan�ado','Portuguesa','Direito'),
(3,'Man�','1996-05-19','Avan�ado','Senegalense','Direito'),
(4,'Neuer','1992-10-02','Guarda-Redes','Alem�o','Direito'),
(4,'Nubel','1994-04-26','Guarda-Redes','Alem�o','Direito'),
(4,'Sule','1993-03-07','Defesa','Alem�o','Direito'),
(4,'Boateng','1993-03-07','Defesa','Alem�o','Direito'),
(4,'Pavard','1987-04-24','Defesa','Fr�nces','Direito'),
(4,'Davies','1988-02-12','Defesa','Canad�','Direito'),
(4,'Lucas','1997-02-12','Defesa','Fr�nces','Direito'),
(4,'Kimmich','1993-09-18','M�dio','Alem�o','Direito'),
(4,'Goretza','1995-07-19','M�dio','Alem�o','Direito'),
(4,'Tolisso','1989-10-06','M�dio','Franc�s','Direito'),
(4,'Dantas','1989-06-13','M�dio','Portugu�s','Direito'),
(4,'Martinez','1994-05-26','M�dio','Espanhol','Direito'),
(4,'Lewandoski','1992-02-22','Avan�ado','Polaco','Direito'),
(4,'Gnabry','1996-03-22','Avan�ado','Alem�o','Direito'),
(4,'San�','1995-07-19','Avan�ado','Alem�o','Direito'),
(4,'Muller','1996-05-19','Avan�ado','Alem�o','Direito')
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
(3,'Luc�lio Baptista'),
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















