package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta{
        val cliente = Cliente("Alexandre")
        val cartao = Cartao("3224053456")

        return Conta("568386-9", "7889-8","R$ 2.000,89","R$ 4.120,00",cliente,cartao)
    }
}