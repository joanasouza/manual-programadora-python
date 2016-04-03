# Preparando o ambiente de trabalho
Antes de iniciarmos a programação de fato, precisamos instalar alguns aplicativos na nossa máquina. Nesta parte do tutorial iremos aprender a instalar o Python e uma IDE para programação.

Além disso, é recomendável a instalação de uma IDE. IDEs são editores de texto especiais para programação, também são conhecidas como _Editores de Código_.

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
Para instalar o Python em distribuições Debian, como o Debian ou o Ubunto, basta abrir o terminal e digitar:
```sh
sudo apt-get install python3
```
