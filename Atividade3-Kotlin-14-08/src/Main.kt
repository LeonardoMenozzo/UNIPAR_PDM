//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    atividade3()
    }

fun atividade3() {
    var produto : String = "caldo de cana"
    var preco : Double = 200.00
    var quantidade : Int = 10
    var imposto : Double = 0.17
    var margem: Double = 0.60


    //(***********************)

    var valorTotalBruto = quantidade * preco
    var valorImposto =  valorTotalBruto * imposto
    var valorTotalComImposto = valorTotalBruto + valorImposto
    var valorTotalComMargem = valorTotalComImposto * (1 + margem)
    var valorUnitarioComMargem = valorTotalComMargem / quantidade







    println(preco)
    println(quantidade)
    println(imposto)
    println(margem)
    print(valorTotalBruto)
    println(valorImposto)
    println(valorTotalComImposto)
    println(valorTotalComMargem)
    println(valorUnitarioComMargem)

}