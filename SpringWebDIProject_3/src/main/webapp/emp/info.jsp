<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container{
   margin-top: 50px;
}
.row {
  margin: 0px auto;
  width:800px;
}
</style>
</head>
<body>
<div class="container">
  <h1 class="text-center">사원 정보</h1>
  <div class="row">
    <table class="table">
      <tr>
        <th width=15% class="text-center">사번</th>
        <th width=15% class="text-center">이름</th>
        <th width=40% class="text-center">직위</th>
        <th width=15% class="text-center">입사일</th>
        <th width=15% class="text-center">급여</th>
      </tr>
      <tr>
        <th width=15% class="text-center">${vo.eptno }</th>
        <th width=15% class="text-center">${vo.ename }</th>
        <th width=40% class="text-center">${vo.job }</th>
        <th width=15% class="text-center">${vo.hiredate }</th>
        <th width=15% class="text-center">${vo.sal }</th>
      </tr>
      <tr>
        <input type=button value="뭐지">
      </tr>
    </table>
  </div>
</div>
</body>
</html>