const baseURL = "http://localhost:8080/10_Back_End_Web_exploded/api/v1/customer";

$(document).ready(function () {
    getCustomers();
});

// Get all customers
function getCustomers() {
    $.ajax({
        url: (baseURL + "/getAll"),
        method: "GET",
        dataType: "json",
        success: function (response) {

            const tableBody = $("#customer_tbody");
            const customers = response;
            tableBody.empty();

            customers.forEach(customer => {
                tableBody.append(`
                <tr data-id="${customer.id}" data-name="${customer.name}" 
                    data-address="${customer.address}" data-age="${customer.age}">
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.address}</td>
                    <td>${customer.age}</td>
                </tr>
                `);
            });

            // Attach click event
            $("#customer_tbody tr").click(function () {
                let id = $(this).attr("data-id");
                let name = $(this).attr("data-name");
                let address = $(this).attr("data-address");
                let age = $(this).attr("data-age");

                $("#id").val(id);
                $("#name").val(name);
                $("#address").val(address);
                $("#age").val(age);
            });
        },
        error: function (error) {
            alert("Failed to load customer data!");
            console.error(error);
        }
    });
}

// Call function when the page loads
$(document).ready(function () {
    getCustomers();
});

//save customer
$("#saveBtn").click((e) => {
    e.preventDefault();
    const customer = {
        id: $("#id").val(),
        name: $("#name").val(),
        address: $("#address").val(),
        age: $("#age").val()
    }

    $.ajax({
        url: (baseURL + "/save"),
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify(customer),
        success: function (response) {
            getCustomers();
            clearForm();
        },
        error: function (error) {
            alert(error);
        }
    });
});

//update customer
$("#updateBtn").click(function () {
    const customer = {
        id: $("#id").val(),
        name: $("#name").val(),
        address: $("#address").val(),
        age: $("#age").val()
    }

    $.ajax({
        url: (baseURL + "/update"),
        method: "PUT",
        contentType: "application/json",
        data: JSON.stringify(customer),
        success: function (response) {
            getCustomers();
            clearForm();
        },
        error: function (error) {
            alert(error);
        }
    });
});

//delete customer
$("#deleteBtn").click(function () {
    const id = $("#id").val();

    $.ajax({
        url: (baseURL + "/delete/" + id),
        method: "DELETE",
        success: function (response) {
            getCustomers();
            clearForm();
        },
        error: function (error) {
            alert(error);
        }
    });
});

//clear form
function clearForm() {
    $("#id").val("");
    $("#name").val("");
    $("#address").val("");
    $("#age").val("");
}