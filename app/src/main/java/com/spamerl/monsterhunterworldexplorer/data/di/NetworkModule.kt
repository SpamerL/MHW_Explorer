package com.spamerl.monsterhunterworldexplorer.data.di

import android.content.Context
import com.spamerl.monsterhunterworldexplorer.data.remote.api.MhwApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkhttpClient(@ApplicationContext context: Context): OkHttpClient =
        OkHttpClient.Builder()
            .build()

    @Provides
    @Singleton
    fun provideRetrofitBuilder(okHttpClient: OkHttpClient): Retrofit.Builder =
        Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())

    @Provides
    @Singleton
    fun provideMHWApi(retrofit: Retrofit.Builder): MhwApi =
        retrofit.baseUrl(MhwApi.BASE_URL).build().create(MhwApi::class.java)
}