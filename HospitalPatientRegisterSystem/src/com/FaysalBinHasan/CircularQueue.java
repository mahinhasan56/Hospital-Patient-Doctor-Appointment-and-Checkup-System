package com.FaysalBinHasan;

public class CircularQueue {
	 private Object[]data;
	  private int size;
	  private int defaultsize=20;
	  private int  front;
	    
	  public CircularQueue()
	  {
	    data=new Object[ defaultsize];
	    size=0;
	    front=0;
	    
	  }
	  public void RegisterPatient(Object item)
	  {
	    if(size==data.length){
	      Object []temp=new Object[data.length*2];  
	      for(int c=0;c<size;c++){
	        temp[c]=data[c];
	      }
	      data=temp;
	    }
	    data[size]=item;
	    size++;
	  } 
	  public Object ServePatient()
	  {
	    if(size<=0){
	      System.out.println("There is no patient");
	      return null;
	    }
	    Object val=data[front];
	    data[front]=null;
	    front=(front+1)%data.length;
	    size--;
	    return val;
	  }
	  public void  Cancellall()
	  {
	     for(int c=0;c<size;c++){
	      data[front]=null;
	      front =(front +1)%data.length;
	     }
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
	    int num=front;
	    StringBuilder obj=new StringBuilder();
	     for(int c=0;c<size;c++){
	        temp[c]=(String)data[num];
	        num=(num+1)%data.length;
	    }
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
	    int val=front;
	    for(int i=0;i<size;i++){
	      System.out.println(data[val]);
	      val=(val+1)%data.length;
	    }
	  }
}
