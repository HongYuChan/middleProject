<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ ȭ��</title>
</head>
<body>
	<form method="POST" action="insertMemberInfo.do">
			<!-- ���̵� -->
			<div class="form-group">
				<label for="id">���̵�</label>
					<input type="text" class="form-control" id="id" name="id" placeholder="ID" required>
				<div class="check_font" id="id_check"></div>
			</div>
			<!-- ��й�ȣ -->
			<div class="form-group">
				<label for="password">��й�ȣ</label>
					<input type="password" class="form-control" id="password" name="password" placeholder="PASSWORD" required>
				<div class="check_font" id="pw_check"></div>
			</div>
			<!-- ��й�ȣ ��Ȯ�� -->
			<div class="form-group">
				<label for="pw2">��й�ȣ Ȯ��</label>
					<input type="password" class="form-control" id="pw2" name="pw2" placeholder="Confirm Password" required>
				<div class="check_font" id="pw2_check"></div>
			</div>
			<!--�г��� -->
			<div class="form-group">
				<label for="nickname">�г���</label>
					<input type="text" class="form-control" id="nickname" name="nickname" placeholder="Nickname" required>
				<div class="check_font" id="name_check"></div>
			</div>
			<!-- ����Ȯ�� �̸��� -->
			<div class="form-group">
				<label for="email">�̸���</label>
					<input type="text" class="form-control" name="email" id="email" placeholder="E-mail" required>
					<!-- <input type="text" style="margin-top: 5px;"class="email_form" name="email_confirm" id="email_confirm" placeholder="������ȣ�� �Է����ּ���!" required>
						<button type="button" class="btn btn-outline-danger btn-sm px-3" onclick="confirm_email()">
							<i class="fa fa-envelope"></i>&nbsp;����
						</button>&nbsp;
						<button type="button" class="btn btn-outline-info btn-sm px-3">
							<i class="fa fa-envelope"></i>&nbsp;Ȯ��
						</button>&nbsp; -->
					<div class="check_font" id="email_check"></div>
			</div>
			<!-- �޴���ȭ -->
			<div class="form-group">
				<label for="phone_number">�޴���ȭ ('-' ���� ��ȣ�� �Է����ּ���)</label>
				<input type="text" class="form-control" id="phone_number" name="phone_number" placeholder="Phone Number" required>
				<div class="check_font" id="phone_check"></div>
			</div>
			<div class="reg_button">
				<a class="btn btn-danger px-3" href="">
					<i class="fa fa-rotate-right pr-2" aria-hidden="true"></i>����ϱ�
				</a>&emsp;&emsp;
				<button class="btn btn-primary px-3" id="reg_submit">
					<i class="fa fa-heart pr-2" aria-hidden="true"></i>�����ϱ�
				</button>
			</div>
		</form>

</body>
</html>