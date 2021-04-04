<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Freemarker Template Resolver</title>
</head>
<body>
    <H1>Freemarker Template Resolver</H1>
    <h2>${text}</h2>
    <h2>${user.name}</h2>
    <h2><#assign inlineTemplate = text?interpret><@inlineTemplate /></h2>
	<h2><#assign inlineTemplate = user.name?interpret><@inlineTemplate /></h2>
	<h2><@text?interpret /></h2>
	<h2><@user.name?interpret /></h2>
</body>
</html