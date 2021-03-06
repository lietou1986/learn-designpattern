package com.pattern.intro.afactory;
/**
 * 简单工厂方法获取操作对象
 * @author xuxhm
 *
 */
public class OperationFactory {
	public static Operation createOperate(char operate){
		Operation oper = null;
		switch(operate){
		case '+':
			oper = new OperationAdd();
			break;
		case '-':
			oper = new OperationSub();
			break;
		}
		return oper;
	}
	
}
