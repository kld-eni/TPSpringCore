<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>${mediatheque.nom} - Ajout</title>
    </head>
    <body>
    <h1>Bienvenue dans ma ${mediatheque.nom}</h1>
    <h2>Ajout d'un ${mediatheque.media}</h2>
    <form method="post" action="<%=request.getContextPath()%>/ajout">
        <div style="display: flex">
            <label for="ajout-nom">Nom:</label>
            <input type="text" name="ajout-nom" id="ajout-nom" />
        </div>
        <div style="display: flex">
            <label for="ajout-titre">Titre:</label>
            <input type="text" name="ajout-titre" id="ajout-titre" />
        </div>
        <div>
            <button type="submit">Valider</button>
        </div>
    </form>
    <a href="<%=request.getContextPath()%>/">Retour</a>
    </body>
</html>
