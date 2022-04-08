# decoder-project
Formação de Especialistas em Microservices Java com Spring

| Computer |    Host   | Port |   User   | Password |
|----------|-----------|------|----------|----------|
| House    | localhost | 5432 | postgres | 3301     |

## Aulas 

### Boas Vindas

- [x] Bem-Vindo(a): Propósito e Motivação
- [x] Projeto Decoder - Overview Completo
- [x] Cronograma do Projeto Decoder
- [x] Avisos Importantes - Termos e Copyright
- [x] Suporte e Comunidade Discord
- [x] F.A.Q - Perguntas Frequentes

### Descodificando Microservices com Spring [Evento]

- [x] O Fim dos Monolíticos - Vantagens dos Microservices
- [x] Fundamentos Microservices - Desafios e Equívocos
- [x] Microservices Patterns e Spring Projects

### Planejamento Arquitetura de Microservices: Componentes e Comunicações

- [x] Concepção da Arquitetura de Microservices
- [x] Definição dos Componentes e Comunicações
- [x] Base de Dados Compartilhada e Base de Dados por Microservice
- [x] Comunicação Microservice: Síncrona e Assíncrona
- [x] Assincronia por Mensageria ou Eventos

### Ecossistema Spring Aplicados a Microservices

- [x] Spring Framework e Spring Boot
- [x] Projetos Spring para Arquitetura de Microservices

### Microservices com Spring: Primeiros Passos

- [x] Instalar JDK 11 e Configurar Variável JAVA_HOME
- [x] Instalar Maven e Configurar Variável MAVEN_HOME
- [x] Instalar Intelij IDEA - Licença Brinde de 6 Meses
- [x] O Primeiro Microservice - AuthUser
- [x] Arquitetura EAD - Criando Microservices Course e Notification
- [x] Instalar Postman
- [x] Instalar PostgreSQL com Variável Ambiente e pgAdmin
- [x] Instalar Git e Acessos aos Códigos Fontes dos Microservices (Versionados)
- [x] Acesso Código Fonte - 1

### API RESTFul para Microservices: Do Básico ao Avançado

- [x] API REST vs RESTful: Introdução e Conceitos
- [x] Overview da API RESTFul a ser Utilizada na Arquitetura
- [x] Criar e Configurar Base de Dados PostgreSQL
- [x] Mapeamentos com Spring Data JPA e Lombok
- [x] API REST com Spring Web
- [x] Criar Método de Registro de Usuários com Verificações Iniciais
- [x] JsonView - Multiplas Visualizações em APIs
- [x] Validação com Spring Validation
- [x] Validação Customizada - @Constraint
- [x] Paginação em APIs com Spring Data
- [x] Filtros Avançados em APIs com Specification
- [x] Hipermídias com Spring Hateoas
- [x] Postman Collection AuthUser API
- [x] Acesso Código Fonte - 2

### Spring Data JPA Avançado em Microservices

- [x] Mapear Entidades, criar Repositories e Services para Multiplas Entidades
- [x] Implementar Relacionamentos OnetoMany e ManyToOne
- [x] FetchType Eager/Lazy, @EntityGraph, FetchMode SELECT/SUBSELECT/JOIN, @Query e @Modify
- [x] Deleção de Relacionamento Cascade.ALL ou Método de Deleção Customizado
- [x] Criar API RESTful para Course com Validação Spring Validation
- [x] Criar RESTful para Module com Validações
- [x] Criar RESTful para Lesson com Validações
- [x] Filtros Avançados em APIs com Specification e Pageable
- [x] Filtros Avançados em APIs com Specification Avançado para Relacionamento e Pageable
- [x] Boas Práticas de Datas nas APIs utilizando o Padrão ISO 8601 UTC
- [x] Acesso Código Fonte - 3
- [x] Postman Collection Course API

### Spring Logging

- [x] Principais Bibliotecas de Logging, Log Levels e Logging no Spring com Logback
- [x] Implementando Logging nos Microservices com Log4J2
- [x] Acesso Código Fonte - 4

