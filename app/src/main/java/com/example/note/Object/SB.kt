package com.example.note.Object

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime

object SB {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://ovjafohkkdthtawntksj.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im92amFmb2hra2R0aHRhd250a3NqIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjQ0MzA2NDQsImV4cCI6MjA0MDAwNjY0NH0.rf0c2C5GoXvl9u_UHMJNMRNmTIhwxSgNMyRh7IKR8X0"
    ) {
        install(Auth)
        install(Postgrest)
        install(Realtime)
        //install other modules
    }
    public fun getClient(): SupabaseClient {
        return supabase
    }
}