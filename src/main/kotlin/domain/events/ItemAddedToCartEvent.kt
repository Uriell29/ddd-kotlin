package domain.events

import domain.Price

class ItemAddedToCartEvent(val productName: String, val quantity: Int, val price: Price) : DomainEvent {}
