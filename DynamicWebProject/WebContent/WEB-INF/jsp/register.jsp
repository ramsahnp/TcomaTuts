<%@page import="com.hib.dao.UserDao"%>  
<jsp:useBean id="obj" class="com.model.User">  
    </jsp:useBean>  
    <jsp:setProperty property="*" name="obj"/>  
      
    <%  
    int i=UserDao.register(obj);  
    if(i>0)  
    out.print("You are successfully registered");  
      
    %>  