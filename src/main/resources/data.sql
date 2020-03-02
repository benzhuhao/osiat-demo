DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS users;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age INT NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

INSERT INTO user (first_name, last_name, age, career) VALUES
  ('Aliko', 'Dangote', 29, 'Billionaire Industrialist'),
  ('Bill', 'Gates', 31, 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 44, 'Billionaire Oil Magnate');