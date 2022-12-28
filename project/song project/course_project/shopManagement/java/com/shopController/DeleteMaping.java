package com.shopController;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;

@Retention(CLASS)
public @interface DeleteMaping {

	String value();

}
