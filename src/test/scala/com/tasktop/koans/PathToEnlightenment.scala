package com.tasktop.koans

import com.google.common.base.Charsets
import org.fusesource.jansi.Ansi
import org.junit.runner.notification.Failure
import java.io.File
import java.io.IOException
import org.fusesource.jansi.Ansi.Color._
import scala.io.Source

class PathToEnlightenment(val firstFailure: Failure) {
  def getPath: Seq[String] = (observe() +: encourage()) ++ guideThroughError()

  private def observe(): String = {
    color(RED, firstFailure.getDescription.getTestClass.getSimpleName + "#" + firstFailure.getDescription.getMethodName + " has damaged your karma.")
  }

  private def encourage(): Seq[String] = Seq(
    color(BLACK, ""),
    "The Master says:",
    color(CYAN, "  You have not yet reached enlightenment."),
    {
      val lastEqualFails: Int = countEqualLastEntries(getLastFailures, firstFailure.getDescription.getDisplayName)
      if (lastEqualFails >= 5) color(CYAN, "  I sense frustration. Do not be afraid to ask for help.")
      else if (lastEqualFails >= 2) color(CYAN, "  Do not lose hope.")
      else ""
    }
  )

  private def countEqualLastEntries(failures: Seq[String], failureName: String): Int = {
    val reverseFailures = failures.reverse
    var count: Int = 0
    var i: Int = 0
    while (i < reverseFailures.size) {
        if (reverseFailures(i) == failureName) count += 1
        else return count
      i += 1
    }
    count
  }

  private def guideThroughError(): Seq[String] = Seq(
    color(BLACK, ""),
    "The answers you seek...",
    color(RED, "  " + firstFailure.getException),
    color(BLACK, ""),
    "Please meditate on the following code:",
    color(RED, "  " + firstFailure.getDescription)
  )

  private def color(color: Ansi.Color, toColor: String): String = {
    if (Option(System.getProperty("enable.ansi")).isDefined) Ansi.ansi.eraseScreen.fg(color).a(toColor).toString else toColor
  }

  private def getLastFailures = {
    Source.fromFile(getTmpFile)(Charsets.UTF_8).getLines().toSeq
  }

  @throws[IOException]
  private def getTmpFile: File = {
    var tmpFolder: String = System.getProperty("java.io.tmpdir")
    if (!tmpFolder.endsWith(File.separator)) tmpFolder = tmpFolder + File.separator
    val file: File = new File(tmpFolder, "com.tasktop.koans.progress.txt")
    file.createNewFile
    file
  }
}
