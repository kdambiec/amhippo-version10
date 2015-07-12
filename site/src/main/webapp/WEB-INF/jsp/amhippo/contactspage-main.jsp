<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<c:if test="${not empty document}">
    <hst:link var="link" hippobean="${document}"/>
    <!-- Custom Fonts -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <%--<link href="<hst:link path="/css/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">--%>

    <!-- Page Heading/Breadcrumbs -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header"><c:out value="${document.cityName}"/></h1>
        </div>
    </div>
    <!-- /.row -->


    <div class="row">
        <article class="has-edit-button">
            <h3></h3>
            <c:if test="${not empty document.mapApiAddress}">
                <!-- Map Column -->
                <div class="col-md-8">
                    <!-- Embedded Google Map -->
                    <iframe width="600" height="400px" frameborder="0" style="border:0"
                            src="https://www.google.com/maps/embed/v1/place?key=AIzaSyBZneHo6Fmh-lMVdXjZz4tjVcJ8JSO3SXc&q=${document.mapApiAddress}">
                    </iframe>
                </div>
            </c:if>
            <!-- Contact Details Column -->
            <div class="col-md-4">
                <h3>Contacto</h3>

                <c:if test="${not empty document.contactname}">
                    <h4><c:out value="${document.contactname}"/></h4>
                </c:if>

                <p>
                    <c:out value="${document.address}" escapeXml="false"/><br>
                </p>

                <c:if test="${not empty document.phoneNumber}">
                    <p><i class="fa fa-phone"></i>
                        <abbr title="Phone">P</abbr>: <c:out value="${document.phoneNumber}"/></p>
                </c:if>
                <c:if test="${not empty document.email}">
                    <p><i class="fa fa-envelope-o"></i>
                        <abbr title="Email">E</abbr>: <a href="mailto:${document.email}">${document.email}</a>
                    </p>
                </c:if>
                <ul class="list-unstyled list-inline list-social-icons">
                    <c:if test="${not empty document.facebookLink}">
                        <li>
                            <a href="${document.facebookLink}" target="_blank"><i
                                    class="fa fa-facebook-square fa-2x"></i></a>
                        </li>
                    </c:if>
                    <c:if test="${not empty document.linkedinLink}">
                        <li>
                            <a href="${document.linkedinLink}" target="_blank"><i
                                    class="fa fa-linkedin-square fa-2x"></i></a>
                        </li>
                    </c:if>
                    <c:if test="${not empty document.twitterLink}">
                        <li>
                            <a href="${document.twitterLink}" target="_blank"><i class="fa fa-twitter-square fa-2x"></i></a>
                        </li>
                    </c:if>
                    <c:if test="${not empty document.googlePlusLink}">
                        <li>
                            <a href="${document.googlePlusLink}" target="_blank"><i
                                    class="fa fa-google-plus-square fa-2x"></i></a>
                        </li>
                    </c:if>
                </ul>
            </div>
            <hst:cmseditlink hippobean="${document}"/>
            <p></p>
        </article>
    </div>


</c:if>