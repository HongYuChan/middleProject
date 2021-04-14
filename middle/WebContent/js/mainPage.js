/**
 * http://usejsdoc.org/
 */

function popupLogin() {
	let iframe = document.createElement("iframe");
	iframe.src = "loginForm.jsp";
	document.slider_area.appendChild(iframe);
}