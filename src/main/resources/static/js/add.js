var answer = 1;
$( '#add' ).click(function() {
	var data = {
		choice1: $('#ch1').val(),
		choice2: $('#ch2').val(),
		choice3: $('#ch3').val(),
		answer: answer
	};

	var save = confirm('Do you want to save it?');
	if (save) {
		$.ajax({
			url: "/add",
			data: JSON.stringify(data),
			method: 'POST',
			contentType:"application/json; charset=UTF-8",
			dataType: 'JSON'
			// postBody: true
		}).done(function () {
			$('#ch1').val('');
			$('#ch2').val('');
			$('#ch3').val('');
			$('#question').val('');
			$('#answer').val('');
			alert('Done');
		});
	}
});

var selectAnswer = 'select-answer';
$('.answer').click(function (event) {
	$('#ch-label-1').removeClass(selectAnswer);
	$('#ch-label-2').removeClass(selectAnswer);
	$('#ch-label-3').removeClass(selectAnswer);

	answer = event.currentTarget.value;
	$('#ch-label-' + answer).addClass(selectAnswer);
});