### API Composition Pattern e Synchronous Communication

- [x] Conceitos de API Composition Pattern
- [x] Mapear Relacionamentos para Comunicação entre Microservices
- [x] API Composition Pattern - Preparar Métodos GetAll
- [x] API Composition Pattern em Authuser Microservice – Parte 01
- [x] API Composition Pattern em Authuser Microservice – Parte 02
- [ ] API Composition Pattern em Course Microservice
- [ ] Comunicação Síncrona Entre Microservices - Layout e Fluxos (Ferramentas)
- [ ] Comunicação Síncrona - Inscrição de User em Course - Parte 1
- [ ] Comunicação Síncrona - Inscrição de User em Course - Parte 2
- [ ] Comunicação Síncrona - Inscrição de User em Course - Parte 3
- [ ] Comunicação Síncrona - Inscrição de User em Course - Parte 4
- [ ] Tipo User Instructor para Criar Courses
- [ ] Validação Customizada - Custom Validation
- [ ] Comunicação Síncrona - Preparação de Deleção Entre Microservices
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Cross Cutting Service Registry Discovery Pattern

- [ ] Conceitos de Service Registry Discovery Pattern
- [ ] Criar Service Registry com Spring Cloud Netflix Eureka
- [ ] Eureka Clients nos Microservices de Negócio
- [ ] Comunicações Síncronas com Client-side Discovery Pattern
- [ ] Acesso Código Fonte

### Cross Cutting API Gateway Pattern

- [ ] Conceitos e Arquitetura de API Gateway Pattern com Spring Cloud Gateway
- [ ] API Gateway Pattern com Service Registry Pattern
- [ ] Criar API Gateway Microservice com Spring Cloud Gateway
- [ ] Configurar Gateway com Eureka Server e Roteamentos
- [ ] Múltiplas Instancias dos Microservices com Load Balance
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Synchronous Communication - Deleção entre Microservices

- [ ] Deleção entre Microservices - parte 1
- [ ] Deleção entre Microservices - parte 2
- [ ] Acesso Código Fonte

### Microservices Patterns para Asynchronous Communication

- [ ] Broker Pattern e Mediator Pattern (Estudo de caso - Homologação de Fornecedores)
- [ ] RabbitMQ, Tipos de Exchanges, Filas Erros e Políticas de Retentativas
- [ ] Event-Driven Pattern - Event Notification Pattern e Event-Carried State Transfer Pattern
- [ ] Saga Pattern por Coreografia ou Orquestração

### Event Driven com Event-Carried State Transfer Pattern e Broker Pattern

- [ ] Preparar EAD para Comunicação Assíncrona
- [ ] Mapear State Transfer Pattern com Replicação Parcial de Dados
- [ ] Iniciando com RabbitMQ e Spring AMQP
- [ ] Criar Publisher e Publicar Event State Transfer (CREATE)
- [ ] Criar Consumer e Receber Event State Tranfer
- [ ] Publicar Event State Transfer (UPDATE e DELETE)
- [ ] Fluxo Híbrido de Comunicação Síncrona e Assíncrona
- [ ] Delete Cascade com State Transfer Pattern
- [ ] Postman Collection

### Reliability - Circuit Breaker Pattern

- [ ] Conceitos de Circuit Breaker Pattern e Spring Cloud Circuit Breaker
- [ ] Implementar Retry Resilience4j e Configurar Timeout
- [ ] Implementar Circuit Breaker Resilience4j
- [ ] Acesso Código Fonte

### Cross Cutting - Global Config Management Pattern

- [ ] Conceitos Global Config Pattern e Spring Cloud Config
- [ ] Criar Config Server Com Spring Cloud Config e repositório Git
- [ ] Configurar Config Client em Authuser Microservice
- [ ] Atualizar Propriedades em Tempo de Execução com @RefreshScope e Spring Actuator
- [ ] Configurar Config Client em Course Microservice
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Asynchronous Communication via Command Messages

