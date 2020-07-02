package ai.akun.nuka


import ai.akun.nukasdk.chatbot.presentation.main.ChatBotActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openChatBot.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("akunBaseURL", "https://mychatbot.akun.ai/")
            bundle.putString("akunUsername", "akun_username")
            bundle.putString("akunPassword", "akun_password")

            val intent = Intent (this, ChatBotActivity::class.java)
            intent.putExtras(bundle)

            startActivity(intent)
        }
    }

}