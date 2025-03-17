//ATIVIDADE: Crie uma classe animal
//ATIVIDADE: Nome Ciêntifico, Especie, Dieta, Habitat
// Essa nossa classe é um superclasse
// A palava OPEN é usada para indicar que uma classe
// pode ser herdada.
open class Animal(){
    var nome: String = ""
    var especie: String = ""
    var dieta: String  = ""
    var habitat: String = ""
 /*ENCAPSULAMENTO: É uma forma de controle sobre
 * os atributos, quem pode acessar ou não */
    //Metodos
   open fun somAnimal(): String{
        return "Faz um barulho!"
    }
}