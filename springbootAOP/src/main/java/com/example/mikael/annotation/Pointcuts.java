/**
 * projectName: cloud2020 fileName: Piontcut.java packageName: com.example.mikael.annotation date:
 * 2020-10-22 copyright(c) 2017-2020 xxx公司
 */
package com.example.mikael.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version: V1.0
 * @author: mikael
 * @className: Piontcut
 * @packageName: com.example.mikael.annotation
 * @description:
 * @data: 2020-10-22
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Pointcuts {

}
