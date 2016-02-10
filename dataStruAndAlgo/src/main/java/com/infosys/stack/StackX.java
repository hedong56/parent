package com.infosys.stack;

/**
 * 用数组模拟栈
 * @author hedong
 * @date 2016年2月5日 下午9:32:14
 * @modifyNote
 * @version 1.0
 */
public class StackX<E> {
	
	private int maxSize;
	private E[] stackArray;
	private int top;
	
	@SuppressWarnings("unchecked")
	public StackX(int s){
		this.maxSize=s;
		//泛型数组
		this.stackArray=(E[])(new Object[this.maxSize]);
		this.top=-1;
	}
	
	/**
	 * 添加一个元素到栈中
	 * @Description
	 * @author hedong
	 * @date 2016年2月5日 下午9:41:54
	 * @modifyNote 
	 * @param j
	 * @throws Exception 
	 */
	public void push(E j) throws Exception{
		if(!this.isFull()){
			this.stackArray[++top]=j;
		}else{
			throw new Exception("栈已满！");
		}
	}
	
	/**
	 * 从栈取出一个元素
	 * @Description
	 * @author hedong
	 * @date 2016年2月5日 下午9:42:13
	 * @modifyNote 
	 * @return
	 * @throws Exception 
	 */
	public E pop() throws Exception{
		if(!this.isEmpty()){
			return this.stackArray[top--];
		}else{
			throw new Exception("栈已空！");
		}
	}
	
	/**
	 * 查看当前元素
	 * @Description
	 * @author hedong
	 * @date 2016年2月5日 下午9:42:30
	 * @modifyNote 
	 * @return
	 */
	public E peek(){
		return this.stackArray[top];
	}
	
	/**
	 * 栈是否为空
	 * @Description
	 * @author hedong
	 * @date 2016年2月5日 下午9:42:48
	 * @modifyNote 
	 * @return
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	
	/**
	 * 栈是否已满
	 * @Description
	 * @author hedong
	 * @date 2016年2月5日 下午9:43:04
	 * @modifyNote 
	 * @return
	 */
	public boolean isFull(){
		return top==this.maxSize;
	}

}
