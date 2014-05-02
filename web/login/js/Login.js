$(document).ready(function(){
	var pathValue = $("#pathValue").val();
	var loginForm = $("form[id=loginForm]");
	loginForm.attr("action","login.action");
	loginForm.attr("method","post");
});