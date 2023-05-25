create table Item
(
    ITEM_ID     INTEGER not null
        constraint PK_Item
            primary key autoincrement,
    Title       VARCHAR2(40),
    Artist      VARCHAR2(40),
    ReleaseDate DATE,
    ListPrice   number(5, 2),
    Price       number(5, 2),
    Version     number(5)
);
INSERT INTO Item (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Diva', 'Annie Lennox', '1992-01-04', 17.97, 13.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Dream of the Blue Turtles', 'Sting',  '1985-02-05', 17.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Trouble is...', 'Kenny Wayne Shepherd Band',  '1997-08-08', 17.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Lie to Me', 'Jonny Lang',  '1997-08-26', 17.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Little Earthquakes', 'Tori Amos',  '1992-01-18', 17.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Seal', 'Seal',  '1991-08-18', 17.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Ian Moore', 'Ian Moore',  '1993-12-05', 9.97, 9.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('So Much for the Afterglow', 'Everclear',  '1997-01-19', 16.97, 13.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Surfacing', 'Sarah McLachlan',  '1997-12-04', 17.97, 13.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Hysteria', 'Def Leppard',  '1987-06-20', 17.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('A Life of Saturdays', 'Dexter Freebish',  '2000-12-06', 16.97, 12.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Human Clay', 'Creed',  '1999-10-21', 18.97, 13.28,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('My, I''m Large', 'Bobs',  '1987-02-20', 11.97, 11.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('So', 'Peter Gabriel',  '1986-10-03', 17.97, 13.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Big Ones', 'Aerosmith',  '1994-05-08', 18.97, 14.99,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('90125', 'Yes',  '1983-10-16', 11.97, 11.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('1984', 'Van Halen',  '1984-08-19', 11.97, 11.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Escape', 'Journey',  '1981-02-25', 11.97, 11.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Greatest Hits', 'Jay and the Americans',  '1966-12-05', 13.99, 9.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Ray of Light', 'Madonna',  '2000-12-15', 14.99, 10.97,1);
INSERT INTO Item  (Title, Artist, ReleaseDate, ListPrice, Price, Version) VALUES ('Music', 'Madonna',1/2+  '2002-02-27', 14.99, 11.97,1);