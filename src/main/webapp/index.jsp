<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Java REST web service</title>
      <style>
          .colorb {
              color: blue;
          }
          .colorr {
              color: red;
          }
          .size{
              font-size: 20px;
          }

      </style>
  </head>
  <body>
 <h2>REST web service Jersey + Json</h2>
  <p class="size">Accept array of Integers and return this array sorted.</p>
  <p class="size">Both input and output will be in a JSON format.</p>
  <p class="size">The request can have a descending flag.</p>
  <p class="size">Request type:POST Content-Type: application/json    host: <a href="https://rest-webservice.herokuapp.com/rest/sorted/array">https://rest-webservice.herokuapp.com/rest/sorted/array</a> </p>

  <p class="colorb">Example Input format:{ "descending":false, "array":[ 9, 7, 3, 15 ] }</p>
  <p class="colorr">Output format: [ 3, 7, 9, 15 ]</p>

 <p class="colorb">Example Input format:{ "descending":true, "array":[ 9, 7, 3, 15 ] }</p>
 <p class="colorr">Output format: [ 15, 9, 7, 3 ]</p>

 <p class="colorb">Example Input format:{"array":[ 9, 7, 3, 15 ] } not flag </p>
 <p class="colorr">Output format: [ 3, 7, 9, 15 ]</p>

 <p class="colorb">Example Input format:{"array":[ A, 7, 3, 15 ] } MISTAKE </p>
 <p class="colorr">Output : Wrong message request. Please check and try again !!</p>

  </body>
</html>
