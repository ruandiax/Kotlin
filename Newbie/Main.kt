/*
                            EXERCÍCIO
a. Crie um novo arquivo com uma função main.
b. Declare uma variavel mutável capaz de armazenar seu nome completo.
c. Decalre uma variável de texto sem valor algum.
d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça.
e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000)
f. Declare uma variável capaz de armazenar a população do Brasi (211.000.000)
g. Imprima o valor do PIB per capita.
h. Rode seu programa de maneira que não tenha erros de compilação de execução.
 */

fun main() {
    var nome = "Ruan Dias"
    var semTexto : String
    val numeroSapato = 43
    var pibBrasil: Long = 1869000000000
    var populacaoBrasil = 211000
    val pibpercapta = pibBrasil / populacaoBrasil

    println("O PIB Per Capta do Brasil é: R$ ${pibpercapta}")
}