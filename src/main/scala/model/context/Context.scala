package com.bobby29831
package model.context

import org.bukkit.OfflinePlayer

trait Context(val supplier: Option[OfflinePlayer], val content: String) {

  def hasSupplier: Boolean = supplier.isDefined
  
}