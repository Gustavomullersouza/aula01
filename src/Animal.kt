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

    //Metodos
   open fun somAnimal(){
        print("Faz um barulho")
    }
}