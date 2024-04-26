CREATE TABLE IF NOT EXISTS prices
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    brand_id BIGINT NOT NULL,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    price_list BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    priority INT NOT NULL,
    price NUMERIC(20,2) NOT NULL,
    currency VARCHAR (3) NOT NULL
);

CREATE INDEX idx_brandId ON prices (brand_id);
CREATE INDEX idx_productId ON prices (product_id);
CREATE INDEX idx_startDate ON prices (start_date);
CREATE INDEX idx_endDate ON prices (end_date);
CREATE INDEX idx_brandId_productId_startDate_endDate ON prices (brand_id, product_id, start_date, end_date);

INSERT INTO prices(id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES (1, 1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');

INSERT INTO prices(id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES (2, 1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR');

INSERT INTO prices(id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES (3, 1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR');

INSERT INTO prices(id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES (4, 1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');
