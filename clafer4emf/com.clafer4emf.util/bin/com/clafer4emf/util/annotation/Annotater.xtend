package com.clafer4emf.util.annotation

import java.util.AbstractMap
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EcoreFactory

class Annotater {
	val source = "clafer4emf"
	public val ENUM_CLASS = "enum.class"
	public val ENUM_LITERAL = "enum.literal"
	public val NONE = "none"

	def addAnnotation(EModelElement element, String key, String value) {
		val annotation = EcoreFactory.eINSTANCE.createEAnnotation
		annotation.source = source
		annotation.details.put(key, value)
		element.getEAnnotations.add(annotation)
	}

	def markEnum(EModelElement element, String name) {
		addAnnotation(
			element,
			ENUM_CLASS,
			name
		)
	}

	def getEnumMark(EModelElement element) {
		val ann = element.getEAnnotation(source)
		if (ann == null) {
			return null
		}

		val value = ann.details.get(ENUM_CLASS)
		if (value == null) {
			return null
		}

		return new AbstractMap.SimpleEntry(ENUM_CLASS, value)
	}

	def markEnumLiteral(EModelElement element, String name) {
		addAnnotation(element, ENUM_LITERAL, name)
	}

	def getEnumLiteralMark(EModelElement element) {
		val ann = element.getEAnnotation(source)
		if (ann == null) {
			return null
		}

		val value = ann.details.get(ENUM_LITERAL)
		if (value == null) {
			return null
		}

		return new AbstractMap.SimpleEntry(ENUM_LITERAL, value)
	}
}
