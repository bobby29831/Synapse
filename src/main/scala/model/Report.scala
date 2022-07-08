package com.bobby29831
package model

import model.context.{ Context, ChatContext, ReportContext, MsgContext }

import org.bukkit.OfflinePlayer

import java.util.{Date, UUID}

class Report
            (
              val reporter: OfflinePlayer,
              val reported: OfflinePlayer,
              val context: List[Context] = List(),
              val created: Date = Date(),
              val uniqueId: UUID = UUID.randomUUID()
            ) {

  def context: (List[ReportContext], List[ChatContext], List[MsgContext]) = {
    context match
      case ReportContext =>
        
  }

}
