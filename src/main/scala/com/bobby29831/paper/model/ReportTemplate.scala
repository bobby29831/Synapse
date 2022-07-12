package com.bobby29831.paper.model

import com.bobby29831.paper.model.report.Report
import com.bobby29831.paper.model.context.ReportContext
import org.bukkit.OfflinePlayer
import com.bobby29831.paper.model.report.ReportStatus
import com.moandjiezana.toml.Toml
import java.io.File
import com.bobby29831.paper.SynapsePlugin

class ReportTemplate(private val name: String, private val content: String) {
  
    def asReport(supplier: Option[OfflinePlayer] = None, status: ReportStatus = ReportStatus.Unread): Report = Report(
        status,
        List(ReportContext(supplier, content))
    )

}

object ReportTemplate {

    def fromFileKey(file: File, key: String): Option[ReportTemplate] = {
        val templates = Toml().read(file).getTables("template")
        templates.forEach(toml => {
            if (toml.getString("name") == key) {
                return Some(ReportTemplate(toml.getString("name"), toml.getString("content")))
            }
        })
        None
    }

}
