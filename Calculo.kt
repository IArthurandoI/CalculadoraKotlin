import kotlin.math.pow

class Calculo {
}

fun forcaPeso(n1: Float, n2: Float): Float {
    return n1 * n2
}


fun forcaCentripeta(potencia: Float, divisao: Float, : Float, n4: Float): Float {
    return n1.pow(n2).toFloat() / n3 * n4
}

fun potencia(base: Double, expoente: Double): Float {
    return base.pow(expoente).toFloat()
}

fun dividir(n1: Float, n2: Float): Float {
    return n1 / n2
}

fun multiplicar(n1: Float, n2: Float): Float {
    return (n1 * n2)
}


fun impulso(velocidade1: Float, velocidade2: Float, massa: Float, força: Float): Float {
    return (velocidade1 - velocidade2) * massa / força
}


fun forcaElastica(corpo: Float, gravidade: Float, massa: Float): Float {
    return (corpo * gravidade / massa)
}



fun velocidadeMedia(posicaoF:Float, posicaoI: Float, tempoF: Float, tempoI: Float): Float {
    return (posicaoF - posicaoI) / (tempoF - tempoI)
}



