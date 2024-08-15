//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    atividade2()
    }


fun atividade2() {
    var nome: String = "Leonardo"
    var idade: Int = 22
    var sal: Int = 3400
    var mesTrab: Int = 12
    var qtdProd: Int = 5
    var desconto: Int = 6500
    //(********************************)

    var salTotal: Int = sal*mesTrab
    var salLiquid: Int = salTotal - desconto
    var conca = "Opa Boa noite $nome, seu salario anual é de: $salLiquid, Parabéns"
    //(********************************)


    //(********************************)
    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário: $sal")
    println("Salário Total: $salTotal")
    println("Salário Liquido: $salLiquid")
    println("Meses de Trabalho: $mesTrab")
    println("Quantidade de Produtos: $qtdProd")
    println("Desconto: $desconto")
    println(conca)


}