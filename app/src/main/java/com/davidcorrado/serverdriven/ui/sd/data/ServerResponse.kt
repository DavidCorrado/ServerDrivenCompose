package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

@JsonClass(generateAdapter = true)
data class ServerResponse(val items: List<Any>) {
    fun toJson(): String {
        val moshi = Moshi.Builder().build()
        val jsonAdapter: JsonAdapter<ServerResponse> = moshi.adapter(ServerResponse::class.java)
        return jsonAdapter.toJson(this)
    }
}