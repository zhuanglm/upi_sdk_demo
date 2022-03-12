package upidemo.model

data class RequestChargeToken (
    var transaction: Transaction?,
    var urls: Urls?,
    var ext: Ext?
)