<%@ tag description="base page template" pageEncoding="UTF-8" %>
<%@ attribute name="pageTitle" %>

<!DOCTYPE html>
<html>
<head>
    <title>${pageTitle}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="/WEB-INF/pages/menu.jsp"/>
<main class="container-fluid mt-5">
    <jsp:doBody/>
    <jsp:include page="/WEB-INF/pages/footer.jsp"/>
    <script src="${pageContext.request.contextPath}/scripts/form-validation.js"></script>
</main>
</body>
</html>