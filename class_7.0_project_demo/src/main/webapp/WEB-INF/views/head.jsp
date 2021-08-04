
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
       <li><a href="#">Page 2</a></li>
        <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 2</a></li>
    </ul>
    
    <p:choose>
    <p:when test="${sessionScope.signUp!=null}">
    <ul class="nav navbar-nav navbar-right">
    <li><a href="upload"><span class="glyphicon glyphicon-user"></span> image upload</a></li>
      <li><a href=""><span class="glyphicon glyphicon-user"></span> product list</a></li>
      <li><a href="listuser"><span class="glyphicon glyphicon-log-in"></span> listuser</a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Login out</a></li>
    </ul>
    </p:when>
    <p:otherwise>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    </p:otherwise>
    </p:choose>
   
  </div>
</nav>