<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>

<%--@elvariable id="document" type="anandamarga.beans.NewsDocument"--%>

<hst:link var="link" hippobean="${document}"/>
<article class="has-edit-button">
  <hst:cmseditlink hippobean="${document}"/>
  <h3><a href="${link}"><c:out value="${document.title}"/></a></h3>
  <c:if test="${hst:isReadable(document, 'date.time')}">
    <p>
      <fmt:formatDate value="${document.date.time}" type="both" dateStyle="medium" timeStyle="short"/>
    </p>
  </c:if>

  <c:if test="${not empty document.author}">
    <p><c:out value="${document.author}"/></p>
  </c:if>
  <c:if test="${not empty document.source}">
    <p><c:out value="${document.source}"/></p>
  </c:if>
  <c:if test="${not empty document.location}">
    <p><c:out value="${document.location}"/></p>
  </c:if>

  <c:if test="${not empty document.introduction}">
    <p><c:out value="${document.introduction}"/></p>
  </c:if>

  <c:if test="${hst:isReadable(document, 'image.original')}">
    <hst:link var="img" hippobean="${document.image.original}"/>
    <figure>
      <img src="${img}" title="${fn:escapeXml(document.image.fileName)}"
           alt="${fn:escapeXml(document.image.fileName)}"/>
      <figcaption><c:out value="${document.image.description}"/></figcaption>
    </figure>
  </c:if>

  <hst:html hippohtml="${document.content}"/>

</article>