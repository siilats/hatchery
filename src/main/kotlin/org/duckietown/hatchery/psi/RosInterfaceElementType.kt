package org.duckietown.hatchery.psi

import com.intellij.psi.tree.IElementType
import org.duckietown.hatchery.rosinterface.RosInterfaceLanguage
import org.jetbrains.annotations.NonNls

class RosInterfaceElementType : IElementType {
  constructor(@NonNls debugName: String) : super(debugName, RosInterfaceLanguage)
}