<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/stylesheets/slipp.css" rel="stylesheet">
<title>SLiPP :: Q&A</title>
<%@ include file="../commons/_header.jspf"%>
</head>

<body>
	<%@ include file="../commons/_top.jspf"%>

	<div class="wrapper">

		<div class="content">
			<div class="container">
				<div class="list-content">
					<div class="content-main">
						<section class="qna-list">

						<h1>글목록</h1>

						<ul class="list">
						
						<c:forEach items="${boards}" var="board">
							<li>
								<div class="wrap">
									<div class="main">
										<strong class="subject"> <a href="#">${board.subject}</a></strong>

										<div class="auth-info">
											<span class="type">응답</span>
											<span class="time"> ${board.date }</span>  ${board.name}
										</div>
										
										<div class="reply" title="댓글">
											<span class="point">2</span>
										</div>
										
									</div>
								</div>
							</li>
						</c:forEach>

						</ul>
						</section>
					</div>

					<div class="content-sub">

						<section class="qna-tags">
						<h1>태그목록</h1>
						<c:forEach items="${tags}" var="tag">
							<ul>
								<li><a href="" class="tag">${tag.toString()}</a></li>
							</ul>
						</c:forEach>
						</section>

					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>
