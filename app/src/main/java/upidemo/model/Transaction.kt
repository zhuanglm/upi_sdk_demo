package upidemo.model

data class Transaction (
    var reference: String?,
    var amount : Int,
    var currency: String?,
    var country: String?,
    var auto_capture : Boolean,
    var note: String?
)