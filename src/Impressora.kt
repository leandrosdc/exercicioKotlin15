class Impressora (){
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun imprimirLista(){
        listaImprimivel.forEach(){
            it.imprimir()
        }
    }
}