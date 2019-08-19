package com.bookislife.kotlinbyexample._19_annotation

@Target(AnnotationTarget.PROPERTY)
annotation class JsonField(val name: String)
