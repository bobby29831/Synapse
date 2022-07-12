package com.bobby29831.paper.model.report

import com.bobby29831.paper.model.context.Context
import com.bobby29831.paper.model.report.ReportStatus
import scala.reflect.ClassTag

class Report(private val status: ReportStatus = ReportStatus.Unread, private val context: List[Context] = List()) {

    def contextOf[T: ClassTag]: List[T] = {
        this.context.flatMap {
            case t: T => Some(t)
            case _ => None
        }
    }
    
}   