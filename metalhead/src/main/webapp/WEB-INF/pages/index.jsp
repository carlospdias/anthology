<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="tpl" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c"    uri="jakarta.tags.core"%>
<%@taglib prefix="fmt"  uri="jakarta.tags.fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<tpl:principal titulo="Página de Entrada">
  <jsp:attribute name="extraStyle">
    <link rel="stylesheet" href="<c:url value="/assets/css/aplicacao.css"/>" />
  </jsp:attribute>
  <jsp:attribute name="extraScript">
    <script src="<c:url value="/assets/js/aplicacao.js"/>"></script>
  </jsp:attribute>

  <jsp:body>
    <main>
       <div id="video-list">
         <header>
           <h3>Your videos</h3>
         </header>
         <ul id="your-videos">
         </ul>
       </div>
       <div id="video-player">
         <header>
           <h3 id="now-playing"></h3>
         </header>
         <video id="video-screen" width="720px" height="480px" controls></video>
       </div>
       <form id="video-form">
         <fieldset>
           <legend>Upload a video</legend>
           <label for="file">Video File</label>
           <input id="file" name="file" type="file" accept="application/mp4">
           <label for="name">Video Name</label>
           <input id="name" name="name" type="text">
           <button type="submit">Save</button>
         </fieldset>
       </form>
   </main>
  </jsp:body>


</tpl:principal>