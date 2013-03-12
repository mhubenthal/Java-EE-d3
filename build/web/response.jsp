<%-- 
    Document   : index
    Created on : Mar 9, 2013, 1:38:31 PM
    Author     : maxhubenthal
    Notes      : The code for this d3 visualization comes from the 
                    d3 gallery at github.com/mbostock/d3/wiki/Gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>d3 Example</title>
        <style>

            body {
                font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
                position: relative;
                width: 960px;
                font-size: 12px;
            }

            .axis text {
                font: 10px sans-serif;
            }

            .axis path,
            .axis line {
                fill: none;
                stroke: #000;
                shape-rendering: crispEdges;
            }

            .bar {
                fill: steelblue;
                fill-opacity: .9;
            }

            .x.axis path {
                display: none;
            }

            label {
                position: absolute;
                top: 10px;
                right: 10px;
            }
        </style> 
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name"/>
        <h1><jsp:getProperty name="mybean" property="name" /></h1>
    </body>
</html>
