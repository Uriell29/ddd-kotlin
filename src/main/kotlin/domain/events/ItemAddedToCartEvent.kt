package domain.events

class ItemAddedToCartEvent(val productName: String, val quantity: Int) : DomainEvent {}
