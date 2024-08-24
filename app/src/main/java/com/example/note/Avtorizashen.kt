package com.example.note

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.note.Object.SB
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.postgrest
import kotlinx.coroutines.launch
import org.json.JSONException

class Avtorizashen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avtorizashen)



        try {
            lifecycleScope.launch {
                val city = SB.getClient().from("Пользователь").select()
                Log.e("!!!!!", city.data)
            }
        }catch (ex: JSONException){
            Log.e("!!!", ex.message.toString())
        }
    }
}