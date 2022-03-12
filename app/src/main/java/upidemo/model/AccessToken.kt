package upidemo.model

data class AccessToken (
    var access_token: String,
    var token_type: String?,
    var expiry: Long ,
    var permission: List<String>?
)