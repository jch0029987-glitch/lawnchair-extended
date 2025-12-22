package com.jeremy.lawnchair.search.algorithms.engine

import android.content.Context

interface SearchPermission {
    fun checkPermission(context: Context): Any
}
