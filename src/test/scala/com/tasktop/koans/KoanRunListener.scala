package com.tasktop.koans

import com.google.common.base.Charsets
import org.fusesource.jansi.Ansi
import org.fusesource.jansi.Ansi.Color._
import org.junit.runner.Result
import org.junit.runner.notification.Failure
import org.junit.runner.notification.RunListener

import scala.io.Source
import scala.language.reflectiveCalls

class KoanRunListener(pleaseStop: => Unit) extends RunListener {
  @throws[Exception]
  override def testFailure(failure: Failure) {
    new PathToEnlightenment(failure).getPath.foreach(println)
    pleaseStop
  }

  @throws[Exception]
  override def testRunFinished(result: Result) {
    getEnlightenment(result).foreach(println)
  }

  def getEnlightenment(result: Result): Seq[String] = {
    def aZenLikeStatement() = result.getFailureCount % 10 match {
      case 0 =>
        "mountains are merely mountains"
      case 1 =>
        "learn the rules so you know how to break them properly"
      case 2 =>
        "learn the rules so you know how to break them properly"
      case 3 =>
        "remember that silence is sometimes the best answer"
      case 4 =>
        "remember that silence is sometimes the best answer"
      case 5 =>
        "sleep is the best meditation"
      case 6 =>
        "sleep is the best meditation"
      case 7 =>
        "when you lose, don't lose the lesson"
      case 8 =>
        "when you lose, don't lose the lesson"
      case _ =>
        "things are not what they appear to be: nor are they otherwise"
    }
    if (result.wasSuccessful){
      getEnlightenmentIcon
    } else{
      Seq(
        color(GREEN, ""),
        color(GREEN, aZenLikeStatement()),
        color(GREEN, s"You are progressing. ${result.getRunCount} koans completed."),
        color(BLACK, "")
      )
    }
  }

  private def getEnlightenmentIcon: Seq[String] = {
    Source.fromInputStream(this.getClass.getResourceAsStream("/enlightenment.txt"))(Charsets.UTF_8).getLines().map(line => color(CYAN, line)).toSeq
  }

  private def color(color: Ansi.Color, toColor: String): String = {
    if (Option(System.getProperty("enable.ansi")).isDefined) Ansi.ansi.eraseScreen.fg(color).a(toColor).toString else toColor
  }
}

