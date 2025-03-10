fun main(){
    val p: Pessoa()

    println("Digite seu nome")
    p.nome = readLine()
    println("Digite sua Idade")
    p.idade = readLine()!!.toInt()
    println("Digite seu Peso")
    p.peso = readLine()!!.toDouble()
    println("Digite sua Altura")
    p.altura = readLine()!!.toDouble()

    val imc = p.peso / (p.altura * p.altura)
    println(imc)

}