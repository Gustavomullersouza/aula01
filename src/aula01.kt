fun main(){
    /*Toda Classe começa com letra MAIUSCULA
 * e segue o padrão CamelCase
 * Exemplo: MinhaClasse*/

    /* Os ovejeto começam com letra MINUSCULA
    * Exemplo: minhaObjeto */
  /*  val p = Pessoa()

    println("Digite seu nome")
    p.nome = readLine()!!.toString()
    println("Digite sua Idade")
    p.idade = readLine()!!.toInt()
    println("Digite seu Peso")
    p.peso = readLine()!!.toDouble()
    println("Digite sua Altura")
    p.altura = readLine()!!.toDouble()

    val imc = p.peso / (p.altura * p.altura)
    println(imc) */

    var gato: Gato = Gato()
    gato.nome = "gato"
    gato.habitat = "domestico"
    gato.especie = "felino"
    gato.dieta = "peixe"

    /*Isso não pe recomendado*/
    //val gato : Gato = gato as Gato
    println(gato.somAnimal())

    var cachorro = Cachorro()
    cachorro.nome = "cachorro"
    cachorro.habitat = "domestico"
    cachorro.especie = "canino"
    cachorro.dieta = "bacon"

    println(cachorro.somAnimal())

    val animal = Animal()
     println(animal.somAnimal())


}