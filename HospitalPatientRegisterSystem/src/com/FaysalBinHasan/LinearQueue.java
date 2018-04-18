package com.FaysalBinHasan;

public class LinearQueue {
	private Object[]data;
	  private int size;
	  private int defaulsize=5;
	  private int front;
	   
	    
	  public LinearQueue()
	  {
	    data=new Object[ defaulsize];
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
	    int nextslot=(size+front)%data.length;
	    data[nextslot]=item;
	    size++;
	  } 
	  public Object ServePatient()
	  {
	    if(size<=0){
	      System.out.println("There is no patient");
	      return null;
	    }
	    Object temp=data[0];
	    int val=size-1;
	    for(int c=0;c<size-1;c++){
	      data[c]=data[c+1];
	    }
	    data[val]=null;
	    size--;
	    return temp;
	  }
	  public void  Cancellall()
	  {
	     for(int c=0;c<size;c++){
	      data[c]=null;
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
	    for(int c=0;c<size;c++){
	        temp[c]=(String)data[c];
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
	    for(int i=0;i<size;i++){
	      System.out.println(data[i]);
	    }
	  }
}