- [ ] Preparar Asynchronous Communication via Commands em Notification Microservice
- [ ] Criar Exchange Topic, definir Queue e Bindings
- [ ] Criar Publisher Command Message
- [ ] Criar Endpoints para visualizar e atualizar Notifications
- [ ] Preparar ConfigServer e novas rotas no Gateway para Notification Microservice
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Basic Authentication em Service Registry e Config Server

- [ ] Implementar Basic Authentication no Service Registry
- [ ] Registrar Microservices no Service Registry com Autenticação
- [ ] Implementar Basic Authentication no Config Server
- [ ] Acesso Código Fonte

### Authentication e Authorization com Basic Authentication

- [ ] Conceitos e Fluxo do Spring Security para Basic Authentication
- [ ] Basic Authentication em AuthUser com Roles
- [ ] Users Roles com Encoder Password em AuthUser
- [ ] Implementar UserDetails e UserDetailsService para Basic Auth com Database
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Authentication e Authorization com Json Web Token (JWT)

- [ ] Conceitos e Estrutura do JWT (Json Web Token)
- [ ] Conceitos e Fluxos do Spring Security com JWT
- [ ] Implementar JwtProvider para Gerar Tokens e Authentication Endpoint
- [ ] Implementar Validation Tokens e Authorization com JWT
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Cross-Cutting Authentication e Authorization com JWT em Microservices

- [ ] Authorization com Roles em Microservices
- [ ] Generate JWT com Subject e Roles
- [ ] Access Token Pattern in Notification Microservice
- [ ] Access Token Pattern in Course Microservice
- [ ] Access Token na Comunicação Síncrona entre Microservices
- [ ] Authorization Roles para Instructor
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Config Ambientes Dev e Prod e Deploy Microservices no Heroku Cloud

- [ ] Criar conta na Plataforma Heroku e Instalar Heroku CLI
- [ ] Config Dev/Prod com Deploy - ServiceRegistry Microservice
- [ ] Config Dev/Prod com Deploy - Config Server Microservice Parte 1
- [ ] Config Dev/Prod com Deploy - Config Server Microservice Parte 2
- [ ] Config Dev/Prod com Deploy - AuthUser Microservice com DB PostgreSQL e RabbitMQ
- [ ] Config Dev/Prod com Deploy - Course Microservice com DB PostgreSQL e RabbitMQ
- [ ] Config Dev/Prod com Deploy - Notification Microservice com DB PostgreSQL e RabbitMQ
- [ ] Config Dev/Prod com Deploy - API Gateway Microservice com Global Config
- [ ] Fluxo Completo da Arquitetura de Microservices em Cloud
- [ ] Acesso Código Fonte
- [ ] Postman Collection

### Arquitetura Hexagonal

- [ ] Arquitetura Hexagonal: Da Teoria à Prática
- [ ] Acesso Código Fonte

### Observability - Log Aggregation com Elastic Stack (ELK)

- [ ] Observability - Log Aggregation Pattern, Health Check API Pattern e Distributed Tracing Pattern
- [ ] Elastic Stack - Elasticsearch, Logstash and Kibana (ELK)
- [ ] Configurar Elastic Stack Cloud com Filebeat Local
- [ ] Log Aggregation Pattern - Microservices com Log4j2 no Padrão ECS Parte 1
- [ ] Log Aggregation Pattern - Microservices com Log4j2 no Padrão ECS Parte 2
- [ ] Criar Dashboard Personalisado no Kibana e Analisar Métricas de Logs
- [ ] Acesso Código Fonte

### Considerações Finais

- [ ] Overview Projeto Decoder: Especialista em Microservices com Spring

### Decoder Week [Evento Extra]

- [ ] [Dia 1] Modelagem Arquitetura de Microservices
- [ ] [Dia 2] Modelos de Comunicações entre Microservices
- [ ] [Dia 3] Microservices Patterns e suas Aplicabilidades
