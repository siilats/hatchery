package org.duckietown.hatchery.rviz

import com.intellij.openapi.fileTypes.LanguageFileType
import org.duckietown.hatchery.filesystem.Icons
import org.jetbrains.yaml.YAMLLanguage


object RVizFileType : LanguageFileType(YAMLLanguage.INSTANCE) {
  override fun getName() = "rviz_file_name"

  override fun getDescription() = "rviz_file_description"

  override fun getDefaultExtension() = "rviz"

  override fun getIcon() = Icons.ros_file
}