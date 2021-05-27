fun main(){
    //Instanciar Impressora
    var impressora1 = Impressora()

    //Instanciar Tipos
    var foto1 = Foto("foto","foto")
    var documento1 = Documento("documento", "documento")
    var contrato1 = Contrato("contrato", "contrato")

    //Executa Imprimivel
    adicionarImprimivel(foto1, impressora1)
    adicionarImprimivel(documento1,impressora1)
    adicionarImprimivel(contrato1, impressora1)

    //Imprimir Lista
    impressora1.imprimirLista()
}

fun adicionarImprimivel(imprimivel: Imprimivel, impressora: Impressora) = impressora.listaImprimivel.add(imprimivel)




