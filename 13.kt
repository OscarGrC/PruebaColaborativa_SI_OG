fun main (){
                                         //Declaracion de variables y valores
 var numero: Int = 0 
 var divisor: Int = 0
 var Dividendo: Int = 0
 var resto: Int = 0
                                        //Peticion de informacion a usuario
    do{
        print("¿Que numero entero deseas dividir?")
        numero= readln() .toInt()
        if (numero<=0)
            println("Numero no valido, no puede ser negativo o 0")
    }while (numero<=0)
    do{
        print("¿Por cuanto quieres dividir?")
        divisor = readln().toInt()
        if (divisor<numero)
            println("El divisor a de ser mayor o igual de $numero")
    }while (divisor<numero)
                                  //Ejecucion de Algoritmos

    println("Fin del programa")
}