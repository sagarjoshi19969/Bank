package bank;

class Bank {
	

	private float balance;
	
	
	
	public Bank(float i)
	{
		balance=i;
	}

	float withdraw(float w)
	{
		int options = 1;
                if(options==0) 
                   
        {
	
     	  balance = (float) (balance - w-(w*0.0004)); 
           System.out.println(" withdrawn ="+w+" and  new balance is "+balance+"\n");
  
        } 
      
     	  else 
     	    {
             balance = (float) (balance - w-(w*0.005)); 
             options=1; 
             System.out.println(" withdrawn= "+w+" and new balance is "+balance+"\n");
            } 
		return balance;
		  
	}
	float deposit(float f)
	{      double n = 0.004;
        
		int options = 0;
		if(options==0) 
        {
     	  balance = (float) (balance + f-(f*n)); 
           System.out.println(" Deposit ="+f+" and  new balance is "+balance+"\n");
        } 
      
     	  else {
             balance = (float) (balance + f-(f*0.005)); 
              options=0; 
              System.out.println(" withdrawn= "+f+" and new balance is "+balance+"\n");
   }
		return balance;
		
	}

	

}


