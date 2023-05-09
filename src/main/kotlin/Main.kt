import jdk.jshell.Snippet.Status

/* ARQUIVO ESTUDO
* .Projeto destinado ao estudo e prática da Linguágem de Programação Kotlin*/

/*Kotlin é uma linguagem de programação multiplataforma, orientada a
objetos e funcional, concisa e estáticamente tipada (variáveis com
tipos específicos), desenvolvida pela JetBrains em 2011, que compila
para a Máquina virtual Java e que também pode ser traduzida para a
linguagem JavaScript e compilada para código nativo (via LLVM).
Foi anunciada em 2017 pela Google como a
linguagem oficial do sistema Android.*/

fun main() {

    //----- PARTE 1 ----- Variáveis Mutáveis e Imutáveis
    println("Variáveis Mutáveis e Imutáveis")

    //Uma variável é mutável quando declarada com "var"
    var var1 = "Variável v1 de Valor 1"
    println(var1)
    var1 = "Variável v1 alterada para Valor 2"
    println(var1)

    //Uma variável é imutável quando declarada com "val"
    val val1 = "Variável de Valor Fixo (Não mutável)"
    println(val1)

    println()
    println("----------------------------------------------------------------------------------")
    println()

    //----- PARTE 2 ----- Tipos Primitivos de Variáveis
    println("Tipos Primitivos de Variáveis")

    //Char -> Caractére único
    /*Uma variável do tipo Caractére é declarada por "Char", por ''(aspas simples)
    * e pode conter apenas 1 único caractére (maiúsculo ou minúsculo). ex. 'a' */
    var c1 = 'a'
    var c2 = 'A'
    println("- Char -")
    println("c1: $c1 \nc2: $c2")

    println()

    //String -> Textos
    /*Uma variável do tipo string é declarada por "String", por ""(aspas duplas)
    * e pode conter 1 ou mais palavras ou 1 frase ou texto.*/
    var st1 = "Palavra 1"
    var st2 = "Frase de exemplo declarada como String"
    println("- String -")
    println("st1: $st1 \nst2: $st2")

    println()

    //Byte -> Números Inteiros (-128 até 127)
    /*Uma variável do tipo byte é declarada por "Byte" e pode
    * ser composta por números inteiros entre -128 e 127*/
    var b1: Byte = -128
    var b2: Byte = 127
    println("- Byte -")
    println("b1: $b1 \nb2: $b2")

    println()

    //Int -> Números Inteiros (-2147483648 até 2147483647)
    /*Uma variável do tipo int é declarada por "Int" e pode
    * ser composta por números inteiros entre -2147483648 e 2147483647*/
    var i1: Int = -2147483648
    var i2: Int = 2147483647
    println("- Int -")
    println("i1: $i1 \ni2: $i2")

    println()

    //Long -> Números Inteiros (-9223372036854775807 até 9223372036854775807)
    /*Uma variável do tipo long é declarada por "Long" e pode ser composta
    * por números inteiros entre -9223372036854775807 e 9223372036854775807*/
    var l1: Long = -9223372036854775807
    var l2: Long = 9223372036854775807
    println("- Long -")
    println("l1: $l1 \nl2: $l2")

    println()

    //Float -> Números Decimais (1.1234567 até 7 casas decimais)
    /*Uma variável do tipo float é declarada por "Float", deve
    * conter "f" ao final do valor e pode ser composta por números
    * decimais (reais) de até 7 casas decimais. ex. 1.1234567*/
    var fl1: Float = 1.1234567f
    var fl2: Float = 12345678910.1234567f
    println("- Float -")
    println("fl1: $fl1 \nfl2: $fl2")

    println()

    //Double -> Números Decimais (1.123456789012345 até 15 casas decimais)
    /*Uma variável do tipo double é declarada por "Double" e pode ser composta
    * por números decimais (reais) de até 15 casas decimais. ex. 1.123456789012345*/
    var d1: Double = 1.123456789012345
    var d2: Double = 123456789012345.123456789012345
    println("- Double -")
    println("d1: $d1 \nd2: $d2")

    println()

    //Boolean -> Valores Booleanos (True / False)
    /*Uma variável do tipo boolean é declarada por "Boolean" e pode ser composta
    * por Valores true ou false, ou compostas por variáveis que as representem.*/
    var bool1 = true
    var bool2 = false
    println("- Boolean -")
    println("bool1: $bool1 \nbool2: $bool2")

    println()
    println("----------------------------------------------------------------------------------")
    println()

    //----- PARTE 3 ----- Declaração de Arrays (Tipos de Arrays e Listas)
    println("Declaração de Arrays (Tipos de Arrays e Listas)")

    /*Arrays são variáveis que podem armazenar uma lista ordenada e organizada de valores
    * através de Índices, sendo que podem ser declaradas como:*/

    /*listOf() -> Lista imutável (fixa). Não é permitido adicionar ou remover itens.
    * É possível fazer listas com tipos primitivos mesclados.*/
    var list1 = listOf("Arroz", 'f', "Batata", 40)
    //list1.add("Batata")
    //list1.add = "Batata"
    //list1.remove("Arroz")
    var list2 = listOf(10, 'b', 30, "Quarenta", 50)
    println("- listOf -")
    println("Lista:String: $list1 \nLista:Int: $list2")

    println()

    /*arrayOf() -> Lista mutável. Não é permitido adicionar ou remover itens.
    * É permitido alterar valores existentes e os tipos primitivos.
    * É possível fazer listas com tipos primitivos mesclados.
    * É possível exibir os itens. (apenas listando por índice)*/
    var arr1 = arrayOf("Arroz", 'f', "Batata", 40)
    //arr1.add("Batata")
    //arr1.add = "Batata"
    //arr1.remove("Arroz")
    var arr2 = arrayOf(10, 'b', 30, "Quarenta")
    println("- arrayOf -")
    println("Lista: " + arr1[0] + ", " + arr1[1] + ", " + arr1[2] + ", " + arr1[3])
    println("Lista: " + arr2[0] + ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3])

    println()

    /*arrayListOf() -> Lista mutável. É permitido adicionar ou remover itens.
    * É permitido alterar valores existentes e os tipos primitivos.
    * É possível fazer listas com tipos primitivos mesclados.
    * É possível exibir os itens através da própria Array.*/
    var arrList1 = arrayListOf("Arroz", 'f', "Batata", 40)
    arrList1.add("Torneira")
    arrList1.add(50)
    //arrList1.add = "Batata"
    arrList1.remove(arrList1[3])
    arrList1.remove("Arroz")
    var arrList2 = arrayListOf(10, 'b', 30, "Quarenta")
    println("- arrayListOf -")
    println(arrList1)
    println(arrList2)
    //println("Lista: " + arrList1[0] + ", " + arrList1[1] + ", " + arrList1[2] + ", " + arrList1[3])
    //println("Lista: " + arrList2[0] + ", " + arrList2[1] + ", " + arrList2[2] + ", " + arrList2[3])

    println()
    println("----------------------------------------------------------------------------------")
    println()

    //----- PARTE 4 ----- Estruturas Condicionais (Loops)
    println("Estruturas Condicionais (Loops)")

    /*if else -> É uma Estrutura Condicional que testa se uma variável é VERDADEIRA
    * ou FALSA. Tem como entrada uma Variável, testa uma Condição, e a Saída é feita
    * quando a condição é satisfeita, realizando as operações dentro das chaves { }*/
    var ie1 = true
    //var ie1 = false
    //var ie1 = null
    println("- if else -")
    if (ie1 == true) {
        println("ie1: $ie1")
    } else if (ie1 == false) {
        println("ie1: $ie1")
    } else {
        println("ie1: $ie1")
    }

    //var ie2 = 1
    var ie2 = 2
    //var ie2 = 3
    if (ie2 == 1) {
        println("ie2: $ie2")
    } else if (ie2 == 2) {
        println("ie2: $ie2")
    } else {
        println("ie2: $ie2")
    }

    println()

    /*while -> É uma Estrutura Condicional que recebe um valor ou variável e
    * executa repetidamente linhas de código dentro das chaves, enquanto a
    * condição for verdadeira. Sua saída do LOOP é até que a condição não
    * seja mais satisfeita (gerando um resultado "false"). ex. while (true)
    * (-  while [Teste no Início]    /    do while [Teste no final]  -) */
    println("- While -")
    var w1 = 1
    print("w1:")
    while (w1 <= 9) {
        print(" $w1")
        w1++
    }

    println("\n")

    /*When (switch) -> É uma Estrutura Condicional que recebe um valor ou
    variável e executa uma opção e suas linhas de código com base na igualdade
    do valor inserido e o valor do índice da opção listada dentro da estrutura
    "when". ex. 1, 2, 3,... else*/
    println("- When -")
    var opcao1 = 1
    when (opcao1) {
        1 -> println("When1: Opção 1")
        2 -> println("When1: Opção 2")
        3 -> println("When1: Opção 3")
        else -> println("When1: Nenhuma opção selecionada!")
    }

    var opcao2 = 1
    var result = when (opcao2) {
        1 -> "Opção A"
        2 -> "Opção B"
        3 -> "Opção C"
        else -> "Nenhuma opção selecionada!"
    }
    println("When2: $result")

    println()

    /*for -> É uma Estrutura Condicional que executa repetidamente linhas de código
    * dentro das chaves, um número pré-determinado de vezes ou até que a condição
    * (declarada após "in"[dentro]) seja satisfeita. ex. 1..9 (de 1 até 9 vezes)*/
    println("- For -")
    print("[for] declarado 0..9 \nfo1:")
    for (fo1 in 0..9) {
        print(" $fo1")
    }

    var fon2 = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
    print("\n[for] declarado Array(10) \nfo2:")
    for (fo2 in fon2) { print(" $fo2") }

    var fon3 = arrayOf("A", "B", "C", "D", "E")
    print("\n[for] declarado withIndex \nfo3:")
    for ((foi, fo3) in fon3.withIndex()) { print(" $foi:$fo3") }

    println("\n")

    /*do while -> É uma Estrutura Condicional que recebe um valor ou variável e
    * executa repetidamente linhas de código dentro das chaves, enquanto a
    * condição for verdadeira. Sua saída do LOOP é até que a condição não seja
    * mais satisfeita (gerando um resultado "false"). ex. do{...} while(true)
    * (-  while [Teste no Início]    /    do while [Teste no final]  -) */
    println("- do while -")
    var dw1 = 0
    do {
        print(" $dw1")
        dw1++
    } while(dw1 <= 9)

    var dw2 = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
    var dw2ind = 0
    print("\n")
    do {
        print(" " + dw2[dw2ind])
        dw2ind++
    } while(dw2ind <= dw2.size-1)

    println("\n")
    println("----------------------------------------------------------------------------------")
    println()

    //----- PARTE 5 ----- SET / MAP / ENUM

    /* hashSetOf (set) -> A Estrutura "set" é do tipo lista, a qual é mais rápido
    * do que um ArrayList. "hashSetOf" não permite itens duplicados e não mantém
    * a ordem dos elementos.*/
    println("- hashSetOf -")
    var se1 = hashSetOf("A", "B", "C", "C", "D", "C", "D", "H", "I", "I")
    print("se1:")
    for (sc1 in se1) { print(" $sc1")
    }

    println()

    var se2 = hashSetOf(10, 20, 30, 40, 50, 60, 70)
    print("se2:")
    for (sc2 in se2) { print(" $sc2") }

    println("\n")

    println("   ---------------------------------------      ")

    println("\n- hashMapOf -")
    /*hashMapOf (map) / (chave / valor) -> A Estrutura "map" é uma implementação
    * chave / valor.
    * É possível adicionar (chave/valor) através do método "put".
    * É possível ter como saída apenas a chave por "[varMap].values" ou apenas o valor por
    * "keys".
    * É possível remover itens por "[varMap].remove"*/
    var m1 = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do Homem"
    )
    m1.put("passaro", "Gosta de voar")
    m1.remove("urso")

    //Exibindo map [m1]
    print("\n- Chave / Valor -\n")
    for (item in m1) { println(". $item") }
    //Exibindo map [m1].values
    print("\n- Chave (map.keys) -\n")
    for (item in m1.keys) { println(". $item") }
    //Exibindo map [m1].keys
    print("\n- Chave (map.values) -\n")
    for (item in m1.values) { println(". $item") }

    println()

    println("   ---------------------------------------      ")

    /*enum -> É um tipo de dados que consiste num conjunto de constantes que são
    * pré-declaradas para serem utilizadas como valores fixos*/
    val pedido = Pedido()

    println("\n- enum -")
    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("O pedido está Processando!")
    } else if (pedido.status == StatusPedido.APROVADO) {
        println("O pedido foi Aprovado!")
    } else if (pedido.status == StatusPedido.REPROVADO) {
        println("O pedido foi Reprovado!")
    }

    println("\n")
    println("----------------------------------------------------------------------------------")
    println()

    //----- PARTE 6 ----- INTERFACE / CLASS / : (EXTENDS) / IMPLEMENTS ???
    println("\n- interface -")

    val jamilton = Jamilton()
    jamilton.direitosDeveres() //classe
    jamilton.ganharEleicao() //interface (override obrigatório)

    val obama = Obama()
    obama.direitosDeveres() //classe
    obama.ganharEleicao() //interface (override obrigatório)
    obama.temFilho() //interface (override obrigatório)
}

/*-------------------------------------------------------------------------*/

/*enum - início*/
enum class StatusPedido() {
    PROCESSANDO, REPROVADO, APROVADO
}

class Pedido() {
    var status: StatusPedido = StatusPedido.PROCESSANDO
}
/*enum - final*/

/*-------------------------------------------------------------------------*/

/*interface - início*/
interface Presidente {
    fun ganharEleicao()
}

open class Cidadao {
    fun direitosDeveres() {
        println("Todo cidadão tem direitos e deveres!")
    }
}

interface Pai {
    fun temFilho()
}

class Obama: Cidadao(), Presidente, Pai {
    override fun ganharEleicao() {
        println("Ganhar Eleição nos EUA")
    }

    override fun temFilho() {
        println("Obama tem filhos")
    }
}

class Jamilton: Cidadao(), Presidente {
    override fun ganharEleicao() {
        println("Ganhar Eleição no Brasil")
    }
}


/*interface - final*/