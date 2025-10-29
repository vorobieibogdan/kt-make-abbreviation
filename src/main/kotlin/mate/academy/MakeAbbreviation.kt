package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    return source
        .split(" ")
        .filter { it.isNotEmpty() }
        .map { it[0].uppercase() }
        .joinToString("")
}


