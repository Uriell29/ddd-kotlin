package domain.service

object CompetitorPricerService {

    fun Double.discountedBy(discount: Double) =
        this@discountedBy.minus(this@discountedBy.times(discount).div(100))
}
