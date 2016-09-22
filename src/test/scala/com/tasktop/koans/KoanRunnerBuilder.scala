package com.tasktop.koans

import org.junit.runner.{RunWith, Runner}
import org.junit.runners.model.RunnerBuilder

private class KoanRunnerBuilder() extends RunnerBuilder {
  def runnerForClass(testClass: Class[_]): Runner = {
    if (testClass.isAnnotationPresent(classOf[RunWith])) {
      if (testClass.getAnnotation(classOf[RunWith]).value eq classOf[KoanRunner])
        return new KoanRunner(testClass)
    }
    throw new IllegalStateException(s"${testClass.getName} should have a @RunWith annotation with supported Koan Runners")
  }
}
