<h1>Custom login page</h1>
<form action="/j_spring_security_check">
    <label for="username2">User Name:</label>
    <input id="username2" name="j_username" type="text"/>

    <label for="password">Password:</label>
    <input id="password" name="j_password" type="password"/>

    <input type="submit" value="Log In"/>

    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>