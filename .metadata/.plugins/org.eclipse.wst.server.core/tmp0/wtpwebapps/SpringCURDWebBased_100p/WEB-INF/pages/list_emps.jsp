<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<c:choose>
   <c:when test="${!empty listDTO}">
       <table  border="1" bgcolor="cyan">
           <tr><th>SrNo</th><th>eno</th><th>Ename</th><th>job</th><th>deptNo</th><th>Operations</th> </tr>
           <c:forEach  var="dto" items="${listDTO}">
               <tr  style="color:blue">
                  <td>${dto.sno}</td>
                  <td>${dto.eno}</td>
                  <td>${dto.job}</td>
                  <td>${dto.deptno}</td>
                  <td>${dto.salary}</td>
                
                  <td>
                    <a href="update_customer.htm?cno=${dto.sno}"  ><img src="images/edit.jpg" width="30" height="30"/></a>
                    &nbsp;
                    <a href="delete_customer.htm?cno=${dto.sno}"  onclick="return confirm('Are u sure!! u want to delete?')"><img src="images/delete.jpg" width="30" height="30"/></a>
                  </td>
               </tr>
           </c:forEach>
       </table>
   </c:when>
   <c:otherwise>
             <h1 style="color:red;text-align:center">Records not found </h1>
   </c:otherwise>
</c:choose>
<br>
<%--  <c:if test="${!empty resMsg}">
     <p style="background:yellow;text-align:center;color:red;font-size:20px">${resMsg } </p>
  </c:if>  --%>
<br>
    <p style="text-align:center"> <a href="add_customer.htm"><img src="images/add.jpg" width="70" height="70"></a> 
    <a href="welcome.htm"><img width="70" heigth="70" src="images/home1.jpg"></a>
     </p>
       
    
