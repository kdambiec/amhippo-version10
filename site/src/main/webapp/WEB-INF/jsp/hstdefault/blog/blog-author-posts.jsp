<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>

<%--@elvariable id="item" type="anandamarga.beans.Blogpost"--%>
<%--@elvariable id="author" type="anandamarga.beans.Author"--%>
<%--@elvariable id="pageable" type="org.onehippo.cms7.essentials.components.paging.Pageable"--%>
<hst:setBundle basename="essentials.blog"/>
<c:if test="${(pageable ne null)}">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">
        <fmt:message key="blog.moreby" var="moreby"/><c:out value="${moreby}"/>&nbsp;<c:out value="${author.fullName}"/>
      </h3>
    </div>
    <c:choose>
      <c:when test="${pageable.total gt 0}">
        <div class="panel-body">
          <c:forEach var="item" items="${pageable.items}" varStatus="status">
            <hst:link var="link" hippobean="${item}"/>
            <p><a href="${link}"><c:out value="${item.title}"/></a></p>
          </c:forEach>
        </div>
      </c:when>
      <c:otherwise>
        <div class="panel-body">
          <p><fmt:message key="blog.notfound" var="notfound"/><c:out value="${notfound}"/></p>
        </div>
      </c:otherwise>
    </c:choose>
  </div>
</c:if>
<%--@elvariable id="editMode" type="java.lang.Boolean"--%>
<c:if test="${editMode and pageable eq null}">
  <img src="<hst:link path='/images/essentials/catalog-component-icons/blogposts-by-author.png'/>"> Click to edit Blogposts by Author
</c:if>
