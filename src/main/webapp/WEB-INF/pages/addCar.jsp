<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Add Car">

    <h1>Add Car</h1>

    <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}/AddCar">
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="license_plate" class="form-label">License Plate</label>
                <input type="text" class="form-control" id="license_plate" name="license_plate" placeholder="" value=""
                       required>
                <div class="invalid-feedback">
                    License Plate is required.
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="parking_spot" class="form-label">Parking Spot</label>
                <input type="text" class="form-control" id="parking_spot" name="parking_spot" placeholder="" value=""
                       required>
                <div class="invalid-feedback">
                    Parking Spot is required.
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="owner" class="form-label">Owner</label>
                <select class="form-select" id="owner" name="owner_id" required>
                    <option value="">Choose...</option>
                    <c:forEach var="user" items="${users}" varStatus="status">
                        <option value="${user.id}">${user.userName}</option>
                    </c:forEach>
                </select>
                <div class="invalid-feedback">
                    Please provide an owner.
                </div>
            </div>
        </div>

        <div class="col-md-6 mb-3" style="padding: 10px">
            <button type="submit" class="btn btn-primary btn-lg">Save</button>
        </div>
    </form>
</t:pageTemplate>