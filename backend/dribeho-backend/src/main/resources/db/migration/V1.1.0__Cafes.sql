CREATE TABLE cafes (
    id varchar(36) PRIMARY KEY,
    name varchar(256) NOT NULL,
    address varchar(256) NOT NULL,
    city varchar(256) NOT NULL,
    state varchar(2) NOT NULL,
    zipcode varchar(5),
    longitude DECIMAL(10, 6),
    latitude DECIMAL(10, 6)
);

CREATE TABLE users (
    id varchar(36) PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    profile_picture VARCHAR(512),
    date_joined DATE NOT NULL,
    last_login DATE
);

CREATE TABLE reviews (
    id varchar(36) PRIMARY KEY,
    user_id varchar(36),
    shop_id varchar(36),
    rating TINYINT NOT NULL,
    review_text TEXT,
    date_posted DATE NOT NULL,
    helpful_votes INT DEFAULT 0,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (shop_id) REFERENCES cafes(id)
);

CREATE TABLE images (
    id varchar(36) PRIMARY KEY,
    shop_id varchar(36),
    user_id varchar(36),
    image_url VARCHAR(512) NOT NULL,
    date_uploaded DATE NOT NULL,
    description VARCHAR(255),
    FOREIGN KEY (shop_id) REFERENCES cafes(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
