package com.example.note.Class

import kotlinx.serialization.Serializable

@Serializable
class Class_Notes (val ID_заметки: Int, val ДляЧего: String = "", val Описание: String = "", val id_пользователя: String = "")