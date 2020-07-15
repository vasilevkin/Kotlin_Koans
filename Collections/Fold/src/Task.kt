// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProd = customers.flatMap{ it.getOrderedProducts() }.toSet()

            return customers.fold(allProd) { acc, cust -> acc.intersect(cust.getOrderedProducts()) }
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products.toList() }
