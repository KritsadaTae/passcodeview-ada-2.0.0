import io.grpc.internal.SharedResourceHolder.release

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("maven-publish")  // ใช้สำหรับเผยแพร่ Dependency
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.KritsadaTae" // GitHub Username ของคุณ
            artifactId = "passcodeview"        // ชื่อ Library
            version = "1.0.0"              // เวอร์ชันของ Library

            // ระบุไฟล์ .aar ที่ต้องการเผยแพร่
            artifact("libs/passcodeview-2.0.0.aar") {
                extension = "aar"          // ระบุชนิดไฟล์
            }
        }
    }
}