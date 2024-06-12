package com.aliyayman.nfcapp

enum class NFCStatus {
    NoOperation,
    Tap,
    Process,
    Confirmation,
    Read,
    Write,
    NotSupported,
    NotEnabled,
}