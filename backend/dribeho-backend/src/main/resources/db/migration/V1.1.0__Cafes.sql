CREATE TABLE cafes
(
    id varchar(36) NOT NULL,
    name varchar(256) NOT NULL,
    address varchar(256) NOT NULL,
    city varchar(256) NOT NULL,
    state varchar(2) NOT NULL,
    zipcode varchar(5),
    PRIMARY KEY (id)
);
INSERT INTO cafes(id, name, address, city, state, zipcode) VALUES (
    '7723db11-e678-4ab6-afe5-7aa5359d813c',
    'Little Canal',
    '26 Canal St',
    'New York',
    'NY',
    '10002');

INSERT INTO cafes(id, name, address, city, state, zipcode) VALUES (
    'aeb7c3fc-7dfe-4bc4-a764-6bbe40ad3e05',
    'Cafe Grumpy',
    '13 Essex St',
    'New York',
    'NY',
    '10002');