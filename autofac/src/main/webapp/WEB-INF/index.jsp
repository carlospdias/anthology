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
    <c:forEach items="${origins}" var="origin" varStatus="st">
    <h3>${origin.name}</h3>
      <c:forEach items="${origin.tales}" var="tale">
      <div class="card">
        <div class="card-header">
          ${tale.name}      
        </div>
        <div class="card-body">
          <p class="card-text">${tale.description}</p>
          <a href="${tale.link}" class="btn btn-primary">Vídeo</a>
        </div> 
      </div>
      </c:forEach> 
    
    </c:forEach>
   
    <br />
  </jsp:body>  
  
    
</tpl:principal>