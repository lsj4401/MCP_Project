<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Hello React</title>
	<script src="https://fb.me/react-0.13.3.js"></script>
	<script src="https://fb.me/JSXTransformer-0.13.3.js"></script>
</head>
<body>
<div id="example"></div>
<script type="text/jsx">

	// ** Example Template **
	var HelloWorld = React.createClass({
		render: function() {
			return (
					<p>
						안녕, <input type="text" placeholder="이름을 여기에 작성하세요" />!
						지금 시간은 {this.props.date.toTimeString()} 입니다.
					</p>
			);
		}
	});

	setInterval(function() {
		React.render(
				<HelloWorld date={new Date()} />,
				document.getElementById('example')
		);
	}, 500);
</script>
</body>
</html>