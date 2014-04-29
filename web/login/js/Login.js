$(document).ready(function(){
	var pathValue = $("#pathValue").val();
	var loginForm = $("form[id=loginForm]");
	loginForm.attr("action",pathValue + "/doTest.do?method=doTest");
	loginForm.attr("method","post");
});