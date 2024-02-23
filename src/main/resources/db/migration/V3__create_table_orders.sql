CREATE TABLE IF NOT EXISTS orders (
    id serial primary key not null,
    codigo_pedido varchar(255) not null,
    valor money not null
);