package upidemo.model

import com.citconpay.sdk.data.api.response.CitconApiResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface CitconUPIAPIService {
    @POST("access-tokens")
    suspend fun getAccessToken(
        @Header("Authorization") auth: String?,
        @Header("Content-Type") contentType: String?,
        @Body type: RequestAccessToken?
    ): CitconApiResponse<AccessToken>

    @POST("charges")
    suspend fun getChargeToken(
        @Header("Authorization") auth: String?,
        @Header("Content-Type") contentType: String?,
        @Body request: RequestChargeToken?
    ): CitconApiResponse<ChargeToken>
}