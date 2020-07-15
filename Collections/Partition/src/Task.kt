// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.filter { val (delivered, und) = it.orders.partition { it.isDelivered }
        delivered.size < und.size }.toSet()
