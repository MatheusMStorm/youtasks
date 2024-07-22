# Youtasks - Sua plataforma livre de gerenciamento de tarefas

Projeto de desenvolvimento de API REST para gerenciamento de tarefas pessoais feito durante o Desafio de Projeto do Bootcamp Santander 2024 da DIO.

## Diagrama de classes

```mermaid
classDiagram
    class Usuario {
        + Long id
        + String nome
        + String email
        + String senha
        + List<Tarefa> tarefas
    }

    class Tarefa {
        + Long id
        + String titulo
        + String descricao
        + LocalDateTime dataCriacao
        + LocalDateTime dataConclusao
        + boolean concluida
        + Usuario responsavel
    }

    Usuario "1" --> "*" Tarefa : possui
```

## Referências

[1] "Santander Dev Week 2023 - falvojr". Disponível em: https://github.com/falvojr/santander-dev-week-2023