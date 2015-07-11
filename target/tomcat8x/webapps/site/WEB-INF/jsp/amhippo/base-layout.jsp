<!doctype html>
<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<html lang="en">
<head>
  <meta charset="utf-8"/>
  <link rel="stylesheet" href="<hst:link  path="/css/bootstrap.css"/>" type="text/css"/>
  <hst:defineObjects/>
  <c:if test="${hstRequest.requestContext.cmsRequest}">
    <link rel="stylesheet" href="<hst:link  path="/css/cms-request.css"/>" type="text/css"/>
  </c:if>
  <hst:headContributions categoryIncludes="htmlHead" xhtml="true"/>
</head>
<body>
<%@ include file="/WEB-INF/jsp/include/piwik.jsp" %>
<div class="container">
  <div class="row">
    <div class="col-md-6 col-md-offset-3">
      <div>
        <img src="<hst:link path='/images/meditate_logo.png' />" class="img-responsive" alt="Ananda Marga Logo"/>
      </div>
      <hst:include ref="top"/>
      <hst:include ref="menu"/>
    </div>
  </div>
  <div class="row">
    <hst:include ref="main"/>
  </div>
  <div class="row">
    <hst:include ref="footer"/>
  </div>
</div>
<hst:headContributions categoryIncludes="htmlBodyEnd" xhtml="true"/>
</body>
</html>