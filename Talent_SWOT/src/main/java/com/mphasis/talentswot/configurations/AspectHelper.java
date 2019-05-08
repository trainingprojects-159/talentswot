package com.mphasis.talentswot.configurations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectHelper {

	@Before("execution(* com.mphasis.talentswot.*.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		System.out.println("Before Method "+joinPoint.getSignature());
		System.out.println(joinPoint.getSignature().getName());
		
	}
	
	@After("execution(* com.mphasis.talentswot.*.*.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		System.out.println("After Method "+joinPoint.getSignature());
		System.out.println(joinPoint.getSignature().getName());
		
	}
}
