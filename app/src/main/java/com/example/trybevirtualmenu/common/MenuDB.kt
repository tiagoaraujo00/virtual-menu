package com.example.trybevirtualmenu.common

import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.mealDataClass.MenuItem

object MenuDB {
    private val items = listOf(
        MenuItem(
            id = 1,
            nome = "File de Carne com Fritas",
            imagem = R.drawable.prato_01,
            descricao = "Uma suculenta porção de " +
                "filé de carne grelhado na " +
                "perfeição, servido com " +
                "deliciosas batatas fritas " +
                "crocantes. Uma explosão de " +
                "sabor que vai satisfazer seus desejos mais carnívoros.",
            preco = "R\$ 65,00"
        ),
        MenuItem(
            id = 2,
            nome = "Frango Grelhado com Legumes",
            imagem = R.drawable.prato_02,
            descricao = "Uma opção saudável e " + "saborosa: peitos de " +
                "frango suculentos " +
                "grelhados à perfeição, " +
                "acompanhados de legumes frescos, " +
                "preparados para manter a crocância " +
                "e o sabor. Uma refeição leve" +
                " e deliciosa para quem busca um toque de frescor.",
            preco = "R\$ 45,00"
        ),
        MenuItem(
            id = 3,
            nome = "Mix de File de Carne e Frango Grelhados",
            imagem = R.drawable.prato_03,
            descricao = "A melhor escolha " +
                "para os indecisos! " +
                "Uma combinação " +
                "harmoniosa de " +
                "filé de carne " +
                "suculento e peito de " +
                "frango grelhado, oferecendo " +
                "uma explosão de sabores em " +
                "cada garfada. Acompanhado de " +
                "opções de molhos que tornam " +
                "essa escolha ainda mais especial.",
            preco = "R\$ 85,00"
        ),
        MenuItem(
            id = 4,
            nome = "Picanha Grelhada com Macaxeira Frita",
            imagem = R.drawable.prato_04,
            descricao = "Uma refeição de dar " +
                "água na boca! Picanha de " +
                "primeira qualidade, " +
                "grelhada à perfeição e " +
                "servida com macaxeira frita " +
                "crocante. Um prato que celebra " +
                "o melhor da culinária brasileira.",
            preco = "R\$ 90,00"
        ),
        MenuItem(
            id = 5,
            nome = "Porção de Batatas Fritas com Molho",
            imagem = R.drawable.prato_05,
            descricao = "Para os amantes " +
                "de batatas, esta é a " +
                "escolha ideal. Nossas " +
                "batatas fritas são " +
                "cortadas e preparadas na " +
                "hora para garantir a crocância " +
                "perfeita. Acompanhadas de uma " +
                "variedade de molhos incríveis " +
                "que vão tornar cada mordida " +
                "ainda mais especial. " +
                "Acompanhamento perfeito " +
                "para qualquer refeição.",
            preco = "R\$ 20,00"
        ),
        MenuItem(
            id = 6,
            nome = "Suco de Laranja",
            imagem = R.drawable.bebida_01,
            descricao = "Um gole de pura refrescância e vitalidade. " +
                "Nosso suco de laranja é feito com as " +
                "laranjas mais suculentas e frescas, " +
                "espremidas na hora para garantir o " +
                "sabor cítrico e natural que todos " +
                "adoram. Perfeito para acompanhar suas " +
                "refeições ou para matar a sede a " +
                "qualquer hora do dia. Deleite-se " +
                "com o gosto da natureza em um copo.",
            preco = "R\$ 10,00"
        )
    )

    fun findAll() = items
    fun getMealById(id: Int) = items.find { it.id == id }
}
