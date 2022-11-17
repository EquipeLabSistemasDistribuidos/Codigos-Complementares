import xmlrpc.client
valor1 = int(input("Digite um valor: "))
valor2 = int(input("Digite outro valor: "))

with xmlrpc.client.ServerProxy("http://localhost:8000/") as proxy:
    #valor1 = 170
    #valor2 = 1001
    print("{} é par? {}" .format(valor1, str(proxy.is_even(valor1))))
    print("{} é par? {}" .format(valor2, str(proxy.is_even(valor2))))