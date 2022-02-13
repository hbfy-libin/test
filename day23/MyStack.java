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

public class MyStack {

    //定义常量表示数组的length(栈的容量)
    final static int I = 5;

    // 提供一个数组来存储栈中的元素
    private Object[] elements;

    // 栈帧（永远指向栈顶部的元素）
    // 每加1个元素，栈帧+1
    // 每减1个元素，栈帧-1
    int index;

    //构造方法

    public MyStack() {
        this.elements = new Object[I];
        this.index=-1;
    }

    public MyStack(Object[] elements, int index) {
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
    public void push(Object ob){
        //如果栈顶index大于常量I则判断栈已满。
        if(this.index > this.elements.length - 1 ){
            System.out.println("栈已满，压栈失败！");
            return;
        }else if (this.index == -1){ //传入第一个元素
            this.elements[0] = ob;
        }
        else {
            //定义用于数组拷贝的一位数组
            Object[] eleTemp1 = new Object[this.elements.length];
            //数组拷贝,每次拷贝临时组数位移一位，总长度为index;
            System.arraycopy(elements,0,eleTemp1,1,index + 1);
            this.elements = eleTemp1;
            //遍历打印数组
            for (int i = 0; i < I; i++) {
                System.out.print(this.elements[i] + "  ");
            }
            System.out.println("数组输出完成！数组长度为" + index);
            return;
        }
    };
    // pop方法（pop方法弹栈）
    // 弹栈表示栈中少一个元素。
    // 但是栈如果已空，弹栈失败。
    // 这个方法的参数以及返回值类型自己定义。

    public void pop(){
        //判断栈是否已空。
        if(index == 0 ){
            System.out.println("弹栈失败，栈已空！");
            return;
        }else {

            //定义用于数组拷贝的一位数组
            Object[] eleTemp1 = new Object[I];
            //数组拷贝,每次拷贝数组位移一位，拷贝的数组长度-1；
            System.arraycopy(elements,0,eleTemp1,I-index+1,index-1);
            elements = eleTemp1;
            //index+1
            index--;
            //遍历打印数组
            for (int i = 0; i < I; i++) {
                System.out.print(this.elements[i] + "  ");
            }
            System.out.println("数组输出完成！数组长度为" + index);
            return;
        }
    }
}
