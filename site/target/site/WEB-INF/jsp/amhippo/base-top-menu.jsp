<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<%--
  Copyright 2014 Hippo B.V. (http://www.onehippo.com)

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
  --%>

<%--@elvariable id="menu" type="org.hippoecm.hst.core.sitemenu.HstSiteMenu"--%>
<%--@elvariable id="editMode" type="java.lang.Boolean"--%>
<!-- Navigation -->
<div class="container-fluid">
  <div class="row headerPadding">
    <div class="col-md-2">
      <img src="<hst:link path="/images/meditate_logo.png"/>" class="img-responsive" alt="Meditation Logo"/>
    </div>
    <div class="col-md-10">
      <h1 class="site-title"><a rel="home" title="Ananda Marga" href="http://www.anandamarga.org.es/">Ananda Marga</a></h1>
      <h2 class="site-description">El yoga de la autorrealización</h2>
    </div>
  </div>
  <c:choose>
    <c:when test="${menu ne null}">
      <c:if test="${not empty menu.siteMenuItems}">
        <nav class="navbar navbar-inverse" role="navigation">
          <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse"
                      data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="base-top-menu-navbar-collapse-1">
              <ul class="nav navbar-nav navbar-left">
                <c:forEach var="item" items="${menu.siteMenuItems}">
                  <c:choose>
                    <c:when test="${item.selected or item.expanded}">
                      <li class="active"><a
                              href="<hst:link link="${item.hstLink}"/>">${item.name}</a>
                      </li>
                    </c:when>
                    <c:otherwise>
                      <li><a href="<hst:link link="${item.hstLink}"/>">${item.name}</a></li>
                    </c:otherwise>
                  </c:choose>
                </c:forEach>
              </ul>
            </div>
          </div>
        </nav>
      </c:if>
      <hst:cmseditmenu menu="${menu}"/>
    </c:when>

    <%--Placeholder reminding us to configure a valid menu in the component parameters--%>
    <c:otherwise>
      <c:if test="${editMode}">
        <h5>[Menu Component]</h5>
        <sub>Click to edit Menu</sub>
      </c:if>
    </c:otherwise>
  </c:choose>
</div>