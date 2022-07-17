package one.digitalinnovation.digionebank

class Cliente(

    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,  //Aqui entra nossa Enum
    val senha: String

) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:     $nome
        Cpf:      $cpf
        Tipo:     ${clienteTipo.descricao}
    """.trimIndent()
}