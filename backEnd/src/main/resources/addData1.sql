-- Script pour créer la table "Utilisateurs"
DROP TABLE IF EXISTS `Utilisateurs`;
CREATE TABLE Utilisateurs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    adresse VARCHAR(100),
    email VARCHAR(100),
    mot_de_passe VARCHAR(100),
    role VARCHAR(100)
);

-- Script pour créer la table "Restaurants"
DROP TABLE IF EXISTS `Restaurants`;
CREATE TABLE Restaurants (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    adresse VARCHAR(150),
    description TEXT
);

-- Script pour créer la table "Produits"
DROP TABLE IF EXISTS `Produits`;
CREATE TABLE Produits (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    description TEXT,
    prix DECIMAL(10, 2)
);

-- Insertion de données dans la table "Utilisateurs"
INSERT INTO Utilisateurs (nom, prenom, adresse, email, mot_de_passe, role)
VALUES
    ('Dupont', 'Jean', '1 Rue de la Paix, Paris', 'jean.dupont@example.com', '$2y$10$.qkbukzzX21D.bqbI.B2R.tvWP90o/Y16QRWVLodw51BHft7ZWbc.', 'USER'),
    ('Feve', 'Marie', '15 Avenue des Lilas, Lyon', 'marie.lefebvre@example.com', '$2a$10$e5T8FPBuqvC9OKeJrAwm0O4dyR2eeq5ZxV.Smw9cuyLGTz/5HS6ka', 'USER'),
    ('Martin', 'Pierre', '8 Rue de la Gare, Marseille', 'pierre.martin@example.com', 'user', 'USER');

-- Insertion de données dans la table "Restaurants"
INSERT INTO Restaurants (nom, adresse, description)
VALUES
    ('Le Gourmet Français', '42 Rue de la Gastronomie, Paris', 'Cuisine française raffinée'),
    ('Sushi Samba', '123 Park Avenue, New York', 'Fusion de cuisine japonaise et brésilienne'),
    ('La Pizzeria Italiana', '17 Via Roma, Rome', 'Authentiques pizzas italiennes');

-- Insertion de données dans la table "Produits"
INSERT INTO Produits (nom, description, prix)
VALUES
    ('Escargots à l''ail', 'Escargots de Bourgogne servis avec de l''ail et du beurre', 12.99),
    ('Sashimi de saumon', 'Tranches fines de saumon frais, servi avec du wasabi et du gingembre', 18.50),
    ('Pizza Margherita', 'Tomate, mozzarella, basilic, huile d''olive et origan', 10.95);
