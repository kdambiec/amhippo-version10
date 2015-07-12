<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>

<%--@elvariable id="document" type="anandamarga.beans.Blogpost"--%>
<div class="has-edit-button">
<hst:cmseditlink hippobean="${document}"/>
<h1><c:out value="${document.title}"/></h1>
<h2>by: <c:out value="${document.author}"/></h2>
<strong>
  <c:if test="${document.publicationDate ne null}">
    <fmt:formatDate type="date" pattern="yyyy-MM-dd" value="${document.publicationDate.time}"/>
  </c:if>
</strong>
<p><c:out value="${document.introduction}"/></p>
<div><hst:html hippohtml="${document.content}"/></div>
</div>