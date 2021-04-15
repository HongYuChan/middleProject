/**
 * 
 */


// Daum 주소 API
function getAddress() {
	new daum.Postcode({
		oncomplete: function(data) {
			document.getElementById('addr').value = data.address;
		}
	}).open();
}


// 비밀번호 기준 방식 설정
function checkPass() {
	let pw = document.getElementById('pw').value;
	if(pw == "") {
		return false;
	}
	
	if(!/^[a-zA-Z0-9]{8,20}$/.test(pw)) {
		alert("숫자와 영문자 조합의 8~20자리를 입력해 주세요.");
		$('#pw').val("");
		return false;
	}
	let checkNum = pw.search(/[0-9]/g);
	let checkEng = pw.search(/[a-z]/ig);
	
	if(chk_num<0 || chk_eng<0){
        alert("비밀번호는 숫자와 영무자를 혼용하여야 합니다.");
        $('#pw').val("");
        return false;
    }
    if(/(\w)\1\1\1/.test(upw)){
        alert("비밀번호에 같은 문자를 4번 이상 사용하실 수 없습니다.");
        $('#pw').val("");
        return false;
    }
    if(upw.search(uid)>-1){
        alert("ID가 포함된 비밀번호는 사용하실 수 없습니다.");
        $('#pw').val("");
        return false;
    }
    return true;
}

// submit 실행 시 빈 목록 확인 
$(function() {
	$('input[type=submit]').click(function() {
		let check = true;
		$('#signForm').find('input[type=text]').each(function(index, item) {
			if($(this).val().trim() == "") {
				alert($(this).attr("name") + " is Null");
				check = false;
				return false;
			}
		});
		if(!check) {
			return;
		}
		
		$(this).prop("disabled", true);
        $(this).prop("disabled", false);
	});
})








