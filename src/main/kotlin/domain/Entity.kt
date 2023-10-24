package domain

interface Entity<T> {
    fun hasSameIdentityAs(other: T): Boolean
}