package upidemo.model

data class ChargeToken (
    var `object`: String?,
    var id: String?,
    var reference: String,
    var amount: Int,
    var amount_captured: Int,
    var amount_refunded: Int,
    var currency: String?,
    var time_created: String?,
    var time_captured: String?,
    var auto_capture : Boolean,
    var status: String?,
    var country: String?,
    var payment: Payment?,
    var charge_token: String?
)