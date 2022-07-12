package com.bobby29831.paper.model.context

import org.bukkit.OfflinePlayer

trait Context(val supplier: Option[OfflinePlayer], val content: String) {

    def ifSupplierPresent(function: (OfflinePlayer, String) => Unit): Unit = {
        if supplier.isDefined then function(supplier.get, content)
    }

    def withSupplier(supplier: Option[OfflinePlayer]): Context

}

