<!doctype html>
<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap Core CSS -->
    <link href="<hst:link path="/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <!-- Custom CSS -->
    <link href="<hst:link path="/css/modern-business.css"/>" rel="stylesheet"/>
    <!-- Custom CSS -->
    <link href="<hst:link path="/css/anandamarga.css"/>" rel="stylesheet"/>
    <hst:defineObjects/>
    <c:if test="${hstRequest.requestContext.cmsRequest}">
        <link rel="stylesheet" href="<hst:link  path="/css/cms-request.css"/>" type="text/css"/>
    </c:if>
    <hst:headContributions categoryIncludes="htmlHead" xhtml="true"/>
    <!-- jQuery -->
    <script src="<hst:link path="/js/jquery.js"/>"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<hst:link path="/js/bootstrap.min.js"/>"></script>

</head>
<body>

<div class="container">
    <hst:include ref="top"/>
    <hst:include ref="menu"/>

    <div class="row">
        <div id="mainDiv" class="col-md-12">
            <hst:include ref="main"/>
        </div>
    </div>
</div>
<div class="row">
    <hst:include ref="footer"/>
</div>
</div>
<hst:headContributions categoryIncludes="htmlBodyEnd" xhtml="true"/>

</body>
</html>