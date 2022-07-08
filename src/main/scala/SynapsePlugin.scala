package com.bobby29831

import model.Report

import com.github.benmanes.caffeine.cache.{Cache, Caffeine}
import org.bukkit.plugin.java.JavaPlugin

import java.util.UUID

class SynapsePlugin extends JavaPlugin {

  lazy val activeReports: Cache[UUID, Report] = Caffeine.newBuilder()
    .maximumSize(10000)
    .build()

  override def onEnable(): Unit = {
    activeReports.invalidateAll()
  }

}
