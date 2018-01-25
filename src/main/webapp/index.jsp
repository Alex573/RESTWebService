<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java REST web service</title>
    <style>
        .color {
            color: blue;
        }

        .color span {
            color: red;
        }

        .size {
            font-size: 16px;
        }

    </style>
</head>
<body>
<h2>REST web service Jersey + Json</h2>
<p class="size">Accept array of Integers and return this array sorted.</p>
<p class="size">Both input and output will be in a JSON format.</p>
<p class="size">The request can have a descending flag.</p>
<p class="size">Request type:POST Content-Type: application/json</p>
<p class="size">host: http://rest-webservice.herokuapp.com/rest/sorted/array</p>

<p class="color">Example Input format:{ "descending":false, "array":[ 9, 7, 3, 15 ] }
    <span>Output format: [ 3, 7, 9, 15 ]</span></p>

<p class="color">Example Input format:{ "descending":true, "array":[ 9, 7, 3, 15 ] }
    <span>Output format: [ 15, 9, 7, 3 ]</span></p>

<p class="color">Example Input format:{"array":[ 9, 7, 3, 15 ] } not flag
    <span>Output format: [ 3, 7, 9, 15 ]</span></p>

<p class="color">Example Input format:{"array":[ A, 7, 3, 15 ] } MISTAKE
    <span>Output : Wrong message request. Please check and try again !!</span></p>
<%--<form id="myform" action="/rest/sorted/array" method="POST"  >--%>
<%--<label>Form for example:</label>--%>
<%--<input type="text" name="mes" size="80"--%>
<%--value="{&quot;descending&quot;:false,&quot;array&quot;:[ 9, 7, 3, 15 ] }" required autofocus>--%>
<%--<input type="submit" value="submint">--%>
<%--</form>--%>
</body>
</html>
