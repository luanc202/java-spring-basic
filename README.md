<p align="center">
  <h1 align='center' style="background-color:#171717">App <span style= 'color:#ff9900;'>Java</span> de Registro de Tarefas</h1>
</p>

<p align="center">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" alt="Spring">
<img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white" alt="Docker">
<img src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white" alt="Maven">
<img alt="GitHub top language" src="https://img.shields.io/github/languages/top/luanc202/java-spring-basic?color=orange&style=for-the-badge">
</p>

<p align="center">
<img alt="GitHub Language Count" src="https://img.shields.io/github/languages/count/luanc202/java-spring-basic">
  <a href="https://github.com/luanc202/java-spring-basic/commits/main">
      <img alt="GitHub Last Commit" src="https://img.shields.io/github/last-commit/luanc202/java-spring-basic">
   </a>
  <a href="LICENSE"><img  src="https://img.shields.io/static/v1?label=License&message=MIT&color=F7DD43&labelColor=202024" alt="License"></a>
</p>

## 📝 Descrição do Projeto

Sistema feito durante o curso introdutório de Java da Rocketseat, com o objetivo de aprender os conceitos básicos da linguagem e do framework Spring.

## ✨ Tecnologias

- [Java](https://www.java.com/)
- [Spring](https://spring.io/)
- [Apache Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)

## 🚀 Como executar

Existem duas formas de iniciar o projeto. A primeira é usando o docker, e a segunda é instalando o Java e o Maven. É recomendado iniciar usando a primeira.

### 🐳 Usando Docker

Para iniciar o projeto usando o docker, é preciso ter o docker instalado na máquina. Depois, basta usar o comando `docker build .` na raiz do projeto, e o docker irá começar a build da imagem localmente.

Ao finalizar, você deve buscar a imagem usando o comando `docker images`, ela deve ser a mais recente na lista, e copiar o id da imagem. Com o id em mãos, basta usar o comando `docker run -p 8080:8080 <id>`, e o servidor irá iniciar na porta 8080.

### 🖥️ Usando Java e Maven

Para iniciar o projeto usando o Java e o Maven, é preciso ter o Java e o Maven instalados na máquina. Depois, basta usar o comando `mvn spring-boot:run` na raiz do projeto, e o Maven irá baixar as dependências e iniciar o servidor na porta 8080.

## 📝 Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---