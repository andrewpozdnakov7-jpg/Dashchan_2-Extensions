package chan.build

import org.gradle.api.Plugin
import org.gradle.api.Project

class LibraryPlugin implements Plugin<Project> {
	@SuppressWarnings('unused')
	private final LibraryPlugin libraryPlugin = null

	@Override
	void apply(Project project) {
		project.apply plugin: 'com.android.library'
		PluginUtils.configureProject(project)

		def libraryName = project.name.replace('-', '')
		def packageName = "chan.library.$libraryName"
		project.android.namespace = packageName
		def xml = '<?xml version="1.0" encoding="utf-8"?>\n' +
				'<manifest xmlns:android="http://schemas.android.com/apk/res/android" />'
		PluginUtils.configureManifest(project, xml)
	}
}
