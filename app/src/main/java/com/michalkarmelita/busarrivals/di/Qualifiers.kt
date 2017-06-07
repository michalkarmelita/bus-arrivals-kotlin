package com.michalkarmelita.busarrivals.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ForApplication

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ForActivity