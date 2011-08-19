<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
    rel="stylesheet"
    type="text/css"
    href="css/style.css"
/>
<meta
    http-equiv="Content-Type"
    content="text/html; charset=UTF-8"
>
<title>Bee management</title>
</head>
<body>
<jsp:useBean
    id="bvm"
    type="viewmodel.BeeViewModel"
    scope="session"
><jsp:setProperty
        name='bvm'
        property="*"
    />
</jsp:useBean>
<table>
    <%
        for (int i = 0; i < bvm.getAlb().size(); i++) {
    %>
    <tr>
        <td>
        <form
            action='BeeServlet'
            method='post'
        >
        <table>
            <tr>
                <td style='width: 50px;'><%=bvm.getAlb().get(i).getId()%></td>
                <input
                    type="hidden"
                    name='id'
                    value=<%=bvm.getAlb().get(i).getId()%>
                />
                <td style='width: 50px;'><%=bvm.getAlb().get(i).getType()%></td>
                <input
                    type="hidden"
                    name='type'
                    value=<%=bvm.getAlb().get(i).getType()%>
                />
                <td style='width: 50px;'><%=bvm.getAlb().get(i).getHealth()%></td>
                <input
                    type="hidden"
                    name='health'
                    value=<%=bvm.getAlb().get(i).getHealth()%>
                />
                <td style='width: 50px;'><%=bvm.getAlb().get(i).getDeadline()%></td>
                <input
                    type="hidden"
                    name='deadline'
                    value=<%=bvm.getAlb().get(i).getDeadline()%>
                />
                <td style='width: 50px;'><%=bvm.getAlb().get(i).isDead() ? "Dead" : "Alive"%></td>
                <input
                    type="hidden"
                    name='dead'
                    value=<%=bvm.getAlb().get(i).isDead()%>
                />
                <td><input
                    type='submit'
                    value='Take damage!'
                /></td>
            </tr>
        </table>
        </form>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>