package upidemo.model

class RequestAccessToken {
    var token_type: String? = null
    fun setTokenType(type: String?): RequestAccessToken {
        token_type = type
        return this
    }
}