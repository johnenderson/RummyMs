# Sistema de Reserva de Salas de Reunião

API REST desenvolvida em Spring Boot para gerenciamento de reservas de salas de reunião.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- SQL

## Estrutura do Projeto

O projeto está organizado nas seguintes camadas:

- **controller**: APIs REST para gerenciamento de salas e reservas
- **service**: Regras de negócio
- **repository**: Camada de acesso a dados
- **model**: Entidades do domínio
- **dto**: Objetos de transferência de dados
- **exception**: Tratamento de exceções

## Funcionalidades

- Listar todas as salas disponíveis
- Visualizar reservas por sala
- Realizar reserva de sala
- Cancelar reserva
- Tratamento de conflitos de horário

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/johnenderson/meeting-room-booking.git
cd meeting-room-booking
``` 

2. Execute a aplicação:

```bash
mvn spring-boot:run
```

## Endpoints

- `GET /rooms`: Lista todas as salas
- `GET /rooms/{id}/bookings`: Lista reservas de uma sala
- `POST /bookings`: Realiza uma reserva
- `DELETE /bookings/{id}`: Cancela uma reserva

## Desenvolvimento

Para contribuir com o projeto:

1. Crie uma branch
2. Faça suas alterações
3. Envie um pull request