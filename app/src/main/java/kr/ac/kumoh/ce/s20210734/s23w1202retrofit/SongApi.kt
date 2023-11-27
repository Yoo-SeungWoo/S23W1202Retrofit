package kr.ac.kumoh.ce.s20210734.s23w1202retrofit

import retrofit2.http.GET

interface SongApi {
    //동기 프로그래밍
    @GET("song")
    suspend fun getSongs(): List<Song>
}