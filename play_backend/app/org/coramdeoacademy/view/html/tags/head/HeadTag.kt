package org.coramdeoacademy.view.html.tags.head

import org.coramdeoacademy.view.html.attributes.Attribute
import org.coramdeoacademy.view.html.tags.TagWithText

abstract class HeadTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)