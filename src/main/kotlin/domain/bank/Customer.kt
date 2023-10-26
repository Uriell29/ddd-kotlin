package domain.bank

import java.util.UUID

data class Customer(var id:UUID, var address: Address, val accounts: List<Account>) {

    fun updateAddress(newAddress: Address) {
        address = newAddress
        accounts.forEach { it.address = newAddress }
    }
}
