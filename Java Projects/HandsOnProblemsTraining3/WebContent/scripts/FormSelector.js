/**
 * 
 */
function display_text_value(){
	
	var uname = document.getElementById("uname");
	var pwd = document.getElementById("pwd");
	var selected_value = document.getElementById("sel_value");
	if(uname.value)
		selected_value.value = uname.value;
	else if(pwd.value)
		selected_value.value = pwd.value;
}

function display_checkbox_value(){
	var java = document.getElementById("java");
	var dot_net = document.getElementById("dot_net");
	var selected_value = document.getElementById("sel_value");
	if(java.checked)
		selected_value.value = "Java";
	else if(dot_net.checked)
		selected_value.value = "DotNet";
	else if(java.checked && dot_net.checked)
		selected_value.value = "Java DotNet";
}

function display_select_value(){
	
	var select = document.getElementById("city");
	var selected_value = document.getElementById("sel_value");
	if(select.value == "CA")
		selected_value.value = "California";	
	else if(select.value == "CH")
		selected_value.value = "Chicago";
}

