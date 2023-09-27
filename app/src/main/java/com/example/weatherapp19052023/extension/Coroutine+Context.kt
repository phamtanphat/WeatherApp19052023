package com.example.weatherapp19052023.extension

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend inline fun CoroutineScope.launchIO(crossinline scope: suspend CoroutineScope.() -> Unit) {
    withContext(Dispatchers.IO) { scope.invoke(this) }
}

suspend inline fun CoroutineScope.launchOnMain(crossinline scope: suspend CoroutineScope.() -> Unit) {
    withContext(Dispatchers.Main) { scope.invoke(this) }
}