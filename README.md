# Setup

This demo project has 3 modules:
- module1 (declared as shared module)
- module2 (depends on module1)
- module3 (depends on module1 and module2)

# Case 1

Run `./gradlew test`

Result: test ApplicationArchUnitTest that verifies modules passed 

# Case 2

Run `./gradlew bootRun`

Result: service starts

# Case 3

Run `./gradlew assemble && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar`

Expected result: service starts (as in case 2)

Actual result: service does not start with the following exception:

```java
java.lang.RuntimeException: java.util.concurrent.ExecutionException: java.lang.IllegalArgumentException: Module module1 does not exist!
    at org.springframework.modulith.runtime.autoconfigure.SpringModulithRuntimeAutoConfiguration.lambda$toSupplier$3(SpringModulithRuntimeAutoConfiguration.java:167) ~[spring-modulith-runtime-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.modulith.runtime.ApplicationModulesRuntime.get(ApplicationModulesRuntime.java:56) ~[spring-modulith-runtime-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.modulith.runtime.autoconfigure.SpringModulithRuntimeAutoConfiguration.lambda$applicationModuleInitializingListener$2(SpringModulithRuntimeAutoConfiguration.java:80) ~[spring-modulith-runtime-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172) ~[spring-context-6.0.10.jar!/:6.0.10]
    at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165) ~[spring-context-6.0.10.jar!/:6.0.10]
    at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:143) ~[spring-context-6.0.10.jar!/:6.0.10]
    at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:437) ~[spring-context-6.0.10.jar!/:6.0.10]
    at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:370) ~[spring-context-6.0.10.jar!/:6.0.10]
    at org.springframework.boot.context.event.EventPublishingRunListener.started(EventPublishingRunListener.java:103) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at org.springframework.boot.SpringApplicationRunListeners.lambda$started$5(SpringApplicationRunListeners.java:76) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at java.base/java.lang.Iterable.forEach(Iterable.java:75) ~[na:na]
    at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:112) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at org.springframework.boot.SpringApplicationRunListeners.started(SpringApplicationRunListeners.java:76) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.1.jar!/:3.1.1]
    at com.example.demo.DemoApplicationKt.main(DemoApplication.kt:15) ~[classes!/:0.0.1-SNAPSHOT]
    at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104) ~[na:na]
    at java.base/java.lang.reflect.Method.invoke(Method.java:578) ~[na:na]
    at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[demo-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
    at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[demo-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
    at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[demo-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
    at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[demo-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
    Caused by: java.util.concurrent.ExecutionException: java.lang.IllegalArgumentException: Module module1 does not exist!
    at java.base/java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:na]
    at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:191) ~[na:na]
    at org.springframework.modulith.runtime.autoconfigure.SpringModulithRuntimeAutoConfiguration.lambda$toSupplier$3(SpringModulithRuntimeAutoConfiguration.java:165) ~[spring-modulith-runtime-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    ... 23 common frames omitted
    Caused by: java.lang.IllegalArgumentException: Module module1 does not exist!
    at org.springframework.modulith.core.ApplicationModules.getRequiredModule(ApplicationModules.java:496) ~[spring-modulith-core-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
    at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:1006) ~[na:na]
    at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
    at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
    at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921) ~[na:na]
    at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
    at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682) ~[na:na]
    at org.springframework.modulith.core.ApplicationModules.of(ApplicationModules.java:523) ~[spring-modulith-core-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.modulith.core.ApplicationModules.lambda$of$3(ApplicationModules.java:184) ~[spring-modulith-core-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at java.base/java.util.HashMap.computeIfAbsent(HashMap.java:1228) ~[na:na]
    at org.springframework.modulith.core.ApplicationModules.of(ApplicationModules.java:179) ~[spring-modulith-core-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.modulith.core.ApplicationModules.of(ApplicationModules.java:162) ~[spring-modulith-core-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.modulith.runtime.autoconfigure.SpringModulithRuntimeAutoConfiguration$ApplicationModulesBootstrap.initializeApplicationModules(SpringModulithRuntimeAutoConfiguration.java:143) ~[spring-modulith-runtime-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at org.springframework.modulith.runtime.autoconfigure.SpringModulithRuntimeAutoConfiguration.lambda$modulesRuntime$0(SpringModulithRuntimeAutoConfiguration.java:70) ~[spring-modulith-runtime-1.0.0-SNAPSHOT.jar!/:1.0.0-SNAPSHOT]
    at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317) ~[na:na]
    at java.base/java.lang.Thread.run(Thread.java:1623) ~[na:na]
```
