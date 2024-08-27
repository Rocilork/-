package com.example.note.Class

import kotlinx.serialization.Serializable

@Serializable
data class User (val ID_пользователя: String = "", val ФИО: String = "")
//@Serializable
//data class User (val id: Int = 0, val текст: String = "")