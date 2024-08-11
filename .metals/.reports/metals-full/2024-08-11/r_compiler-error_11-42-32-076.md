file://<HOME>/Documents/UCSC/YEAR%202/Semester%201/Functional%20Prog./Assignment%208/22001255_2.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file://<HOME>/Documents/UCSC/YEAR%202/Semester%201/Functional%20Prog./Assignment%208/22001255_2.scala
text:
```scala
import scala.io.StdIn

object act82{
    
    val multiple = (n:Int) => {
        if(n%3 == 0){
            println("Multiple of Three")
        }else if (n%5 == 0){
            println("Multiple of Five")
        } else if( n%3==0 && n%5==0){
            println("Multiple of Both Three and Five")
        }else{
            print
        }
    }

    def main(args: Array[String])={
        println("Enter an Integer: ")
        val int = scala.io.StdIn.readInt()
        println("You entered, "+ int +"")
    }
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.core.TypeOps$.dominators$1(TypeOps.scala:248)
	dotty.tools.dotc.core.TypeOps$.approximateOr$1(TypeOps.scala:382)
	dotty.tools.dotc.core.TypeOps$.orDominator(TypeOps.scala:395)
	dotty.tools.dotc.core.Types$OrType.join(Types.scala:3468)
	dotty.tools.dotc.core.Types$OrType.widenUnionWithoutNull(Types.scala:3484)
	dotty.tools.dotc.core.Types$Type.widenUnion(Types.scala:1322)
	dotty.tools.dotc.core.ConstraintHandling.widenOr$1(ConstraintHandling.scala:652)
	dotty.tools.dotc.core.ConstraintHandling.widenInferred(ConstraintHandling.scala:668)
	dotty.tools.dotc.core.ConstraintHandling.widenInferred$(ConstraintHandling.scala:29)
	dotty.tools.dotc.core.TypeComparer.widenInferred(TypeComparer.scala:30)
	dotty.tools.dotc.core.TypeComparer$.widenInferred(TypeComparer.scala:3033)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:1929)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:1935)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:1936)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:1947)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1694)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1701)
	dotty.tools.dotc.typer.Namer.defDefSig(Namer.scala:1792)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:791)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:934)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:814)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:2991)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3016)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3114)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3213)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3259)
	dotty.tools.dotc.typer.Typer.typedBlockStats(Typer.scala:1161)
	dotty.tools.dotc.typer.Typer.typedBlock(Typer.scala:1165)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3058)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3115)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedFunctionValue(Typer.scala:1630)
	dotty.tools.dotc.typer.Typer.typedFunction(Typer.scala:1381)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3060)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3115)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3303)
	dotty.tools.dotc.typer.Namer.typedAheadExpr$$anonfun$1(Namer.scala:1656)
	dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1646)
	dotty.tools.dotc.typer.Namer.typedAheadExpr(Namer.scala:1656)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1$$anonfun$1(Namer.scala:1909)
	dotty.tools.dotc.inlines.PrepareInlineable$.dropInlineIfError(PrepareInlineable.scala:243)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1(Namer.scala:1909)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:1917)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:1935)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:1936)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:1947)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1694)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1701)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:787)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:934)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:814)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:2991)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3016)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3114)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3213)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3259)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:2669)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3038)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3042)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3114)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3213)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3259)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2812)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3083)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3115)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3303)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:44)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$adapted$1(TyperPhase.scala:50)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:440)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:50)
	dotty.tools.dotc.typer.TyperPhase.runOn$$anonfun$3(TyperPhase.scala:84)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:84)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:246)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:262)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:270)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:279)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:71)
	dotty.tools.dotc.Run.compileUnits(Run.scala:279)
	dotty.tools.dotc.Run.compileSources(Run.scala:194)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticdbTextDocument$$anonfun$1(ScalaPresentationCompiler.scala:238)
```
#### Short summary: 

java.lang.AssertionError: assertion failed