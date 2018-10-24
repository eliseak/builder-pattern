# builder-pattern
Exemplo de padrão de projeto Builder com JAVA  

## Comentários sobre o Builder  
- Chamadas aninhadas  
- Instancia o objeto desejado no construtor
- Métodos no Builder:
  - Seta as propriedades do objeto instanciado
  - Os métodos retornam o próprio Builder >> this (isso permite aninhar)
    - Com exceção do método build() 
- No final retorna o objeto desejado >> build()

**** procurar definição