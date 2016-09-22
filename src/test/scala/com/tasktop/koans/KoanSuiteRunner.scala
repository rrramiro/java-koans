package com.tasktop.koans

import org.junit.runner.notification.RunNotifier
import org.junit.runners.Suite

import scala.collection.mutable

class KoanSuiteRunner(val klass: Class[_]) extends Suite(klass, new KoanRunnerBuilder) {
  val notifiers = mutable.ListBuffer[RunNotifier]()

  private val runListener = new KoanRunListener(notifiers.foreach(_.pleaseStop()))

  override def run(notifier: RunNotifier) {
    notifiers += notifier
    notifier.addListener(runListener)
    super.run(notifier)
  }
}
