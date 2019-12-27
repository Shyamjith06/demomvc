function validate() {
	var name = document.getElementById("name").value;
	var salary=document.getElementById("salary").value;
	var id=document.getElementById("mid").value;
	if (name == '') {
		alert('Please enter a valid name.');
		return false;
	}
	else if(salary<0)
	{
		alert('please enter a valid salary');
		return false;
	}
	else if(mid=='')
		{
		alert('please enter valid id');
		return false;
		}
else {
		return true;
	}
}