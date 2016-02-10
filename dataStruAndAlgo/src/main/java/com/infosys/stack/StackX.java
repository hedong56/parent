package com.infosys.stack;

/**
 * ������ģ��ջ
 * @author hedong
 * @date 2016��2��5�� ����9:32:14
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
		//��������
		this.stackArray=(E[])(new Object[this.maxSize]);
		this.top=-1;
	}
	
	/**
	 * ���һ��Ԫ�ص�ջ��
	 * @Description
	 * @author hedong
	 * @date 2016��2��5�� ����9:41:54
	 * @modifyNote 
	 * @param j
	 * @throws Exception 
	 */
	public void push(E j) throws Exception{
		if(!this.isFull()){
			this.stackArray[++top]=j;
		}else{
			throw new Exception("ջ������");
		}
	}
	
	/**
	 * ��ջȡ��һ��Ԫ��
	 * @Description
	 * @author hedong
	 * @date 2016��2��5�� ����9:42:13
	 * @modifyNote 
	 * @return
	 * @throws Exception 
	 */
	public E pop() throws Exception{
		if(!this.isEmpty()){
			return this.stackArray[top--];
		}else{
			throw new Exception("ջ�ѿգ�");
		}
	}
	
	/**
	 * �鿴��ǰԪ��
	 * @Description
	 * @author hedong
	 * @date 2016��2��5�� ����9:42:30
	 * @modifyNote 
	 * @return
	 */
	public E peek(){
		return this.stackArray[top];
	}
	
	/**
	 * ջ�Ƿ�Ϊ��
	 * @Description
	 * @author hedong
	 * @date 2016��2��5�� ����9:42:48
	 * @modifyNote 
	 * @return
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	
	/**
	 * ջ�Ƿ�����
	 * @Description
	 * @author hedong
	 * @date 2016��2��5�� ����9:43:04
	 * @modifyNote 
	 * @return
	 */
	public boolean isFull(){
		return top==this.maxSize;
	}

}
