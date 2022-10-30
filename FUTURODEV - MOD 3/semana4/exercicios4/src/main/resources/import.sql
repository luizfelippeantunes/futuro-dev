INSERT INTO public.produto(descricao, preco_unitario) VALUES ('teste1','10');
INSERT INTO public.produto(descricao, preco_unitario) VALUES ('teste2','20');
INSERT INTO public.produto(descricao, preco_unitario) VALUES ('teste3','30');

INSERT INTO public.usuarios(data_atualizacao, data_cadastro, nome, login, senha) VALUES (timezone('utc', CURRENT_TIMESTAMP(0)),timezone('utc', CURRENT_TIMESTAMP(0)),'teste1','teste1','teste1');
INSERT INTO public.usuarios(data_atualizacao, data_cadastro, nome, login, senha) VALUES (timezone('utc', CURRENT_TIMESTAMP(0)),timezone('utc', CURRENT_TIMESTAMP(0)),'teste2','teste2','teste2');
INSERT INTO public.usuarios(data_atualizacao, data_cadastro, nome, login, senha) VALUES (timezone('utc', CURRENT_TIMESTAMP(0)),timezone('utc', CURRENT_TIMESTAMP(0)),'teste3','teste3','teste3');

INSERT INTO public.telefones(numero, tipo, id_usuario) VALUES ('99999999', 'Celular', 1);
INSERT INTO public.telefones(numero, tipo, id_usuario) VALUES ('33333333', 'Casa', 1);
INSERT INTO public.telefones(numero, tipo, id_usuario) VALUES ('88888888', 'Celular', 2);