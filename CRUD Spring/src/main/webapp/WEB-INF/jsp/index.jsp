<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
    <head>
        <title>
            Homepage
        </title>
    </head>
    <body>
        <div>
            <h1>Hello ${name}</h1>

            <table>
                <thead>

                </thead>
            </table>

            <c:forEach items="${list}" var="std" varStatus="listt">
                ${listt.index+1}, ${std.name}, ${std.rollNo} <br><br>
            </c:forEach>
        </div>

        <a href="/insert">Create Account</a>

    </body>
</html>