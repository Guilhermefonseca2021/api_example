## Como funciona?

cada classes precisamos de nossas anotacoes para indicar endpoints e funcoes, o spring faz uma varredura em cada classe para montar nossa aplicacao.


## Endpoints

```js
// home
$   http://localhost:3333
// json informations
$   http://localhost:3333/greet
```

## Set up docker-compose.yml

primeiro voce precisa do docker na sua maquina [docker.com](https://www.docker.com/products/docker-desktop/) no caso abaixo estamos usando o mysql.

```js
// in the terminal type:
$  docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=root -d mysql:5.7
// you can verify the connection typing:
$  docker ps
// in can stop typing the code and put after the beginner of container's id (this won't remove, just stop):
$  docker stop ..
// to sure you stopped you can list all docker containers.
$  docker ps -a
// to return back type the code and put after the the container beginner id
$  docker start ..
```