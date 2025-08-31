-- Inserir dados para Categoria
INSERT INTO categoria (codigo, nome) VALUES ('CAT001', 'Eletrônicos');
INSERT INTO categoria (codigo, nome) VALUES ('CAT002', 'Roupas');
INSERT INTO categoria (codigo, nome) VALUES ('CAT003', 'Alimentação');

-- Inserir dados para Fabricante
INSERT INTO fabricante (codigo, nome) VALUES ('FAB001', 'Dell');
INSERT INTO fabricante (codigo, nome) VALUES ('FAB002', 'Nike');
INSERT INTO fabricante (codigo, nome) VALUES ('FAB003', 'Burguer King');

-- Inserir dados para Cliente
INSERT INTO cliente (codigo, nome, cpf) VALUES ('CLI001', 'Gustavo Garcia', '123.456.789-01');
INSERT INTO cliente (codigo, nome, cpf) VALUES ('CLI002', 'João Pedro Garcia', '987.654.321-09');

-- Inserir dados para Funcionario
INSERT INTO funcionario (codigo, nome, cpf) VALUES ('FUN001', 'Vinicius Garcia', '111.222.333-44');
INSERT INTO funcionario (codigo, nome, cpf) VALUES ('FUN002', 'Snoop Garcia', '555.666.777-88');

-- Inserir dados para Produto
INSERT INTO produto (codigo, nome, preco, quantidade, validade, categoria_codigo, fabricante_codigo) 
VALUES ('PROD001', 'Dell G15', 5800.50, 10, '2025-12-31', 'CAT001', 'FAB001');
INSERT INTO produto (codigo, nome, preco, quantidade, validade, categoria_codigo, fabricante_codigo) 
VALUES ('PROD002', 'Air Max', 389.90, 25, '2024-06-30', 'CAT002', 'FAB002');
INSERT INTO produto (codigo, nome, preco, quantidade, validade, categoria_codigo, fabricante_codigo) 
VALUES ('PROD003', 'Whopper Duplo', 15.50, 100, '2024-03-15', 'CAT003', 'FAB003');

-- Inserir dados para Venda
INSERT INTO venda (codigo, horario, valor_total, quantidade_total, cliente_codigo, funcionario_codigo) 
VALUES ('VEN001', '2024-01-15 14:30:00', 5800.50 + 389.90 + 5.50, 3, 'CLI001', 'FUN001');

-- Inserir dados para ItemVenda
INSERT INTO item_venda (codigo, valor_parcial, quantidade_parcial, produto_codigo, venda_codigo) 
VALUES ('ITEM001', 5800.50, 1, 'PROD001', 'VEN001');
INSERT INTO item_venda (codigo, valor_parcial, quantidade_parcial, produto_codigo, venda_codigo) 
VALUES ('ITEM002', 389.90, 1, 'PROD002', 'VEN001');
INSERT INTO item_venda (codigo, valor_parcial, quantidade_parcial, produto_codigo, venda_codigo) 
VALUES ('ITEM003', 5.50, 1, 'PROD003', 'VEN001');