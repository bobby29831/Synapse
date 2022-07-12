package com.bobby29831.paper.model.context

import org.bukkit.OfflinePlayer
import com.bobby29831.paper.model.context.Context

case class ReportContext(reporter: Option[OfflinePlayer], info: String) extends Context(reporter, info) {

    override def withSupplier(supplier: Option[OfflinePlayer]): ReportContext = ReportContext(supplier, info)

}
