<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean Hello</title>
    </head>
    <body>
        <p>Bean Hello</p>
	    <h2>${user.prefix} ${user.name}</h2>
	    <h2 style="font: color:red;">${message}</h2>
    </body>
</html>
