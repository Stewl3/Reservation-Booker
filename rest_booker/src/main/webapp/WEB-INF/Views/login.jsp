<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
    <link rel="stylesheet" href="Styles/stylesheet.css" />
    <link rel="stylesheet" href="Styles/normalize.css" />
  </head>
  <body>
    <div class="container">
      <h1 class="formTitle">Please Login Below</h1>
      <form method="post" action="/login/database">
        Email : <input type="text" name="name" /><br />
        <br />
        Password : <input type="password" name="password" /><br />
        <br />
        <input type="submit" />
      </form>
    </div>
  </body>
</html>