<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Hello React</title>
	<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/bootstrap/css/bootstrap-theme.min.css">
	<script src="/libs/jquery-3.2.1.min.js"></script>
	<script src="/bootstrap/JS/bootstrap.js"></script>
</head>
<body>
	<div class="container-fluid" id="addProblem">
		<div class="col-md-12"><h4>Add Problem</h4></div>
		<div class="input-group">
			<span class="input-group-addon" >Question</span>
			<input id="question"  class="form-control" type="text">
		</div>
		<div class="input-group">
			<span id="ch-label-1" class="input-group-addon" >Choice 1</span>
			<input id="ch1"  class="form-control" type="text">
		</div>
		<div class="input-group">
			<span id="ch-label-2" class="input-group-addon" >Choice 2</span>
			<input id="ch2"  class="form-control" type="text">
		</div>
		<div class="input-group">
			<span id="ch-label-3" class="input-group-addon" >Choice 2</span>
			<input id="ch3"  class="form-control" type="text">
		</div>
		<div class="btn-toolbar" role="toolbar" aria-label="1">
			<div class="btn-group" role="group" aria-label="1">
				<button class="answer col-md-2 btn btn-default" value="1">1</button>
				<button class="answer col-md-2 btn btn-default" value="2">2</button>
				<button class="answer col-md-2 btn btn-default" value="3">3</button>
			</div>
		</div>
		<button id="add" class="col-md-2 btn btn-primary">Add Problem</button>
	</div>
</body>
<script src="/js/add.js"></script>
<link rel="stylesheet" href="/css/add.css">
</html>