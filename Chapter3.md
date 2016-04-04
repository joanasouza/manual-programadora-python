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

Por fim, alguns comandos podem ser diferentes no Windows. Neste tutorial, preocupei-me em listar o comando equivalente para usuárias Windows, mas saiba que você pode procurar instalar uma linha de comando que seja similar à do Linux, como por exemplo o [PowerShell](https://www.microsoft.com/en-us/download/details.aspx?id=42554).

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
Por vezes queremos navegar para um diretório mas não sabemos onde ele está. Podemos então listar o conteúdo das pastas com o seguinte comando:
```sh
ls
```
Caso você esteja utilizando o Windows, digite:
```sh
dir
```
![Listando o conteúdo de uma pasta usando o comando ls](/images/cmd-ls.png)

### Criando uma pasta
Para criar uma pasta, basta digitar:
```sh
mkdir <nome_da_pasta>
```
E uma pasta será criada no seu atual diretório, caso já não exista uma com o mesmo nome.
![Criando uma pasta chamada Project dentro do diretório djangogirls](/images/cmd-mkdir.png)

### Excluindo uma pasta
Excluir uma pasta utilizando o terminal __remove a pasta e todo seu conteúdo terminantemente do computador. Nada de lixeira! Todo o conteúdo vai pra um limbo indefinido e jamais será recuperado novamente D:__ Agora que estamos cientes, para remover uma pasta utilizando a linha de comando, basta digitar:
```sh
rm -r <nome_da_pasta>
```
Ou caso você esteja utilizando o Windows:
```sh
rmdir /S <nome_da_pasta>
```
![Removendo a pasta djangogirls terminantemente](/images/cmd-rm.png)



---

# Exercícios
1. Crie uma pasta chamada _python_ no seu atual diretório.
2. Entre na pasta _python_.
3. Crie uma pasta chamada _Projeto_ dentro da pasta _python_ e entre nela.
4. Crie um arquivo chamado _home.txt_ dentro da pasta _Projeto_. Não tenha vergonha de pesquisar no Google!
5. Liste o conteúdo da pasta _Projeto_.
6. Estando na pasta _Projeto_, suba uma pasta.
6. Exclua a pasta _Projeto_.
7. Consegue descobrir qual é o seu diretório atual? Utilize o comando respectivo para esta ação.
8. Suba um nível e exclua a pasta _python_.

