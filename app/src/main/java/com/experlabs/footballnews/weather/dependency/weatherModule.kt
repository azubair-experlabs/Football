package com.experlabs.footballnews.weather.dependency

import com.experlabs.footballnews.weather.repository.WeatherRepository
import com.experlabs.footballnews.weather.ui.WeatherFragment
import com.experlabs.footballnews.portal.viewmodels.PortalViewModel
import com.experlabs.footballnews.weather.viewmodels.WeatherViewModel
import com.experlabs.training.retrofit.RetrofitObject
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val weatherModule = module{
    single {
        RetrofitObject()
    }

    single{
        WeatherRepository(get())
    }

    scope<WeatherFragment> {
        scoped {
            PortalViewModel(get())
        }
    }

    viewModel {
        WeatherViewModel(get())
    }

}