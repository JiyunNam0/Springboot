package com.study.security_jiyun.handler.aop.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) //실행중에 적용
@Target({ TYPE, METHOD }) //타입, 메소드 위에 달겠다
public @interface Timer {

}
