package com.example.note.Object

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime

object SB {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://yraepbbfmolqzpyvigsh.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InlyYWVwYmJmbW9scXpweXZpZ3NoIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjQ3NjU1ODEsImV4cCI6MjA0MDM0MTU4MX0.NlkLylntb92woVHgdoYDBmzePtNWFTBrFDN015r9BBI"
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