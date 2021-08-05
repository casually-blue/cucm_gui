package org.coramdeoacademy.view.html.tags.body

import org.coramdeoacademy.view.html.attributes.Attribute
import org.coramdeoacademy.view.html.tags.TagWithText

abstract class BodyTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)