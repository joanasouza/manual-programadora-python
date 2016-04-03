# Preparando o ambiente de trabalho
Para iniciarmos nossos estudos, será necessário instalar o Python. Neste tutorial iremos utilizar a versão 3 da linguagem, o Python 3. Existem algumas diferenças entre o Python 2 e o Python 3, por isso, mesmo que você já possua uma versão do Python 2 instalada na sua máquina, recomendamos fortemente que você instale o Python 3.

## Instalando Python
Dependendo do seu sistema operacional, o Python pode ser obtido de diversas maneiras. Nesta parte do guia vamos aprender à instalar o Python nos seguintes sistemas operacionais:
* Windows
* Linux
* OS X

### Windows
Para instalar o Python no Windows, é preciso que você faça o download da última versão disponível no site do Python Software Foundation, clicando [aqui](https://www.python.org/downloads/windows/). Procure por um link onde estará indicando a última versão do Python 3, algo como _Latest Python 3 Release_. Você será redirecinada para uma página com um resumo das últimas novidades da linguagem e ao final, com os links para download. Faça o download do arquivo de instalação de acordo com o seu sistema operacional: se você utiliza um Windows 64 bits, procure por _Windows x86-64 executable installer_, ou para versões 32 bits do Windows, _Windows x86 executable installer_.

![Arquivos de Instalação do Python para Windows no site do Python Software Foundation](images/python-executable-download-for-windows.png)

### Linux
Se você for uma usuária Linux, provavelmente já possui o Python instalado pois ele faz parte do conjunto de aplicações básicas da maioria das distribuições Linux. Para verificar, basta abrir o terminal e digitar:
```sh
whereis python
```
![Listando todas as instalações do Python](images/whereis-python.png)
E serão listadas todas as instalações do Python na sua máquina.

Caso o comando não retorne nada, para instalar o Python no Linux é muito simples.

#### Distribuições Red Hat
Para instalar o Python em distribuições Red Hat, como o CentOS ou o Fedora, basta abrir o terminal e digitar:
```sh
sudo dnf install python3
```
#### Distribuições Debian
Para instalar o Python em distribuições Debian, como o Debian ou o Ubunto, basta abrir o terminal e digitar:
```sh
sudo apt-get install python3
```

### OS X
Para instalar o Python no Mac OS X, é preciso que você faça o download da última versão disponível no site do Python Software Foundation, clicando [aqui](https://www.python.org/downloads/mac-osx/). Procure por um link onde estará indicando a última versão do Python 3, algo como _Latest Python 3 Release_. Você será redirecinada para uma página com um resumo das últimas novidades da linguagem e ao final, com os links para download. Faça o download do arquivo de instalação de acordo com a versão do seu sistema operacional.

![Arquivos de Instalação do Python para Mac OS X no site do Python Software Foundation](images/python-executable-download-for-mac-osx.png)

Depois de finalizar o download do pacote de instalação, dê um duplo clique para finalmente instalar o Python na sua máquina.