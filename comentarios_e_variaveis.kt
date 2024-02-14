//comentario em uma linha


/*
comentários por blocos
 */

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