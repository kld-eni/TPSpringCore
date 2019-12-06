<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>${mediatheque.nom}</title>
    </head>
    <body>
    <h1>Bienvenue dans ma ${mediatheque.nom}</h1>
    <h2>Liste des ${mediatheque.media}s</h2>
    <div style="display: flex">
        <span>Nom</span>
        <span>Titre</span>
    </div>
    <ul>
        <c:forEach items="${mediatheque.medias}" var="media">
            <li style="display:flex;">
                <span>${media.name}</span>
                <span>${media.title}</span>
            </li>
        </c:forEach>
    </ul>
    <a href="<%=request.getContextPath()%>/ajout">Ajout d'un ${mediatheque.media}</a>
    </body>
</html>
