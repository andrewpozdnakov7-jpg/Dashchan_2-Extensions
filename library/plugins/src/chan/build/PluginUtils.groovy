package chan.build

import org.gradle.api.JavaVersion
import org.gradle.api.Project

class PluginUtils {
	static void configureProject(Project project) {
		project.android {
			compileSdk 36
			buildToolsVersion '36.0.0'

			defaultConfig {
				minSdk 30
				targetSdk 30
			}

			buildFeatures {
				aidl true
				buildConfig true
			}

			sourceSets.main {
				manifest.srcFile getManifestFile(project)
				java.srcDirs = ['src']
				resources.srcDirs = []
				aidl.srcDirs = ['src']
				res.srcDirs = ['res']
				assets.srcDirs = ['assets']
			}

			compileOptions {
				sourceCompatibility JavaVersion.VERSION_1_8
				targetCompatibility JavaVersion.VERSION_1_8
			}
		}
	}

	static void throwKeyNotFound(String key) {
		throw new NullPointerException("$key is not defined")
	}

	static File getManifestFile(Project project) {
		return new File(project.buildDir, 'generated/AndroidManifest.xml')
	}

	static void configureManifest(Project project, String xml) {
		def manifestFile = getManifestFile(project)
		if (!manifestFile.exists()) {
			// Fixes IntelliJ Android plugin error
			manifestFile.parentFile.mkdirs()
			manifestFile.write(xml)
		}
		project.preBuild.dependsOn(project.task('generateManifest', type: GenerateFileTask) {
			inputText = xml
			outputFile = manifestFile
		})
	}
}
