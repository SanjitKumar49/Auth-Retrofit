package com.sanjit49.simpleapp.API

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    // This annotation specifies that the HTTP method
    // is GET and the endpoint URL is "jokes/random".
    @GET("jokes/random")
    // This method returns a Call object with a generic
    // type of DataModel, which represents
    // the data model for the response.
    fun getjokes(): Call<DataModel>
}