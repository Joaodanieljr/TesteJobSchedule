# Teste Job Schedule - Dev - Vivo.

## Instruções para funcionanmento
> O teste proposto foi desenvolvido em Java 8 + JUNIT.
> Para Testar, somente é necessario abrir em uma IDE (Eclipse, netBeans), e importar o projeto como JavaProject, todos os arquivos e configuracoes ja estao setadas no proprio projeto e anexados.

> Bibliotecas necessarias:JRE SYSTEM LIBRARY e JUNIT4.

## Projeto
> O projeto foi dividido em MODEL, REPOSITORY, SERVICE, APPLICATION e TEST.

### Model
> Foi criado a classe JOB com os objetos requeridos + getters e setters e implementado um comparable para ordernar os ArrayList do projeto.

### Repository 
> Adicionados os Dados dos JOBS e a logica para transformacoes de datas. Foi utilizado o getTime() para trabalhar com milisegundos, o simpleDateFormat para receber as datas no formato passado pelo pdf e o parse para transformacao em String.

> Foi adicionado um throws ParseException devido a problemas que podem acontecer devido a transformação de data em String, se for necessario é possivel tratar com TRY/CATCH.

### Service
> Adicionado as Logicas do negocio, criacao das condições e a lista de Jobs sequencial como resposta.

### Application
> Responsavel pela iniciação(main) do projeto atraves das chamadas das funções.

### Test
> Foi utilizado o JUNIT para realização dos testes da classe ScheduleJob.

> Criado teste para verificar se os dados gerados estavam todos sendo alocados em em JOB.

> Criado teste para comparar o schedule gerado com a devido schedule correto, comparando dados e ORDEM da lista.
