fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()

            for ((ind, prod) in products.withIndex()) {
                tr {
                    td(color = getCellColor(ind, 0)) {
                        text(prod.description)
                    }
                    td(color = getCellColor(ind, 1)) {
                        text(prod.price)
                    }
                    td(color = getCellColor(ind, 2)) {
                        text(prod.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
