package com.bobby29831.paper.model.context

import org.bukkit.OfflinePlayer
import com.bobby29831.paper.model.context.Context

case class ChatContext(sender: Option[OfflinePlayer], chat: String) extends Context(sender, chat) {

    override def withSupplier(supplier: Option[OfflinePlayer]): ChatContext = ChatContext(supplier, chat)


}
