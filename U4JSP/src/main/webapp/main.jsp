<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! 
	//declarative tag
    int a = 12;
    int b = 14;
    
    int add(int c, int d) {
        return c + d;
    }
    int mul(int c,int d){
    	return c*d;
    }
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body style="background:yellow">
    <% 
        out.println(add(a, b));   //scriptlet tag
    %>
    
    <%= 
        add(a, b) //expression tag: for print value
    %>
    
    <%=
    	mul(a,b)
    %>
    
    <%= 
        a
    %>
</body>
</html>
