package com.FaysalBinHasan;

public class Node {
	public String item;
	 public int element;
	 public Node next;
	 public Node(){
	   this(null,-0,null);
	 }
	  public Node(String i,int e,Node n)
	   {  
	    next=n;
	    element=e;
	    item=i;
	  }
}
