package ai.akun.nukasdk.chatbot.data

import android.app.Application

class Globals : Application() {
    companion object {
        var akunBaseURL: String = ""
        var akunUsername: String = ""
        var akunPassword: String = ""
    }
}