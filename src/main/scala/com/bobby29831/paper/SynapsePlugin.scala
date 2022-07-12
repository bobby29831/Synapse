package com.bobby29831.paper

import org.bukkit.plugin.java.JavaPlugin
import com.bobby29831.paper.model.ReportTemplate
import java.io.File
import com.moandjiezana.toml.Toml
import scala.collection.mutable.ArraySeq

class SynapsePlugin extends JavaPlugin {

    lazy val templates: ArraySeq[ReportTemplate] = populateTemplates()

    override def onEnable(): Unit = {
        
        

    }

    private def populateTemplates(): ArraySeq[ReportTemplate] = {
        val file = File(getDataFolder(), "templates.toml")
        val templates = Toml().read(file).getTables("template")
        val seq: ArraySeq[ReportTemplate] = ArraySeq()

        templates.forEach(toml => {
            val template = ReportTemplate.fromFileKey(file, toml.getString("name"))
            seq :+ template
        })

        return seq
    }

}