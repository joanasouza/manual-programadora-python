# Preparando o ambiente de trabalho
Antes de iniciarmos a programação de fato, precisamos instalar alguns aplicativos na nossa máquina. Nesta parte do tutorial iremos aprender a instalar o Python e uma IDE para programação.

## Instalando Python
Neste tutorial iremos utilizar a versão 3 da linguagem, o Python 3. Existem algumas diferenças entre o Python 2 e o Python 3, por isso, mesmo que você já possua uma versão do Python 2 instalada na sua máquina, recomendamos fortemente que você instale o Python 3.

Dependendo do seu sistema operacional, o Python pode ser obtido de diversas maneiras. Nesta guia vamos aprender à instalar o Python nos seguintes sistemas operacionais:
* Linux
* Windows
* OS X

### Linux
Se você for uma usuária Linux, provavelmente já possui o Python instalado pois ele faz parte do conjunto de aplicações básicas da maioria das distribuições Linux. Para verificar, basta abrir o terminal e digitar:
```sh
whereis python
```
![Listando todas as instalações do Python](/images/whereis-python.png)
E serão listadas todas as instalações do Python na sua máquina.

Caso o comando não retorne nada, para instalar o Python no Linux é muito simples.

#### Distribuições Red Hat
Para instalar o Python em distribuições Red Hat, como o CentOS ou o Fedora, basta abrir o terminal e digitar:
```sh
sudo dnf install python3
```
#### Distribuições Debian
Para instalar o Python em distribuições Debian, como o Debian ou o Ubuntu, basta abrir o terminal e digitar:
```sh
sudo apt-get install python3
```

### Windows
Para instalar o Python no Windows, é preciso que você faça o download da última versão disponível no site do Python Software Foundation, clicando [aqui](https://www.python.org/downloads/windows/). Procure por um link onde estará indicando a última versão do Python 3, algo como _Latest Python 3 Release_. Você será redirecinada para uma página com um resumo das últimas novidades da linguagem e ao final, com os links para download. Faça o download do arquivo de instalação de acordo com o seu sistema operacional: se você utiliza um Windows 64 bits, procure por _Windows x86-64 executable installer_, ou para versões 32 bits do Windows, _Windows x86 executable installer_.

![Arquivos de Instalação do Python para Windows no site do Python Software Foundation](/images/python-executable-download-for-windows.png)
Após o download do arquivo, inicie a instalação do Python e atente apenas para a opção de _Adicionar python.exe ao Path_.

### OS X
Para instalar o Python no Mac OS X, é preciso que você faça o download da última versão disponível no site do Python Software Foundation, clicando [aqui](https://www.python.org/downloads/mac-osx/). Procure por um link onde estará indicando a última versão do Python 3, algo como _Latest Python 3 Release_. Você será redirecinada para uma página com um resumo das últimas novidades da linguagem e ao final, com os links para download. Faça o download do arquivo de instalação de acordo com a versão do seu sistema operacional.

![Arquivos de Instalação do Python para Mac OS X no site do Python Software Foundation](/images/python-executable-download-for-mac-osx.png)

Depois de finalizar o download do pacote de instalação, dê um duplo clique para finalmente instalar o Python na sua máquina.

## Instalando uma IDE

IDEs (Integrated Development Environments, ou em português, Ambiente de desenvolvimento Integrado) são editores de texto especiais para programação, também conhecidas como _Editores de Código_. Elas facilitam o trabalho da programadora pois possuem recursos como destaque de código em cores, permitem abrir diversos arquivos simultaneamente e outros incríveis recursos que podem ser adicionados através de plugins.

Para este tutorial, indico duas IDEs gratuitas que possuem recursos incríveis para iniciarmos os nossos estudos:
* [Atom](https://atom.io/)
* [Sublime Text](https://www.sublimetext.com)