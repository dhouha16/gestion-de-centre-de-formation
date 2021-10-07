package projet_java;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
	 private String  password ;
	 private int CIN;
	 
	 public Admin(int CIN, String password)
	    { 
	        this.CIN=CIN ;
	        this.password =password ;
	       
	    }
	     public Admin(int CIN)
	    { 
	        this.CIN=CIN ;
	 
	    }
	    
	    public void setPassword(String password )
	    {
	        this.password=password;
	    }
	    
	    
	    public int getCIN()
	    {
	        return this.CIN;
	    }
	    public String getPassword()
	    {
	        return this.password;
	    }
	   
	    public boolean exist_admin() 
	    { ConnectionBD c = new  ConnectionBD();
	        boolean ok=false;
	      String req = "SELECT * FROM formateur where (cin='"+this.getCIN()+"'and password='"+this.getPassword()+"')";
	      try
	      {
	      ResultSet rs = ConnectionBD.stm.executeQuery(req);
	      if (rs.next())
	        { ok=true ;System.out.println(getCIN()+"existe");}
	      rs.close();c.close();
	      }catch(SQLException e)
	      {
	       e.getMessage();
	      }
	     
	     return ok;
	    }
	  
	    



}
