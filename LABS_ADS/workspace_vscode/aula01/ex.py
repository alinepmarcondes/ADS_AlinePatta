val = input('Valor para elevar ao cubo: ')
val = int(val)

val2 = val ** 3
#print(val2)

if val2 > 100:
    print(f'Resultado {val2} maior que 100')
elif val2 == 100:
    print(f'Resultado {val2} igual a 100')
else: print('Menor que 100')
