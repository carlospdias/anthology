<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" trimDirectiveWhitespaces="true" %>
<%@taglib prefix="tpl" tagdir="/WEB-INF/tags"   %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<tpl:principal titulo="Página de Entrada">
  <jsp:attribute name="extraStyle">
    <link rel="stylesheet" href="<c:url value="/assets/css/aplicacao.css"/>" />
  </jsp:attribute>
  <jsp:attribute name="extraScript">
    <script src="<c:url value="/assets/js/aplicacao.js"/>" ></script>
  </jsp:attribute>
  
  <jsp:body>
    <h2>Início da aplicação</h2>
    
    <div class="card" style="width: 18rem;">
      <div class="card-body">
      <h5 class="card-title">Card title</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    </div>
    <ul class="list-group list-group-flush">
      <c:forEach begin="1" end="10" var="it">
        <li class="list-group-item"> item ${it}</li>
      </c:forEach>
    </ul>
      <div class="card-body">
        <a href="#" class="card-link">Card link</a>
        <a href="#" class="card-link">Another link</a>
      </div>
    </div>
    <br />
  </jsp:body>  
  
    
</tpl:principal>