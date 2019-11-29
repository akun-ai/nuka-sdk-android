package ai.akun.nukasdk.chatbot.presentation.chatmessage.holder

import ai.akun.nukasdk.chatbot.presentation.main.ChatBotViewModel
import ai.akun.nukasdk.chatbot.presentation.main.ChatMessage
import ai.akun.nukasdk.chatbot.presentation.shared.ImageLoader
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_row_received_gif_chat_message.view.*

class ReceivedGifChatMessageViewHolder(itemView: View) : ChatMessageViewHolder(itemView) {

    override fun bind(chatMessage: ChatMessage) {
        ImageLoader.load(chatMessage.imageUri!!, itemView.gif)
    }

    override fun setViewModel(chatBotViewModel: ChatBotViewModel) { }
}