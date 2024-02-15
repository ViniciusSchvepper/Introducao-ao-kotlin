fun filterReduceMap() {    
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers)

    var evenNumbers = numbers.filter { it%2 == 0 }
    println("Listagem de números Pares: $evenNumbers")


    var oddNumbers = numbers.filter { it%2 != 0 }
    println("Listagem de números Ímpares: $oddNumbers")

    var multiplyNumbers = numbers.map { it * it }
    println("Multiplicação: $multiplyNumbers")


    var sumNumbers = numbers.reduce {
        acc, it ->
        println("acc = $acc, it = $it")
        acc + it }

    println("Resultado da Somatório: $sumNumbers")
}

Exemplo de uso de enumeradores
enum class Compass {
    north,
    east,
    west,
    south
}

fun enum(args: Array<String>) {
    var direction = Compass.north
    println("Minha direção é $direction")

    when (direction) {
        Compass.north -> 
            println("Estamos indo para o norte")
        Compass.south ->
            println("Estamos indo para o sul")
        Compass.east ->
            println("Estamos indo para o leste")
        Compass.west ->
            println("Estamos indo para o oeste")
    }
}

fun estruturas() {
    //Estrutura if-else
    var numero1 = 10
    var numero2 = 5

    if (numero1 > numero2) {
        println("$numero1 é maior que $numero2")
    }
    else {
        println("$numero1 é menor que $numero2")
    }

    //Estrutura when
    var numero3 = 7
    when (numero3 % 2) {
        0 -> 
        println("$numero3 é par")
        else -> 
        println("$numero3 é ímpar")
    }

    //Estrutura while
    var life = 10
    while (life > 0) {
        println("O jogador está com $life vidas")
        life = life - 1
    }

    //Estrutura for in
    var students = arrayOf(
        "João Francisco",
        "Pedro Henrique",
        "Gustavo Oliveira",
        "Janaina Santos",
        "Francisco José"
    )   
    for (student in students) {
        println("O aluno $student veio na aula de hoje!")
    }
}

fun operadoresComparacao(){
    var a = 12
    var b = 3
    var c = 7
    var d = 3
    println(a > b)   //true
    println(a < b)   //false
    println(b >= d)  //true
    println(a <= c)  //false
    println(b == d)  //true
    println(b != d)  //false
}

fun operadoresLogicos() {
    var yes = true
    var no = false
    println(yes &amp;&amp; no)   //false
    println(yes || no)   //true
    println(!yes)        //false
}

fun operadoresCompostos() {
    var a = 2
    var b = 3
    var newValue = 5

    newValue += a   //7
    newValue -= b   //4
    newValue *= a   //8
    newValue /= a   //4
    newValue %= b   //Resto da divisão: 1

    newValue++ //incrementando 1
       
    newValue-- //decrementando 1
}

fun aritmeticos() {
    var a = 12
    var b = 3
    var sum = a + b
    var subtract = a - b
    var multiplication = a * b
    var division = a / b
    var módulus = a % b
    var minusA = -a
}

fun colecoes() {
    val tipoDeDado = String::class //Aqui podemos escolher qualquer um dos tipos de dados para a criação da array
    var arrayVazia = arrayOf<tipoDeDado>() //Criação de array com o tipo selecionado

    //Criação de uma list
    var filmes = arrayList<String>()
    filmes.addAll(ListOf(
        "Matrix",
        "Crepusculo",
        "Jurassic Park",
    ))

    Criação de um set
    var cores = HashSet<String> ()
    var catalogo = listOf (
        "Preto",
        "Branco",
        "Escarlate"
    )
    catalogo.addAll(cores)

    Criação de um map
    var numeroNome = HashMap<Int, String>()
    var adicionar = mapOf (
        Pair(1,"Vinicius"),
        Pair(2,"Luna"),
        Pair(3,"Aime"),
    )
    numeroNome.putAll(adicionar)
}

fun types() {
    //Valores que long, int, short e byte abrangem:
    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)

    //Numeros com virgula
    var pesoPessoa: Double = 70.50
    var salarioPessoa = 2700.34F

    //Char e String
    var nomePessoa: String = "Vinicius"
    var letraInicialDaPessoa: Char = 'V' //Char armazena apenas uma letra e deve ser definido de maneira explicita

    //Booleanos
    var pessoaAprovada = True
    var pessoaReprovada = False

    //Pair
    val (enderecoPessoal, numeroCasa = Pair("Rua dos Limoes", 245) //Retorna mais de um tipo ao mesmo tempo

    //Nullable
    var nomeDoFilho: String? = null //Caso a declaração tenha um '?' como sufixo é possivel que o valor retornado seja nulo
}

fun variaveis() {
    //Variáveis mutaveis
    var faculdade: String = "FIAP" //Declaração explicita
    var cidade = "Sao Paulo" //Declaração implicita

    println("O tipo da variavel faculdade e: ${faculdade::class.simpleName}")
    println("O tipo da varivel cidade e: ${cidade::class.simpleName}")
    
    //Variáveis imutáveis
    val pi = 3.141592
    val gravity = 9.81
}