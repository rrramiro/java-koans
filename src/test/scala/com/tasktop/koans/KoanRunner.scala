package com.tasktop.koans

import org.junit.runners.BlockJUnit4ClassRunner
import org.junit.runners.model.FrameworkMethod
import java.lang.reflect.Method
import java.util
import scala.collection.JavaConverters.collectionAsScalaIterableConverter
import scala.collection.JavaConverters.seqAsJavaListConverter

class KoanRunner(val klass: Class[_]) extends BlockJUnit4ClassRunner(klass) {
  override protected def computeTestMethods: util.List[FrameworkMethod] = {
    sortMethodsBySourceOrder(getTestClass.getJavaClass, super.computeTestMethods.asScala.map{_.getMethod}).map{new FrameworkMethod(_)}.asJava
  }

  private def sortMethodsBySourceOrder(testClass: Class[_], methods: Iterable[Method]): Seq[Method] = {
    val classMethods = testClass.getDeclaredMethods.map(_.getName)
    methods.toList.sortWith{(methodA: Method, methodB: Method) => classMethods.indexOf(methodA.getName) < classMethods.indexOf(methodB.getName)}
  }

  override protected def validateZeroArgConstructor(errors: util.List[Throwable]) { }
}


