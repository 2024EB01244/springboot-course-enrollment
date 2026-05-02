<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table border="1">
<tr><th>Name</th><th>Email</th></tr>

<c:forEach var="s" items="${students}">
<tr>
<td>${s.name}</td>
<td>${s.email}</td>
</tr>
</c:forEach>

</table>
