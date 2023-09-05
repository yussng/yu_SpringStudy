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
.row{
	margin: 0px auto;
	width: 960px;
}
</style>
</head>
<body>
  <div class="container">
    <div class="row">
      <h3>믿고 보는 맛집리스트</h3>
      <hr>
      <div class="row">
        <c:forEach var="vo" items="${list }" varStatus="s">
         <c:if test="${s.index>=0 && s.index<12 }">
          <div class="col-md-3">
		    <div class="thumbnail">
		      <a href="/w3images/lights.jpg">
		        <img src="${vo.poster }" alt="Lights" style="width:100%">
		        <div class="caption">
		          <p>${vo.title }</p>
		        </div>
		      </a>
		    </div>
		  </div>
		 </c:if> 
		</c:forEach>
      </div>
      <h3>지역별 인기 맛집리스트</h3>
      <hr>
      <div class="row">
        <c:forEach var="vo" items="${list }" varStatus="s">
         <c:if test="${s.index>=12 && s.index<18 }">
          <div class="col-md-4">
		    <div class="thumbnail">
		      <a href="/w3images/lights.jpg">
		        <img src="${vo.poster }" alt="Lights" style="width:100%">
		        <div class="caption">
		          <p>${vo.title }</p>
		        </div>
		      </a>
		    </div>
		  </div>
		 </c:if> 
		</c:forEach>
      </div>
      <h3>메뉴별 인기 맛집리스트</h3>
      <hr>
      <div class="row">
        <c:forEach var="vo" items="${list }" varStatus="s">
         <c:if test="${s.index>=18 && s.index<30}">
          <div class="col-md-4">
		    <div class="thumbnail">
		      <a href="/w3images/lights.jpg">
		        <img src="${vo.poster }" alt="Lights" style="width:100%">
		        <div class="caption">
		          <p>${vo.title }</p>
		        </div>
		      </a>
		    </div>
		  </div>
		 </c:if> 
		</c:forEach>
      </div>
    </div>
  </div>
</body>
</html>