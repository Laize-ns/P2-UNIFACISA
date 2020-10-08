# Encapsulamento

- Determina quais informações (atributos e métodos) podem/devem ser visíveis à outras classes. 
- Objetivos:

    - Esconder aspectos de funcionamento de uma classe que, por alguma razão, não precisa ser acessível por outra classe.
    - Criar uma abstração que proveja baixo acoplamento entre diferentes classes de um programa.
    - Proteger o acesso a informações confidenciais e sensíveis.


## Modificadores de acesso

- permite implementar encapsulamento nos programas.

- São divididos em:

    - public: acesso global, a partir de qualquer outra classe
    - protected:	acesso permitido à todas as classes do mesmo pacote, e às suas sub-classes (herança)
    - sem modificador explícito (default ou package-private):	acesso permitido à todas as classes do mesmo pacote
    - private:	acesso restrito aos membros da classe

- Observação:
funções públicas para acesso (getter) e modificação (setter) não devem ser praticado de forma indiscriminada para todo tipo de variável. 
