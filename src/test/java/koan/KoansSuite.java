package koan;

import advanced.AboutMocks;
import beginner.*;
import com.tasktop.koans.KoanSuiteRunner;
import intermediate.*;
import java7.*;
import java8.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith( KoanSuiteRunner.class )
@Suite.SuiteClasses( {
    AboutKoans.class,
    AboutAssertions.class,
    beginner.AboutEquality.class,
    AboutStrings.class,
    AboutArithmeticOperators.class,
    AboutConditionals.class,
    AboutLoops.class,
    AboutPrimitives.class,
    AboutObjects.class,
    AboutInheritance.class,
    AboutCasting.class,
    AboutConstructors.class,
    AboutEnums.class,
    AboutExceptions.class,
    AboutMethodPreference.class,
    AboutBitwiseOperators.class,
    AboutArrays.class,
    AboutVarArgs.class,
    AboutAutoboxing.class,
    AboutCollections.class,
    AboutComparison.class,
    AboutDates.class,
    intermediate.AboutEquality.class,
    AboutFileIO.class,
    AboutInnerClasses.class,
    AboutLocale.class,
    AboutRegularExpressions.class,
    AboutSerialization.class,
    AboutMocks.class,
    AboutJava7LiteralsEnhancements.class,
    AboutStringsInSwitch.class,
    AboutDiamondOperator.class,
    AboutTryWithResources.class,
    AboutRequireNotNull.class,
    AboutDefaultMethods.class,
    AboutOptional.class,
    AboutLocalTime.class,
    AboutLambdas.class,
    AboutStreams.class,
    AboutMultipleInheritance.class
})
public class KoansSuite {
}
