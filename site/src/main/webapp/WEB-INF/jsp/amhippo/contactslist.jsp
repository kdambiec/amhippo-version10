<%--
  Created by IntelliJ IDEA.
  User: karun
  Date: 26/02/15
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<!-- Custom Fonts -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<%--@elvariable id="item" type="anandamarga.beans.Contactdocument"--%>
<%--@elvariable id="pageable" type="org.onehippo.cms7.essentials.components.paging.Pageable"--%>




<c:forEach var="item" items="${pageable.items}" varStatus="status">
    <div class="row">
        <hst:link var="link" hippobean="${item}"/>
        <article class="has-edit-button">
            <h3><a href="${link}"><c:out value="${item.cityName}"/></a></h3>
            <!-- Contact Details Column -->
            <div class="col-md-4">
               <%-- <c:if test="${not empty item.contactPhoto}">
                    <hst:link var="contactPhotoDesktop" hippobean="${item.contactPhoto.contactdesktop}"/>
                    <img src="${contactPhotoDesktop}" class="img-rounded"/>
                </c:if>--%>
                <c:if test="${not empty item.contactName}">
                    <h4><c:out value="${item.contactName}"/></h4>
                </c:if>
                <c:if test="${not empty item.address}">
                    <p>
                        <c:out value="${item.address}" escapeXml="false"/><br>
                    </p>
                </c:if>
                <c:if test="${not empty item.phoneNumber}">
                    <p><i class="fa fa-phone"></i>
                        <abbr title="Phone">P</abbr>: <c:out value="${item.phoneNumber}"/></p>
                </c:if>
                <c:if test="${not empty item.email}">
                    <p><i class="fa fa-envelope-o"></i>
                        <abbr title="Email">E</abbr>: <a href="mailto:${item.email}">${item.email}</a>
                    </p>
                </c:if>
                <ul class="list-unstyled list-inline list-social-icons">
                    <c:if test="${not empty item.facebookLink}">
                        <li>
                            <a href="${item.facebookLink}" target="_blank"><i
                                    class="fa fa-facebook-square fa-2x"></i></a>
                        </li>
                    </c:if>
                    <c:if test="${not empty item.linkedinLink}">
                        <li>
                            <a href="${item.linkedinLink}" target="_blank"><i
                                    class="fa fa-linkedin-square fa-2x"></i></a>
                        </li>
                    </c:if>
                    <c:if test="${not empty item.twitterLink}">
                        <li>
                            <a href="${item.twitterLink}" target="_blank"><i class="fa fa-twitter-square fa-2x"></i></a>
                        </li>
                    </c:if>
                    <c:if test="${not empty item.googlePlusLink}">
                        <li>
                            <a href="${item.googlePlusLink}" target="_blank"><i
                                    class="fa fa-google-plus-square fa-2x"></i></a>
                        </li>
                    </c:if>
                </ul>
            </div>
            <hst:cmseditlink hippobean="${item}"/>
            <p></p>
        </article>
    </div>
</c:forEach>
<c:if test="${pageable.showPagination}">
    <%@ include file="/WEB-INF/jsp/include/pagination.jsp" %>
</c:if>

