<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty error}">
    <div>${error}</div>
</c:if>

<form action="/login" method="POST">
    <label for="username">User Name:</label>
    <input id="username" name="username" type="text"/>

    <label for="password">Password:</label>
    <input id="password" name="password" type="password"/>

    <input type="submit" value="Log In"/>
</form>