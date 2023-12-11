package com.fazalulabid.internetusagemeter.util

data class Usage(
    var downloads: Long = 0L,
    var uploads: Long = 0L,
    var timeTaken: Long = 0L
)