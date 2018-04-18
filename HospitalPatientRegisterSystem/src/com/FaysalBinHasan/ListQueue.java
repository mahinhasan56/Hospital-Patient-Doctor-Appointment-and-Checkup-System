package com.FaysalBinHasan;

public class ListQueue {

	  private Node data;
	  private int size;
	  private Node tail;
	  public ListQueue()
	  {
	      data=new Node();
	      tail=data;
	      size=0;
	    }
	  public  void RegisterPatient(String item)
	  {
	    Node temp=new Node (item,size,null);
	      size++;
	    if(data.next==null){
	      data.next=temp;
	      tail=temp;
	    }
	    tail.next=temp;
	    tail=temp;
	  }
	  public Object ServePatient(){
	   if(size<=0){
	      System.out.println("There is no patient");
	      return null;
	    }
	   Node temp=data.next;
	   data.next=temp.next;
	   size--;
	   return temp.item;
	  }
	  public void  Cancellall()
	  {
	    data.next=null;
	    size=0;
	  }
	  public boolean Candoctorgohome()
	  {
	      if(size<=0){
	        return true;
	      }
	      else{
	      return false;
	      }
	  }
	  public Object Showall()
	  {
	    String[] temp=new String[size];
	    Node head=data.next;
	    for(int c=0;c<size;c++){
	      temp[c]=head.item;
	      head=head.next;
	    }
	    StringBuilder obj=new StringBuilder();
	    for(int i=0;i<size;i++){
	      for(int j=i+1;j<size;j++){
	        if(temp[i].compareToIgnoreCase(temp[j])>0){
	          String post=temp[i];
	          temp[i]=temp[j];
	          temp[j]=post;
	        }
	      }
	    }
	    obj.append("[");
	    for(int i=0;i<size;i++){
	      obj.append(" "+temp[i]);
	    }
	    obj.append("  ]");
	    return obj.toString();
	  }
	  void print(){
	    Node newnode=data.next;
	    for(int i=0;i<size;i++){
	      System.out.println(newnode.item);
	      newnode =newnode.next;
	    }
	  }
}
