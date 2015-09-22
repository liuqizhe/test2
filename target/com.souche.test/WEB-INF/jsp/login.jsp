<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
	<head></head>
	<body>
		<!-- '/'表示http://localhost:8088/ -->
		 <form action="/test2/login/login3.from" method="post">
			用户名：<input type="text" name="username"/><br/>
			密码：<input type="password" name="password"/><br/>
			<input type="submit" value="提交"/>
		</form>
	</body>
</html>