# Introdução à linha de comando

A linha de comando, também conhecida como _cmd_, _CLI_, _prompt_, _console_ ou _terminal_, é uma parte especial do sistema operacional que nos permite realizar ações (algumas comuns como criar uma pasta na área de trabalho) através de comandos. Apesar de parecer complexo, não se assuste! Ela é extremamente útil no nosso dia-a-dia quando programamos em Python e te faz se sentir tão poderosa quanto uma Deusa (Whoa!).

## Abrindo a interface de linha de comando
Dependendo do seu sistema operacional, a interface de linha de comando pode ser encontrada em locais diferentes. Ao executá-la, será aberta uma tela preta (ou branca) com um cursor piscando, aguardando que seja digitado algum comando.
![Print screen da linha de comando com alguns comandos que foram executados](/images/terminal-example.png)

### Windows
Chamada de _Prompt de Comando_ no Windows, para acessá-la basta ir em _Iniciar > Todos os programas > Acessórios > Prompt de comando_. 
### Linux
Conhecida como _Terminal_ em boa parte das distribuições Linux, a sua interface pode ser acessada em diferentes locais dependendo da interface gráfica da sua distribuição. Em distribuições com Gnome como interface gráfica, o Terminal pode ser acessado em _Atividades > Mostrar Aplicativos > Terminal_. Em distribuições com KDE como interface gráfica, o Terminal provavelmente será encontrado em _Aplicativos > Acessórios > Terminal_.
### Mac OS X
Conhecida como _Terminal_ no Mac OS X, ela pode ser encontrada em _Aplicativos > Utilitários > Terminal_.
## Comandos Básicos
Existem diversos comandos para executar as mais diversas ações na linha de comando. Não se preocupe em memorizar todos, pois é praticamente impossível! Abaixo, seguem alguns comandos básicos que utilizaremos no dia-a-dia e em caso de dúvida não tenha vergonha de recorrer ao Google ;)

Ao abrir a linha de comando, ela estará sendo executada em um determinado diretório (geralmente a sua pasta de usuário). Ao trabalhar com a linha de comando, tenha sempre em mente que os diretórios do seu computador comportam-se de maneira hierárquica. Uma pasta, está dentro de outra pasta, que contém mais pastas, e assim sucessivamente. A maioria dos comandos que iremos utilizar será para navegar entre diretórios e manipular seus arquivos. 

Por fim, alguns comandos podem ser diferentes no Windows

### Acessar uma pasta

Para acessar outra pasta, basta digitar:
```sh
cd <local_da_pasta>
```
Sendo que o _`<local_da_pasta`>_ deve respeitar a hierarquia atual do seu diretório. No código abaixo estou acessando uma pasta chamada _djangogirls_ dentro do meu atual diretório:
```sh
cd djangogirls
```
E no código abaixo estou acessando uma pasta acima do meu atual diretório:
```sh
cd ../Imagens
```
E para apenas subir uma pasta, basta digitar:
```sh
cd ..
```
![Navegando entre diretórios usando o comando cd](/images/nav-into-directories.png)
### Onde estou?
Navegar entre diretórios pode se tornar confuso em determinados momentos. Para isto, digite este comando e o terminal irá te responder o exato local onde ele se encontra no momento:
```sh
pwd
```
Caso você seja usuária Windows, o comando equivalente que deve ser digitado já é um conhecido nosso:
```sh
cd
```
![A resposta do comando pwd ou cd deve ser o atual diretório](/images/cmd-pwd.png)
### Listando conteúdo do atual diretório
Por vezes queremos navegar para um diretório mas não sabemos onde ele está. Podemos então lista o conteúdo das pastas com o seguinte comando:
```sh
```