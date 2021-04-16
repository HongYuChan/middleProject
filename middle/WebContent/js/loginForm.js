/**
 * http://usejsdoc.org/
 */

function dataCheck() {
	let id = $('id').val();
	let password = $('password').val();
	
	if(!id) {
		alert("Please input ID");
		$('id').focus();
		return false;
	}
	
	if(!password) {
		alert("Please input PassWord");
		$('password').focus();
		return false;
	}
}

