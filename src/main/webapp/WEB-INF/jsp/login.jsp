<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <div class="login-form">
                <div class="panel-heading">
                    <div class="panel-title">Sign In</div>
                </div>

                <div class="panel-body">
                    <c:if test="${not empty error}">
                        <div id="login-alert" class="alert alert-danger">${error}</div>
                    </c:if>   
                    <c:url var="loginUrl" value="/login" />    
                    <form:form id="loginform" class="form-horizontal" role="form" action="${loginUrl}" method="post">

                        <div id = "login_input_group" class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user"></i></span>
                            <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="MERA user login">                                        
                        </div>
                        <div  id = "password_input_group" class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                            <input id="login-password" type="password" class="form-control" name="password" placeholder="Password">
                        </div>
                        <div class="input-group pull-right">
                            <button type="submit" id="btn-login" class="btn btn-primary">Login</button>
                        </div>
                    </form:form>   
                </div>
            </div>
        </div>
    </body>
</html>