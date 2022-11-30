INSERT INTO public.produtos(descricao, preco_compra, preco_venda) VALUES ('Mouse','50','100');
INSERT INTO public.produtos(descricao, preco_compra, preco_venda) VALUES ('Teclado','100','150');

INSERT INTO public.formas_pagamento(descricao) VALUES ('Dinheiro');
INSERT INTO public.formas_pagamento(descricao) VALUES ('Cartão');

INSERT INTO public.clientes(nome, cpf, rg) VALUES ('Luiz','111.111.111-11','11111');
INSERT INTO public.clientes(nome, cpf, rg) VALUES ('Luna','222.222.222-22','22222');

INSERT INTO public.pedidos(id_cliente, id_forma) VALUES ('1','1');
INSERT INTO public.pedidos(id_cliente, id_forma) VALUES ('2','2');

INSERT INTO public.itens_pedido(id_pedido, id_produto, quantidade, valor_item) VALUES ('1','1','10','1000');
INSERT INTO public.itens_pedido(id_pedido, id_produto, quantidade, valor_item) VALUES ('1','2','2','300');
INSERT INTO public.itens_pedido(id_pedido, id_produto, quantidade, valor_item) VALUES ('2','2','5','750');