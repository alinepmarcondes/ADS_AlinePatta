class Pessoa:
    nome = None
    sexo = None
    idade = None

    def __init__(self,nome,sexo,idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, sexo, idade,cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf 

cidadao = Cidadao
cidadao.nome = input("Entre com o nome: ")
cidadao.sexo = input("Entre com o sexo: ")
cidadao.idade = input("Entre com a idade: ")
cidadao.cpf = input("Entre com o cpf: ")

print(cidadao.nome, cidadao.sexo, cidadao.idade, cidadao.cpf)
