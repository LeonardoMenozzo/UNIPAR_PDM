//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    kotlin()
    }


fun kotlin(){
    var nome: String = "Leonardo"
    var idade: Int = 22
    var altura: Double = 1.80
    var isEstudante: Boolean = true

    // Operações Simples
    val somaIdades: Int = idade + 25
    val alturaDobrada: Double = altura * 2
    val saudacao: String = "Olá, $nome!"
    // Exibição de Resultados
    println("Idade: $idade")
    println("Altura: $altura")
    println("Nome: $nome")
    println("É estudante? ${if (isEstudante) "Sim" else "Não"}")
    println("Soma das idades: $somaIdades")
    println("Altura duplicada: $alturaDobrada")
    println("Saudacao: $saudacao")



}




