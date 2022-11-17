# Execução via terminal WINDOWS
## Gerar os arquivos das classes Stub e Skeleton
### Compilando a interface
  * Abrir console
```
javac Calculadora.java
```
  * Compilando a implementação da interface
```
javac CalculadoraImp.java
```
  * Gerando a classe Stub
```
rmic CalculadoraImp
```

  * Registrando o objeto
```
start rmiregistry
```

Compilação
```
javac ServidorCalculadora.java
```
```
javac ClienteCalculadora.java
```

Execução
```
start Java ServidorCalculadora
```
```
java ClienteCalculadora
```
