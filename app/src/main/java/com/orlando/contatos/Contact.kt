package com.orlando.contatos

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contact (
    var name: String,
    var phone:String,
    var photo:String
): Parcelable