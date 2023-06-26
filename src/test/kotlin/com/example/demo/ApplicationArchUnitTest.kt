package com.example.demo

import com.tngtech.archunit.core.domain.JavaClass
import com.tngtech.archunit.core.domain.JavaClasses
import com.tngtech.archunit.core.importer.ClassFileImporter
import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.lang.ArchCondition
import com.tngtech.archunit.lang.ConditionEvents
import com.tngtech.archunit.lang.SimpleConditionEvent
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*
import org.junit.jupiter.api.Test
import org.springframework.modulith.Modulith
import org.springframework.modulith.core.ApplicationModules

class ApplicationArchUnitTest {

    @Test
    fun `should verify app modules`() {
        val appModules = ApplicationModules.of(DemoApplication::class.java)

        appModules.forEach { println(it) }
        // appModules.forEach { module ->
        //
        //     val classes = ClassFileImporter()
        //         .withImportOption(ImportOption.OnlyIncludeTests())
        //         .importPackages(module.basePackage.name)
        //
        //
        //     classes.any { cls -> JavaClass.Predicates.assignableTo(kclass.java).test(cls) }
        //
        // }

        appModules.verify()
    }

    class HaveAtLeastOneClassAnnotatedWith(
        private val annotation: Class<out Annotation>
    ) : ArchCondition<JavaClasses>("asdasdad") {
        override fun check(item: JavaClasses, events: ConditionEvents) {
            val hasAnnotation = item.any { cls -> cls.isAnnotatedWith(annotation) }
            events.add(SimpleConditionEvent(item, hasAnnotation, MSG))
        }

        companion object {
            private const val MSG = "qweweqe"
        }
    }
}
