/*编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。

		public class MyStack{ // 栈类

			// 提供一个数组来存储栈中的元素
			Object[] elements;

			// 栈帧（永远指向栈顶部的元素）
			// 每加1个元素，栈帧+1
			// 每减1个元素，栈帧-1
			int index;

			// 构造方法
			// 构造方法是不是应该给一维数组一个初始化容量。

			// push方法（push方法压栈）
			// 压栈表示栈中多一个元素。
			// 但是栈如果已满，压栈失败。
			// 这个方法的参数以及返回值类型自己定义。

			// pop方法（pop方法弹栈）
			// 弹栈表示栈中少一个元素。
			// 但是栈如果已空，弹栈失败。
			// 这个方法的参数以及返回值类型自己定义。

		}

		main(){
			测试...
		}*/
package com.hbfybj.javase.study.day23;

public class MyStackDu {
    //定义常量表示数组的length(栈的容量)
    final static int I = 5;

    // 提供一个数组来存储栈中的元素
    private Object[] elements;

    // 栈帧（永远指向栈顶部的元素）
    // 每加1个元素，栈帧+1
    // 每减1个元素，栈帧-1
    int index;

    //构造方法

    public MyStackDu() {
        this.elements = new Object[I];
        this.index = -1;
    }

    public MyStackDu(Object[] elements, int index) {
        //重写构造方法，创建一位数组，length = index
        this.elements = new Object[I];
        this.index = -1;
    }

    //set and get 方法

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // push方法（push方法压栈）
    // 压栈表示栈中多一个元素。
    // 但是栈如果已满，压栈失败。
    // 这个方法的参数以及返回值类型自己定义。
    //注：栈中先压后出，后压先出，最先压的在最下面。
    public void push(Object ob){
        //如果栈顶index大于常量I则判断栈已满。
        if(this.index >= this.elements.length - 1 ){
            System.out.println("栈已满，压栈失败！");
            return;
        }else {
            //数组传入ob值。
            this.elements[++index] = ob;
            //遍历打印数组
            for (int i = 0; i < I; i++) {
                System.out.print(this.elements[i] + "  ");
            }
            System.out.println("压栈成功，压入元素为" + ob + "完成！数组长度为" + index);
            return;
        }
    };
    // pop方法（pop方法弹栈）
    // 弹栈表示栈中少一个元素。
    // 但是栈如果已空，弹栈失败。
    // 这个方法的参数以及返回值类型自己定义。
    //注：栈中先压后出，后压先出，最先压的在最下面。
    public void pop(){
        //判断栈是否已空。
        if(index < 0 ){
            System.out.println("弹栈失败，栈已空！");
            return;
        }else {
            System.out.println("弹栈成功，弹出元素为" + this.elements[index] + "完成！数组长度为" + --index);
            this.elements[index + 1] = null;
            //遍历打印数组
            for (int i = 0; i < I; i++) {
                System.out.print(this.elements[i] + "  ");
            }
            System.out.println("");
            return;
        }
    }
}
