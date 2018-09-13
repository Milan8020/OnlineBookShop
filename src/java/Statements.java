/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayur Domadiya
 */
import java.sql.*;
public class Statements {

    public static void insert(String ... s){
           
  try {
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/informatiion","root","");
               String query="insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement(query);
        for(int i=0;i<s.length;i++)
        {
             if(i==0 || i==9){
                ps.setLong(i+1, Long.parseLong(s[i]));
             }
             else if(i==2 || i==4 || i==6 || i==9){
              ps.setFloat(i+1, Float.parseFloat(s[i]));
             }
             else
             {
             ps.setString(i+1,s[i]);
             }
        }
        ps.executeUpdate();
        ps.close();
        conn.close();
    }catch(Exception e){System.out.println(e.toString());
    }

   
}
    
     public static ResultSet select(){
           
  try {
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/informatiion","root","");
               String query="select * from student";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
      
        return rs;
    }catch(Exception e){System.out.println(e.toString());
    
        return null;
    }
}
     public static void delete(String en){
           
  try {
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/informatiion","root","");
               String query="delete from student where Enrollment_no="+en;
        Statement st=conn.createStatement();
        st.executeUpdate(query);
      
        
    }catch(Exception e){System.out.println(e.toString());
    
        
    }
}
    
     public static void changepass(String ... s){
     
      try {
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/informatiion","root","");
       
         
        CallableStatement st=conn.prepareCall("{call proc(?,?)}");
       
        st.setLong(1, Long.parseLong(s[0]));
        st.setString(2, s[1]);
        st.execute();
        
        st.close();
        conn.close();
  
    }catch(Exception e){System.out.println(e.toString());
    }
     }

    
}